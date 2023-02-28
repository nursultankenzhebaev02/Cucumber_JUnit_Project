Feature: Web table app login functionality
  Agile Story: User should be able to login with correct credentials

  Scenario: Positive login scenario
    Given user is on the Web Table app login
    When user enters tester username "Test"
    And user enters valid password "Tester"
    And user clicks to login button
    Then user should see "orders" word in the URL

  Scenario: Positive login scenario
    Given user is on the Web Table app login
    When user enters below correct credentials
      | username | Test   |
      | password | Tester |
    And user clicks to login button
    Then user should see "orders" word in the URL