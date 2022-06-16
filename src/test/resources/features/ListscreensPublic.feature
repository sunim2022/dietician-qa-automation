@ListOfScreensUnderPublic
Feature: List of screens under Public
  I want to use this template for my feature file

  @ListOfScreensUnderPublic
  Scenario: Public page
    Given user is on Dietician website
    When user clicks screens
    Then User should see a list of screens

  @ListOfScreensUnderPublic
  Scenario: user sign in
    Given user is on public page
    When User clicks sign in
    Then user navigates to sign in page

  @ListOfScreensUnderPublic
  Scenario: Register
    Given user navigated to public page
    When user clicks Register
    Then user navigates to register page

  @ListOfScreensUnderPublic
  Scenario: Team
    Given user should be on public page
    When user clicks Team
    Then user navigates to Team page

  @ListOfScreensUnderPublic
  Scenario: 
    Given user is on screens page
    When user clicks Testimonials
    Then user navigated to Testimonials page
