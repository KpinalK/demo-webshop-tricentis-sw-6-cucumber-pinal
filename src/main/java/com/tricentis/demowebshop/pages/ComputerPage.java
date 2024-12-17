package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerText;


    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopTab;

    public String getComputerMessageRequired() {
        return getTextFromElement(computerText);
    }

    public void clickOnDesktop(){
        clickOnElement(desktopTab);
        log.info("Click On Desktop : " + desktopTab);
    }
}
