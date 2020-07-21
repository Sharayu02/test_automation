package util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

}
