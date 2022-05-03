package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsroomPage extends Homepage {

    @FindBy(xpath = "//a[@href=\"https://newsroom.expedia.com/multimedia\"]")
    public WebElement multimediaOption;

    @FindBy(xpath = "//a[@href='https://newsroom.expedia.com/awards']")
    public WebElement awardsPage;

    @FindBy(xpath = "//a[@href='https://newsroom.expedia.com/international']")
    public WebElement expediaInternational;

    @FindBy(xpath = "//a[@href='https://newsroom.expedia.com/ottspodcast']")
    public WebElement outTravelTheSystem;


    public NewsroomPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickMultimediaOption(){
        clickOnElement(multimediaOption);
    }
    public void clickAwardsPage(){
        clickOnElement(awardsPage);
    }
    public void clickExpediaInternationalPage(){
        clickOnElement(expediaInternational);
    }
    public void clickOutTravelTheSystemPage(){
        clickOnElement(outTravelTheSystem);
    }

}
