package accessories_page;

import org.testng.annotations.Test;
import pom.AccessoriesPage;
import pom.PhoneCases;
import shared.Homepage;


public class TestAccessories extends Homepage {

    @Test
    public void testFirstLink() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Cases");
        PhoneCases phoneCases = new PhoneCases();
        phoneCases.findCheapestPrice();
        Thread.sleep(3000);
    }
}