import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.uqbar.hoope.HOOPLInjectorProvider;
import org.uqbar.hoope.hoopl.Program;

@InjectWith(HOOPLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<Program> parser;
  
  @Test
  public void parseHOOPL() {
    try {
      Program hoopl = this.parser.parse(
        "ref rana = object { }\n\tref camion = object { }\n ");
      final Program rana = ((Program) hoopl);
      EList<EObject> _objects = rana.getObjects();
      int _size = _objects.size();
      Assert.assertEquals(2, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
