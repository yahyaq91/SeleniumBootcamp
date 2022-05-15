package testBankOfAmerica;

import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {
    @Test
    public void testVerifySignInToOnlineBankingLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.SignInToOnLineBanking();
        //String ExpectedTest = "clickSignInOnLineBankingLink";
        //Assert.assertEquals(ExpectedTest, "clickSignInOnLineBanking");
    }
    @Test
    public void testVerifyCheckingPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnChecking();
    }
    @Test
    public void testVerifyCreditCardsPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnCreditCards();
    }
    @Test
    public void testVerifyHomeLoansPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnHomeLoans();
    }
    @Test
    public void testVerifyAutoLoansPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnAutoLoans();
    }
    @Test
    public void testVerifyInvestingPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnInvesting();
    }
    @Test
    public void testVerifySmallBusinessPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnSmallBusiness();
    }
    @Test
    public void testVerifyWealthManagementPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnWealthManagement();
    }
    @Test
    public void testVerifyPersonalPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnPersonal();
    }
    @Test
    public void testVerifySecurityPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnSecurity();
    }
    @Test
    public void testVerifyBetterMoneyHabitsPageLinkFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnBetterMoneyHabits();
    }
}







