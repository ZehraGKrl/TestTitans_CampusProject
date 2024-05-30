Feature: Assignments Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button

  Scenario: Controlling the tasks assigned to the user in the Assignments section

    Given Hover-over the Assignments button
    When Verify that the number of assigned tasks appears
    Then Click on Assignments and verify the existence of assigned tasks in the sheet.
    And Verify existence of tasks in Assignments section

