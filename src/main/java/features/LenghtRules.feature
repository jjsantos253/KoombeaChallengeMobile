Feature: Lenght screen should allow the user to convert different sizes

  Scenario: Validate the title of the screen
    Given That I launched the app
    Then The Lenght title is displayed

  Scenario: Validate that I can type a number
    Given That I launched the app
    And Type the number 8
    Then The number 8 is typed

  Scenario: Validate that I can change the conversion type
    Given That I launched the app
    And Type the number 8
    And Conversion dropdown is typed
    And Select the Inch option
    Then The inch value was converted