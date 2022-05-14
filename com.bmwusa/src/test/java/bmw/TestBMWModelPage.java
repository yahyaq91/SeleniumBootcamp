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
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(0));
    }

    @Test
    public void testNavigateToX2() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x2");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(1));
    }

    @Test
    public void testNavigateToX3() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x3");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(2));
    }

    @Test
    public void testNavigateToX4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x4");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(3));
    }

    @Test
    public void testNavigateToX5() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x5");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(4));
    }

    @Test
    public void testNavigateToX6() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x6");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(5));
    }

    @Test
    public void testNavigateToX7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x7");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(6));
    }


    @Test
    public void testNavigateTo2Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("2");

        Assert.assertTrue(isElementInvisible(homepage.modelChoiceConfirmation));
        Assert.assertEquals(getElementText(homepage.modelChoiceConfirmation), excel.readStringList("BMWModel").get(7));
    }

    @Test
    public void testNavigateTo3Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("3");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(8));
    }

    @Test
    public void testNavigateTo4Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("4");

        Assert.assertTrue(isElementInvisible(homepage.modelChoiceConfirmation));
        Assert.assertEquals(getElementText(homepage.modelChoiceConfirmation), excel.readStringList("BMWModel").get(9));
    }

    @Test
    public void testNavigateTo5Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("5");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(10));
    }

    @Test
    public void testNavigateTo7Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("7");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("BMWModel").get(11));
    }

    @Test
    public void testNavigateTo8Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("8");

        Assert.assertTrue(isElementInvisible(homepage.modelChoiceConfirmation));
        Assert.assertEquals(getElementText(homepage.modelChoiceConfirmation), excel.readStringList("BMWModel").get(12));
    }

}
