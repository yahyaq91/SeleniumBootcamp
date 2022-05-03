package expedia;

import app.pom.NewsroomPage;
import app.shared.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNewsroomPage extends BasePage {
    @Test
    public void testObtainingInfoOnMultimedia(){
        Homepage homepage = new Homepage();
        NewsroomPage newsroomPage = homepage.clickNewsroomPageButton();
        switchToTab();
        newsroomPage.clickMultimediaOption();

        Assert.assertTrue(isElementVisible(newsroomPage.selectionConfirmation));
        Assert.assertEquals(getElementText(newsroomPage.selectionConfirmation), excel.readStringList("NewsroomPage").get(0));
    }
    @Test
    public void testObtainingInfoOnAwards(){
        Homepage homepage = new Homepage();
        NewsroomPage newsroomPage = homepage.clickNewsroomPageButton();
        switchToTab();
        newsroomPage.clickAwardsPage();

        Assert.assertTrue(isElementVisible(newsroomPage.selectionConfirmation));
        Assert.assertEquals(getElementText(newsroomPage.selectionConfirmation), excel.readStringList("NewsroomPage").get(1));
    }
    @Test
    public void testObtainingInfoOnExpediaInternational(){
        Homepage homepage = new Homepage();
        NewsroomPage newsroomPage = homepage.clickNewsroomPageButton();
        switchToTab();
        newsroomPage.clickExpediaInternationalPage();

        Assert.assertTrue(isElementVisible(newsroomPage.selectionConfirmation));
        Assert.assertEquals(getElementText(newsroomPage.selectionConfirmation), excel.readStringList("NewsroomPage").get(2));
    }
    @Test
    public void testObtainingInfoOnOutTravelTheSystem(){
        Homepage homepage = new Homepage();
        NewsroomPage newsroomPage = homepage.clickNewsroomPageButton();
        switchToTab();
        newsroomPage.clickOutTravelTheSystemPage();

        Assert.assertTrue(isElementVisible(newsroomPage.selectionConfirmation));
        Assert.assertEquals(getElementText(newsroomPage.selectionConfirmation), excel.readStringList("NewsroomPage").get(3));
    }
}
