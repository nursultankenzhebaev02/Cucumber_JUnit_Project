@SEAMLES-439
Feature: Profile Settings Functionality

  Background:
    Given the user is logged in
  @SEAMLES-435
  Scenario: User can see at least following titles inside personal info under Full name/Email/Phone Number
    And the user clicks the avatar icon
    And the user clicks settings label
    Then the user should see following labels
      | Full name       |
      #| Email           |
      #      | Phone number    |
      #      | Address         |
      #      | Website         |
      #      | Twitter         |
      #      | Language        |
      #      | Locale          |
      #      | Profile picture |