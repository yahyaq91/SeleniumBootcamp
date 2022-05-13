package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import shared.Homepage;

public class CryptoMarket extends Homepage {

    public CryptoMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectCryptoMarket(){
        clickOnElement(cryptoMarket);
    }
    public void navigateCryptoMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}
