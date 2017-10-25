#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: Login Action

Scenario: Successful Login with Valid Credentials by data table
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	    | shubham3 | Test@153 | testdata3 |
	Then Message displayed Login Successfully

Scenario: Successful Login with Valid Credentials by Maps in Data Tables
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIns
	| Username   | Password |
  | testuser_1 | Test@153 |
  | testuser_2 | Test@154 |
	Then Message displayed Login Successfully

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username   | password |
    | Shubham1 | Test@153 |
    | Shubham2 | Test@153 |
    
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfullyy
