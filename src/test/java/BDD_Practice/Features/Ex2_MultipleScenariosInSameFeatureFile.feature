Feature: login to application

  Scenario: S1-login to app with valid credentials
    Given user is on login page
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user should be redirected to the home page

  Scenario: S2-login to app with invalid credentials
    Given user is on login page
    When user enters invalid username
    And user enters invalid password
    And user clicks on login button
    Then login failed error msg should be visible

  Scenario: S3-Verify title of an application
    Given user is on login page
    Then title of page should be visible
