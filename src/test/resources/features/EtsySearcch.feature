Feature: Etsy search functionality
  Agile Story: User should be able to type any keyword and see relevant info

  Scenario: Etsy Title Verification
    Given user is on the Etsy page
    Then user should see title is as expected

    Scenario: Etsy Search Functionality Title Verification (without parameterization)
      Given user is on the Etsy page
      When User types Wooden Spoon in the search box
      And User clicks search button
      Then User sees Wooden Spoon is in the title

      Scenario: Etsy Search Functionality Title Verification (with parameterization)
        Given user is on the Etsy page
        When User types "Wooden Spoon" in the search box
        And User clicks search button
        Then User sees "Wooden Spoon" is in the title