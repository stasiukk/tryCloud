@wipAndrei
Feature: As a user, I should be able to search file or contact from Dashboard

  Background:
    Given the user is logged in

  Scenario: User can search file typing its name through the magnifying glass icon inside Files Module and see the details side page of the file when clicked on it.
    Then user clicks on files module
    Then user clicks on magnifying glass icon
    And user searches for file "name"
    Then user checks the file details

  Scenario: User can search file typing its name through the magnifying glass icon inside Contacts Module and see the details side page of the file when clicked on it.
    Then user clicks on Contacts module
    Then user clicks on magnifying glass icon
    And user searches for file "name"
    Then user checks the file details

  Scenario: User can search file typing its name through the magnifying glass icon inside Calendar Module and see the details side page of the file when clicked on it.
    Then user clicks on Calendar module
    Then user clicks on magnifying glass icon
    And user searches for file "name"
    Then user checks the file details


  Scenario: User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page from Files Module.
    Then user clicks on files module
     Then user navigates back to dashboard

  Scenario: User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page from Contacts Module.
    Then user clicks on Contacts module
    Then user navigates back to dashboard

  Scenario: User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page from Calendar Module.
    Then user clicks on Calendar module
    Then user navigates back to dashboard