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

@tag
Feature: Sign In Form 
  
  Scenario Outline: Dietician wants to create newPatientRecord 
    Given User is on NewPatientPage
    When Enters "<FullName>" and "<AddressLane1>" and "<AddressLane2>" and "<Country>" and "<City>" and "<StateProvinence>" and "<PostalCode>" and "<Email>" and "<Phonenumber>" 
    And user click on Update button
    Then PatientRecord Created

    Examples: 
      | Fullname   | AddressLane1 |    AddressLane2     |Country|City   |StateProvinence |PostalCode |Email        |Phonenumber|
      |YamunaXYZ   | RST Drive    | CountyRoad          | USA   |NewYork| Delaware       |34241      |qwe@gvb.com  |1234567891 |
      |YGABCD      |BelmontShore  | Highwoods Drive     |UK     |London |  Bellfast      |dfg        |erf@yahoo.com|3453|
      
    Scenario: PataientData is visible
    Given User is on NewPatientPage
    When User clicks Clickshere
    Then UpdateHealthConditions form should open
      
    
