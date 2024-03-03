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
Feature: Log in Feature of Webdriver University Portal
  Using the Log in feature user having valid username and password are able to log in and access the resouces
 	Background:
		Given User navigates to WebDriverUniversity.com
    And user clicks on log in portal link
    When user enters valid username

  Scenario: Login using valid username and password
    And user enters "valid" password
    And user clicks on log in button
    Then user ables to log in

 Scenario: Login using invalid username and password
    And user enters "invalid" password
    And user clicks on log in button
    Then user is not able to log in
