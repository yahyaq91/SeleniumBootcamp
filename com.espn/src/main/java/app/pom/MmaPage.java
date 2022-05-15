package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MmaPage extends Homepage {


    @FindBy(xpath ="//a[@name=\"&lpos=sitenavdefault+mma_mmaindex\"]")
    public WebElement mmaHome;

    @FindBy(xpath = "//li//a[@name='&lpos=subnav+subnav_mma_champions']")
    public WebElement championsPage;

    @FindBy(xpath = "//a[@name=\"&lpos=sitenavdefault+mma_mmap4p\"]")
    public WebElement P4pPage;

    @FindBy(xpath = "//a[@name=\"&lpos=sitenavdefault+mma_mmadivisional_rankings\"]")
    public WebElement divisionalRankingPage;


    @FindBy(xpath = "//a[@name=\"&lpos=sitenavdefault+mma_mmapfl\"]")
    public WebElement pflPage;


    public MmaPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickMMAHome(){
        clickOnElement(mmaHome);
    }
    public void clickChampions(){
        clickOnElement(championsPage);
    }

    public void clickP4p(){
        clickOnElement(P4pPage);
    }

    public void clickDivisionalRanking(){
        clickOnElement(divisionalRankingPage);
    }

    public void clickPfl(){
        clickOnElement(pflPage);
    }

}


