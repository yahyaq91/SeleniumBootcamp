package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends SystemBar {


    @FindBy (id = "customer_firstname")
    public WebElement firstNameInputField;

    @FindBy (id="customer_lastname")
    public WebElement lastNameInputField;

    @FindBy (id = "passwd")
    public WebElement passwordInputField;

    @FindBy (id = "days")
    public WebElement dateOfBirthDayComboBox;

    @FindBy (id = "months")
    public WebElement dateOfBirthMonthComboBox;

    @FindBy (id = "years")
    public WebElement dateOfBirthYearsComboBox;

    @FindBy (id = "newsletter")
    public WebElement newsletterCheckBox;




    @FindBy (id = "optin")
    public WebElement specialOfferCheckBox;


    @FindBy (id = "address1")
    public WebElement addressInputField;


    @FindBy (id = "city")
    public WebElement cityInputField;


    @FindBy (id = "id_state")
    public WebElement stateComboBox;

    @FindBy (id = "postcode")
    public WebElement zipCodeField;

    @FindBy (id = "phone_mobile")
    public WebElement mobilePhoneInputField;

    @FindBy (id = "submitAccount")
    public WebElement registerButton;


    public CreateAccount() {
        PageFactory.initElements(driver, this);
    }


    /*public MyAccount registerNewUser(String firstName, String lastName, String password, String day, String monthNumber,
                                     String year, String streetAddress, String city, String state, String zipCode,
                                     String phoneNumber)*/


    public void registerNewUser ( String firstName, String lastName, String password, String day, String month,
                                  String year, String Address, String city, String state, String phoneNumber)

    {
        inputFirstName(firstName);
        inputLastName(lastName);
        inputPassword(password);
        selectDobDay(day);
        selectDobMonth(month);
        selectDobYear(year);
        clickNewsLetterCheckBox(newsletterCheckBox);
        clickSpecialOfferLetterCheckBox(specialOfferCheckBox);
        inputStreetAddress(Address);
        inputCity(city);
        selectState(state);
        inputmobilePhoneNumber(phoneNumber);

        inputMobilePhoneNumber(phoneNumber);
        clickRegisterButton(registerButton);


        return new MyAccount();
    }



    public void inputFirstName(String firstName) {
        sendKeysToElement( firstNameInputField, firstName);
    }

    public void inputLastName(String lastName) {
        sendKeysToElement( lastNameInputField, lastName);
    }

    public void inputPassword(String password) {

        sendKeysToElement( passwordInputField, password);
    }

    public void selectDobDay(String day) {
        if (Integer.valueOf(day) > 0 && Integer.valueOf(day) <= 31) {
            selectFromDropdownByValue(dateOfBirthDayComboBox, day);
        }
    }

    public void selectDobMonth(String month) {
    if(Integer.parseInt(month)>0 && Integer.parseInt(month)<=12) {
        selectFromDropdownByValue(dateOfBirthMonthComboBox, month);
      }

    }

    public void selectDobYear(String year) {
        if (Integer.parseInt(year) > 1900 && Integer.parseInt(year) <= 2022) {
            selectFromDropdownByValue(dateOfBirthYearsComboBox, year);
        }



        public void clickNewsLetterCheckBox() {
            jsClickOnElement(newsletterCheckBox);
        }

        public void clickSpecialOffersCheckBox() {
            jsClickOnElement(specialOfferCheckBox);
        }

        public void inputStreetAddress (String Address){
            sendKeysToElement(addressInputField, );

        }

        public void inputCity (String city){
            sendKeysToElement(cityInputField, city);
        }


        public void inputCity(String city) {
            sendKeysToElement(cityInputField, city);
        }

        public void selectState (String state){
            selectFromDropdownByVisibleText(stateComboBox, state);

        }


        public void inputZipCode (String zipCode){
            sendKeysToElement(zipCodeField, zipCode);

        }


        public void inputMobilePhoneNumber (String phoneNumber){
            sendKeysToElement(mobilePhoneInputField, phoneNumber);
        }

        public void clickRegisterButton () {
            safeClickOnElement(registerButton);
        }


    }}