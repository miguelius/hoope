import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.uqbar.HoopeInjectorProvider
import org.uqbar.hoope.Program

@InjectWith(typeof(HoopeInjectorProvider))
@RunWith(typeof(XtextRunner))
class ParserTest {

	@Inject
	ParseHelper<Program> parser

	@Test
	def void parseHOOPL() {
		var hoopl = parser.parse(
			"val pepita = object {

				

			 }
 	")
		val pepita = hoopl as Program
		assertEquals(1, pepita.expressions.size)
	}
}
