package org.uqbar.hoope.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.uqbar.hoope.hoopl.Expresion;
import org.uqbar.hoope.hoopl.HooplPackage;
import org.uqbar.hoope.hoopl.Message;
import org.uqbar.hoope.hoopl.ObjectDefinition;
import org.uqbar.hoope.hoopl.Program;
import org.uqbar.hoope.hoopl.Property;
import org.uqbar.hoope.services.HOOPLGrammarAccess;

@SuppressWarnings("all")
public class HOOPLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HOOPLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HooplPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HooplPackage.EXPRESION:
				if(context == grammarAccess.getExpresionRule()) {
					sequence_Expresion_IfExpresion_WhileExpresion(context, (Expresion) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIfExpresionRule()) {
					sequence_IfExpresion(context, (Expresion) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getWhileExpresionRule()) {
					sequence_WhileExpresion(context, (Expresion) semanticObject); 
					return; 
				}
				else break;
			case HooplPackage.MESSAGE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case HooplPackage.OBJECT_DEFINITION:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getObjectDefinitionRule()) {
					sequence_ObjectDefinition(context, (ObjectDefinition) semanticObject); 
					return; 
				}
				else break;
			case HooplPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case HooplPackage.PROPERTY:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((condition=Expresion sentences+=Expresion*) | (condition=Expresion then=Expresion else=Expresion?))
	 */
	protected void sequence_Expresion_IfExpresion_WhileExpresion(EObject context, Expresion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expresion then=Expresion else=Expresion?)
	 */
	protected void sequence_IfExpresion(EObject context, Expresion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sentences+=Expresion*)
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID features+=Feature*)
	 */
	protected void sequence_ObjectDefinition(EObject context, ObjectDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (objects+=Expresion | objects+=ObjectDefinition)*
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Typo initial=Terminal?)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expresion sentences+=Expresion*)
	 */
	protected void sequence_WhileExpresion(EObject context, Expresion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
