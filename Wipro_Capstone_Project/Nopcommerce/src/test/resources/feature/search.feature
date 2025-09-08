Feature: Product Search After Login

  Background: 
    Given I am logged in with valid email "munnyreddy05@gmail.com" and password "Munny@12"

  Scenario Outline: Search products after login
    When I search for "<productName>"
    Then I should see search results for "<productName>"

    Examples:
      | productName                                                |
      | Apple MacBook                                              |  
      | Electronics                                                |  
      | @#$%!                                                      |
      | XYZProduct123                                              |
      |                                                            |
      | LoremIpsumDolorSitAmetConsecteturAdipiscingElit1234567890  |