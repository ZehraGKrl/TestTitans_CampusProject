Feature: Assignment Functionality
  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton Assignment Functionality|
    And Main page should be displayed

  Scenario: Assignment Functionality
    When the user clicks the assignments button
    Then the user selects a homework and clicks the information button, submit button, and favorite button
    And the user selects and clicks a homework and sees the homework information
    And the user clicks the discuss button







