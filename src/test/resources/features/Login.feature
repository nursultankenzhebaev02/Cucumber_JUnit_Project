@regression
Feature: Library Login feature

  User Story:
  As a user, I should able to login with correct credentials to different accounts,
  and dashboard should be displayed.
  Account are: librarian, student, admin

  #this is how we comment in feature file

  Background: For all scenarios user is on the login page of the library application
  Given user is on the login page of the library application

  @librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

    @student
    Scenario: Login as a student
      When user enters student username
      And user enters student password
      Then user should see the dashboard

      @admin
  Scenario: Login as a admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

