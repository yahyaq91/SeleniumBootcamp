package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import shared.Homepage;

public class RatesMarket extends Homepage {

    public RatesMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectRatesMarket(){
        clickOnElement(ratesMarket);
    }
    public void navigateRatesMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}
