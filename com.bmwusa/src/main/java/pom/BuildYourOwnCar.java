package pom;

import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnCar extends Homepage {


    public BuildYourOwnCar() {
        PageFactory.initElements(driver, this);
    }
}