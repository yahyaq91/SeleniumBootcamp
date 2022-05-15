package app;


import SignInButton.SignInButton;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

import javax.swing.*;

import static base.BasePage.driver;

public class HomePage extends SystemBar {

    @FindBy (xpath ="//*[@id='authContainer']/a[2]" )
    public WebElement Register;

    @FindBy (xpath ="//a[@class='login']")
    public WebElement SigInButton;

    @FindBy (xpath ="//img[@class='logo img-responsive']")
    public WebElement homePageLogo;

    @FindBy (xpath ="/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")
    public WebElement searchBox;

    @FindBy (xpath ="//img[@class='logo img-responsive']")
    public WebElement searchButton ;

    //@FindBy (xpath ="")
    //public WebElement ;

    //@FindBy (xpath ="")
    //public WebElement ;

    //@FindBy (xpath ="")
    //public WebElement ;

    //@FindBy (xpath ="")
    //public WebElement ;

    //@FindBy (xpath ="")
    //public WebElement ;

    //@FindBy (xpath ="")
    //public WebElement ;

    //@FindBy (xpath ="")
    //public WebElement ;










    public HomePage(){
        PageFactory.initElements(driver, this);

}

    public void clickOnRegister() {

    }
    public void clickOnSignIn() {
        //Action.click(driver, SignInButton);
        //return; new SignInpage();
    }
    public void clickOnHomePageLogo() {
    }

    public void clickSearchBox() {
    }

    public void clickOnSearchButton() {
    }
}