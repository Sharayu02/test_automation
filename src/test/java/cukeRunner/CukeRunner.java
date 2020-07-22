package cukeRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/searchFlight.feature",
        glue = {"stepDef"},
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
        tags = {"@flight"}
)


public class CukeRunner
{

}
