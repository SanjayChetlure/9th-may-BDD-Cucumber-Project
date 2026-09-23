Feature: login to app with test data from feature file

  Scenario: login to app with valid credentials from feature file
    Given user is on login page
    When user enter username as "abc"
    And user enter password as "xyz"
    And user clicks on login button
    Then verify home page visible with logo text "SwagLab"



