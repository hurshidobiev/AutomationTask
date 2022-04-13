@wip
Feature: Verify Home Page elements

  Background:
    Given the user is on home page

    Scenario: Verify "Hello World" is displayed
      When the user clicks run button
      Then "Hello World" should be displayed on Output window

    Scenario: Verify the "Share" button link starts with "https://dotnetfiddle.net/"
      When the user clicks "Share" button
      Then the link displayed should start with "https://dotnetfiddle.net/"