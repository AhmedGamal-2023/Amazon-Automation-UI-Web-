package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.Hooks.driver;

public class TodayDealsPage {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private final By GroceryLocator  =By.xpath("//span[contains(text(),'Grocery ')]");
    private final By HeadphonesLocator  =By.xpath("//span[contains(text(),'Headphones ')]");
    private final By OffLocator  =By.xpath("//span[contains(text(),'10%')]");
    private final By Page2Locator  =By.cssSelector("li[aria-label='Page 2 of 2']");

    public void selectHeadphonesAndGrocery(){

       WebElement GroceryElement = driver.findElement(GroceryLocator);
       js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", GroceryElement);
       wait.until(ExpectedConditions.elementToBeClickable(GroceryElement)).click();

       WebElement HeadphonesElement = driver.findElement(HeadphonesLocator);
       js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", HeadphonesElement);
       wait.until(ExpectedConditions.elementToBeClickable(HeadphonesElement)).click();
    }
    public void chooseOff(){

        WebElement OffElement = driver.findElement(OffLocator);
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", OffElement);
        wait.until(ExpectedConditions.elementToBeClickable(OffElement)).click();
    }
    public void ScrollToClickOnNextPage(){

        WebElement Page2element = driver.findElement(Page2Locator);
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", Page2element);
        wait.until(ExpectedConditions.elementToBeClickable(Page2element)).click();
    }
}
