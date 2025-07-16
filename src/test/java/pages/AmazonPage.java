package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id = "sp-cc-accept")
    public WebElement acceptCookies;

    @FindBy(xpath = "//*[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"][1]")
    public WebElement firstProduct;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(id = "nav-logo-sprites")
    public WebElement homePage;

}
