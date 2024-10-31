@wip
Feature: US-07 Calendar Module Functionality
  As a user, I should be able to see Daily-Weekly-Monthly
  calendar view and create a new event under the Calendar module

  Background:
    Given the user is on the login page
    And the user put valid credentials
    Then the user logged in successfully
    Given the user can find the Calendar module on dashboard
    Then the user can click on the Calendar module

  Scenario: Verify that the user can successfully display the daily calendar view
    Given the user can display the daily calendar view

  Scenario: Verify that the user can successfully display the weekly calendar view
    Given the user can find the Calendar module on dashboard


  Scenario: Verify that the user can successfully display the monthly calendar view
    And the user can display the monthly calendar view
    Then the user can click on the New Event
    And the user can create a new event under the monthly calendar view
    And the user can see new event created on the monthly calendar view






