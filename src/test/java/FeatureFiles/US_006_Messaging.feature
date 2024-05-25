Feature: Messaging Functionality

  Background:
    Given Navigate to Campus

  Scenario: Messaging Functionality
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |

    Then Click on the element in Dialog
      | loginButton |

    And Click on the element Top Menu
      | hamburgerMenu |

    And Hover Over the messaging button

    And Click on the element in Dialog
      | outboxButton |

    And Click on the trash button
