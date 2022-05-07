import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.ListingPage;

public class TestListingPage extends BasePage {
    @Test
    public void testFindHomeInAustin() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Austin");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(0);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInTampa() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Tampa");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(1);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInNewYork() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("New York");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(2);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInMcLeanVA() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Mclean");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(3);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInMinneapolis() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Minneapolis");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(4);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInCincinnati() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Cincinnati");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(5);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInSanFrancisco() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("San Francisco");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(6);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInSacramento() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Sacramento");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(7);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInNashville() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Nashville");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(8);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInAtlanta() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Atlanta");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(9);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInBoston() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Boston");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(10);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInPortland() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Portland");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(11);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInHouston() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Houston");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(12);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInDallas() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Dallas");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(13);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testFindHomeInSeattle() {
        Homepage homepage = new Homepage();
        homepage.navigateToAnyUSHomeListing("Seattle");
        ListingPage listingPage = new ListingPage();
        listingPage.waitForFirstHomeCard();

        String actualLocation = listingPage.locationTagText.getText();
        String expectedLocation = excel.readStringList("USCities").get(14);

        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
}