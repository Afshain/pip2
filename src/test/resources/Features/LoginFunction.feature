Feature: Login page functionality

  Background:
    Given user navigate to URL

  Scenario: Login the user with valid credentials
    Given  User Enter the Email
    And User enter the password
    When User clicks on the login button
    Then User should be logged in with the account
