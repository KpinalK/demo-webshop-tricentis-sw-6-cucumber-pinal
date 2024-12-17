package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerTab;

    @CacheLookup
    @FindBy(xpath = "//span[@for='FirstName']")
    WebElement firstNameRequired;


    @CacheLookup
    @FindBy(xpath = "//span[@for='LastName']")
    WebElement lastNameRequired;


    @CacheLookup
    @FindBy(xpath = "//span[@for='Email']")
    WebElement emailRequired;


    @CacheLookup
    @FindBy(xpath = "//span[@for='Password']")
    WebElement passwordRequires;

    @CacheLookup
    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement passwordRequires2;

    @CacheLookup
    @FindBy(xpath = "//input[@value='F']")
    WebElement selectGender;


    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;


    @CacheLookup
    @FindBy(id  = "LastName")
    WebElement enterLastName;



    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;



    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;



    @CacheLookup
    @FindBy(id  = "ConfirmPassword")
    WebElement enterConfirmPassword;


    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerTab);
        log.info("Click On Register Button : " + registerTab.toString());
    }

    public String getFirstNameRequired() {
        return getTextFromElement(firstNameRequired);
    }

    public String getLastNameRequired() {
        return getTextFromElement(lastNameRequired);
    }

    public String getEmailRequired() {
        return getTextFromElement(emailRequired);
    }

    public String getPasswordRequires() {
        return getTextFromElement(passwordRequires);
    }

    public String getPasswordRequires2() {
        return getTextFromElement(passwordRequires2);
    }

    public void clickOnGender(){
        clickOnElement(selectGender);
        log.info("Click on gender : " + selectGender.toString());
    }


    public void enterFirstNameField(String name) {
        sendTextToElement(enterFirstName, name);
        log.info("Enter FirstName Field : " + enterFirstName.toString());
    }

    public void enterLastNameField(String last) {
        sendTextToElement(enterLastName, last);
        log.info("Enter LastName Field : " + enterLastName.toString());
    }


    public void enterEmailField(String email) {
        sendTextToElement(enterEmail, email);
        log.info("Enter Email field : " + enterEmail.toString());
    }

    public void enterPasswordField(String password) {
        sendTextToElement(enterPassword, password);
        log.info("Enter Password Field : " + enterPassword.toString());
    }


    public void enterConfirmPasswordField(String password) {
        sendTextToElement(enterConfirmPassword, password);
        log.info("Enter Confirm PasswordField : " + enterConfirmPassword.toString());
    }
}
