Feature: Attendance Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button

  Scenario: Entering a class attendance excuse in the attendance section

    Given Click on the attendance button

    When Click on the attendance excuse button

    Then Enter an excuse
      | addButon |
      | AttendanceCalendarButton |

