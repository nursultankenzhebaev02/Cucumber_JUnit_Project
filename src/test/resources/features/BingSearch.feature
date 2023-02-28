Feature: Bing search functionality
  Agile story: As a user, when i am on the Google search page
  i should able to search anything and see relevant results


  Scenario: Search result title verification
    Given user is on the Bing search page
    When user searches for samsung
    Then user should see samsung in the title

  Scenario: Search result title verification
    Given user is on the Bing search page
    When user searches for "orange"
    Then user should see "orange" in the title