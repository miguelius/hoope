/*
 * generated by Xtext
 */
package org.uqbar.hoope.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.uqbar.hoope.hoopl.ObjectDefinition

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class HOOPLGenerator implements IGenerator {

	@Inject extension IQualifiedNameProvider
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
	 for(od : input.allContents.toIterable.filter( typeof(ObjectDefinition) )) {
		fsa.generateFile(
			od.name + ".java",
			od.compile
		)}
	}
	
	def compile(ObjectDefinition o) '''
	import org.uqbar.hoop.HoopeObject
	
	public class «o.name» extends HoopObject {

	 	public static void main(String args) {
	 		System.out.println("Soy «o.name»");
	 	}
	}
	'''
	
/*
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (o : resource.allContents.toIterable.filter(typeof(Object))) {
			fsa.generateFile(o.name, o.fullyQualifiedName.toString("/") + ".java", o.compile)
		}
	}

	def compile(Property p) '''
		int «p.name»;
		
		int get«p.name.toFirstUpper»() {
			return «p.name»;
		}
		
		void set«p.name.toFirstUpper»(int value) {
			this.«p.name» = value;
		}
	'''

	def compile(Operation op) '''
		void «op.name»() {
			
		}
	'''

	def compile(Object o) '''
		public class «o.name» {
		   «o.features.filter(typeof(Property)).map[compile]»
		   «o.features.filter(typeof(Operation)).map[compile]»
		   
		   public static void main(String args) {
		   	System.out.println("Hola, Mundo!");
		   } 
		}
	'''
	*/
}
