package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterResultPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerMessage;


    public String getRegisterMessageRequired() {
        return getTextFromElement(registerMessage);
    }
}
