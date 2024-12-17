@regression
Feature: Register
  In Order to perform successful registration
  As a User
  I have to enter correct information

  @smoke
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate to register page successfully

    @sanity
  Scenario: Verify that firstname lastname email password and confirm password field are mandatory
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then I should see the error message firstname is required
    And I should see the error message lastname is required
    And I should see the error message email is required
    And I should see the error message password is required
    And I should see the error message confirm password is required

    Scenario: Verify that the user should create account successfully
      Given I am on homepage
      When  I click on register link
      And I select gender Female
      And I enter the first name
      And I enter the last name
      And I enter email
      And I enter password
      And I enter confirm password
      And I click on the register button
      Then I should see the message your registration completed




