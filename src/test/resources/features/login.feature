@regression
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @sanity
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email                  | password | errorMessage                                                                                |
      | asdfdsfgfd@gmail.com   | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | fgghfghgfh@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfcfrtafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |


  Scenario: User should log in successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "pinal111@gmail.com"
    And I enter password "pinal111"
    And I click on login button
    Then I should log in successfully
    And I should see the Logout link


  Scenario: Verify that user should logout successfully
    Given I am on homepage
    When I click on login link
    And I enter email "pinal111@gmail.com"
    And I enter password "pinal111"
    And I click on login button
    And I click on logout link
    Then I should see login link


