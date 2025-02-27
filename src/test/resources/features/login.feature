@login
Feature: Testing the login functionality

  @valid-login-scenario
  Scenario: Verifying the login page using valid credentials
    Given the user is in swag labs page
    When the user gives username "standard_user" and password "secret_sauce"
    And the user clicks on Login button
    Then the products page should be displayed

  @valid-login-scenario-outline
  Scenario Outline: Verifying the login page using valid credentials
    Given the user is in swag labs page
    When the user gives "<username>" and "<password>"
    And the user clicks on Login button
    Then the products page should be displayed
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |

  @valid-login-scenario
  Scenario: Verifying the login page using valid credentials
    Given the user is in swag labs page
    When the user gives username "user" and password "12345"
    And the user clicks on Login button
    Then the user is in swag labs page
    And the error message is displayed