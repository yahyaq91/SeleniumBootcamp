package testAutomationPractice;

import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testVerifyRegisterLinkFunctionality()throws InterruptedException{
        HomePage homePage = new HomePage();
        homePage.clickOnRegister();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.automationpractice.com");

    }
    @Test
    public void testVerifySignInLinkFunctionality() throws Throwable {
        HomePage homePage = new HomePage();
        homePage.clickOnSignIn();
        //String URL = driver.getCurrentUrl();
        //Assert.assertEquals(URL,"http://automationpractice.com/index.php");
    }
    @Test
    public void testVerifyHomePageLogoLinkFunctionality() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnHomePageLogo();
        Thread.sleep(6000);
        //Assert.assertTrue(isElementVisible());
    }
    @Test
    public void testVerifySearchBoxPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickSearchBox();
    }
    @Test
    public void testVerifySearchButtonPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnSearchButton();
    }
    //@Test
    //public void testVerify PageLinkFunctionality() {
        //HomePage homePage = new HomePage();
       // homePage.click();
    //}
   // @Test
    //public void testVerify PageLinkFunctionality() {
       // HomePage homePage = new HomePage();
       // homePage.click();
    //}
   // @Test
    //public void testVerify PageLinkFunctionality() {
        //HomePage homePage = new HomePage();
        //homePage.click();
   // }
    //@Test
    //public void testVerify PageLinkFunctionality() {
        //HomePage homePage = new HomePage();
       // homePage.click();
    //}
   // @Test
    //public void testVerify PageLinkFunctionality() {
       // HomePage homePage = new HomePage();
       // homePage.click();
    //}
    //@Test
    //public void testVerify PageLinkFunctionality() {
       // HomePage homePage = new HomePage();
        //homePage.click();
    //}
    //@Test
    //public void testVerify PageLinkFunctionality() {
        //HomePage homePage = new HomePage();
        //homePage.click();
    //}
    //@Test
   // public void testVerify PageLinkFunctionality() {
       // HomePage homePage = new HomePage();
       // homePage.click();
    //}
    //@Test
    //public void testVerify PageLinkFunctionality() {
        //HomePage homePage = new HomePage();
       // homePage.click();
    //}
}
