@logout
Feature: User log out functionality

  As a user,
  I should be able to log out successfully.

  Background:
    Given the user is on the login page
    And the user is logged in successfully
    And the user is on the home page

  Scenario: User logs out and is redirected to login page
    When the user logs out
    Then the user should be redirected to the login page

  Scenario: User cannot access home page after logging out
    Given the user is on the login page after logging out
    When the user clicks the browser's back button
    Then the user should be redirected back to the login page
    Then user sees the login page header "TRYCLOUD"






