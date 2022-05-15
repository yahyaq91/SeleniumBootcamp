package espn.nfl_page;

import app.pom.NBAPage;
import app.pom.NFLPage;
import app.shared.Homepage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestNFLPage extends BasePage {
    @Test
    public void testNavigateToAtlantaHawksPage() {
        Homepage homepage = new Homepage();
        NFLPage nflPage = homepage.clickNFLTab();
        nflPage.clickTeamsButton();
        nflPage.hoverOverNFLTeamsDropDown();
    }
    @Test
    public void testNavigateToBostonCelticsPage(){
        Homepage homepage = new Homepage();
        NBAPage nbaPage = homepage.clickNBATab();
        nbaPage.clickTeamsButton();
        nbaPage.hoverOverNBATeamsDropDown();



    }
}
