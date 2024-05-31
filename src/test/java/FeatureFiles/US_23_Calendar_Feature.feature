Feature: Calendar Funtionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button

    Scenario: Checking the weekly and monthly lesson plan in the calendar function
      Given Click on the Calendar Button
      When Verify that the icons P=Published, S=Started, E=Ended, C=Cancelled are present.
      Then Click on the Weekly Course Plan button. and check and verify the required functions
      And Click on the Calendar button inside the calendar. and check and verify the required functions