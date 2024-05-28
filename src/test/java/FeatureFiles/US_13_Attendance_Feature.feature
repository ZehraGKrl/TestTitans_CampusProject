Feature: Attendance Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button

  Scenario: Entering a class attendance excuse in the attendance section

    Given Click on the attendance button
    When Click on the attendance excuse button
    Then Enter an excuse
    And The user uploads and sends a health report or a file upon request
    And Check the accuracy of the received message.


