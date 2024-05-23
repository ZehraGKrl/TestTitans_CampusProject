Feature: Home Tab Menu Functionality

  Background:
    Given Navigate to Campus

    Scenario Outline:  Tab Menu Functionality

      When Enter username "<username>" and password "<password>" and click login button

      Then Click on all buttons in the tab menu
        |coursesButton|
        |calendarButton|
        |attendanceButton|
        |assignmentButton|
        |gradingButton|
        |moreButton|
        |chatButtonOpen|
        |chatButtonClose|
        |newMessageButton|
        |profileSetingsButton|

      Examples:
        | username | password |
        | Student_7 | S12345 |




