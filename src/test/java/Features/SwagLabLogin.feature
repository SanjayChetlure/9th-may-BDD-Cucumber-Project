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


