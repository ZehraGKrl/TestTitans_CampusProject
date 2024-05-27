Feature: Home Functionality
  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

    Scenario: Home Functionality
      And User should see the company logo at the left upper corner
      When User should click the company logo at the left upper corner
      Then User should redirected to the desired site
