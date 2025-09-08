Feature: User Login

  Scenario Outline: Login with different credentials
    Given I am on the login page
    When I enter "<email>" and "<password>"
    And I click on login

    Examples:
      | email                   | password     |
      | munnyreddy05@gmail.com  | Munny@12     |
      | @gmail.com              | abcdef       |
      | 3@gmail.com             | 123456       |
      | munnyreddy05@gmail.com  |              |
      |                         |123456        |
