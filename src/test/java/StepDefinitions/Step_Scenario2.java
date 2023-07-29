package StepDefinitions;

import DataDriven.JSonDataReader;
import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class Step_Scenario2 {
    JSonDataReader Reader = new JSonDataReader();
    SoftAssert soft = new SoftAssert();
    private HomePage home =new HomePage();
    private TodayDealsPage todayDeals=new TodayDealsPage();
    private Page2 page2 =new Page2();
    private Item2Page item =new Item2Page();
    private CartPage cart =new CartPage();

    @Given("user navigate to HomePage and Open today's deals")
    public void OpenTodayDeals(){
     home.OpenTodayDeals();
    }
    @When("from the left side filters select Headphones and grocery")
    public void selectHeadphonesAndGrocery(){
     todayDeals.selectHeadphonesAndGrocery();
    }
    @And("from the discount part choose 10% off or more")
    public void chooseOff(){
        todayDeals.chooseOff();
    }
    @Then("go to the fourth page then select any item and add it to the cart and check {string}")
    public void selectItemAndAddItToCart(String Text_Added){
     todayDeals.ScrollToClickOnNextPage();
     page2.selectItem();
     item.AndAddItToCart();

        String ExpectedResult = Text_Added;
        String actualResult = cart.AssertItemIsAddedSuccessfully();
        soft.assertEquals(ExpectedResult , actualResult);
    }
}
