package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import com.tricentis.demowebshop.pages.RegisterResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate to register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        String expectedText = "Register";
        String actualText = new RegisterPage().getRegisterText();
        Assert.assertEquals(actualText,expectedText,"Register text is not displayed");
    }


    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message firstname is required")
    public void iShouldSeeTheErrorMessageFirstnameIsRequired() {
       String expectedMessage1 = "First name is required.";
       Assert.assertEquals(new RegisterPage().getFirstNameRequired(),expectedMessage1,"Error message not displayed");
    }

    @And("I should see the error message lastname is required")
    public void iShouldSeeTheErrorMessageLastnameIsRequired() {
        String expectedMessage2 = "Last name is required.";
        Assert.assertEquals(new RegisterPage().getLastNameRequired(),expectedMessage2,"Error message not displayed");
    }

    @And("I should see the error message email is required")
    public void iShouldSeeTheErrorMessageEmailIsRequired() {
        String expectedMessage3 = "Email is required.";
        Assert.assertEquals(new RegisterPage().getEmailRequired(),expectedMessage3,"Error message not displayed");
    }

    @And("I should see the error message password is required")
    public void iShouldSeeTheErrorMessagePasswordIsRequired() {
        String expectedMessage4 = "Password is required.";
        Assert.assertEquals(new RegisterPage().getPasswordRequires(),expectedMessage4,"Error message not displayed");
    }

    @And("I should see the error message confirm password is required")
    public void iShouldSeeTheErrorMessageConfirmPasswordIsRequired() {
        String expectedMessage5 = "Password is required.";
        Assert.assertEquals(new RegisterPage().getPasswordRequires2(),expectedMessage5,"Error message not displayed");
    }


    @And("I select gender Female")
    public void iSelectGenderFemale() {
        new RegisterPage().clickOnGender();
    }

    @And("I enter the first name")
    public void iEnterTheFirstName() {
        new RegisterPage().enterFirstNameField("Riva");
    }

    @And("I enter the last name")
    public void iEnterTheLastName() {
        new RegisterPage().enterLastNameField("patel");
    }

    @And("I enter email")
    public void iEnterEmail() {
        new RegisterPage().enterEmailField("rivapatel228@gamil.com");
    }

    @And("I enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPasswordField("riva258");
    }

    @And("I enter confirm password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPasswordField("riva258");
    }

    @And("I click on the register button")
    public void iClickOnTheRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the message your registration completed")
    public void iShouldSeeTheMessageYourRegistrationCompleted() {
        String expectedResult = "Your registration completed";
        Assert.assertEquals(new RegisterResultPage().getRegisterMessageRequired(),expectedResult,"Message not displayed");
    }
}
