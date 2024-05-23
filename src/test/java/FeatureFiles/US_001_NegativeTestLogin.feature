Feature: Invalid Login Functionality

  Background:
    Given Navigate to Campus

  Scenario Outline:
    When Enter invalid username as "<user>" or invalid password as "<pass>" and click login button
    Then User should see Invalid username or password message


    Examples:
      | user      | pass   |
      | Studenttt | S12345 |
      | Student_7 | 1234   |




