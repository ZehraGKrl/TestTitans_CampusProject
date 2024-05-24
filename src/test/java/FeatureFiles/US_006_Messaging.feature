Feature: Messaging Functionality

  Background:
    Given Navigate to Campus

  Scenario: Login to the account
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed
    And Click on the element Top Menu
      | hamburgerMenu |
    And Hover Over the messaging button
  