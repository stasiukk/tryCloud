Feature:

  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given the user is logged in
    Given User is on contact page


  Scenario Outline: User is able to create new contacts

    And User click on New contact
    And User enter contact "<name>"
    Then New contact "<name>"should be created
    Examples:
      | name          |
      | John Deer     |
      | Daniel Jonson |
      | Alex Deer     |
      |               |


  Scenario: User is able to see all contact as a list in the middle column and total number of
  contact near the All contacts tab

    And User click on All contacts tab
    Then User should see all contacts as a list in the middle column
    And User should see total number of contact near the All contacts tab


  Scenario: User can change the profile picture of any contact with a previously
  uploaded picture by using Choose from files option

    And User click on Contact User08
    And User click on Profile Picture Setting
    And User click Choose from Files
    And User select picturesfav folder
    And User select new pictures
    Then User click Choose Button


  Scenario Outline: User can Delete any selected contacts
    And User click on New contact
    And User enter contact "<name>"
    And User select contact "<name>" from the list
    And User click on 3 dots action button
    And User click on Delete
    Then Contact "<name>" should be deleted
    Examples:
      | name           |
      | Vladimir Casap |
      | Johnny Depp    |
      | Angelina Jolie |
      |                |






