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
#			
@homepageHometitleAndLogoImage
Feature: Dietician Home page
  I want to validate the Home page


  Scenario: Home page title
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see the title of the page as "Home"
  
  			  
   Scenario: Logo on the Home Page
   Given User is on the browser
   When User opens the Dietician Website
   Then User should see a logo image with the company name on the Home Page
 
 