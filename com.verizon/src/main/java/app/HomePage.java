package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy(xpath = "//*[@id='gnav20-sign-id']")
    public WebElement signInLink;

    @FindBy(xpath ="//*[@id='gnav20-Shop-L1']")
    public WebElement shopLink;

    @FindBy(xpath ="//*[@id='gnav20-Why-Verizon-L1']" )
    public WebElement whyVerizon;

    @FindBy(xpath ="//*[@id='gnav20-Support-L1']")
    public WebElement verizonLink;

    @FindBy(xpath ="//*[@id='deals']/div/div/div[1]/h1" )
    public WebElement dealsLink;

    @FindBy(xpath = "//*[@class='gnav20-subanchor']")
    public WebElement storesLink;

    @FindBy(xpath = "//*[@id='gnav20-Support-L1']")
    public WebElement supportLink;

    @FindBy(xpath = "//*[@id='gnav20-eyebrow-link-Personal']")
    public WebElement personalButton;

    @FindBy(xpath = "//*[@id=\"gnav20-eyebrow-link-Business\"]")
    public WebElement businessButton;

    @FindBy(xpath ="//*[@id='plans'/div/div/div[1]/h2" )
    public WebElement plansButton;

    @FindBy(xpath ="//*[@id='plans']/div/div/div[3]/div/a" )
    public WebElement homeInternet;

    @FindBy(xpath ="//*[@id=\"plans\"]/div/div/div[3]/div/a" )
    public WebElement mobileButton;
















    public void clickSignIn() {
    }

    public void clickShopButton() {
    }

    public void clickDealsLink() {
    }

    public void clickStorsLink() {
    }

    public void clickSupportLink() {
    }

    public void clickPersonalButton() {
    }

    public void clickBusinessButton() {
    }

    public void clickPlansButton() {
    }

    public void clickHomeInternet() {
    }
}
