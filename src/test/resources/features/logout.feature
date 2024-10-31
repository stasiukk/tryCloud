@logout
Feature: User log out functionality

  As a user,
  I should be able to log out successfully.

  Background:
    Given the user is on the login page
    When the user is logged in successfully
    Then the user is on the home page

  Scenario: User logs out and is redirected to login page
    When the user click user icon
    Then the user see the Log out button
    And the user clicks on Log out button
    And the user should be redirected to the login page

  Scenario: User cannot access home page after logging out
    Given the user is on the login page after logging out
    When the user clicks the browser's back button
    And the user should be redirected back to the login page
    Then user sees the login page header "TRYCLOUD"
