package app.shared;


import app.pom.NBAPage;
import app.pom.NFLPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {


    @FindBy(xpath = "//li[@class='sports menu-nba']")
    public WebElement nbaTab;
    @FindBy(xpath = "//li[@class='sports menu-nfl']")
    public WebElement nflTab;

    @FindBy(xpath = "//h1[@class='ClubhouseHeader__Name ttu flex items-start n2']")
    public WebElement teamSelectionConfirmation;



    @FindBy(xpath = "//h1[@class='headline headline__h1 dib']")
    public WebElement teamInfoSelectionConfirmation;

    @FindBy(xpath = "//header[@class='article-header']")
    public WebElement championsPageConfirmation;


    public Homepage() {
        PageFactory.initElements(driver, this);
    }



    public NFLPage clickNFLTab(){
        clickOnElement(nflTab);

        return new NFLPage();
    }
    public NBAPage clickNBATab(){
        clickOnElement(nbaTab);

        return new NBAPage();
    }
}