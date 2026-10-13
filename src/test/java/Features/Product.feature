@product
Feature: Swaglab product feature
  Background: login to Swaglab app
    Given user open SwagLab Application with url "URL"
    When user enter UN as "#UN"
    And wait for 1 sec
    And user enter PWD as "#PWD"
    And wait for 1 sec
    And user click on login button
    And wait for 1 sec
    Then verify Swaglab Home page logo text as "Swag Labs"

  @product_addRemoveFromCart
  Scenario: TC4- Add To Cart button functionality
    When user click on addToCart button
    And wait for 2 sec
    Then verify remove button is visible
    And wait for 2 sec

  @product_verifySpecificProductName
  Scenario: TC5- verify Specific Product Name visible
    Then verify "Sauce Labs Backpack1" product is present in home page

  @product_verifySpecificProductPrice
  Scenario: TC6- verify Specific Product Name visible
    Then verify Sauce Labs Backpack price as 29.99

  @product_verifyAllProductPriceTotal
  Scenario: TC6- verify Specific Product Name visible
    Then verify total product price should be 129.94

  @product_verifyTotalProductSize
  Scenario: TC7- verify total product size
    Then verify total product size should be 6

  @product_E2E
  Scenario: TC8 - E2E Scenario
    When user click on addToCart button
    And wait for 1 sec
    And user click on cart link
    And wait for 1 sec
    And user click checkout button
    And wait for 1 sec
    And user enter FN as "abc"
    And user enter LN as "xyz"
    And user enter postal code as "1234"
    And wait for 2 sec
    And user click on continue button
    And wait for 2 sec
    And user click on finish button
    And wait for 3 sec
    Then verify order placed message "Thank you for your order!" is visible


  @product_E2E_usingScenarioOutline
  Scenario Outline: TC8 - E2E Scenario using scenario outline
    When user click on addToCart button
    And wait for 1 sec
    And user click on cart link
    And wait for 1 sec
    And user click checkout button
    And wait for 1 sec
    And user enter FN as "<FN>"
    And user enter LN as "<LN>"
    And user enter postal code as "<PC>"
    And wait for 2 sec
    And user click on continue button
    And wait for 2 sec
    And user click on finish button
    And wait for 3 sec
    Then verify order placed message "<expMessage>" is visible
    Examples:
    |FN    | LN   |PC    |expMessage                |
    | abc1 | xyz1 | 1111 |Thank you for your order! |
    | abc2 | xyz2 | 2222 |Thank you for your order! |
    | abc3 | xyz3 | 3333 |Thank you for your order! |





