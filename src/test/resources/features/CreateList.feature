Feature: Creating a simple list(Practice)

  Background: the user on the login page
    Given the user on the login page
    And the user is logged in the given link

  Scenario: create list
    When user can click task icon
    And Click Add to list
    And Enter "Trafalgar" task and click save
    Then User cans see left drop down menu "Trafalgar" appear in the Trafalgar list

  Scenario: Check different button actions
    Given Navigate to "Buttons" page
    When  Double click on button
    Then  Verify text double click message "You have done a double click" should be visible
    And   Right click on button
    Then  Verify text right click message "You have done a right click" should be visible
    And   Click Me button
    Then  Verify text click me message "You have done a dynamic click" should be visible