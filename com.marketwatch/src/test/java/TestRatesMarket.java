import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.RatesMarket;
import shared.Homepage;

public class TestRatesMarket extends BasePage {
    @Test
    public void testUS10YrRates() {
        Homepage homepage = new Homepage();
        RatesMarket ratesMarket = homepage.closePopUpToViewRatesMarket();
        ratesMarket.selectRatesMarket();
        ratesMarket.navigateRatesMarket("U.S. 10yr");

        Assert.assertTrue(isElementVisible(ratesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(ratesMarket.dataSelectionConfirmation),
                excel.readStringList("RatesMarket").get(0));
    }
    @Test
    public void testGermany10yrRates() {
        Homepage homepage = new Homepage();
        RatesMarket ratesMarket = homepage.closePopUpToViewRatesMarket();
        ratesMarket.selectRatesMarket();
        ratesMarket.navigateRatesMarket("Germany 10yr");

        Assert.assertTrue(isElementVisible(ratesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(ratesMarket.dataSelectionConfirmation),
                excel.readStringList("RatesMarket").get(1));
    }
    @Test
    public void testItaly10yrRates() {
        Homepage homepage = new Homepage();
        RatesMarket ratesMarket = homepage.closePopUpToViewRatesMarket();
        ratesMarket.selectRatesMarket();
        ratesMarket.navigateRatesMarket("Italy 10yr");

        Assert.assertTrue(isElementVisible(ratesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(ratesMarket.dataSelectionConfirmation),
                excel.readStringList("RatesMarket").get(2));
    }
    @Test
    public void testSpain10yrRates() {
        Homepage homepage = new Homepage();
        RatesMarket ratesMarket = homepage.closePopUpToViewRatesMarket();
        ratesMarket.selectRatesMarket();
        ratesMarket.navigateRatesMarket("Spain 10yr");

        Assert.assertTrue(isElementVisible(ratesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(ratesMarket.dataSelectionConfirmation),
                excel.readStringList("RatesMarket").get(3));
    }
    @Test
    public void testUK10yrRates() {
        Homepage homepage = new Homepage();
        RatesMarket ratesMarket = homepage.closePopUpToViewRatesMarket();
        ratesMarket.selectRatesMarket();
        ratesMarket.navigateRatesMarket("U.K. 10yr");

        Assert.assertTrue(isElementVisible(ratesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(ratesMarket.dataSelectionConfirmation),
                excel.readStringList("RatesMarket").get(4));
    }
    @Test
    public void testJapan10yrRates() {
        Homepage homepage = new Homepage();
        RatesMarket ratesMarket = homepage.closePopUpToViewRatesMarket();
        ratesMarket.selectRatesMarket();
        ratesMarket.navigateRatesMarket("Japan 10yr");

        Assert.assertTrue(isElementVisible(ratesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(ratesMarket.dataSelectionConfirmation),
                excel.readStringList("RatesMarket").get(5));
    }
}
