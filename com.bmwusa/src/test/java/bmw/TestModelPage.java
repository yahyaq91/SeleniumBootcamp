package bmw;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;

public class TestModelPage extends BasePage {

    @Test
    public void testNavigateToX1() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x1");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(0));
    }

    @Test
    public void testNavigateToX2() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x2");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(1));
    }

    @Test
    public void testNavigateToX3() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x3");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(2));
    }

    @Test
    public void testNavigateToX4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x4");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(3));
    }

    @Test
    public void testNavigateToX5() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x5");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(4));
    }

    @Test
    public void testNavigateToX6() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x6");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(5));
    }

    @Test
    public void testNavigateToX7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("x7");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(6));
    }

    @Test
    public void testNavigateTo2Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("2");

        Assert.assertTrue(isElementInvisible(homepage.modelChoiceConfirmation));
        Assert.assertEquals(getElementText(homepage.modelChoiceConfirmation), excel.readStringList("Model").get(7));
    }

    @Test
    public void testNavigateTo3Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("3");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(8));
    }

    @Test
    public void testNavigateTo4Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("4");

        Assert.assertTrue(isElementInvisible(homepage.modelChoiceConfirmation));
        Assert.assertEquals(getElementText(homepage.modelChoiceConfirmation), excel.readStringList("Model").get(9));
    }

    @Test
    public void testNavigateTo5Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("5");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(10));
    }

    @Test
    public void testNavigateTo7Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("7");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(11));
    }

    @Test
    public void testNavigateTo8Series() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("8");

        Assert.assertTrue(isElementInvisible(homepage.modelChoiceConfirmation));
        Assert.assertEquals(getElementText(homepage.modelChoiceConfirmation), excel.readStringList("Model").get(12));
    }

    @Test
    public void testNavigateToZ4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("z4");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(13));
    }

    @Test
    public void testNavigateToMSeries() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("m");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(14));
    }

    @Test
    public void testNavigateToiX() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("ix");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(15));
    }

    @Test
    public void testNavigateToi4() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("i4");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(16));
    }

    @Test
    public void testNavigateToi7() {
        Homepage homepage = new Homepage();
        homepage.chooseBMWModel("i7");

        Assert.assertTrue(isElementInvisible(homepage.modelConfirmation));
        Assert.assertEquals(getElementText(homepage.modelConfirmation), excel.readStringList("Model").get(17));
    }
}

