package espn.soccer_page;

import app.pom.SoccerPage;
import app.shared.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLocatingSoccerTeams extends BasePage {
    @Test
    public void testLocatingRealMadrid(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Real Madrid");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(0));
    }
    @Test
    public void testLocatingPSG(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("PSG");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(1));
    }
    @Test
    public void testLocatingManchesterUnited(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Manchester United");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(2));
    }
    @Test
    public void testLocatingManchesterCity(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Manchester City");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(3));
    }
    @Test
    public void testLocatingJuventus(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Juventus");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(4));
    }
    @Test
    public void testLocatingBayernMunich(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Bayern Munich");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(5));
    }
    @Test
    public void testLocatingBarcelona(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Barcelona");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(6));
    }
    @Test
    public void testLocatingLiverpool(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Liverpool");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(7));
    }
    @Test
    public void testLocatingBorussiaDortmund(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Borussia Dortmund");

        Assert.assertTrue(isElementVisible(soccerPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamSelectionConfirmation), excel.readStringList("SoccerPage").get(8));
    }

}
