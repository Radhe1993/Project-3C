@smoke
Feature: Home Page
  As User I want to login into check visa website

  Scenario: User should select an Australian Coming To UK For Tourism
    Given I am on homepage
    When I Click on start button
    And I Select a Nationality 'Australia'
    And I will Click on Continue button
    And Select reason Tourism
    And I should click on continue button
    Then I should verify result "You will not need a visa to come to the UK"


