package espn.mmaPage;

import app.pom.MmaPage;
import app.shared.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMmaPage extends BasePage {

    @Test
    public void testLocatingCurrentChampions(){
        Homepage homepage = new Homepage();
        MmaPage mmaPage = homepage.clickMMATab();
        mmaPage.clickMMAHome();
        mmaPage.clickChampions();

        Assert.assertTrue(isElementVisible(mmaPage.championsPageConfirmation));
        Assert.assertEquals(getElementText(mmaPage.championsPageConfirmation), excel.readStringList("MMA").get(0));
    }


    @Test
    public void testLocatingP4p(){
        Homepage homepage = new Homepage();
        MmaPage mmaPage = homepage.clickMMATab();
        mmaPage.clickP4p();

        Assert.assertTrue(isElementVisible(mmaPage.p4pPageConfirmation));
        Assert.assertEquals(getElementText(mmaPage.p4pPageConfirmation), excel.readStringList("MMA").get(1));
    }




@Test
    public void testLocatingDivisionalRanking(){
        Homepage homepage = new Homepage();
        MmaPage mmaPage = homepage.clickMMATab();
        mmaPage.clickDivisionalRanking();

        Assert.assertTrue(isElementVisible(mmaPage.divisionalRankingPageConfirmation));
        Assert.assertEquals(getElementText(mmaPage.divisionalRankingPageConfirmation), excel.readStringList("MMA").get(2));
    }

    @Test
    public void testLocatingPfl(){
        Homepage homepage = new Homepage();
        MmaPage mmaPage = homepage.clickMMATab();
        mmaPage.clickPfl();

        Assert.assertTrue(isElementVisible(mmaPage.pflPageConfirmation));
        Assert.assertEquals(getElementText(mmaPage.pflPageConfirmation), excel.readStringList("MMA").get(3));
    }


    @Test
    public void testLocatingHomePage(){
        Homepage homepage = new Homepage();
        MmaPage mmaPage = homepage.clickMMATab();
        mmaPage.clickMMAHome();

        Assert.assertTrue(isElementVisible(mmaPage.homePageConfirmation));
        Assert.assertEquals(getElementText(mmaPage.homePageConfirmation), excel.readStringList("MMA").get(4));
    }
}