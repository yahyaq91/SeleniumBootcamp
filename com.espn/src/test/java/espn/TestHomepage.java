package espn;

import app.pom.SoccerPage;
import app.shared.Homepage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestHomepage extends BasePage {
    @Test
    public void testHomepage(){
        Homepage homepage = new Homepage();
        SoccerPage soccerPage = homepage.clickSoccerTab();
    }
}
