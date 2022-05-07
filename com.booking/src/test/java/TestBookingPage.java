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
    @Test
    public void testLondonStay() {
        Homepage homepage = new Homepage();
        String destination = "Greater London";
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

        Assert.assertEquals(getElementText(homepage.destinationConfirmation), excel.readStringList("Locations").get(2));
    }
    @Test
    public void testParisStay() {
        Homepage homepage = new Homepage();
        String destination = "Paris";
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

        Assert.assertEquals(getElementText(homepage.destinationConfirmation), excel.readStringList("Locations").get(3));
    }
    @Test
    public void testMadridStay() {
        Homepage homepage = new Homepage();
        String destination = "Madrid";
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

        Assert.assertEquals(getElementText(homepage.destinationConfirmation), excel.readStringList("Locations").get(4));
    }
    @Test
    public void testMilanStay() {
        Homepage homepage = new Homepage();
        String destination = "Milan";
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

        Assert.assertEquals(getElementText(homepage.destinationConfirmation), excel.readStringList("Locations").get(5));
    }

}
