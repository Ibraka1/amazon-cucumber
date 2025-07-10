package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AmazonStepDefinitons {
    AmazonPage amazonPage= new AmazonPage();

    @Given("Customer visit the Amazon page and log in")
    public void customer_visit_the_amazon_page_and_log_in() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPage.login.click();
    }




}
