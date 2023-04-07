Feature: Authorized
  As a user
  I want to access product
  So I can buy product

  @login
  Scenario: Login user
    Given I am on the home page
    Then I click account on the header
    And I input email
    And I input password
    And I click button masuk
    When I will go to home page