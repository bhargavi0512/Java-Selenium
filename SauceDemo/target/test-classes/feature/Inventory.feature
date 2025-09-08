Feature: Inventory Page Tests

  Background:
    Given User is logged in with "standard_user" and "secret_sauce"

  Scenario: Verify inventory page loads with products
    Then Inventory page title should be "Swag Labs"
    And Products should be visible

  Scenario: Verify filter dropdown options
    Then Filter dropdown should be visible
    And Filter dropdown should have options:
      | Name (A to Z)     |
      | Name (Z to A)     |
      | Price (low to high) |
      | Price (high to low) |

  Scenario: Verify sort by Name A-Z
    When User selects "Name (A to Z)" from filter dropdown
    Then Products should be sorted in ascending order

  Scenario: Verify sort by Name Z-A
    When User selects "Name (Z to A)" from filter dropdown
    Then Products should be sorted in descending order

  Scenario: Verify sort by Price Low-High
    When User selects "Price (low to high)" from filter dropdown
    Then Products should be sorted by increasing price

  Scenario: Verify sort by Price High-Low
    When User selects "Price (high to low)" from filter dropdown
    Then Products should be sorted by decreasing price