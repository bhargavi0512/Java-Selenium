Feature: Cart Page Tests

  Scenario: Add product to cart
    Given User is logged in with "standard_user" and "secret_sauce"
    When User adds "Sauce Labs Backpack" to the cart
    And User opens the cart
    Then Cart badge should show "1"
    And Cart should contain "Sauce Labs Backpack"

  Scenario: Remove product from cart
    Given User is logged in with "standard_user" and "secret_sauce"
    And User adds "Sauce Labs Backpack" to the cart
    And User opens the cart
    When User removes "Sauce Labs Backpack" from the cart
    Then Cart should be empty

  Scenario: Verify cart badge count
    Given User is logged in with "standard_user" and "secret_sauce"
    When User adds products:
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |
    And User opens the cart
    Then Cart badge should show "2"