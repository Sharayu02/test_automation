package cukeRunner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/searchFlight.feature",
        glue = {"stepDef"},
        plugin = {"pretty", "html:target/cucumber-reports", "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"},
        tags = {"@flight"}
)


public class CukeRunner
{


}
