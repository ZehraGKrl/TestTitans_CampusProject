Feature: Calendar Functionality
  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton|
    And Main page should be displayed

    Scenario: Calendar Functionality
      When the user clicks the completed lesson and recording button
      Then the user see the lesson video and play button




