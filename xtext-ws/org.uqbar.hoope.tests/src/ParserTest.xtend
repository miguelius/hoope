import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.uqbar.hoope.HOOPLInjectorProvider
import org.uqbar.hoope.hoopl.Program

import static org.junit.Assert.*

@InjectWith(typeof(HOOPLInjectorProvider))
@RunWith(typeof(XtextRunner))
class ParserTest {

	@Inject
	ParseHelper<Program> parser
	
	@Test
	def void parseHOOPL() {
		var hoopl = parser.parse(
	"ref rana = object { }
	ref camion = object { }
 ")
		val rana = hoopl as Program
		//assertEquals("x", rana.features.head.name)	
		assertEquals(2, rana.objects.size)	
	}
}