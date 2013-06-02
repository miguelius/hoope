package org.uqbar.hoope.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.uqbar.hoope.hOOPL.HOOPLPackage;
import org.uqbar.hoope.hOOPL.Mutator;
import org.uqbar.hoope.hOOPL.Operation;
import org.uqbar.hoope.hOOPL.Property;
import org.uqbar.hoope.hOOPL.SendMessage;
import org.uqbar.hoope.services.HOOPLGrammarAccess;

@SuppressWarnings("all")
public class HOOPLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HOOPLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HOOPLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HOOPLPackage.MUTATOR:
				if(context == grammarAccess.getMutatorRule()) {
					sequence_Mutator(context, (Mutator) semanticObject); 
					return; 
				}
				else break;
			case HOOPLPackage.OBJECT:
				if(context == grammarAccess.getHOOPLRule() ||
				   context == grammarAccess.getObjectRule()) {
					sequence_Object(context, (org.uqbar.hoope.hOOPL.Object) semanticObject); 
					return; 
				}
				else break;
			case HOOPLPackage.OPERATION:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case HOOPLPackage.PROPERTY:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case HOOPLPackage.SEND_MESSAGE:
				if(context == grammarAccess.getSendMessageRule()) {
					sequence_SendMessage(context, (SendMessage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Mutator(EObject context, Mutator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HOOPLPackage.Literals.MUTATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HOOPLPackage.Literals.MUTATOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMutatorAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID features+=Feature*)
	 */
	protected void sequence_Object(EObject context, org.uqbar.hoope.hOOPL.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation* name=ID (sentence+=Mutator | sentence+=SendMessage)*)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HOOPLPackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HOOPLPackage.Literals.FEATURE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name='self') (message=ID | message=Primitive))
	 */
	protected void sequence_SendMessage(EObject context, SendMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
