@login
Feature: Testing the login functionality

  Scenario: Verifying the login page using valid credentials
    Given the user is in swag labs page
    When the user gives username "standard_user" and password "secret_sauce"
    And the user clicks on Login button
    Then the products page should be displayed

  Scenario Outline: Verifying the login page using valid credentials
    Given the user is in swag labs page
    When the user gives "<username>" and "<password>"
    And the user clicks on Login button
    Then the products page should be displayed
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
