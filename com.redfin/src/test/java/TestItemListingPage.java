import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.ItemListingPage;

public class TestItemListingPage extends BasePage {
    @Test
    public void testFindHomeInAustin() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Austin");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(0);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInTampa() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Tampa");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(1);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInNewYork() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("New York");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(2);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInMcLeanVA() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Mclean");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(3);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInMinneapolis() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Minneapolis");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(4);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInCincinnati() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Cincinnati");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(5);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInSanFrancisco() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("San Francisco");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(6);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInSacramento() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Sacramento");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(7);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInNashville() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Nashville");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(8);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInAtlanta() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Atlanta");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(9);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testFindHomeInBoston() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Boston");
        ItemListingPage listingPage = new ItemListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(10);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
}
