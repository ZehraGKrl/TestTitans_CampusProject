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

    Then User should be able to start a discussion

    Then User should be able to click the chat button

    Then User should be able to click the contacts button

    Then User should be able to click the attach files button

    Then User should be able to open a new discussion

    And When the user sends their message, the message text (attach file name if available) and send message should also be able to see the date and time in a stream
