Feature: login to application

  Scenario: login to app with valid credentials
    Given user is on login page
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user should be redirected to the home page