Feature: Scenario outline And normal scenario in same feature file

  Scenario Outline: S1-Submit multiple students details
    Given user is on signin page
    When student enter "<name>" as firstname
    And student enter <per> as percentage
    And student click on submit button
    Then verify student details submitted
    Examples:
    |name    | per |
    |Amol    | 67.3|
    |Nirank  | 55.9|
    |Pooja   | 90.1|
    |Sanjay  | 77.1|

  Scenario: S2-login to app with valid credentials
    Given user is on login page
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user should be redirected to the home page

    
