package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @CacheLookup
    @FindBy(id = "product_attribute_16_5_4")
    WebElement processorDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_16_6_5")
    WebElement ramDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_16_3_6_18")
    List<WebElement> hddRadio;

    @CacheLookup
    @FindBy(id = "product_attribute_16_4_7_44")
    List<WebElement> osRadio;

    @CacheLookup
    @FindBy(id = "product_attribute_16_8_8_22")
    List<WebElement> softwareCheckbox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='add-to-cart-button-16']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement shoppingCartMessage;

    public void selectProcessorFromDropdown(String processor) {
        selectByVisibleTextFromDropDown(processorDropdown, processor);
        log.info("Select Processor From Dropdown : " + processorDropdown.toString() );
    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramDropdown, ram);
        log.info("Select Ram : " + ramDropdown.toString());
    }

    public void selectHddRadio(String radio) {
        List<WebElement> hddRadios = hddRadio;

        String val = "320 GB";
        String val1 = "400 GB [+$100.00]";

        if (val.equalsIgnoreCase(radio)) {
            hddRadios.get(0).click();
        } else if (val1.equalsIgnoreCase(radio)) {
            hddRadios.get(1).click();
        }
        log.info("Select Hdd Radio : " + hddRadio.size());
    }

    public void selectOs(String os) {
        List<WebElement> osOption = getListOfElements(osRadio);
        String val = "Windows 7 [+50.00]";
        String val1 = "Windows 10 [+60.00]";
        if (val.equalsIgnoreCase(os)) {
            osOption.get(0).click();
        } else if (val1.equalsIgnoreCase(os)) {
            osOption.get(1).click();
        }
        log.info("Select Os : " + osRadio.size());
    }

    public void selectCheckBox(String software) {
        List<WebElement> softwareOption = getListOfElements(softwareCheckbox);
        String val0 = "Microsoft Office [+$50.00]";
        String val1 = "Acrobat Reader [+$10.00]";
        String val2 = "Total Commander [+$5.00]";

        //deselect all before performing next action
        for(WebElement chkbox: softwareOption){
            if(chkbox.isSelected())
                chkbox.click();
        }

        //clicking on checkbox
        if (val0.equalsIgnoreCase(software)) {
            softwareOption.get(0).click();
        } else if (val1.equalsIgnoreCase(software)) {
            softwareOption.get(1).click();
        } else if (val2.equalsIgnoreCase(software)) {
            softwareOption.get(2).click();
        }
        log.info("Select CheckBox : " + softwareCheckbox.size());
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
        log.info("Click On AddToCart + :" + addToCart.toString());
    }

    public String verifyShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
}
