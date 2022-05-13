
package app.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import app.pom.Homepage;

public class ModelPage extends Homepage {

    @FindBy(xpath = "//a[@aria-label='Shop Inventory']//span[contains(text(), 'Shop Inventory')]")
    public WebElement shopInventoryButton;

    @FindBy(xpath = "(//div[@data-animation='fade'])[2]")
    public WebElement modelTextAnimation;

    public ModelPage() {
        PageFactory.initElements(driver, this);
    }

    public void waitForShopInventoryButton() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(shopInventoryButton));
    }

    public void waitForModelNameAnimation() {
        webDriverWait.until(ExpectedConditions.visibilityOf(modelTextAnimation));
    }
}

