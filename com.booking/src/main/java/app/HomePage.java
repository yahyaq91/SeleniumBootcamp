package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy(xpath ="//*[@id='b2indexPage']/header/nav[1]/div[2]/div[5]/a/span")
    public WebElement rejisterLink;


    public HomePage(){
        PageFactory.initElements(driver, this);



}

    public void clickRejisterLink() {

    }
}
