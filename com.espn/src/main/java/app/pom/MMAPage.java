package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMAPage extends Homepage {

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+mma_mmaindex']")
    public WebElement mmaHome;

    @FindBy(xpath = "//li//a[@name='&lpos=subnav+subnav_mma_champions']")
    public WebElement championsPage;


    public MMAPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickMMAHome(){
        clickOnElement(mmaHome);
    }
    public void clickChampions(){
        clickOnElement(championsPage);
    }

}
