Feature: Area screen should allow the user to convert different space areas

  Scenario: Validate the title of the screen
    Given That I launched the app
    And I open the volume category
    Then The title is displayed

  Scenario: Validate that I can convert cups to liter
    Given That I opened the app
    And I clicked the main menu
    And I open the volume category
    And I typed the number eight
    And I tap the conversion type dropdown
    And I select the cup option
    Then The cup value is converted