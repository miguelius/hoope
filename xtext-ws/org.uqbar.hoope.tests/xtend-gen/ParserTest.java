import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.uqbar.hoope.HOOPLInjectorProvider;
import org.uqbar.hoope.hoopl.Feature;

@InjectWith(HOOPLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<org.uqbar.hoope.hoopl.Object> parser;
  
  @Test
  public void parseHOOPL() {
    try {
      org.uqbar.hoope.hoopl.Object hoopl = this.parser.parse(
        "object Rana {\n\t\t x = 3\n\t\t y = 3\n\t\t\n\t\tsalta {\n\t\t\tself subir\n\t\t}\n\t } ");
      final org.uqbar.hoope.hoopl.Object rana = ((org.uqbar.hoope.hoopl.Object) hoopl);
      EList<Feature> _features = rana.getFeatures();
      Feature _last = IterableExtensions.<Feature>last(_features);
      String _name = _last.getName();
      Assert.assertEquals("salta", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
