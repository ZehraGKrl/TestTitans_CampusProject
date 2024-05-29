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