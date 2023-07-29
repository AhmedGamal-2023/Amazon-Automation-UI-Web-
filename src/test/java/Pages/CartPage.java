package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.Hooks.driver;

public class CartPage {
    private final By AddToCartLocator  =By.xpath("//span[contains(text(),'Added to Cart')]");


    public String AssertItemIsAddedSuccessfully(){
        return AddToCartLocator.findElement(driver).getText();
    }
}
