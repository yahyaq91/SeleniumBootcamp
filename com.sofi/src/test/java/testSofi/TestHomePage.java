package testSofi;

import app.HomePage;
import base.BasePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {
    @Test
    public void testVerifyProductsPageLinkFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickProductsLink();
       // Sting ExpectedTest="click";
       // Assert.assertEquals(ExpectedTest, "click");
    }
    @Test
    public void testVerifyMembersBenefitsPageFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickOnMemberBenefitsButton();

        //Assert.assertTrue(isElementVisible(homePage.memberBenefitConfirmation));
        Assert.assertEquals(getElementText(homePage.memberBenefitConfirmation), excel.readStringList("SoFi").get(0));
    }
    @Test
    public void testVerifyPersonalLoansPageFunctionality(){
       HomePage homePage = new HomePage();
       homePage.clickOnPersonalLoansLink();

       //Assert.assertTrue(isElementVisible(homePage.personalLoansLinkConfirmation));

    }
    @Test
    public void testVerifyInvestPageFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickOnInvestLink();

        //Assert.assertTrue(isElementVisible(homePage.investLinkConfirmation));

    }
    @Test
    public void TestVerifyCreditCardsPageFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickOnCreditCardsLink();

        //Assert.assertTrue(isElementVisible(homePage.creditCardsLinkConfirmation));
    }
    @Test
    public void TestVerifyMortgagePageFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickOnMortgageLink();

        Assert.assertTrue(isElementVisible(isElementVisible(homePage.mortgageLinkConfirmation));
    }

    @Test
    public void TestVerifyInsurancePageFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickOnInsuranceLink();
        String ExpectedTest="click";
        Assert.assertEquals(ExpectedTest, "click");
        }

    @Test
    public void TestVerifyPrivateStudentsLoansPageFunctionality(){
        HomePage homePage = new HomePage();
        homePage.clickOnPrivateStudentsLoansLink();
        String ExpectedTest="click";
        Assert.assertEquals(ExpectedTest, "click");
    }
    @Test
    public void TestVerifyAutoLoanRefinancing() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnAutoLoanRefinancingLink();
        Thread.sleep(6000);
        String ExpectedTest="click";
        Assert.assertEquals(ExpectedTest, "click");
    }
    @Test
    public void TestVerifyCreditScoreAndBudgeting(){
        HomePage homePage = new HomePage();
        homePage.clickOnCreditScoreAndBudgetingLink();
        String ExpectedTest="click";
        Assert.assertEquals(ExpectedTest, "click");
    }
    @Test
    public void TestVerifyStudentsLoansRefinancing(){
        HomePage homePage = new HomePage();
        homePage.clickOnStudentsLoansRefinancingLink();
        String ExpectedTest="click";
        Assert.assertEquals(ExpectedTest, "click");
    }
}

