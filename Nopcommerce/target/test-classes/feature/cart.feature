Feature: Shopping Cart functionality

  Background:
    Given I am logged in with "munnyreddy05@gmail.com" and "Munny@12"

  Scenario: Add Flower Girl Bracelet to the cart
    When I navigate to the "Jewelry" category
    And I add "Flower Girl Bracelet" to the cart
    And I go to the shopping cart
    Then I should see "Flower Girl Bracelet" in the cart

  Scenario: Remove Flower Girl Bracelet from the cart
    Given "Flower Girl Bracelet" is already in the cart
    When I remove "Flower Girl Bracelet" from the cart
    Then I should not see "Flower Girl Bracelet" in the cart
