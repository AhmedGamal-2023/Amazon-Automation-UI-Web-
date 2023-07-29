package StepDefinitions;

import DataDriven.JSonDataReader;
import Pages.CartPage;
import Pages.HomePage;
import Pages.Item1Page;
import Pages.SearchResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class Step_Scenario1 {
    JSonDataReader Reader = new JSonDataReader();
    SoftAssert soft = new SoftAssert();
    private HomePage home =new HomePage();
    private SearchResultsPage searchResults =new SearchResultsPage();
    private CartPage cart =new CartPage();
    private Item1Page item = new Item1Page();


    @Given("user navigate to Amazon Website then type SearchKeyword")
    public void typeSearchKeyword() throws IOException, ParseException {
        Reader.jsonReader();
        home.typeSearchKeyword(Reader.SearchKeyword);
    }
    @When("Select the first Item")
    public void SelectFirstItem(){
        searchResults.SelectFirstItem();
    }
    @And("Add item to the cart")
    public void AddItemToCart(){
    item.AddItemToCart();
    }
    @Then("Go to the cart and check that item is {string} successfully")
    public void AssertItemIsAddedSuccessfully(String Text_Added){
        String expectedResult = Text_Added;
        String actualResult = cart.AssertItemIsAddedSuccessfully();
        soft.assertEquals(expectedResult , actualResult);
    }

}
