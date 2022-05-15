package testVerizon;

import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {
    @Test
    public void testVerifySignInLinkFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickSignIn();
        //Assert.assertTrue(isElementVisible(homePage.signInConfirmation));
    }
    @Test
    public void testVerifyShopLinkFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickShopButton();
        //Assert.assertTrue(isElementVisible(homePage.));
    }
    @Test
    public void testVerifyDealsLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickDealsLink();
        //Assert.assertTrue(isElementVisible(homePage.));
    }
    @Test
    public void testVerifyStoresLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickStorsLink();
        //Assert.assertTrue(isElementVisible(homePage.));
    }
    @Test
    public void testVerifySupportLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickSupportLink();
        //Assert.assertTrue(isElementVisible(homePage.));
    }
    @Test
    public void testVerifyPersonalLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickPersonalButton();
        //Assert.assertTrue(isElementVisible(homePage.));
    }
    @Test
    public void testVerifyBusinessLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickBusinessButton();
        //Assert.assertTrue(isElementVisible(homePage.));
    }
    @Test
    public void testVerifyPlansLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickPlansButton();
        //Assert.assertTrue(isElementVisible(homePage.));
    }
    @Test
    public void testVerifyHomeInternetLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickHomeInternet();
        //Assert.assertTrue(isElementVisible(homePage.));

    }


}
