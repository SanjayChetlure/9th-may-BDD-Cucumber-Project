
Feature: Swaglab product feature
  Background:
    Given user open SwagLab Application with url "URL"

    @product_addRemoveFromCart
  Scenario: TC4- Add To Cart button functionality
    When user enter UN as "#UN"
    And wait for 1 sec
    And user enter PWD as "#PWD"
    And wait for 1 sec
    And user click on login button
    And wait for 1 sec
    Then verify Swaglab Home page logo text as "Swag Labs"
    When user click on addToCart button
    And wait for 2 sec
    Then verify remove button is visible
    And wait for 2 sec

