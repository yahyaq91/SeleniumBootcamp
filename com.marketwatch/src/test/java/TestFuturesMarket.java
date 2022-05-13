import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.FuturesMarket;
import shared.Homepage;

public class TestFuturesMarket extends BasePage {
    @Test
    public void testDJIAFRates() {
        Homepage homepage = new Homepage();
        FuturesMarket futuresMarket = homepage.closePopUpToViewFuturesMarket();
        futuresMarket.selectFuturesMarket();
        futuresMarket.navigateFuturesMarket("DJIA F");

        Assert.assertTrue(isElementVisible(futuresMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(futuresMarket.dataSelectionConfirmation),
                excel.readStringList("FuturesMarket").get(0));
    }
    @Test
    public void testSPFRates() {
        Homepage homepage = new Homepage();
        FuturesMarket futuresMarket = homepage.closePopUpToViewFuturesMarket();
        futuresMarket.selectFuturesMarket();
        futuresMarket.navigateFuturesMarket("S&P F");

        Assert.assertTrue(isElementVisible(futuresMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(futuresMarket.dataSelectionConfirmation),
                excel.readStringList("FuturesMarket").get(1));
    }
    @Test
    public void testNASDAQFRates() {
        Homepage homepage = new Homepage();
        FuturesMarket futuresMarket = homepage.closePopUpToViewFuturesMarket();
        futuresMarket.selectFuturesMarket();
        futuresMarket.navigateFuturesMarket("NASDAQ F");

        Assert.assertTrue(isElementVisible(futuresMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(futuresMarket.dataSelectionConfirmation),
                excel.readStringList("FuturesMarket").get(2));
    }
    @Test
    public void testGoldRates() {
        Homepage homepage = new Homepage();
        FuturesMarket futuresMarket = homepage.closePopUpToViewFuturesMarket();
        futuresMarket.selectFuturesMarket();
        futuresMarket.navigateFuturesMarket("Gold");

        Assert.assertTrue(isElementVisible(futuresMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(futuresMarket.dataSelectionConfirmation),
                excel.readStringList("FuturesMarket").get(3));
    }
    @Test
    public void testSilverRates() {
        Homepage homepage = new Homepage();
        FuturesMarket futuresMarket = homepage.closePopUpToViewFuturesMarket();
        futuresMarket.selectFuturesMarket();
        futuresMarket.navigateFuturesMarket("Silver");

        Assert.assertTrue(isElementVisible(futuresMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(futuresMarket.dataSelectionConfirmation),
                excel.readStringList("FuturesMarket").get(4));
    }
    @Test
    public void testCrudeOilRates() {
        Homepage homepage = new Homepage();
        FuturesMarket futuresMarket = homepage.closePopUpToViewFuturesMarket();
        futuresMarket.selectFuturesMarket();
        futuresMarket.navigateFuturesMarket("Crude Oil");

        Assert.assertTrue(isElementVisible(futuresMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(futuresMarket.dataSelectionConfirmation),
                excel.readStringList("FuturesMarket").get(5));
    }
}
