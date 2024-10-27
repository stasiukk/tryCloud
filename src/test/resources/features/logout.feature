@logout
Feature: Users log out functionality.

  Background: User is already logged in.


  Scenario: User is already logged in
    Given the user is on the login page
    Then user logs out and ends up on login page
    And user tries to click back to access home page
    Then user should be redirected to login page


#    Given the user logged in with username as "User1" and password as "UserUser123"





