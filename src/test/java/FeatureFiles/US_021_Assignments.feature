Feature: Assignments Functionality

  Background:
    Given Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

    Scenario: Assignment Functionality
      When the user clicks the assignments button
      Then user should be able to see submit button and click button
      And the user should be able to write in a text editor, insert images and create tables
      And user should receive a verification message when they save as draft
      Then user must click submit button and see the verification message

