Feature: Finance Functionality

  Background:
    Given Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

  Scenario: Access to student payment information

    And Click on the element Top Menu
      | hamburgerMenu |

    Then Hover Over the Finance button

    And Click on the element in Dialog
      | MyFinanceButton        |
      | viewButton             |
      | feeBalanceDetailButton |

    And User should see the installment table