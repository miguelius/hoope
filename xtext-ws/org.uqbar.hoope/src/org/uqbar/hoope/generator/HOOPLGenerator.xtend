/*
 * generated by Xtext
 */
package org.uqbar.hoope.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import org.uqbar.hoope.hOOPL.Object
import org.uqbar.hoope.hOOPL.Property
import org.uqbar.hoope.hOOPL.Operation

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class HOOPLGenerator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(o: resource.allContents.toIterable.filter(typeof(Object))) {
	    fsa.generateFile(
	      o.name,
	      o.fullyQualifiedName.toString("/") + ".java",
	      o.compile)
	  	}
	}
	
	def compile(Property p) '''
		int �p.name�;
	''' 
	
	def compile(Operation op) '''
		void �op.name�() {
			
		}
	''' 
	
	def compile(Object o) '''
		public class �o.name� {
		   �o.features.filter(typeof(Property)).map[compile]�
		   �o.features.filter(typeof(Operation)).map[compile]�
		   
		   public static void main(String args) {
		   	System.out.println("Hola, Mundo!");
		   } 
		}
	'''
}
