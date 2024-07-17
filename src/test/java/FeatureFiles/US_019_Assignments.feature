Feature: Assignment Functionality

  Background:
    Given Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

  Scenario: Assignment Functionality

    And Click on the element Top Menu
      | assignmentsButton |

    Then Click on the element in Dialog
      | dateButton     |
      | thisYearButton |

    And Click on the search button

    Then Click on the lesson in assignments page
