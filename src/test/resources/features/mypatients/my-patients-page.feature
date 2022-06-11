@tag
Feature: My Patients page

  @Test1
  Scenario: Verify my patient tab
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then My Patients tab is selected/ highlighted

  @Test1
  Scenario: Verify breadcrumbs
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then It shows breadcrubs as Dietician Software/ MyPatients

  @Test1
  Scenario: Confirm my patient title
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then Page title is displayed as 'My Patients'
