Feature: Grading Functionality

  Background:
    Given Navigate to Campus

    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |

    Then Click on the element in Dialog
      | loginButton |