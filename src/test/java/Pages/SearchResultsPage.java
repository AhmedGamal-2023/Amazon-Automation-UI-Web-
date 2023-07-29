package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static StepDefinitions.Hooks.driver;

public class SearchResultsPage {
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private final By firstItemLocator  =By.cssSelector("div[cel_widget_id='MAIN-SEARCH_RESULTS-6']");


    public void SelectFirstItem(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(firstItemLocator))).click();
    }
}
