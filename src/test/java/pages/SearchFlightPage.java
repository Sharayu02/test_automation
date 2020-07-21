package pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import util.ConfigReader;
import util.Utilities;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SearchFlightPage extends ConfigReader
{
    Utilities util= new Utilities();
    private By home= By.id("Home");
    private By fromCity=By.id("FromTag");
    private By fromList=By.xpath("(//li[@class='list'])[1]");
    private By depart= By.name("from");
    private By to=By.name("to");
    private By toList=By.xpath("(//li[@class='list'])[2]");
    private By toCity=By.id("ToTag");
    private By date=By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']");
    private By adult=By.id("Adults");
    private By search=By.id("SearchBtn");
    private By departureDate=By.name("depart_date");

    public SearchFlightPage() {
        PageFactory.initElements(driver, this);
    }

    public void cleartrip(String url)
    {
        prop.getProperty(url);
    }

    public void flightSearch(DataTable testData)
    {
        List<Map<String, String>> data = testData.asMaps(String.class, String.class);
        util.waitForVisibilityOfElement(home);
        //Departure city
        util.click(fromCity);
        util.enterText(fromCity,data.get(0).get("Departure City"));
        util.waitForVisibilityOfElement(fromList);
        fromCity.findElement(driver).sendKeys(Keys.DOWN);
        fromCity.findElement(driver).sendKeys(Keys.ENTER);
        if(depart.findElement(driver).getAttribute("value").contains("PNQ"))
        {
            System.out.println("Departue City verified");
            Assert.assertTrue(true);
        }
        //Arrival city
        util.click(toCity);
        util.enterText(toCity,data.get(0).get("Arrival City"));
        util.waitForVisibilityOfElement(toList);
        toCity.findElement(driver).sendKeys(Keys.DOWN);
        toCity.findElement(driver).sendKeys(Keys.ENTER);
        if(to.findElement(driver).getAttribute("value").contains("MAA"))
        {
            System.out.println("Arrival City verified");
            Assert.assertTrue(true);
        }
        //Departure date
        util.click(date);
        if(departureDate.findElement(driver).getAttribute("value").contains(data.get(0).get("Departure Date")))
        {
            System.out.println("Departue date verified");
            Assert.assertTrue(true);
        }
        //Passengers
        util.click(adult);
        Select passenger= new Select(By.name("adults").findElement(driver));
        passenger.selectByValue(data.get(0).get("Passengers"));
        //Search
        util.click(search);
    }

    //Scenario 2
    public void searchFlight(String arg0, String arg1, String arg2, int arg3)
    {

        util.waitForVisibilityOfElement(home);
        //Departure city
        util.click(fromCity);
        util.enterText(fromCity,arg0);
        util.waitForVisibilityOfElement(fromList);
        fromCity.findElement(driver).sendKeys(Keys.DOWN);
        fromCity.findElement(driver).sendKeys(Keys.ENTER);
        if(depart.findElement(driver).getAttribute("value").contains("PNQ"))
        {
            System.out.println("Departue City verified");
            Assert.assertTrue(true);
        }
        //Arrival city
        util.click(toCity);
        util.enterText(toCity,arg1);
        util.waitForVisibilityOfElement(toList);
        toCity.findElement(driver).sendKeys(Keys.DOWN);
        toCity.findElement(driver).sendKeys(Keys.ENTER);
        if(to.findElement(driver).getAttribute("value").contains("MAA"))
        {
            System.out.println("Arrival City verified");
            Assert.assertTrue(true);
        }
        //Departure date
        util.click(date);
        if(departureDate.findElement(driver).getAttribute("value").contains(arg2))
        {
            System.out.println("Departue date verified");
            Assert.assertTrue(true);
        }
        //Passengers
        util.click(adult);
        Select passenger= new Select(By.name("adults").findElement(driver));
        passenger.selectByValue(String.valueOf(arg3));
        //Search
        util.click(search);
    }

    //Scenario 3
    public void searchFlight1(String arg0, String arg1, String arg2, String arg3)
    {
        util.waitForVisibilityOfElement(home);
        //Departure city
        util.click(fromCity);
        util.enterText(fromCity,arg0);
        util.waitForVisibilityOfElement(fromList);
        fromCity.findElement(driver).sendKeys(Keys.DOWN);
        fromCity.findElement(driver).sendKeys(Keys.ENTER);
        if(depart.findElement(driver).getAttribute("value").contains("PNQ"))
        {
            System.out.println("Departue City verified");
            Assert.assertTrue(true);
        }
        //Arrival city
        util.click(toCity);
        util.enterText(toCity,arg1);
        util.waitForVisibilityOfElement(toList);
        toCity.findElement(driver).sendKeys(Keys.DOWN);
        toCity.findElement(driver).sendKeys(Keys.ENTER);
        if(to.findElement(driver).getAttribute("value").contains("MAA"))
        {
            System.out.println("Arrival City verified");
            Assert.assertTrue(true);
        }
        //Departure date
        util.click(date);
        if(departureDate.findElement(driver).getAttribute("value").contains(arg2))
        {
            System.out.println("Departue date verified");
            Assert.assertTrue(true);
        }
        //Passengers
        util.click(adult);
        Select passenger= new Select(By.name("adults").findElement(driver));
        passenger.selectByValue(String.valueOf(arg3));
        //Search
        util.click(search);
    }

    public void result()
    {

    }
}
