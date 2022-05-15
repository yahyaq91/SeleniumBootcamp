package pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.Homepage;


public class UnitedStatesMarket extends Homepage {

    @FindBy(xpath = "//td[@class='table__cell symbol']//a[@data-track-code='MW_Header_Market Data_Quote Click_Dow Jones Industrial Average']")
    public WebElement dowShares;
    @FindBy(xpath = "(//*[local-name()='svg' and @version='1.1'])[3]")
    public WebElement marketGraphs;
    @FindBy(xpath = "//td[@class='table__cell symbol']//a[@data-track-code='MW_Header_Market Data_Quote Click_S&P 500 Index']")
    public WebElement sp500;
    @FindBy(xpath = "//td[@class='table__cell symbol']//a[@data-track-code='MW_Header_Market Data_Quote Click_NASDAQ Composite Index']")
    public WebElement nasdaqShares;
    @FindBy(xpath = "//td[@class='table__cell symbol']//a[@data-track-code='MW_Header_Market Data_Quote Click_Global Dow Realtime USD']")
    public WebElement dowGlobal;
    @FindBy(xpath = "//td[@class='table__cell symbol']//a[@data-track-code='MW_Header_Market Data_Quote Click_GOLD']")
    public WebElement goldValue;
    @FindBy(xpath = "//td[@class='table__cell symbol']//a[@data-track-code='MW_Header_Market Data_Quote Click_CRUDE OIL - ELECTRONIC']")
    public WebElement oilPrices;

    public UnitedStatesMarket() {
        PageFactory.initElements(driver, this);
    }

    public void selectUSMarket() {
        clickOnElement(usMarket);
    }

    public void hoverDOW() {
        hoverOverElement(dowShares);
    }

    public void clickDOW() {
        clickOnElement(dowShares);
    }

    public void hoverSP500() {
        hoverOverElement(sp500);
    }

    public void clickSP500() {
        clickOnElement(sp500);
    }

    public void hoverMarketGraph() {
        hoverOverElement(marketGraphs);
    }

    public void hoverNasdaq() {
        hoverOverElement(nasdaqShares);
    }

    public void clickNasdaq() {
        clickOnElement(nasdaqShares);
    }

    public void hoverGlobalDow() {
        hoverOverElement(dowGlobal);
    }

    public void clickGlobalDow() {
        clickOnElement(dowGlobal);
    }

    public void hoverGoldPrices() {
        hoverOverElement(goldValue);
    }

    public void clickGoldPrices() {
        clickOnElement(goldValue);
    }

    public void hoverOilPrices() {
        hoverOverElement(oilPrices);
    }

    public void clickOilPrices() {
        clickOnElement(oilPrices);
    }
}
