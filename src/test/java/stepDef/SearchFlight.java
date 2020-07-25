package stepDef;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.SearchFlightPage;
import util.ConfigReader;

public class SearchFlight extends ConfigReader
{
    SearchFlightPage searchFlightPage = new SearchFlightPage();

    //Scenario Hooks
    @Before
    public void beforeScenario()
    {
        ConfigReader.initialization();
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png", "");
            }
        } finally {
            driver.quit();
        }
    }

    // Step Hooks
    @BeforeStep
    public void beforeStep()
    {

    }

    @AfterStep
    public void afterStep()
    {

    }

    //Conditional Hooks
    @Before("@fligth1")
    public void doSomethingBefore(Scenario scenario)
    {

    }

    @After("@flight and not @flight1")
    public void doSomethingAfter(Scenario scenario)
    {

    }



    @Given("I'am on cleartrip search flight page")
    public void iAmOnCleartripSearchFlightPage()
    {
        searchFlightPage.cleartrip(prop.getProperty("url"));
    }

    @When("I enter details and search flights")
    public void iEnterDetailsAndSearchFlights(DataTable testData)
    {
        searchFlightPage.flightSearch(testData);
    }

    @Then("I should see flight options")
    public void iShouldSeeFlightOptions()
    {
        searchFlightPage.verifyFlightListings();
    }


    @When("I enter departure city as {string}, arrival city as {string}, departure date as {string}, Passengers as {int}")
    public void iEnterDepartureCityAsArrivalCityAsDepartureDateAsPassengersAs(String arg0, String arg1, String arg2, int arg3)
    {
        searchFlightPage.searchFlight(arg0,arg1,arg2,arg3);
    }

    @When("I enter departure city as {string}, arrival city as {string}, departure date as {string} and passengers as {string}")
    public void iEnterDepartureCityAsArrivalCityAsDepartureDateAsAndPassengersAs(String arg0, String arg1, String arg2, String arg3)
    {
        searchFlightPage.searchFlight1(arg0,arg1,arg2,arg3);
    }



}
