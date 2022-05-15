package app.shared;

import app.pom.MmaPage;
import app.pom.SoccerPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {


//    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[5]/a")
//    public WebElement soccerTab;



//    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[5]/div/ul[1]/li[7]/a")
//    public WebElement teamSelectionConfirmation;
//
//    @FindBy(xpath = "//*[@id=\"nav-menu-item-4196\"]/span0")
//    public WebElement teamInfoSelectionConfirmation;




    @FindBy (xpath = "//a[@name=\"&lpos=sitenavdefault+sitenav_mma\"]")
            public WebElement mmaTab;

    @FindBy (xpath = "//*[@id=\"news-feed\"]/article[1]/section/a/div/div[3]/h1")
    public WebElement homePageConfirmation;

    @FindBy(xpath = "//header[@class=\"article-header\"]")
    public WebElement championsPageConfirmation;


    @FindBy(xpath = "//*[@id=\"article-feed\"]/article[1]/div/header")
    public WebElement p4pPageConfirmation;

    @FindBy(xpath = "\\header[@class=\"article-header\"]")
    public WebElement divisionalRankingPageConfirmation;

    @FindBy(xpath = "//a[@class=\"contentItem__padding watch-link\"]")
    public WebElement pflPageConfirmation;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

//    public SoccerPage clickSoccerTab(){
//        clickOnElement(soccerTab);
//
//        return new SoccerPage();
//    }


    public MmaPage clickMMATab(){
        clickOnElement(mmaTab);

        return new MmaPage();
    }


}
