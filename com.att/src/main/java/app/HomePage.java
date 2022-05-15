package app;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy(xpath ="//*[@id='z1-tier1Nav']/child::div['class=z1_cta_widget']/child::[1])")
    public WebElement dealsLink;

    @FindBy(xpath ="//*[@id=\"z1-tier1Nav\"]/a[2]/span")
    public WebElement wirelessLink;

    @FindBy(xpath = "//*[@id=\"z1-tier1Nav\"]/a[3]/span")
    public WebElement internetLink;

    @FindBy(xpath ="//*[@id=\"z1-tier1Nav\"]/a[4]/span")
    public WebElement TVLink;

    @FindBy(xpath ="//*[@id=\"z1-tier1Nav\"]/a[5]/span")
    public WebElement prepaidLink;

    @FindBy(xpath ="//*[@id=\"HEADBAND06\"]/span/a/div/svg/path")
    public WebElement bundles;

    @FindBy(xpath ="//*[@id=\"tab-desktop-menu\"]/li[9]/a/span[1]")
    public WebElement accessories;

    //@FindBy(xpath ="")
    //public WebElement








    public HomePage() {
            PageFactory.initElements(driver, this);
        }


    public void clickDeals() {
    }
}

