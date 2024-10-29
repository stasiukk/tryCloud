Feature:

  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given the user is on the login page
    And the user logs in successfully
    Given User is on contact page


  Scenario: User is able to create new contact

    And User click on New contact
    And User enter contact name
    Then New contact should be created


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


    Scenario: User can Delete any selected contacts
      And User click on New contact
      And User enter contact name
      And User select contact from the list
      And User click on 3 dots action button
      And User click on Delete
      Then Contact should be deleted






