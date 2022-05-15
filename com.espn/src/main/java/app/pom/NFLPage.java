package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NFLPage extends Homepage {

    @FindBy(xpath = "//li[@class='Nav__Secondary__Menu__Item flex items-center n7 relative Nav__Secondary__Menu__Item--active']")
    public WebElement teamsDropDownList;

//    @FindBy(xpath = "//li[@class='teams nfl sub']//a[@name='&lpos=subnav+subnav_nfl_teams']")
    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+nfl_nflteams']")
    //li[@class='teams nba sub']//a[@name='&lpos=sitenavdefault+nba_nbateams']&lpos=subnav+subnav_nba_teams
    public WebElement NFLTeamsButton;


    public NFLPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickTeamsButton() {
        clickOnElement(NFLTeamsButton);
    }

    public void hoverOverNFLTeamsDropDown() {
        hoverOverElement(teamsDropDownList);
    }

    public void selectNFLTeam(String team) {
        driver.findElement(By.xpath(String.format("//ul[@class='Nav__Dropdown__Group flex pa3 bg-clr-gray-09 flex-wrap is--3']//span[contains(text(),'%s')]", team))).click();
    }
}