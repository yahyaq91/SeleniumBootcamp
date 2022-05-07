package shared;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//span[@class='chapter-engine__eyebrow']")
    public WebElement amgEngineViewConfirmation;
    @FindBy(xpath = "//div[@class='specialty-carousel__counter']")
    public WebElement amgPerformanceViewConfirmation;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public MercedesNavigationPage navigateMenu(String option){
        driver.findElement(By.xpath(String.format("//nav[@class=\"global-header__menu-l1 global-header__menu-l1--" +
                "closed\"]//li[@class=\"global-header__menu-l1-list-item\"]//button[contains(text(),'%s')]",
                option))).click();
        return new MercedesNavigationPage();
    }
}
