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
@Login
Feature: Sign In Form 

  
  Scenario: Sign in form is visible
    Given User is on Dietician website
    When User clicks account icon and selects sign in
    Then Sign in form should open

  
  Scenario Outline: Sign in with valid credentials
    Given User is on Sign in form
    When Enters "<username>" and "<Password>"
    And user clicks on signin button
    Then navigates to home page

    Examples: 
      | username | password |
      |Sowmiyaabc|Sowmiya@ABC|
      
      
    Scenario Outline: Sign in with invalid credentials
    Given User is on Sign in form
    When Enters "<username>" and "<Password>"
    And user clicks on signin button
    Then User gets popup says Invalid username or password
    Examples: 
      | username | password |
      |awbsjhfdj|Sowmiya@ABC|
      |123464736|Sowmiya|
      |Sowmiyaabc|298347|
      
      Scenario Outline: Login with your valid email
      Given User is on Sign in form
      When Enters "<emailid>" and "<Password>"
      And user clicks on signin button
      Then navigates to home page
      | emailid | password|
      |sowmiya@gmail.com|Sowmiya@123|

      Scenario Outline: Login with your invalid email
      Given User is on Sign in form
      When Enters "<emailid>" and "<Password>"
      And user clicks on signin button
      Then User gets popup says Invalid username or password      
       | emailid | password|
       |sowmiya.com|Sowmiya@123|
      |sowmiya@gmail.com|111223|
    
      Scenario: Login with facebook
      Given User is on Sign in form
      When User clicks Facebook button
      Then Facebook username and Password displays in corresponding text box
      When User clicks signin button
      Then navigates to home page
      
      Scenario: Login with gmail 
      Given User is on Sign in form
      When User clicks Facebook button
      Then google username and Password displays in corresponding text box
      When User clicks signin button
      Then navigates to home page
