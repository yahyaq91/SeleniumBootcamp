package shared;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

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
