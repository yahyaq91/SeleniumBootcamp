package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//a[@href='https://www.ebay.com/deals']")
    public WebElement dailyDealsLink;
    @FindBy(xpath ="//*[@id='gh-p-4']/a" )
    public WebElement brandOutletLink;





    public HomePage() {
    }
    {
            PageFactory.initElements(driver, this);
        }
        public void clickDailyDeals() {
    }
}
