Feature: Finance Functionality

  Background:
    Given Navigate to Campus

  Scenario: Making Payments in The Finance Section
    Given Enter username and password and click login button
    When Go to the payment screen by clicking on the finance section
      | moreButton      |
      | financeButton   |
      | myFinanceButton |
    Then Make payment in My finance section
      | viewButton   |
      | stripeButton |


