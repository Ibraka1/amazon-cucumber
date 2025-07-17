package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AmazonStepDefinitons {
    AmazonPage amazonPage= new AmazonPage();
    Actions actions = new Actions(Driver.getDriver());

    @Step("User visit the Amazon")
    @Description("Amazon home page will open")
    @Given("Customer visit the Amazon page")
    public void customer_visit_the_amazon_page() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.wait(2);
        amazonPage.acceptCookies.click();
    }

    @Step("Searching for a home furniture")
    @When("Search home furniture")
    public void search_home_furniture() {
        amazonPage.searchBox.sendKeys("Home Furniture", Keys.ENTER);
    }

    @When("Select the first product of results")
    public void select_the_first_product() {
        ReusableMethods.wait(5);
        amazonPage.firstProduct.click();
    }


    @And("Add to cart")
    public void addToCart() {
        actions.sendKeys(amazonPage.firstProduct,Keys.ARROW_DOWN);
        amazonPage.addToCart.click();
    }

    @Then("Customer navigate to the home page")
    public void navigateToHomePageBack() {
        amazonPage.homePage.click();
    }

    @When("User searches for {string}")
    public void userSearchesFor(String arg0) {
        amazonPage.searchBox.sendKeys(arg0,Keys.ENTER);
    }


    @Then("take a screenshot of {string}")
    public void takeAScreenshotOf(String arg0) {
        ReusableMethods.takeScreenshot(arg0);
    }
}
