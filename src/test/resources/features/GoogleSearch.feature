Feature: Google search functionality
  Agile story: As a user, when i am on the Google search page
  i should able to search anything and see relevant results

  Scenario: Search page default title verification
    When user is on the Google search page
    Then user should see title is Google




      #WIP means W - working, I - In, P - progress
    Scenario: Search result title verification
      Given user is on the Google search page
      When user searches for apple
      Then user should see apple in the title

