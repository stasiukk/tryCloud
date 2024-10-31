@wip
Feature: Manage Conversations in the Talk Module
  As a user, I should be able to create a new conversation and manage participants under the Talk module.

  Background:
    Given the user is logged in
    Given the user clicks on the "Talk" module


  @CreateConversationName
  Scenario: User creates a new conversation with a title
    When the user clicks on the "Create New Conversation" button
    Then the user enters "Group 11" as the conversation title
    And the user press on the "Add Participants" option
    Then the user should see the search participants field

  @AddParticipant
  Scenario: User adds a participant to the conversation
    Given the user clicks on the "Create New Conversation" button
    Then the user enters "Group 11" as the conversation title
    And the user press on the "Add Participants" option
    Then the user clicks on the "Search Participants" field
    And the user types "Employee1" into the search field
    And the user selects "Employee1" from the search results
    Then the user should see "Employee1" added to the conversation participants list


#  @CreateConversation
#  Scenario: User creates a new conversation with the participant
#    Given "Employee1" is added to the conversation participants list
#    When the user clicks on the "Create Conversation" button
#    Then the user should see the conversation title "Name" in the conversation list
#    And the conversation should be created successfully
#

  @DeleteConversation-1
  Scenario: User selects an existing conversation
    Given the conversation titled "Group 11" is available in the conversation list
    When the user click the conversation titled "Group 11"
    Then the selected conversation should be highlighted


  @DeleteConversation-2
  Scenario: User initiates the deletion process
    When the user clicks on the settings icon
    And the user selects the "Delete Conversation" option
    Then the user should see a confirmation prompt


  @DeleteConversation-3
  Scenario: User confirms conversation deletion
    When the user clicks on the settings icon
    And the user selects the "Delete Conversation" option
    When the user clicks the "Yes" button to confirm
    Then the conversation titled "Group 11" should no longer appear in the conversation list
    And the conversation should be deleted successfully

