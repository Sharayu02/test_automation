package cukeRunner;


import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import util.ConfigReader;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/searchFlight.feature",
        glue = {"stepDef"},
        plugin = {"pretty", "html:target/cucumber-reports", "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"},
        tags = {"@flight"}
)


public class CukeRunner extends ConfigReader
{


}
