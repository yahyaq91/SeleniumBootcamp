package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.UnitedStatesMarket;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='https://www.marketwatch.com/markets/us']")
    public WebElement usMarket;

    @FindBy(xpath = "//button[@class='close-btn']")
    public WebElement popUP;

    @FindBy(xpath = "//h1[@class='company__name']")
    public WebElement dataSelectionConfirmation;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public UnitedStatesMarket closePopUp(){
        clickOnElement(popUP);

        return new UnitedStatesMarket();
    }
}
