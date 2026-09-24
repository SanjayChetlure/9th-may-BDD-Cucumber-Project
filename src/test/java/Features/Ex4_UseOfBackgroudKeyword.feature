Feature: login to application

  Background:
    Given user is on login page


  Scenario: S1-login to app with valid credentials
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user should be redirected to the home page

  Scenario: S2-login to app with invalid credentials
    When user enters invalid username
    And user enters invalid password
    And user clicks on login button
    Then login failed error msg should be visible

  Scenario: S3-Verify title of an application
    Then title of page should be visible
