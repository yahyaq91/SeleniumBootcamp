package business_page;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BusinessPage;
import shared.Homepage;

public class TestBusinessShopPage extends BasePage {
    @Test
    public void testBusinessSmartPhonesAllBrands() throws InterruptedException {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        businessPage.navigateBusinessPageOptions("Shop");
        Thread.sleep(3000);
        businessPage.selectBrand("All");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(0));
    }
    @Test
    public void testBusinessSmartPhonesAppleBrands() throws InterruptedException {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        businessPage.navigateBusinessPageOptions("Shop");
        Thread.sleep(3000);
        businessPage.selectBrand("Apple");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(1));
    }
    @Test
    public void testBusinessSmartPhonesSamsungBrands() throws InterruptedException {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        businessPage.navigateBusinessPageOptions("Shop");
        Thread.sleep(3000);
        businessPage.selectBrand("Samsung");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(2));
    }
    @Test
    public void testBusinessSmartPhonesMotorolaBrands() throws InterruptedException {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        businessPage.navigateBusinessPageOptions("Shop");
        Thread.sleep(3000);
        businessPage.selectBrand("Motorola");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(3));
    }
    @Test
    public void testBusinessSmartPhonesGoogleBrands() throws InterruptedException {
        Homepage homepage = new Homepage();
        BusinessPage businessPage = homepage.clickOnBusinessPage();
        businessPage.navigateBusinessPageOptions("Shop");
        Thread.sleep(3000);
        businessPage.selectBrand("Google");

        Assert.assertTrue(isElementVisible(businessPage.smartPhoneBrandSearchConfirmation));
        Assert.assertEquals(getElementText(businessPage.smartPhoneBrandSearchConfirmation),
                excel.readStringList("Brands").get(4));
    }
}
