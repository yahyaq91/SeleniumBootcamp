package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import shared.Homepage;

public class BusinessPage extends Homepage {


    public BusinessPage(){
        PageFactory.initElements(driver, this);
    }
    public void navigateBusinessPageOptions(String option){
        driver.findElement(By.xpath(String.format("//div[@class='gnav20-navigation']//button[contains(text(),'%s')][1]", option))).click();
    }
    public void selectBrand(String brand){
        driver.findElement(By.xpath(String.format("//div[@class='Tabs Tabs--accentBottom']//a[contains(text(),'%s')]", brand))).click();
    }

}
