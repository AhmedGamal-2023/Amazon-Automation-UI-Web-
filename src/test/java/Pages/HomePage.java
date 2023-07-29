package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static StepDefinitions.Hooks.driver;

public class HomePage {
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private final By AmazonHomeLocator  =By.cssSelector("a[aria-label='Amazon']");

    private final By SearchFieldLocator  =By.cssSelector("input[aria-label='Search Amazon']");
    private final By SearchSubmitLocator  =By.id("nav-search-submit-button");
    private final By todayDealsLocator  =By.xpath("//a[contains(text(),'Deals')]");
    FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(org.openqa.selenium.NoSuchElementException.class);
    public void typeSearchKeyword(String SearchKeyword){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(AmazonHomeLocator))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(SearchFieldLocator))).click();
        driver.findElement(SearchFieldLocator).sendKeys(SearchKeyword);
        driver.findElement(SearchSubmitLocator).click();
    }
    public void OpenTodayDeals(){
        // Wait for the element to be clickable
        WebElement todayDealsElement = fluentWait.until(ExpectedConditions.elementToBeClickable(todayDealsLocator));
        // Use JavaScriptExecutor to click the element
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", todayDealsElement);
    }
}
