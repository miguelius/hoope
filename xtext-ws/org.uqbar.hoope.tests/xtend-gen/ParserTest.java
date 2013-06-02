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
import org.uqbar.hoope.hOOPL.Feature;
import org.uqbar.hoope.hOOPL.HOOPL;

@InjectWith(HOOPLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<HOOPL> parser;
  
  @Test
  public void parseHOOPL() {
    try {
      HOOPL hoopl = this.parser.parse(
        "object Rana {\n\t\t x = 3\n\t\t y = 3\n\t\t\n\t\tsalta {\n\t\t\tself subir\n\t\t}\n\t } ");
      final org.uqbar.hoope.hOOPL.Object rana = ((org.uqbar.hoope.hOOPL.Object) hoopl);
      EList<Feature> _features = rana.getFeatures();
      Feature _head = IterableExtensions.<Feature>head(_features);
      String _name = _head.getName();
      Assert.assertEquals(_name, "x");
      EList<Feature> _features_1 = rana.getFeatures();
      Feature _last = IterableExtensions.<Feature>last(_features_1);
      String _name_1 = _last.getName();
      Assert.assertEquals(_name_1, "salta");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
