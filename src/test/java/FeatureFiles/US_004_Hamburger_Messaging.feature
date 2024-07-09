Feature: Hambuurger Menu Messaging Functionality

  Background:
    Given Navigate to Campus
    When User sending the keys in Dialog
      | usernameInput | Student_7 |
      | passwordInput | S12345    |
    Then Click on the element in Dialog
      | loginButton |
    And Main page should be displayed

  Scenario: Messaging Functionality

    And Click on the element Top Menu
      | hamburgerMenu |

    And Hover Over the messaging button

    Then User should be able to see related buttons

    Then Click on the element in Hamburger Menu
      | messageButton |

    Then Click on the element Top Menu
      | hamburgerMenu |

    And Hover Over the messaging button

    Then Click on the element in Hamburger Menu
      | inboxButton |

    Then  Click on the element Top Menu
      | hamburgerMenu |

    And Hover Over the messaging button

    Then Click on the element in Hamburger Menu
      | outboxButton |

    Then Click on the element Top Menu
      | hamburgerMenu |



