@regression
Feature: Home Page
  As User I want to login into check visa website


      Scenario: User should a columbian national coming To The UK To join a partner for along stay they do have an article 10Or 20card
        Given I am on homepage
        When I click on Start button
        And I  Selected a Nationality "Colombia"
        And I will Click  on continue Button
        And I Selected reason
        And I should click On continue button
        And I Select state My partner of family member have uk immigration status "family visa"
        Then I verify result "You’ll need a visa to join your family or partner in the UK"

