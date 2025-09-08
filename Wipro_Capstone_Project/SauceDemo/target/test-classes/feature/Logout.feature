Feature: Logout and Navigation Tests

  Background:
    Given User is logged in with "standard_user" and "secret_sauce"

  Scenario: User logs out successfully
    When User clicks on the menu button
    And User clicks on logout
    Then User should be redirected to the login page

  Scenario: User navigates back to inventory from cart
    When User opens the cart
    And User clicks on continue shopping
    Then User should be redirected to the inventory page