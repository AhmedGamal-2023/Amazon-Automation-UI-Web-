package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static StepDefinitions.Hooks.driver;

public class Item1Page {
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private final By AddToCartLocator  =By.id("add-to-cart-button");

    public void AddItemToCart(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(AddToCartLocator))).click();

    }
}
