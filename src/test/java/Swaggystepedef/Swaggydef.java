package Swaggystepedef;

import Readwrite.Data;
import Swaggypageobjects.Swaggyapplicationobject;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Swaggydef extends Data {
    Scenario scn;
    Swaggyapplicationobject sa=new Swaggyapplicationobject();
    @Before
    public  void bh(Scenario s) throws IOException
    {
        WebDriverManager.chromedriver().setup();
        Swaggyapplicationobject.driver=new ChromeDriver();
        Swaggyapplicationobject.driver.manage().window().maximize();
        sa.Readdata();
        this.scn=s;
    }
    @After
    public  void ah(Scenario s)
    {
        if(s.isFailed())
        {
            TakesScreenshot srcshot=(TakesScreenshot)driver;
            byte[] data=srcshot.getScreenshotAs(OutputType.BYTES);
            scn.embed(data,"image/png");
        }
        else
        {
            TakesScreenshot srcshot=(TakesScreenshot) Swaggyapplicationobject.driver;
            byte[] data=srcshot.getScreenshotAs(OutputType.BYTES);
            scn.embed(data,"image/png");

        }
        Swaggyapplicationobject.driver.close();
    }

    @Given("^Login to the Application$")
    public  void Login_to_the_Application() throws InterruptedException {
        sa.swaglaunch();
    }
    @When("^user add an items to cart$")
    public void user_add_an_items_to_cart() throws InterruptedException {
        sa.Additemstocart();
    }

    @And("^validate added item in cart page$")
    public void validate_added_item_in_cart_page() throws InterruptedException {
        sa.Validatecart();
    }

    @When("^user add multiple items to cart$")
    public  void user_add_multiple_items_to_cart() throws InterruptedException {
        sa.Multipleitemsaddtocart();
    }
    @When("^User will select the price range as low to high from filter$")
    public  void User_will_select_the_price_range_as_low_to_high_from_filter() throws InterruptedException {
        sa.Pricefilter();
    }

    @When("^select the alphabetical order option from filter$")
    public  void select_the_alphabetical_order_option_from_filter() throws InterruptedException {
        sa.Alphabeticalfilter();
    }

    @And("^verify the item in cart page$")
    public  void verify_the_item_in_cart_page()
    {
        sa.Verifyitemsincart();
    }
    @And("^User will click on checkout$")
    public  void User_will_click_on_checkout()
    {
        sa.checkoutbtn();
    }

    @And("^user provides the details$")
    public  void user_provides_the_details() throws InterruptedException {
        sa.userdetails();
    }

    @Then("^user will place the order$")
    public  void user_will_place_the_order() throws InterruptedException {
        sa.Placeorder();
    }

}
