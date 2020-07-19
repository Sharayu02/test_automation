package stepDef;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchFlightPage;
import util.ConfigReader;

public class SearchFlight extends ConfigReader
{
    SearchFlightPage searchFlightPage = new SearchFlightPage();

    @Given("I'am on cleartrip search flight page")
    public void iAmOnCleartripSearchFlightPage()
    {
        ConfigReader.initialization();
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
        searchFlightPage.result();
    }


    @When("I enter departure city as {string}, arrival city as {string}, departure date as {int}, Passengers as {int}")
    public void iEnterDepartureCityAsArrivalCityAsDepartureDateAsPassengersAs(String arg0, String arg1, int arg2, int arg3)
    {
        searchFlightPage.searchFlight(arg0,arg1,arg2,arg3);
    }

    @When("I enter departure city as {string}, arrival city as {string}, departure date as {string} and passengers as {string}")
    public void iEnterDepartureCityAsArrivalCityAsDepartureDateAsAndPassengersAs(String arg0, String arg1, String arg2, String arg3)
    {
        searchFlightPage.searchFlight1(arg0,arg1,arg2,arg3);
    }
}
