@regression
Feature: computer page Test

  @smoke
  Scenario: User should navigate to computer page successfully
    Given I am on homepage
    When I click on the computer tab
    Then I should see computer text

  @sanity
  Scenario: User should navigate to desktops page successfully
    Given I am on homepage
    When I click on the computer tab
    And I click on the desktops link
    Then I should see Desktops text


  Scenario Outline: User should build your own computer and add them to cart successfully
    Given I am on homepage
    When I click on the computer tab
    And I click on the desktops link
    And I click on the product name Build your own computer
    And I select Processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on ADD TO CART Button
    Then I should see the message The product has been added to your shopping cart
    Examples:
      | processor                                       | ram           | hdd               | os                  | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Windows 7 [+50.00]  | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Windows 10 [+60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Ubuntu              | Total Commander [+$5.00]   |


