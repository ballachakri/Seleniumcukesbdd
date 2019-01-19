import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(features ="src/test",tags={"@search , @filter , @smoke , @regression , @sort , @ basket , @register"},dryRun = false,strict = true,plugin ="json: argos.json")
public class RunCucumberTest {
}
