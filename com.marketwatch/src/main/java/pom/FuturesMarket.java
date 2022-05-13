package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import shared.Homepage;

public class FuturesMarket extends Homepage {

    public FuturesMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectFuturesMarket(){
        clickOnElement(futuresMarket);
    }
    public void navigateFuturesMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}
