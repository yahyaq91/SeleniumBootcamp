package test_app.functionality;

import app.pom.Catalog;
import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;


public class TestFilters extends TestBasePage {
    @Test
    public void testFilteringByColorBlack() {
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectBlackOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectBlackOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(0));

    }
    @Test
    public void testFilteringByColorBeige(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectBeigeOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectBeigeOption();


        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(1));
    }
    @Test
    public void testFilteringByColorBlue(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectBlueOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectBlueOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(2));
    }
    @Test
    public void testFilteringByColorYellow(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectYellowOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectYellowOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(3));
    }
    @Test
    public void testFilteringByColorWhite(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectWhiteOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectWhiteOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(4));
    }
    @Test
    public void testFilteringByColorOrange(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectOrangeOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectOrangeOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(5));
    }
    @Test
    public void testFilteringByColorGreen(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectGreenOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectGreenOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(6));
    }
    @Test
    public void testFilteringByColorPink(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.selectPinkOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectPinkOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(7));
    }
    @Test
    public void testFilteringByStyleCasual(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickCasualOption();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(8));
    }
    @Test
    public void testFilteringByStyleDressy(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickDressyOption();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(9));
    }
    @Test
    public void testFilteringByStyleGirly(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickGirlyOption();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(10));
    }
    @Test
    public void testFilterCategoryToTops(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickTopsFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(11));
    }
    @Test
    public void testFilterCategoryToDresses(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickDressesFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(12));
    }
    @Test
    public void testFilterBySizeS(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickSmallFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(13));
    }
    @Test
    public void testFilterBySizeM(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickMediumFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(14));
    }
    @Test
    public void testFilterBySizeL(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickLargeFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(15));
    }
    @Test
    public void testFilterByPropertyColorfulDress(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickColorfulDressFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(16));
    }
    @Test
    public void testFilterByPropertyMaxiDress(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickMaxiDressFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(17));
    }
    @Test
    public void testFilterByPropertyMidiDress(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickMidiDressFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(18));
    }
    @Test
    public void testFilterByPropertyShortDress(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickShortDressFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(19));
    }
    @Test
    public void testFilterByPropertyShortSleeve(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickShortSleeveFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(20));
    }
    @Test
    public void testFilterByCompositionCotton(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickCottonFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(21));
    }
    @Test
    public void testFilterByCompositionPolyester(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickPolyesterFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(22));
    }
    @Test
    public void testFilterByCompositionViscose(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickViscoseFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(23));
    }
    @Test
    public void testFilterByAvailability(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickInStockFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(24));

    }
    @Test
    public void testFilterByManufacturer(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickFashionManufacturerFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(25));
    }
    @Test
    public void testFilterByCondition(){
        Homepage homepage = new Homepage();

        Catalog catalog = homepage.clickWomenOption();
        catalog.clickNewConditionFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("Filters").get(26));
    }
}