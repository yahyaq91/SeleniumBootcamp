import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.VehiclePage;
import shared.Homepage;
import shared.MercedesNavigationPage;

public class TestVehiclePage extends BasePage {
    @Test
    public void testMercedesAMGEngineView() {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Vehicles");
        VehiclePage vehiclePage = mercedesNavigationPage.navigateVehicleOptions("Mercedes-AMG");
        vehiclePage.clickVideoControl();
        vehiclePage.navigateMedia("03.");

        Assert.assertTrue(isElementVisible(vehiclePage.amgEngineViewConfirmation));
        Assert.assertEquals(getElementText(vehiclePage.amgEngineViewConfirmation), excel.readStringList("AMG").get(0));
    }
    @Test
    public void testMercedesAMGPerformanceView() throws InterruptedException {
        Homepage homepage = new Homepage();
        MercedesNavigationPage mercedesNavigationPage = homepage.navigateMenu("Vehicles");
        VehiclePage vehiclePage = mercedesNavigationPage.navigateVehicleOptions("Mercedes-AMG");
        vehiclePage.clickVideoControl();
        vehiclePage.navigateMedia("04.");
        vehiclePage.clickExplorePerformance();
        vehiclePage.clickExplorePerformance();
        vehiclePage.clickExplorePerformance();
        vehiclePage.clickExplorePerformance();
        vehiclePage.clickExplorePerformance();
        vehiclePage.clickExplorePerformance();


        Assert.assertTrue(isElementVisible(vehiclePage.amgPerformanceViewConfirmation));
        Assert.assertEquals(getElementText(vehiclePage.amgPerformanceViewConfirmation), excel.readStringList("AMG").get(1));
    }
}
