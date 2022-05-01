package app.shared;

import app.pom.SoccerPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//li[@class='sports menu-soccer']")
    public WebElement soccerTab;

    @FindBy(xpath = "//h1[@class='ClubhouseHeader__Name ttu flex items-start n2']")
    public WebElement teamSelectionConfirmation;

    @FindBy(xpath = "//h1[@class='headline headline__h1 dib']")
    public WebElement teamInfoSelectionConfirmation;
    

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public SoccerPage clickSoccerTab(){
        clickOnElement(soccerTab);

        return new SoccerPage();
    }
}
