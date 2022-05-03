package app.shared;

import app.pom.NewsroomPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='https://newsroom.expedia.com/']")
    public WebElement newsroomPage;

    @FindBy(xpath = "//h1[@class='page_header']")
    public WebElement selectionConfirmation;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public NewsroomPage clickNewsroomPageButton(){
        clickOnElement(newsroomPage);

        return new NewsroomPage();
    }
}

