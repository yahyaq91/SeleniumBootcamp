package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy(xpath ="//*[@id='navigation-_-cta-_-Sign-in-to-Online-Banking']")
    public WebElement onLineBankingLink;

    @FindBy(xpath ="//*'[@id=navChecking]'/span[3]")
    public WebElement checkingLink;

    @FindBy(xpath ="/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[3]/a/span[3]")
    public WebElement creditCardsLink;

    @FindBy(xpath ="//*[@id='navHomeLoans']/span[3]")
    public WebElement homeLoansLink;

    @FindBy(xpath ="//*['@id=navAutoLoans']/span[3]")
    public WebElement autoLoans;

    @FindBy(xpath ="//*[@id='navInvesting']/span[3]")
    public WebElement investing;

    @FindBy(xpath ="//a[@id='NAV_BUSINESS_ADVANTAGE']")
    public WebElement smallBusiness;

    @FindBy(xpath ="//a[@id='NAV_WEALTH_MANAGEMENT']")
    public WebElement wealthManagement;

    @FindBy(xpath ="//a[@id='NAV_PERSONAL']")
    public WebElement personal;

    @FindBy(xpath ="//*[@id='headerModule']/div[2]/div/div/div/ul[1]/li[5]/a")
    public WebElement security;

    @FindBy(xpath ="//*[@id='navBetterMoneyHabits']/span[3]")
    public WebElement betterMoneyHabits  ;












    public HomePage(){
        PageFactory.initElements(driver, this);
}

    public void clickSignInToOnlineBanking() {

    }

    public void clickOnChecking() {
    }

    public void clickOnSavings() {
    }

    public void clickOnCreditCards() {
    }

    public void clickOnHomeLoans() {
    }

    public void clickOnAutoLoans() {
    }

    public void clickOnInvesting() {
    }

    public void clickOnSmallBusiness() {
    }

    public void clickOnWealthManagement() {
    }

    public void clickOnPersonal() {
    }

    public void clickOnSecurity() {
    }

    public void clickOnBetterMoneyHabits() {
    }
}
