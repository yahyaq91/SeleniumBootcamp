package TestAtt;

import app.HomePage;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.BasePage.driver;

public class testHomePage {
    @Test
    public void testVerifyDealsPageLinkFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickDeals();
    }
    @Test
    public void testVerifyPageLinkWirelessLinkFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickWireless();

    } @Test
    public void testVerifyInternetLinkPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnInternetLink();

    } @Test
    public void testVerifyTVLinkPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnTvLink();

    } @Test
    public void testVerifyPrepaidLinkPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnPrepaidLink();
    }
    @Test
    public void testVerifyBundlesLinkPageLinkFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickBundlesLink();
    }
    @Test
    public void testVerifyAccessoriesLinkPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickAccessoriesLink();
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
