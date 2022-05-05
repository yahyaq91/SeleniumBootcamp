package test_app.smoke;

import app.pom.Homepage;
import app.pom.ItemVewPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class FunctionalityChecking extends TestBasePage {

    @Test
    public void testTheFunctionalityOfFilteringByColorYellow(){
        Homepage homepage = new Homepage();

        ItemVewPage itemVewPage = homepage.clickWomenOption();
        itemVewPage.selectYellowOption();
        itemVewPage.isElementInvisible(itemVewPage.loadingCircle);
        itemVewPage.selectYellowOption();

        Assert.assertTrue(isElementVisible(itemVewPage.filterConfirmation));

    }
    @Test
    public void testSearchForLocalStore(){
        Homepage homepage = new Homepage();

        ItemVewPage itemVewPage = homepage.clickWomenOption();
        itemVewPage.clickDiscoverStoreButton();
        itemVewPage.enterSearchData("10029");
        itemVewPage.selectRadius(2);
        itemVewPage.clickSearchButton();

        Assert.assertTrue(isElementVisible(itemVewPage.locatorConfirmation));
    }
    @Test
    public void testSearchForSpecials(){
        Homepage homepage = new Homepage();

       ItemVewPage itemVewPage = homepage.clickWomenOption();
        itemVewPage.clickSpecialsButton();

        Assert.assertTrue(isElementVisible(itemVewPage.specialsConfirmation));

    }

    @Test
    public void testIncreasingQuantityWithInputtingQuantity(){
        Homepage homepage = new Homepage();

        ItemVewPage itemVewPage = homepage.selectTShirtOption();
        itemVewPage.clickFadedShortSleeveOption();
        itemVewPage.setProductQuantity(2);
        itemVewPage.selectSize(0);
        itemVewPage.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(itemVewPage.addedToCartConfirmation));

    }
    @Test
    public void testSelectingColorOption(){
        Homepage homepage = new Homepage();

        ItemVewPage itemVewPage = homepage.selectTShirtOption();
        itemVewPage.clickFadedShortSleeveOption();
        itemVewPage.selectTShirtBlueOption();
        itemVewPage.selectSize(0);
        itemVewPage.pressAddToCartButton();

        Assert.assertTrue(isElementVisible(itemVewPage.addedToCartConfirmation));

    }

}
