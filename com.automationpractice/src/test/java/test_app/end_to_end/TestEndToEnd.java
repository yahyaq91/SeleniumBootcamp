package test_app.end_to_end;

import app.pom.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import utils.GenerateData;

public class TestEndToEnd extends TestBasePage {
    @Test
    public void testEndToEndProcessViewWishlist() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        MyAccount myAccount = createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        myAccount.viewWishlist();

        Assert.assertTrue(isElementVisible(myAccount.wishlistConfirmation));
        Assert.assertEquals(getElementText(myAccount.wishlistConfirmation), excel.readStringList("WishListConfirmation").get(0));
    }
    @Test
    public void testEndToEndProcessViewAddress() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        MyAccount myAccount = createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        myAccount.viewMyAddress();

        Assert.assertTrue(isElementVisible(myAccount.addressConfirmation));
        Assert.assertEquals(getElementText(myAccount.addressConfirmation), excel.readStringList("AddressConfirmation").get(0));

    }
    @Test
    public void TestingTheSize() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        ItemVewPage itemVewPage = homepage.clickWomenOption();
        itemVewPage.clickSmallFilter();
        itemVewPage.isElementInvisible(itemVewPage.loadingCircle);

        Assert.assertTrue(isElementVisible(itemVewPage.filterConfirmation));
        Assert.assertEquals(getElementText(itemVewPage.filterConfirmation), excel.readStringList("FilterConfirmation").get(0));
    }
    @Test
    public void testEndToEndProcessViewCreditSlips() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        MyAccount myAccount = createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        myAccount.viewMyCreditSlips();

        Assert.assertTrue(isElementVisible(myAccount.creditSlipConfirmation));
        Assert.assertEquals(getElementText(myAccount.creditSlipConfirmation), excel.readStringList("endToEnd").get(0));
    }
    @Test
    public void testEndToEndProcessViewItemsThatAreColorBlack() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        ItemVewPage catalog = homepage.clickWomenOption();
        catalog.selectBlackOption();
        catalog.isElementInvisible(catalog.loadingCircle);
        catalog.selectBlackOption();

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("endToEnd").get(1));
    }
    @Test
    public void testEndToEndProcessViewItemsThatAreSizeSmall() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        ItemVewPage catalog = homepage.clickWomenOption();
        catalog.clickSmallFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("endToEnd").get(2));
    }
    @Test
    public void testEndToEndProcessViewItemsThatAreConditionNew() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        ItemVewPage catalog = homepage.clickWomenOption();
        catalog.clickNewConditionFilter();
        catalog.isElementInvisible(catalog.loadingCircle);

        Assert.assertTrue(isElementVisible(catalog.filterConfirmation));
        Assert.assertEquals(getElementText(catalog.filterConfirmation), excel.readStringList("endToEnd").get(3));
    }

}

