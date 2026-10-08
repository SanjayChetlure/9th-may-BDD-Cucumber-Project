@login
Feature: Swaglab login feature
  Background:
    Given user open SwagLab Application with url "URL"

  @validLogin
  Scenario: TC1- login with valid credentials
    When user enter UN as "#UN"
    And user enter PWD as "#PWD"
    And user click on login button
    Then verify Swaglab Home page logo text as "Swag Labs"

  @inValidLogin
  Scenario: TC2- login with invalid credentials
    When user enter UN as "abc1"
    And user enter PWD as "xyz1"
    And user click on login button
    Then verify login failed error message with message "Epic sadface: Username and password do not match any user in this service"

    @loginWithCorrectAndIncorrectCredentials
  Scenario Outline: TC3- login with correct & incorrect credentials
    When user enter UN as "<username>"
    When wait for 2 sec
    And user enter PWD as "<password>"
    When wait for 1 sec
    And user click on login button
    Then verify login failed error message with message "<expectedErrorMsg>"
    Examples:
    |username| password| expectedErrorMsg                                                           |
    |#UN     | xyz1    |  Epic sadface: Username and password do not match any user in this service |
    | abc2   | #PWD    |  Epic sadface: Username and password do not match any user in this service |
    | abc3   | xyz3    |  Epic sadface: Username and password do not match any user in this service |

