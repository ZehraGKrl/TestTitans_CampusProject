Feature: Profile Functionality
  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

  Scenario: Profile Functionality
    When the user clicks the profile button and the settings button
    Then the user selects a theme
    And the user clicks the save button
    And the user should see a success message









