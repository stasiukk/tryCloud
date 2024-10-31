@logout
Feature: User log out functionality

  As a user,
  I should be able to log out successfully.

  Background:
    Given the user is logged in

  Scenario: User logs out and is redirected to login page
    When the user click user icon
    And the user clicks on Log out button
    Then the user should be redirected to the login page

  Scenario: User cannot access home page after logging out
    When the user click user icon
    And the user clicks on Log out button
    When the user clicks the browser's back button
    Then title should contain "Trycloud QA"
