package app;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy(xpath = "//a[@onclick='event.preventDefault(); sofiUtils.checkScreenWidth('/products/', this);']")
    public WebElement productsLink;

    @FindBy(xpath = "//a[@data-qa='nav-member-benefits']")
    public WebElement memberBenefitsButton;

    @FindBy(xpath ="//*[@id='hero-tile-pl']")
    public WebElement personalLoansLink;

    @FindBy(xpath = "//*[@id='hp-product-tiles']/li[1]/div")
    public WebElement investLink;
    
    @FindBy(xpath = "//*[@id='hero-tile-cc']")
    public  WebElement creditCardsLink;

    @FindBy(xpath = "//*[@id='hero-tile-hl']")
    public WebElement mortgageLink;

    @FindBy(xpath = "//*[@id=\"hero-tile-insurance\"]")
    public WebElement InsuranceLink;

    @FindBy(xpath = "//*[@id=\"hero-tile-ps\"]")
    public WebElement PrivateStudentsLoansLink;

    @FindBy(xpath = "//*[@id=\"hero-tile-auto\"]")
    public WebElement AutoLoanRefinancingLink;

    @FindBy(xpath ="//*[@id=\"hero-tile-credit-score\"]")
    public WebElement CreditScoreAndBudgetingLink;

    @FindBy(xpath ="//*[@id=\"hero-tile-sl\"]")
    public WebElement StudentsLoansRefinancingLink;
    @FindBy(xpath = "//sp-rc-section[@id='ae-main-content']/h2")

    public WebElement memberBenefitConfirmation;
    public WebElement investLinkConfirmation;
    public WebElement personalLoansLinkConfirmation;
    public WebElement creditCardsLinkConfirmation;
    public WebElement mortgageLinkConfirmation;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickProductsLink() {
        clickOnElement(productsLink);
    }

    public void clickOnMemberBenefitsButton() {
        clickOnElement(memberBenefitsButton);
    }

    public  void clickOnPersonalLoansLink() {clickOnElement(personalLoansLink);
    }

    private void PersonalLoansLink() {
    }

    public void clickOnInvestLink() {
    }

    public void clickOnCreditCardsLink() {
    }

    public void clickOnMortgageLink() {
    }

    public void clickOnInsuranceLink() {
    }

    public void clickOnPrivateStudentsLoansLink() {
    }

    public void clickOnAutoLoanRefinancingLink() {
    }

    public void clickOnCreditScoreAndBudgetingLink() {
    }

    public void clickOnStudentsLoansRefinancingLink() {
    }



}
