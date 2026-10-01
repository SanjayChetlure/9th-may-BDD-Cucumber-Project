@login
Feature: place order feature

  @Sanity @MayRelease26
  Scenario: S1- fetch currently placed order
    Given user should get logged in
    And user should be at orders page
    When user click on current orders
    Then user should see currently placed order

  @Sanity @MayRelease26
  Scenario: S2-fetch previously placed order
    Given user should get logged in
    And user should be at orders page
    When user click on past orders
    Then user should see previously placed order

  @Smoke @MayRelease26
  Scenario: S3-fetch canceled order info
    Given user should get logged in
    And user should be at orders page
    When user click on cancel orders
    Then user should see canceled order info

    @Regression @MayRelease26
  Scenario: S4-fetch previously placed order
    Given user should get logged in
    And user should be at orders page
    When user click on past orders
    Then user should see previously placed order

  @Regression
  Scenario: S5-fetch canceled order info
    Given user should get logged in
    And user should be at orders page
    When user click on cancel orders
    Then user should see canceled order info
