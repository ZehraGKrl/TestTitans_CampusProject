Feature: Finance Functionality
  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

  Scenario: Finance Functionality
    When the user clicks the finance button and the my finance button
    And the user clicks the name
    And the user sees the online payment button and the Fee_Balance Detail button
    And the user selects the Stripe button and clicks the pay button
    And the user clicks the Fee_Balance Detail button and sees the payment
    And the user sees all payments and balances or debts
    Then the user should see the message at the top right





