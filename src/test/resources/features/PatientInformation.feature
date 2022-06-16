@PatientInfo
Feature: Patient Information

  @PatientInfo
  Scenario: View patients previous diet plans
    Given Patients records are displayed
    When User clicks on button 'View Previous Diet Plans'
    Then It redirects user to 'Generated Diet Plans' page

  @PatientInfo
  Scenario: Create new diet plan
    Given Patients records are displayed
    When User clicks on button 'Create New Report Plan'
    Then It redirects user to 'Confirm Health Conditions and Generate a New Diet plan' page

  @PatientInfo
  Scenario: View patients previous test reports
    Given Patients records are displayed
    When User clicks on button 'View Previous Test Reports'
    Then It redirects user to 'View Patient Test Reports' page
