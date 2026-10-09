@product
Feature: Swaglab product feature
  Background:
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

