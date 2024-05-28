Feature: Grading Functionality

  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

    Scenario: Student should be able to download detailed course grades and transcript
      When Click the grading and student transcript button
