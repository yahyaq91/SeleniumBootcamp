package espn.nba_page;

import app.pom.NBAPage;
import app.shared.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNBAPage extends BasePage {
    @Test
    public void testNavigateToHoustonRocketsTeam(){
        Homepage homepage = new Homepage();
        NBAPage nbaTeam = homepage.clickNBATab();
        nbaTeam.clickTeamsButton();
        nbaTeam.hoverOverNBATeamsDropDown();
        nbaTeam.selectNBATeam("Houston Rockets");

        Assert.assertTrue(isElementVisible(nbaTeam.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaTeam.teamSelectionConfirmation), excel.readStringList("NBATeam").get(0));
    }
    @Test
    public void testNavigateToIndianaPacersPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Indiana Pacers");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(1));
    }
    @Test
    public void testNavigateToLAClippersPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("LA Clippers");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(2));
    }

    @Test
    public void testNavigateToAtlantaHawksPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Atlanta Hawks");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(3));
    }
    @Test
    public void testNavigateToBostonCelticsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Boston Celtics");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(4));
    }
    @Test
    public void testNavigateToBrooklynNetsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Brooklyn Nets");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(5));
    }
    @Test
    public void testNavigateToCharlotteHornetsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Charlotte Hornets");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(6));
    }
    @Test
    public void testNavigateToChicagoBullsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Chicago Bulls");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(7));
    }
    @Test
    public void testNavigateToClevelandCavaliersPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Cleveland Cavaliers");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(8));
    }
    @Test
    public void testNavigateToDallasMavericksPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Dallas Mavericks");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(9));
    }

    @Test
    public void testNavigateToLosAngelesLakersPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Los Angeles Lakers");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(10));
    }
    @Test
    public void testNavigateToMemphisGrizzliesPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Memphis Grizzlies");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(11));
    }
    @Test
    public void testNavigateToMiamiHeatPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Miami Heat");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(12));
    }
    @Test
    public void testNavigateToMilwaukeeBucksPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Milwaukee Bucks");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(13));
    }
    @Test
    public void testNavigateToMinnesotaTimberwolvesPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Minnesota Timberwolves");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(14));
    }

    @Test
    public void testNavigateToDenverNuggetsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Denver Nuggets");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(15));
    }
    @Test
    public void testNavigateToDetroitPistonsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Detroit Pistons");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(16));
    }



    @Test
    public void testNavigateToNewOrleansPelicansPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("New Orleans Pelicans");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(17));
    }
    @Test
    public void testNavigateToNewYorkKnicksPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("New York Knicks");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(18));
    }
    @Test
    public void testNavigateToOklahomaCityThunderPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Oklahoma City Thunder");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(19));
    }

    @Test
    public void testNavigateToSacramentoKingsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Sacramento Kings");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(20));
    }
    @Test
    public void testNavigateToSanAntonioSpursPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("San Antonio Spurs");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(21));
    }
    @Test
    public void testNavigateToTorontoRaptorsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Toronto Raptors");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(22));
    }
    @Test
    public void testNavigateToUtahJazzPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Utah Jazz");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(23));
    }
    @Test
    public void testNavigateToWashingtonWizardsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();
        nbaPage.selectNBATeam("Washington Wizards");

        Assert.assertTrue(isElementVisible(nbaPage.teamSelectionConfirmation));
        Assert.assertEquals(getElementText(nbaPage.teamSelectionConfirmation), excel.readStringList("NBATeam").get(24));
    }

}
