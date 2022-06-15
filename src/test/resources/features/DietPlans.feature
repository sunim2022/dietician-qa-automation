@tag
Feature: View Diet plans

  @ViewDietPlans
  Scenario: View Diet plans for a single patient with previous visits
    Given Dietician is on the "My Patients" page
    When Dietician enters a "Name", clicks on Search and clicks on "VIEW PREVIOUS DIET PLANS" button for first plan.
    Then Dietician should be navigated to "View Recent Diets" Page.
    
   @ViewDietPlans
  Scenario: View Diet plans for a single patient with previous visits
    Given Dietician is on the "My Patients" page.
    When Dietician clicks on "VIEW PREVIOUS DIET PLANS" button.
    Then Dietician should be navigated to "View Recent Diets" Page and Dietician should see Record Number, Plan-ID, Customer Details,Diet Plan, Plan Generated Time and Comments columns.
 
  @ViewDietPlans
  Scenario: View Diet plans for a single patient with previous visits
    Given Dietician is on the "View Recent Diets" page and patient has 0 diet plans
    Then Dietician should see zero records in table.
  
  @ViewDietPlans
  Scenario: View Diet plans for all patients
    Given Dietician is on the "My Patients"page.
    When Dietician clicks on "VIEW PREVIOUS DIET PLANS" button for one of the patients from the list.
    Then Dietician should be navigated to "View Recent Diets" Page and Dietician should see Record Number, Plan-ID, Customer Details,Diet Plan, Plan Generated Time and Comments columns.
    
   @ViewDietPlans
  Scenario: View Diet plans for all patients
    Given Dietician is succesfully logged in.
    When Dietician clicks on "Diet Plans" tab.
    Then Dietician should be navigated to "View Recent Diets" Page and Dietician should see Record Number, Plan-ID, Customer Details,Diet Plan, Plan Generated Time and Comments columns.
    
   @ViewDietPlans
  Scenario: View patient's diet plan pdf
    Given Dietician is on the "View Recent Diets" page.
    When Dietician clicks on "View PDF" button for the latest diet plan
    Then Dietician should see the pdf file opened with diet content. 
   