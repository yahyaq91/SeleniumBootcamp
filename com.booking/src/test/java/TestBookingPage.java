import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;

public class TestBookingPage extends Homepage {
    @Test
    public void testNewYorkStay() {

        Homepage homepage = new Homepage();
        String destination = "New York";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }
        Assert.assertEquals(getElementText(homepage.destinationConfirmation), excel.readStringList("Locations").get(0));

    }

    @Test
    public void testCaliforniaStay() {

        Homepage homepage = new Homepage();
        String destination = "California";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }

        Assert.assertEquals(getElementText(homepage.destinationConfirmation), excel.readStringList("Locations").get(1));

    }
}
