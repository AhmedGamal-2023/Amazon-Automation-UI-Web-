package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.Hooks.driver;

public class Page2 {
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private final By item2Locator  =By.cssSelector("div[data-csa-c-item-id='amzn1.deal.10061d25']");
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void selectItem(){

        WebElement ItemElement = driver.findElement(item2Locator);
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", ItemElement);
        wait.until(ExpectedConditions.elementToBeClickable(ItemElement)).click();
    }
}
