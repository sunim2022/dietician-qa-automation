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
#	""			
 
@HomepageTeam
Feature: TEAM Link on Home Page
  I want to validate the team link on Home page

  @tag1
  Scenario: Validating the TEAM link on Upper Menu Bar  on Home page
    Given User is on Home page
    When User clicks on Team Link on Home Page
    Then User is directed to Doctor Team page

 