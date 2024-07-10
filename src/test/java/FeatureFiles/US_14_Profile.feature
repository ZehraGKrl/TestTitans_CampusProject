Feature: Profile Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button

    Scenario: Uploading a profile photo in the profile section

      Given Click on the profile and click on the Settings
      Then Verification that you are on the settings page
      When Click on the profile picture and upload button
      And  Select the photo to upload from the files
      And After taking the photo, click the Upload button and save button
      Then Receive a Success message when they successfully upload or change their profile picture.
