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
Feature: User submits comments
  As a user I should be able to submit my comments by providing my first name, last name, email address, and comments

  Background: 
    Given User navigates to WebDriverUniversity.com
    And user clicks on contact us link
    And user enters first name
    And user enters last name
    And user enters email address
    And user enters comments
    |hello|there!	|
    |very	|good		|

  Scenario: User submits comments
    When user clicks on submit button
    Then thank you message should be displayed
  Scenario: User resets comments
  	When user clicks on reset button
    Then first name field should be cleared
    And last name field should be cleared
    And email address field should be cleared
    And comments field should be cleared
