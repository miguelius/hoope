package org.uqbar.interpreter

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.uqbar.hoope.Program
import org.uqbar.hoope.lib.IHoopeInterpreter
import org.uqbar.jvmmodel.HoopeJvmModelInferrer
import org.uqbar.hoope.lib.HoopeObject
import java.util.ArrayList
import org.uqbar.hoope.lib.IProjectClassLoaderHelper
import org.eclipse.core.resources.IProject
import java.util.logging.Logger
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.xbase.interpreter.impl.DefaultEvaluationContext
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XVariableDeclaration
import java.awt.image.SampleModel
import org.uqbar.hoope.lib.IHoopePlayground

class HoopeGraphicObjectShellInterpreter extends XbaseInterpreter implements IHoopeInterpreter {
	
	@Inject extension IJvmModelAssociations 

	@Inject extension IProjectClassLoaderHelper

	@Inject IEvaluationContext context
	
	static Logger log = Logger::getLogger( typeof(HoopeGraphicObjectShellInterpreter).name ) 

	IProject project;

	// Evalúa el método main de la clase Main
	override run(EObject program, IHoopePlayground playground) {
		val runningContext = context.fork

		if (program != null) {
			(program as Program).expressions.forEach[
				it.evaluate(runningContext,null)
			]
			
			// manera muy cabeza de obtener los elementos dibujables:
			// son aquellos que son HoopeObject y tienen un field de position
			val dibujables = 
				(program as Program).expressions.filter(XVariableDeclaration).map[(it as XVariableDeclaration).right].filter(org.uqbar.hoope.HoopeObject).map[t|t -> t.features].filter[it.value.exists[f|f.name=='position']].map[it.key]
			
			dibujables.forEach[playground.registerGraphicObject((it.eContainer as XVariableDeclaration).name, it.doEvaluate(runningContext, null) )]
			log.info(dibujables.fold("dibujables: ")[ x,t | x + t.doEvaluate(runningContext, null) ]);
		}

	}

	@Inject extension HoopeJvmModelInferrer
	
	//extiende el evaluador de expresiones para instanciar un hoope object
	override Object doEvaluate(XExpression expression, IEvaluationContext context, CancelIndicator indicator) {
		log.info(''' evaluando: «expression.toString» ''')
		switch expression {
			org.uqbar.hoope.HoopeObject: {
				log.info(''' se comopne de: «getJvmElements(expression).head» ''')
				loadClass(project, (getJvmElements(expression).head as JvmGenericType).identifier).newInstance
			}
			XExpression:
				super.doEvaluate(expression,context,indicator)
		}
		
	}

	//esto duele y mucho:
	// cuando quiero invocar métodos de las clases definidas por el usuario
	// necesito el classloader con el que fueron definidas, por lo que le pido a la clase
	// su class loader.
	// El error que ocurría era que no podía encontrar el método, ya que lo buscaba en el class loader
	// del plugin
	override Object invokeOperation(JvmOperation operation, Object receiver, List<Object> argumentValues) {
		javaReflectAccess.setClassLoader(receiver.class.classLoader)
		super.invokeOperation(operation,receiver,argumentValues)
	}
	
	override setProject(IProject project) {
		this.project = project
	}

}

class StopLineReachedException extends RuntimeException {
}