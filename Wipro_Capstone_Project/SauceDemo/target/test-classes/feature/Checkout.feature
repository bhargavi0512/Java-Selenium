Feature: Checkout Page Tests

  Background:
    Given User is logged in with "standard_user" and "secret_sauce"
    And User adds "Sauce Labs Backpack" to the cart
    And User opens the cart

  Scenario: Successful checkout
    When User clicks on checkout button
    And User enters checkout details "Vemireddy" "Bhargavi" "12345"
    And User clicks continue
    Then Checkout overview page should be displayed
    When User clicks finish
    Then Order confirmation message should be displayed

  Scenario: Cancel checkout
    When User clicks on checkout button
    And User clicks cancel
    Then User should be redirected back to the cart page