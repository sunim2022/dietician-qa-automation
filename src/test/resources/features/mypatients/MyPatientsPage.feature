@tag
Feature: My Patients page

  
  @Test1
  Scenario: Verify breadcrumbs
    Given User is on any page after login
    And "My Patients" tab is enabled
    When User clicks on "My Patients" tab
    Then It shows breadcrubs as Dietician Software/ MyPatients

  @Test1
  Scenario: Confirm my patient title
    Given User is on any page after login
     And "My Patients" tab is enabled
    When User clicks on "My Patients" tab
    Then Page title is displayed as 'My Patients'
