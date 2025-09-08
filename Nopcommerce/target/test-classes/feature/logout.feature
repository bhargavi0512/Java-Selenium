Feature: User Logout

  Background: 
    Given I am logged in with "munnyreddy05@gmail.com" and "Munny@12"

  Scenario: Successful logout
    When I click on logout
    Then I should be logged out successfully
