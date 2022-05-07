package accessories_page;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AccessoriesPage;
import pom.PhoneAccessories;
import pom.TabletAccessories;
import shared.Homepage;


public class TestAccessories extends Homepage {

    @Test
    public void testSearchForPhoneCases() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Cases");
        PhoneAccessories phoneAccessories = new PhoneAccessories();
        phoneAccessories.findCheapestPrice();
        Thread.sleep(3000);

        Assert.assertTrue(isElementVisible(ap.caseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.caseSearchConfirmation), excel.readStringList("Accessories").get(0));
    }
    @Test
    public void testSearchForPhoneScreenProtectors() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Screen Protectors");
        PhoneAccessories phoneAccessories = new PhoneAccessories();
        phoneAccessories.findCheapestPrice();
        Thread.sleep(3000);

        Assert.assertTrue(isElementVisible(ap.screenProtectorSearchConfirmation));
        Assert.assertEquals(getElementText(ap.screenProtectorSearchConfirmation),
                excel.readStringList("Accessories").get(1));
    }
    @Test
    public void testSearchForTabletCases() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("Cases");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();
        Thread.sleep(3000);

        Assert.assertTrue(isElementVisible(ap.tabletCaseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.tabletCaseSearchConfirmation),
               excel.readStringList("Accessories").get(2));
    }
    @Test
    public void testSearchForPhoneMagSafe() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("MagSafe");
        PhoneAccessories phoneAccessories = new PhoneAccessories();
        phoneAccessories.findCheapestPrice();
        Thread.sleep(3000);

        Assert.assertTrue(isElementVisible(ap.caseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.caseSearchConfirmation), excel.readStringList("Accessories").get(0));
    }
    @Test
    public void testSearchForTabletScreenProtectors() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("Screen Protectors");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();
        Thread.sleep(3000);

        Assert.assertTrue(isElementVisible(ap.screenProtectorSearchConfirmation));
        Assert.assertEquals(getElementText(ap.screenProtectorSearchConfirmation),
                excel.readStringList("Accessories").get(1));
    }
    @Test
    public void testSearchForTabletMagSafe() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("MagSafe");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();
        Thread.sleep(3000);

        Assert.assertTrue(isElementVisible(ap.caseSearchConfirmation));
        Assert.assertEquals(getElementText(ap.caseSearchConfirmation), excel.readStringList("Accessories").get(0));
    }
    @Test
    public void testSearchForTabletKeyboards() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickTabletAccessoriesColumnCategory("Keyboards");
        TabletAccessories tabletAccessories = new TabletAccessories();
        tabletAccessories.findCheapestPrice();
        Thread.sleep(3000);

        Assert.assertTrue(isElementVisible(ap.tabletAccessoriesSearchConfirmation));
        Assert.assertEquals(getElementText(ap.tabletAccessoriesSearchConfirmation),
                excel.readStringList("Accessories").get(3));
    }
}