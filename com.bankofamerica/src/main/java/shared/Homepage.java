package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pop.ContactUs;

public class Homepage extends BasePage {
    @FindBy(xpath = "//a[@id='footer_bofa_contactus']")
    public WebElement contactUs;
    @FindBy(xpath = "//div[@class='column-content equalize']//h3")
    public WebElement makingClientsPriorityConfirmation;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public ContactUs clickContactUs(){
        clickOnElement(contactUs);

        return new ContactUs();
    }
}
