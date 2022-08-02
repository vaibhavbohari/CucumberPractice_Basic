@All
Feature: Facebook loginTagDemo feature
  I want to use this template for my feature file
  @Smoke
	Scenario: To check user is able to login
		Given I have login page facebook
    When I will login with username "vaibhavbohari@gmail.com" and password "Mayuri@"
    Then login should be successful
   @Regression
	 Scenario: To check user is able to login
		 Given I have login page facebook
     When I will login with username "vaibhav@gmail.com" and password "Sumit@"
     Then login should be successful
   @Smoke @Regression
	 Scenario: To check user is able to login
		 Given I have login page facebook
     When I will login with username "gopal@gmail.com" and password "Gopal@"
     Then login should be successful
  