package app.shared;

import app.pom.SoccerPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//li[@class='sports menu-soccer']")
    public WebElement soccerTab;
    

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public SoccerPage clickSoccerTab(){
        clickOnElement(soccerTab);

        return new SoccerPage();
    }
}
