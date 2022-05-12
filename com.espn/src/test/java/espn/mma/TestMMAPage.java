package espn.mma;

import app.pom.MMAPage;
import app.shared.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMMAPage extends BasePage {
    @Test
    public void testLocatingCurrentChampions(){
        Homepage homepage = new Homepage();
        MMAPage mmaPage = homepage.clickMMATab();
        mmaPage.clickMMAHome();
        mmaPage.clickChampions();

        Assert.assertTrue(isElementVisible(mmaPage.championsPageConfirmation));
        Assert.assertEquals(getElementText(mmaPage.championsPageConfirmation), excel.readStringList("MMA").get(0));
    }
}
