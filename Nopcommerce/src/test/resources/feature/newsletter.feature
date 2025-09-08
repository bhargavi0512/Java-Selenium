Feature: Newsletter Subscription

  Scenario Outline: Subscribe to newsletter with different emails
    Given I am on the newsletter section
    When I enter "<email>" in the newsletter field
    And I click on subscribe button
    Then subscription should be successful or show error

    Examples:
      | email                   |
      | munnyreddy05@gmail.com  |
      | @gmail.com              |
      |                         |
