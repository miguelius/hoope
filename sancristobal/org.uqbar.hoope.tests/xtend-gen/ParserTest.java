import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.uqbar.HoopeInjectorProvider;
import org.uqbar.hoope.Program;

@InjectWith(HoopeInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<Program> parser;
  
  @Test
  public void parseHOOPL() {
    try {
      Program hoopl = this.parser.parse(
        "val pepita = object {\n\t\t\t }\n \t");
      final Program pepita = ((Program) hoopl);
      EList<XExpression> _expressions = pepita.getExpressions();
      int _size = _expressions.size();
      Assert.assertEquals(1, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
