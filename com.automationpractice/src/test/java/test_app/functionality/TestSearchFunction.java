package test_app.functionality;

import app.pom.Catalog;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestSearchFunction extends TestBasePage {
    @Test
    public void testSearchWithSearchBar(){
        Homepage homepage = new Homepage();
        Catalog catalog = homepage.searchBar("dresses");
        catalog.clickSubmitSearchButton();

        Assert.assertTrue(isElementVisible(catalog.searchConfirmation));
        Assert.assertEquals(getElementText(catalog.searchConfirmation), excel.readStringList("SearchFunction").get(0));
    }
    @Test
    public void testSearchForLocalStore(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickDiscoverStoreButton();
        catalog.enterSearchData("10029");
        catalog.selectRadius(2);
        catalog.clickSearchButton();

       Assert.assertTrue(isElementVisible(catalog.locatorConfirmation));
        Assert.assertEquals(getElementText(catalog.locatorConfirmation), excel.readStringList("SearchFunction").get(1));
    }
    @Test
    public void testSearchForSpecials(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickSpecialsButton();

        Assert.assertTrue(isElementVisible(catalog.specialsConfirmation));
        Assert.assertEquals(getElementText(catalog.specialsConfirmation), excel.readStringList("SearchFunction").get(2));
    }

}
