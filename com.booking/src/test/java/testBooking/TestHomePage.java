package testBooking;

import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {
    @Test
    public void testVerifyRegisterPageLinkFunctionality() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickRejisterLink();
        Thread.sleep(6000);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.booking.com/");

    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }
    @Test
    public void testVerify PageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.click();
    }

}
