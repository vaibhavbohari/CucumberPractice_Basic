Feature: check login functionality

Scenario: To check user is able to login
		Given user is on login page
    When user enters valid   username "vaibhavbohari@gmail.com" and password "Mayuri@"
    And  clicks on login button
    Then user is navigated to the home page   