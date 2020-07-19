package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Utilities extends ConfigReader
{
    public Utilities() {
        PageFactory.initElements(driver, this);
    }

    public void waitForVisibilityOfElement(By element) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void click(By element) {
        waitForVisibilityOfElement(element);
        element.findElement(driver).click();
    }

    public void enterText(By element, String value) {
        waitForVisibilityOfElement(element);
        element.findElement(driver).clear();
        element.findElement(driver).sendKeys(value);
    }


    //Assertion
    public void verifyText(By element, String text, By message) {
        waitForVisibilityOfElement(element);
        String firstMessage = message.findElement(driver).getText();
        assertEquals(firstMessage.trim(), text.trim());
        System.out.println("**********" + text + "**********");
        System.out.println("**********" + firstMessage + "**********");

    }

}
