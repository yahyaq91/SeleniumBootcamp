import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pop.ContactUs;
import shared.Homepage;

public class TestContactUsPage extends BasePage {
    @Test
    public void testMakingClientsOurPriorityVideo() throws InterruptedException {
        Homepage homepage = new Homepage();
        ContactUs contactUs = homepage.clickContactUs();
        contactUs.clickShareFeedback();
        Thread.sleep(3000);
        contactUs.clickPlayPauseForClientCareVideo();
        contactUs.enableFullScreen();
        Thread.sleep(10000);
        contactUs.enableDisableSubtitles();
        Thread.sleep(20000);
        contactUs.progressSlider(0);
        Thread.sleep(3000);
        contactUs.disableFullScreen();

        Assert.assertTrue(isElementVisible(contactUs.makingClientsPriorityConfirmation));
        Assert.assertEquals(getElementText(contactUs.makingClientsPriorityConfirmation),
                excel.readStringList("ContactUs").get(0));
    }
}
