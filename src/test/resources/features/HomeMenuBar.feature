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
@HomepageMenubar
Feature: Menu bar options on
  I want to validate the menu bar options

  Scenario: Validating the tab "PRODUCT" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text "PRODUCT" on the top menu bar of the Home page

  Scenario: Validating the tab "CLIENTS" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text "CLIENTS" on the top menu bar of the Home page

  Scenario: Validating the tab "REGISTER" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text "REGISTER" on the top menu bar of the Home page

  Scenario: Validating the tab "About" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text "About" on the bottom menu bar of the Home page

  Scenario: Validating the tab "Featured" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text "Featured" on the bottom menu bar of the Home page

  Scenario: Validating the tab "Blog" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text "Blog" on the bottom menu bar of the Home page

  Scenario: Validating the tab "Contact us" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text "Contact us" on the bottom menu bar of the Home page

  Scenario: Validating the visibility of search option on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a search option symbol  on the bottom menu bar of the Home page

  Scenario: Validating the visibility of Signin option on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a Signin option next to the search button on the bottom menu bar of the Home page
