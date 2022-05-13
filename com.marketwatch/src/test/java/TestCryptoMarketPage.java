import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CryptoMarket;
import shared.Homepage;

public class TestCryptoMarketPage extends BasePage {
    @Test
    public void testBitcoinUSDRates() {
        Homepage homepage = new Homepage();
        CryptoMarket cryptoMarket = homepage.closePopUpToViewCryptoMarket();
        cryptoMarket.selectCryptoMarket();
        cryptoMarket.navigateCryptoMarket("Bitcoin USD");

        Assert.assertTrue(isElementVisible(cryptoMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(cryptoMarket.dataSelectionConfirmation),
                excel.readStringList("CryptoMarket").get(0));
    }
    @Test
    public void testEthereumUSDRates() {
        Homepage homepage = new Homepage();
        CryptoMarket cryptoMarket = homepage.closePopUpToViewCryptoMarket();
        cryptoMarket.selectCryptoMarket();
        cryptoMarket.navigateCryptoMarket("Ethereum USD");

        Assert.assertTrue(isElementVisible(cryptoMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(cryptoMarket.dataSelectionConfirmation),
                excel.readStringList("CryptoMarket").get(1));
    }
    @Test
    public void testXRPUSDRates() {
        Homepage homepage = new Homepage();
        CryptoMarket cryptoMarket = homepage.closePopUpToViewCryptoMarket();
        cryptoMarket.selectCryptoMarket();
        cryptoMarket.navigateCryptoMarket("XRP USD");

        Assert.assertTrue(isElementVisible(cryptoMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(cryptoMarket.dataSelectionConfirmation),
                excel.readStringList("CryptoMarket").get(2));
    }
    @Test
    public void testBitcoinCashUSDRates() {
        Homepage homepage = new Homepage();
        CryptoMarket cryptoMarket = homepage.closePopUpToViewCryptoMarket();
        cryptoMarket.selectCryptoMarket();
        cryptoMarket.navigateCryptoMarket("Bitcoin Cash USD");

        Assert.assertTrue(isElementVisible(cryptoMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(cryptoMarket.dataSelectionConfirmation),
                excel.readStringList("CryptoMarket").get(3));
    }
    @Test
    public void testLitecoinUSDRates() {
        Homepage homepage = new Homepage();
        CryptoMarket cryptoMarket = homepage.closePopUpToViewCryptoMarket();
        cryptoMarket.selectCryptoMarket();
        cryptoMarket.navigateCryptoMarket("Litecoin USD");

        Assert.assertTrue(isElementVisible(cryptoMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(cryptoMarket.dataSelectionConfirmation),
                excel.readStringList("CryptoMarket").get(4));
    }
    @Test
    public void testMoneroUSDRates() {
        Homepage homepage = new Homepage();
        CryptoMarket cryptoMarket = homepage.closePopUpToViewCryptoMarket();
        cryptoMarket.selectCryptoMarket();
        cryptoMarket.navigateCryptoMarket("Monero USD");

        Assert.assertTrue(isElementVisible(cryptoMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(cryptoMarket.dataSelectionConfirmation),
                excel.readStringList("CryptoMarket").get(5));
    }
}
