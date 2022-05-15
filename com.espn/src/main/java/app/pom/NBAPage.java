package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NBAPage extends Homepage {

    @FindBy(xpath = "//li[@class='Nav__Secondary__Menu__Item flex items-center n7 relative Nav__Secondary__Menu__Item--active']")
    public WebElement teamsDropDownList;

    @FindBy(xpath = "//li[@class='teams nba sub']//a[@name='&lpos=sitenavdefault+nba_nbateams']")
    //@FindBy(id = "nav-menu-item-7050")
    public WebElement teamsButton;


    public NBAPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickTeamsButton() {
        clickOnElement(teamsButton);
    }
    public void hoverOverNBATeamsDropDown() {
        hoverOverElement(teamsDropDownList);
    }
    public void selectNBATeam(String team){
        driver.findElement(By.xpath(String.format("//ul[@class='Nav__Dropdown__Group flex pa3 bg-clr-gray-09 flex-wrap is--3']//span[contains(text(),'%s')]", team))).click();
    }
}