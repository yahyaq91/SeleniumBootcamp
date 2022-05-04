package expedia;

import app.shared.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVacationSearch extends BasePage {

    @Test
    public void testTripToNYC() {
        Homepage homepage = new Homepage();
        homepage.refreshPage();

        homepage.selectRandomDestinationResultItem("NYC");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("Flights").get(0);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToMexico() {
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Mexico");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("Flights").get(1);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToSouthAfrica() {
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("South Africa");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("Flights").get(2);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToIstabul() {
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Istanbul");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("Flights").get(3);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToJapan() {
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Japan");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("Flights").get(4);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testTripToRome() {
        Homepage homepage = new Homepage();
        homepage.refreshPage();


        homepage.selectRandomDestinationResultItem("Rome");
        homepage.selectCurrentCheckInDate();
        homepage.selectCheckOutDateWithinTwoWeeks();
        homepage.applyChanges();

        String actualResult = homepage.mapHeaderText.getText();
        String expectedResult = excel.readStringList("Flights").get(5);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}