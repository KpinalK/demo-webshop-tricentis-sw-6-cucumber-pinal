package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.BuildYourOwnComputerPage;
import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopsPage;
import com.tricentis.demowebshop.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on the computer tab")
    public void iClickOnTheComputerTab() {
        new HomePage().clickOnComputer();
    }

    @Then("I should see computer text")
    public void iShouldSeeComputerText() {
        String expectedText = "Computers";
        Assert.assertEquals(new ComputerPage().getComputerMessageRequired(),expectedText,"TExt not displayed");
    }

    @And("I click on the desktops link")
    public void iClickOnTheDesktopsLink() {
        new ComputerPage().clickOnDesktop();
    }

    @Then("I should see Desktops text")
    public void iShouldSeeDesktopsText() {
        String expectedText = "Desktops";
        Assert.assertEquals(new DesktopsPage().getDesktopText(),expectedText,"Text not displayed");
    }

    @And("I click on the product name Build your own computer")
    public void iClickOnTheProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildComputerButton();
    }

    @And("I select Processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHddRadio(hdd);
    }

    @And("I select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectCheckBox(software);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I should see the message The product has been added to your shopping cart")
    public void iShouldSeeTheMessageTheProductHasBeenAddedToYourShoppingCart() {
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(new BuildYourOwnComputerPage().verifyShoppingCartMessage(),expectedMessage,"Message not displayed");

    }
}
