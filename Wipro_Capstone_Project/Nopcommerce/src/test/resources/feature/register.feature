Feature: User Registration

  Scenario Outline: Register with different inputs
    Given I am on the registration page
    When I enter "<gender>", "<firstname>", "<lastname>", "<email>", "<password>", "<confirmpassword>"
    And I click on register

    Examples:
      | gender   | firstname      | lastname               | email                  | password | confirmpassword |
      | Female   | Vemireddy      | Bhargavi Prasanna      | munnyreddy05@gmail.com | Munny@12 | Munny@12        |
      | Male     | 123            | @@@                    | abc@gmail.com          | 123456   | 123456          |
      | Female   | abc            | 123                    | 6@gmail.com            | abcdef   | abcdef          |
      |          |                |                        |                        |          |                 |
