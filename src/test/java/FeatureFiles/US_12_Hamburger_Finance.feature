Feature: Hamburger Menu Finance Functionality

  Background:
    Given  Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

    Scenario: Student should be able to download the finance details
      When Click on the element Top Menu
        | hamburgerMenu |
      And Hover over the finance and click on the my finance
      And Click on the pull down menu button and click the excel export

