Feature: Create users

  Scenario Outline: User creation for multiple users
    Given user is on signin page
    When user enter firstname as "<FN>"
    And user enter lastname as "<LN>"
    And user enter age <Age>
    And user enter gender "<Gender>"
    And user click on submit button
    Then user created message visible
    Examples:
    |FN   | LN  | Age | Gender  |
    |abc1 |xyz1 | 20  | Male    |
    |abc2 |xyz2 | 25  | Male    |
    |abc3 |xyz3 | 30  | Female  |

  Scenario Outline: Submit multiple students details
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


