package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.MercedesNavigationPage;


public class VehiclePage extends MercedesNavigationPage {

    @FindBy(xpath = "//button[@class='html5-video-control__button animation-element']")
    public WebElement videoControl;
    @FindBy(xpath = "//span[@class='specialty-apps-amg__button-label']")
    public WebElement exploreEngine;
    @FindBy(xpath = "//i[@class='icon-mb icon-volume engine-carousel-item__sound-icon']")
    public WebElement engineVolume;



//    @FindBy(xpath = "//a[@href='/en/contact-us/contact-a-dealer']")
//    public WebElement imInterested;
//
//    @FindBy(xpath = "//*[@id=\"leads-form-vehicle-selector\"]//div[2]/div/button/span")
//    public WebElement vehicleSelectionSubmission;
//
//    @FindBy(xpath = "//*[@id=\"_l2uwi0zguz4f3\"]")
//    public WebElement zipCode;

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
    public void hoverExploreEngine(){
        hoverOverElement(exploreEngine);
    }
    public void clickExploreEngine(){
        clickOnElement(exploreEngine);
    }
    public void clickForEngineVolume(){
        clickOnElement(engineVolume);
    }


//    public void clickImInterested(){
//        clickOnElement(imInterested);
//    }
//    public void dropdownSelection(String option){
//        driver.findElement(By.xpath(String.format("//span[@class='select-control__input-label-text']" +
//                "//span[contains(text(),'%s')]", option))).click();
//    }
//    public void chooseClass(String option){
//        driver.findElement(By.xpath(String.format("//ul[@class=\"select-control__list\"]//li[contains(text(),'%s')]",
//                option))).click();
//    }
//    public void chooseModel(String option){
//        driver.findElement(By.xpath(String.format("//ul[@class=\"select-control__list\"]//li[contains(text(),'%s')]",
//                option))).click();
//    }
//    public void clickVehicleSelectionSubmission(){
//        clickOnElement(vehicleSelectionSubmission);
//    }
//    public void enterZipCode(String zipcode){
//        clearSendKeysToElement(zipCode, zipcode);
//    }
//    public void submitZipCode(){
//        clickOnElement(zipCode);
//    }
}
