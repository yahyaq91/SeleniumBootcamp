package app.shared;

import app.pom.MMAPage;
import app.pom.NBAPage;
import app.pom.SoccerPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//li[@class='sports menu-soccer']")
    public WebElement soccerTab;

    @FindBy(xpath = "//li[@class='sports menu-mma']")
    public WebElement mmaTab;

    @FindBy(xpath = "//li[@class='sports menu-nba']")
    public WebElement nbaTab;

    @FindBy(xpath = "//h1[@class='ClubhouseHeader__Name ttu flex items-start n2']")
    public WebElement teamSelectionConfirmation;



    @FindBy(xpath = "//h1[@class='headline headline__h1 dib']")
    public WebElement teamInfoSelectionConfirmation;

    @FindBy(xpath = "//header[@class='article-header']")
    public WebElement championsPageConfirmation;
    

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public SoccerPage clickSoccerTab(){
        clickOnElement(soccerTab);

        return new SoccerPage();
    }
    public MMAPage clickMMATab(){
        clickOnElement(mmaTab);

        return new MMAPage();
    }
    public NBAPage clickNBATab(){
        clickOnElement(nbaTab);

        return new NBAPage();
    }
}
