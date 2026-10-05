Feature: Swaglab login feature

  Scenario: TC1- login with valid credentials
    Given user open SwagLab Application with url "URL"
    When user enter UN as "UN"
    And user enter PWD as "PWD"
    And user click on login button
    Then verify Swaglab Home page logo text as "Swag Labs"