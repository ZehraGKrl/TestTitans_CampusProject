Feature: Login Functionality

  Background:
    Given Navigate to Campus

  Scenario: Login Functionality
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |

    Then Click on the element in Dialog
      | loginButton |

    And Main page should be displayed
