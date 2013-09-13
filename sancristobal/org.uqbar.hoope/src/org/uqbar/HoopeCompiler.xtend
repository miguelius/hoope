package org.uqbar

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.uqbar.jvmmodel.HoopeJvmModelInferrer
import org.uqbar.hoope.HoopeObject

@Singleton
class HoopeCompiler extends XbaseCompiler {

	override void doInternalToJavaStatement(XExpression obj, ITreeAppendable appendable, boolean isReferenced) {
		toJavaStatement(obj, appendable, isReferenced)
	}

	override void internalToConvertedExpression(XExpression obj, ITreeAppendable appendable) {
		toJavaExpression(obj, appendable)
	}

	def dispatch void toJavaStatement(HoopeObject object, ITreeAppendable appendable, boolean isReferenced) {
		// DO nothing but empty body is required
	}

	@Inject extension HoopeJvmModelInferrer;

	def dispatch void toJavaExpression(HoopeObject object, ITreeAppendable b) {
		b.append("new ").append(getType(object)).append("();")

		// String body = func.getValue()
		// .substring(2, func.getValue().length() - 2);
		// b.append("Integer.valueOf(\"");
		// b.append(body);
		// b.append("\")");
		}

	}
	