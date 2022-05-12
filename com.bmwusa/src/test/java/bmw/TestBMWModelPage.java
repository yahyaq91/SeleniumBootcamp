package bmw;

import app.pom.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestBMWModelPage extends BasePage {

    @Test
    public void testNavigateToX1() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x1");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        //Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(0));
    }

    @Test
    public void testNavigateToX2() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x2");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        //Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(1));
    }

    @Test
    public void testNavigateToX3() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x3");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        //Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(2));
    }

    @Test
    public void testNavigateToX4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x4");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        //Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(3));
    }

    @Test
    public void testNavigateToX5() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x5");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        //Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(4));
    }

    @Test
    public void testNavigateToX6() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x6");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        //Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(5));
    }

    @Test
    public void testNavigateToX7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x7");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        //Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(6));
    }
}
