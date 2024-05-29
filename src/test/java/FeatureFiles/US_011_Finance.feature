Feature: Hamburger Menu Finance Functionality

  Background:
    Given Navigate to Campus

    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |

    Then Click on the element in Dialog
      | loginButton |

  Scenario: Finance Functionality

    And Click on the element Top Menu
      | hamburgerMenu |

    Then Hover Over the Finance button

    And Click on the element in Dialog
      | MyFinanceButton |
      | viewButton      |

    And Click the Stripe button to choose the payment method

    And Click on the element in Dialog
      | payAmountDue |
      | payButton    |

    And Enter the amount to be paid

    And Click the Pay button

    And User must enter card details

    And The user should receive a confirmation message that they have paid

