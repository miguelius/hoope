import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.uqbar.hoope.HOOPLInjectorProvider
import static org.junit.Assert.*
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.uqbar.hoope.hOOPL.HOOPL
import org.uqbar.hoope.hOOPL.Object

@InjectWith(typeof(HOOPLInjectorProvider))
@RunWith(typeof(XtextRunner))
class ParserTest {

	@Inject
	ParseHelper<HOOPL> parser
	
	@Test
	def void parseHOOPL() {
		var hoopl = parser.parse(
	"object Rana {
		 x = 3
		 y = 3
		
		salta {
			self subir
		}
	 } ")
		val rana = hoopl as Object
		assertEquals(rana.features.head.name, "x")	
		assertEquals(rana.features.last.name, "salta")	
	}
}