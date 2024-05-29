Feature: Assignments Functionality

  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

    Scenario: Student should see all info and search within tasks and sort items on the Assign page
      When Click the assignments button
      And Search button should be visible and clickable