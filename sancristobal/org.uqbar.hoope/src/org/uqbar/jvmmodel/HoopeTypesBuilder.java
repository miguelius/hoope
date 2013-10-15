package org.uqbar.jvmmodel;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.AnnotationLookup;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.interpreter.ConstantExpressionsInterpreter;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.eclipse.xtext.xtype.XtypeFactory;
import org.uqbar.hoope.Feature;

import com.google.inject.Inject;

@NonNullByDefault
public class HoopeTypesBuilder extends JvmTypesBuilder {
	
	private static Logger LOG = Logger.getLogger(HoopeTypesBuilder.class);
	
	@Inject
	private IJvmModelAssociator associator;
	
	@Inject
	private ILogicalContainerProvider logicalContainerProvider;

	@Inject
	private TypeReferences references;
	
	@Inject
	private IEObjectDocumentationProvider documentationProvider;
	
	@Inject
	private TypesFactory typesFactory;
	
	@Inject(optional = true)
	private XtypeFactory xtypesFactory = XtypeFactory.eINSTANCE;
	
	@Inject
	private AnnotationLookup annotationLookup;
	
	@Inject 
	private ConstantExpressionsInterpreter constantExpressionsInterpreter;
	
	@Inject
	private CommonTypeComputationServices commonTypeComputationServices;
	
	/**
	 * shorthand for <code>toSetter(sourceElement, name, name, typeRef)</code>
	 */
	@Nullable
	public JvmOperation toObservedSetter(@Nullable final EObject sourceElement, @Nullable final String name, @Nullable JvmTypeReference typeRef) {
		return toObservedSetter(sourceElement, name, name, typeRef);
	}
	
	/**
	 * Este método se agregó para observar los objetos hoope y de esa manera la UI puede ir actualizandolo
	 * 
	 * 
	 * @param sourceElement
	 * @param propertyName
	 * @param fieldName
	 * @param typeRef
	 * @return
	 */
	@Nullable
	public JvmOperation toObservedSetter(@Nullable final EObject sourceElement, @Nullable final String propertyName, @Nullable final String fieldName, @Nullable JvmTypeReference typeRef) {
		if(sourceElement == null || propertyName == null || fieldName == null) 
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(references.getTypeForName(Void.TYPE,sourceElement));
		result.setSimpleName("set" + Strings.toFirstUpper(propertyName));
		result.getParameters().add(toParameter(sourceElement, propertyName, cloneWithProxies(typeRef)));
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(@Nullable ITreeAppendable p) {
				if(p != null) {
					p = p.trace(sourceElement);
					p.append("this.");
					p.append(fieldName);
					p.append(" = ");
					p.append(propertyName);
					p.append(";\nsetChanged();\n");
					p.append("notifyObservers(\"");
					p.append(fieldName);
					p.append("\");\n");
				}
			}
		});
		return associate(sourceElement, result);
	}
	
}