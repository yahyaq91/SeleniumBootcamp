package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.MercedesNavigationPage;


public class VehiclePage extends MercedesNavigationPage {

    @FindBy(xpath = "//button[@class='html5-video-control__button animation-element']")
    public WebElement videoControl;
    @FindBy(xpath = "//button[@class='specialty-carousel__button specialty-carousel__button--next']")
    public WebElement explorePerformance;



    public VehiclePage(){
        PageFactory.initElements(driver, this);
    }
    public void clickVideoControl(){
        clickOnElement(videoControl);
    }
    public void navigateMedia(String options){
        driver.findElement(By.xpath(String.format("//div[@class=\"waypoint-nav__container sticky-nav__container\"]" +
                "//span[contains(text(),'%s')]", options))).click();
    }
    public void clickExplorePerformance() throws InterruptedException {
        webDriverWait.wait(3000);clickOnElement(explorePerformance);}
}
