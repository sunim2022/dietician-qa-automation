@PatientTestReports
Feature: Patient test reports

  @PatientTestReports
  Scenario: Verify Patients reports page details
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on Search button without entering any filter text fields.
    Then It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report/ Plan
      
  
  @PatientTestReports
  Scenario: View Patient Recent Test Reports
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on "VIEW PREVIOUS TEST REPORTS" button for one of the patients from the list
    Then Dietician should be navigated to "View Recent Test Reports" Page
   
  @PatientTestReports
  Scenario: View Patient Recent Test Reports page and patient's data
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on "VIEW PREVIOUS TEST REPORTS" button for one of the patients from the list
    Then Dietician should be navigated to "View Recent Test Reports" Page and Dietician should see the Patient info (Patient ID, Name, and details)
	   
  @PatientTestReports
  Scenario: View Patient Recent Test Reports page and patient's test reports table
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on "VIEW PREVIOUS TEST REPORTS" button for one of the patients from the list
    Then Dietician should be navigated to "View Recent Test Reports" Page and Dietician should see the list of Test Reports with Record Number, DOC -ID, FILE ,Uploaded Time, File/Report Name, Identified Health Conditions columns.
  
	@PatientTestReports
  Scenario: View patient's test report pdf
    Given Dietician is on the "VIEW PREVIOUS TEST REPORTS" page.
    When Dietician clicks on "View PDF" button for the latest test report
    Then Dietician should see the pdf file opened with content.
	