@tag
Feature: Dietician is on the "My Patients"page.

  @CreateNewReportAndDietPlan
  Scenario: Patient with Previous visits
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on Search button without entering any filter text fields.
    Then Dietician should see action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report/ Plan
    
  @CreateNewReportAndDietPlan
  Scenario: Patient with no Previous visits
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on Search button without entering any filter text fields.
    Then Dietician should see only Create New Report/ Plan action button.
    
  @CreateNewReportAndDietPlan
  Scenario: Confirm Conditions and Create Diet plan for Patient with Previous visits
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on "CREATE NEW REPORT/PLAN" button for one of the patients from the list.
    Then Dietician should be navigated to "Confirm Conditions and Create Plan" Page .
    
  @CreateNewReportAndDietPlan
  Scenario: Confirm Conditions and Create Diet plan for Patient with no Previous visits
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on "CREATE NEW REPORT/PLAN" button for one of the patients from the list.
    Then Dietician should be navigated to "Confirm Conditions and Create Plan" Page .
    
  @CreateNewReportAndDietPlan
  Scenario: Confirm Conditions and Create Diet plan using Toggle Switch option.
    Given Dietician is on the "Confirm Conditions and Create Plan" Page 
    When Dietician selects condition1 and condition 2 and clicks on "GENERATE MENU"
    Then Dietician should stay on the same page and dietician should be able to edit the Conditions and Preferences.
    
   @CreateNewReportAndDietPlan
  Scenario: Confirm Conditions and Create Diet plan using Toggle Switch option.
    Given Dietician is on the "Confirm Conditions and Create Plan" Page 
    When Dietician selects condition 1, clicks on "CONFIRM", then clicks on "GENERATE MENU" button.
    Then Dietician should stay on the same page and dietician should not be able to edit the Conditions and Preferences.
  
  @CreateNewReportAndDietPlan
  Scenario: Confirm Conditions and Create Diet plan using Multi Switch option.
    Given Dietician is on the "Confirm Conditions and Create Plan" Page 
    When Dietician selects new value 1 under Conditions and clicks on "GENERATE MENU"
    Then Dietician should stay on the same page and dietician should be able to edit the Conditions and Preferences.
    
   @CreateNewReportAndDietPlan
  Scenario: Confirm Conditions and Create Diet plan using Multi Switch option.
    Given Dietician is on the "Confirm Conditions and Create Plan" Page 
    When Dietician selects new value 1 under Conditions, clicks on "CONFIRM", then clicks on "GENERATE MENU" button.
    Then Dietician should stay on the same page and dietician should not be able to edit the Conditions and Preferences.
  