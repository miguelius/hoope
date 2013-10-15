package org.uqbar.interpreter

import com.google.inject.Inject
import java.util.List
import java.util.logging.Logger
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.uqbar.hoope.HoopeObject
import org.uqbar.hoope.Program
import org.uqbar.hoope.lib.IHoopeInterpreter
import org.uqbar.hoope.lib.IHoopePlayground
import org.uqbar.hoope.lib.IProjectClassLoaderHelper
import org.uqbar.jvmmodel.HoopeJvmModelInferrer
import org.eclipse.xtext.xbase.XFeatureCall

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
			val declaredObjects = newLinkedHashMap()
			(program as Program).expressions.forEach[
				
				it.evaluate(runningContext,null)
				switch (it) {
					XVariableDeclaration: {
						val objecto = runningContext.getValue(QualifiedName.create(it.name))
						declaredObjects.put(it.name, objecto )

						// determino si hay que dibujarlo, si es así lo registro como tal
						if (objecto.positionable) {
							playground.registerGraphicObject(it.name, objecto)
						}

					}
				}
			]
		}

	}

	@Inject extension HoopeJvmModelInferrer
	
	//extiende el evaluador de expresiones para instanciar un hoope object
	override Object doEvaluate(XExpression expression, IEvaluationContext context, CancelIndicator indicator) {
		log.info(''' evaluando: «expression.toString» ''')
		switch expression {
			HoopeObject: {
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

	def boolean positionable(Object object) {
		!object.class.declaredMethods.filter[f| f.name == 'getPosition'].empty
	}
}
