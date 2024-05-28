Feature: Messaging Functionality

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
    And Hover Over the messaging button
    And Click on the trash button in hamburger menu "trashButton"
    Then The trash and restore icon should be visible
    And Click on the restore button and see the success message
    And Click on the delete button and see the success message
