import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pageObject.Browser;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTest {

}
