package shared;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pom.VehiclePage;

public class MercedesNavigationPage extends Homepage{

    public MercedesNavigationPage (){
        PageFactory.initElements(driver, this);
    }
    public VehiclePage navigateVehicleOptions(String options){
        driver.findElement(By.xpath(String.format("//div[@class=\"global-header__vehicles-link-list\"]" +
                "//a[contains(text(),'%s')]", options))).click();

        return new VehiclePage();
    }
}
