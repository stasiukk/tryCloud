@dashboard
  Feature: User should be able to modify Dashboard

    Background: User is already in the log in page
      Given the user is logged in


    Scenario: Verify modules list on dashboard
      Then  user can see list of modules




    Scenario: Verify username on dashboard
      When user click on username icon
     Then user should be able to see username on dashboard


      Scenario: Verify customize button
        When user can click on customize button

        Scenario: Verify widget buttons
          Given user can click on customize button
          When user can click on set weather widget
          And user can click on status widget
          And user can click on upcoming events widget
          And user can click on recommended files widget
          And user can click on recent status widget
          And user can click on talk mentions widget
          And user can click on important mail widget
          And user can click on customize button unread mail widget

          Scenario: Verify set status button
            When user should be able to click on username icon
            And user should be able to click on set status icon

            Scenario: Verify  online status option
              Given user should be able to click on username icon
              When user should be able to click on set status icon
              And user should be able to click on online status icon
              Then  user should be able to click message status icon

              Scenario: Verify away status option
                Given user should be able to click on username icon
                When user should be able to click on set status icon
                And user should be able to click on away status icon
                Then user should be able to click message status icon


                Scenario: Verify do not disturb option
                  Given user should be able to click on username icon
                  When user should be able to click on set status icon
                  And user should be able to click on do not disturb status icon
                  Then  user should be able to click message status icon

                  Scenario: Verify invisible status option
                    Given user should be able to click on username icon
                    When user should be able to click on set status icon
                    And user should be able to click on invisible status icon
                    Then user should be able to click message status icon








