Feature: Area screen should allow the user to convert different space areas

  Scenario: Validate the title of the screen
    Given That I launched the app
    Then The title is displayed

  Scenario: Validate that I can type a number
    Given That I launched the app
    And I typed the number 8
    Then The number 8 is typed

  Scenario: Validate that I can change the conversion type
    Given That I launched the app
    And I typed the number 8
    And I taped the conversion type   dropdown
    And I select the Inch option
    Then The inch value is converted