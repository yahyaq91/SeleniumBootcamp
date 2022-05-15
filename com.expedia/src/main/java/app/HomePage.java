package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/div[2]")
    public WebElement signInLink;
    @FindBy(xpath ="//*[@id='wizardMainRegionV2']/div/div/div/div/ul/li[1]/a/span")
    public WebElement staysLink;











    public HomePage(){

         PageFactory.initElements(driver, this);

    }

    public void clickSignIn() {
    }
    public void clickStay(){

    }
}
