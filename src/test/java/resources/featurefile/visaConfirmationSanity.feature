@sanity
Feature: Home Page
  As User I want to login into check visa website


    Scenario: User should a chile and coming to The UK for work and plans on staying for longer than sixMonths
      Given I am on homepage
      When I Click on start Button
      And I will Select a Nationality "chile"
      And I will Click on continue button
      And I Select reason "Work, academic visit or business"
      And I should click On Continue button
      And I Select intendent to stay for "longer than 6 months"
      And I will be click on Continue button
      And I Select have planning to work for "Health and care professional"
      And I Select be click on Continue Button
      Then I Should verify result "You need a visa to work in health and care"

