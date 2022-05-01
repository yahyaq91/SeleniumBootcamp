package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoccerPage extends Homepage {

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+soccer_soccerteams']")
    public WebElement teamsButton;
    @FindBy(xpath = "//li[@class='Nav__Secondary__Menu__Item flex items-center n7 relative Nav__Secondary__Menu__Item--active']")
    public WebElement teams;



    public SoccerPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickTeamsButton(){
        clickOnElement(teamsButton);
    }
    public void hoverTeams(){
        hoverOverElement(teams);
    }
    public void teamSelection(String team){
        driver.findElement(By.xpath(String.format("//ul[@class='Nav__Dropdown__Menu__List']//span[contains(text(),'%s')]",team))).click();

    }
    public void navigationOptions(String option){
        driver.findElement(By.xpath(String.format("//ul[@class='Nav__Secondary__Menu center flex items-center relative']//span[contains(text(),'%s')]",
                option))).click();

    }
    public void selectStatsCriteria(String criteria){
        driver.findElement(By.xpath(String.format("//ul[@class='tabs__list']//a[contains(text(),'%s')]", criteria))).click();
    }

}
