Feature: Home
  As a user
  I want to see home page
  So I can view

  Scenario: View Home page
    Given I am on the google.com
    And I click field search google
    And I write uniqlo
    And I push enter
    When I click website uniqlo
    Then I will go to home page