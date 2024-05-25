Feature: Messasing Functionality
  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

  Scenario: Messaging Functionality
    When the user clicks the messaging button and the new message button
    Then the user clicks the add receivers button
    And the user enters the receiver's name and selects the receiver
    Then the user enters the subject
    And the user writes a message and adds a table or picture
    And the user adds a document
    And the user clicks the send button
    Then the success page should be displayed
    And the user clicks the hamburger menu, messaging button, and outbox button
    Then the user should see the outbox list










