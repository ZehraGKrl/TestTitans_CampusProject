Feature: Home Functionality
  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | username | Student_7 |
      | password | S12345    |
    Then Click on the element in Dialog
      | login |
    And Main page should be displayed

    Scenario: Home Functionality
      And User should see the company logo at the left upper corner
      When User should click the company logo at the left upper corner
      Then A new tab should open
      And User should redirected to "https://techno.study/"
