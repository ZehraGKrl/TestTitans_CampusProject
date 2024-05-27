Feature: Home Functionality

  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

  Scenario: User should delete and restore the messages
    When Click on the element Top Menu
      | hamburgerMenu |
    And Click on the element in Dialog
      | msgButton   |
      | trashButton |