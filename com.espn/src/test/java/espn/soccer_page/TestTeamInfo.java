package espn.soccer_page;

import app.pom.SoccerPage;
import app.shared.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTeamInfo extends BasePage {
    @Test
    public void testObtainingRealMadridTeamInfoOnPerformance(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Real Madrid");
        soccerPage.navigationOptions("Stats");
        soccerPage.selectStatsCriteria("Performance");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(0));
    }
    @Test
    public void testObtainingRealMadridTeamInfoOnDiscipline(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Real Madrid");
        soccerPage.navigationOptions("Stats");
        soccerPage.selectStatsCriteria("Discipline");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(1));
    }
    @Test
    public void testObtainingRealMadridTeamInfoOnScoring(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Real Madrid");
        soccerPage.navigationOptions("Stats");
        soccerPage.selectStatsCriteria("Scoring");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(2));
    }
    @Test
    public void testObtainingRealMadridResults(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Real Madrid");
        soccerPage.navigationOptions("Results");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(3));
    }
    @Test
    public void testObtainingRealMadridSquadList(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Real Madrid");
        soccerPage.navigationOptions("Squad");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(4));
    }
    @Test
    public void testObtainingRealMadridTransfers(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("Real Madrid");
        soccerPage.navigationOptions("Transfers");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(5));
    }
    @Test
    public void testObtainingPSGTeamInfoOnPerformance(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("PSG");
        soccerPage.navigationOptions("Stats");
        soccerPage.selectStatsCriteria("Performance");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(6));
    }
    @Test
    public void testObtainingPSGTeamInfoOnDiscipline(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("PSG");
        soccerPage.navigationOptions("Stats");
        soccerPage.selectStatsCriteria("Discipline");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(7));
    }
    @Test
    public void testObtainingPSGTeamInfoOnScoring(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("PSG");
        soccerPage.navigationOptions("Stats");
        soccerPage.selectStatsCriteria("Scoring");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(8));
    }
    @Test
    public void testObtainingPSGResults(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("PSG");
        soccerPage.navigationOptions("Results");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(9));
    }
    @Test
    public void testObtainingPSGSquadList(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("PSG");
        soccerPage.navigationOptions("Squad");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(10));
    }
    @Test
    public void testObtainingPSGTransfers(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
        soccerPage.clickTeamsButton();
        soccerPage.hoverTeams();
        soccerPage.teamSelection("PSG");
        soccerPage.navigationOptions("Transfers");


        Assert.assertTrue(isElementVisible(soccerPage.teamInfoSelectionConfirmation));
        Assert.assertEquals(getElementText(homepage.teamInfoSelectionConfirmation), excel.readStringList("TeamInfo").get(11));
    }
}
