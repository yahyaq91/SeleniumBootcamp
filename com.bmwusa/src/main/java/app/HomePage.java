package app;

import Shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SystemBar {
    @FindBy(xpath = "//html/body/div[1]/div/div/div[2]/div[4]/div/nav/ul/li[1]/button/span")
    public WebElement ModelsLink;










    public HomePage(){
        PageFactory.initElements(driver, this);
}

    public void clickModels() {
        
    
    }

    public void clickModel() {
    }
}
