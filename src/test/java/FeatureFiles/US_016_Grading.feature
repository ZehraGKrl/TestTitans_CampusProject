Feature: Grading Functionality

  Background:
    Given Navigate to Campus

    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |

    Then Click on the element in Dialog
      | loginButton |

  Scenario: Testing the sections inside the Grading button
    And Click on the element Top Menu
      | gradingButton |

    Then Click on the transcript by subject button

    And Transcript by course should be appeared

    Then Click on the Student transcript button

    And Verify elements in Student Transcript button

    And Click on the Course Grade button

    Then List the names of elements in the Course Grade button