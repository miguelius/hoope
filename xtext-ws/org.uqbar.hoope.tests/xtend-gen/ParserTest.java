import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.uqbar.hoope.HOOPLInjectorProvider;

@InjectWith(HOOPLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<Object> parser;
  
  @Test
  public void parseHOOPL() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method features is undefined for the type ParserTest"
      + "\nname cannot be resolved"
      + "\nlast cannot be resolved");
  }
}
