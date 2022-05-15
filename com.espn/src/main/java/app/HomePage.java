package app;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {
    //FindBy(xpath="//*[@id='global-nav']/ul/li[1]/a/span/span[1]")
    //Public WebElement NFL;











    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickNFL() {

    }
}
