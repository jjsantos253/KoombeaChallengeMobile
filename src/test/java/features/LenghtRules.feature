Feature: Lenght screen should allow the user to convert different size types

  Scenario: Validate the title of the screen
    Given That I launched the app
    Then The title is displayed

  Scenario: Validate that I can convert from foot to centimeter
    Given That I launched the app
    And I typed the number 8
    Then The number 8 is typed

  Scenario: Validate that I can change the conversion unit from inch to centimeter
    Given That I launched the app
    And I typed the number 8
    And I taped the conversion type dropdown
    And I select the Inch option
    Then The inch value is converted

  Scenario: Validate that I can swap the conversion units
    Given That I launched the app
    And I typed the number 8
    And I swaped the convertion units
    Then The unit values are swaped
