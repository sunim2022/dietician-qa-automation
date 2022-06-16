@ListOfScreensUnderDietician
Feature: List Of Screens Under Dietician

  @ListOfScreensUnderDietician
  Scenario: Validating the Dietician Section on list of screens
    Given User is on Dietician website
    When User clicks 3 horizontal lines on top right corner
    Then user navigated to list of screens under "dietician"

  @ListOfScreensUnderDietician
  Scenario: Validating the text of View Recent Diets link
    Given User is on Dietician website
    When User clicks 3 horizontal lines on top right corner
    Then user should see a link  "View Recent diets"

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of View Recent Diets link when user is not signed in
    Given User is on Home page
    When User selects the link "View Recent diets "before signing in
    Then user is re directed to Sign in page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of View Recent Test Reports link when user is not signed in
    Given User is on Home page
    When User selects the link " View Recent Test Reports "before signing in
    Then user is redirected to sign in page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of View Recent Test Reports when link user is  signed in
    Given User is on Dietician page after signing in
    When User selects the link  "View Recent Test Reports" after signing in
    Then user is re directed to View Recent Test Reports page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of Add New Patient link when user is not signed in
    Given User is on Home page
    When User selects the link  "Add New Patient" before signing in
    Then user is redirected to sign in page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of Add New Patient when link user is  signed in
    Given User is on Dietician page after signing in
    When User selects the link  "Add New Patient" after signing in
    Then user is re directed to Add New Patient page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of Dietician Home link when user is not signed in
    Given User is on Home page
    When User selects the link " Dietician Home" before signing in
    Then user is redirected to sign in page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of Dietician Home link user is  signed in
    Given User is on Dietician page after signing in
    When User selects the link  "Dietician Home" after signing in
    Then user is re-directed to Dietician Home page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of  My Patients link when user is not signed in
    Given User is on Home page
    When User selects the link " My Patients" before signing in
    Then user is re directed to sign in page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of  My Patients link user is  signed in
    Given User is on Dietician page after signing in
    When User selects the link  "My Patients" after signing in
    Then user is re directed to My Patients page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of  Confirm Conditions and Create Plan link when user is not signed in
    Given User is on Home page
    When User selects the link  "Confirm Conditions and Create Plan" before signing in
    Then user is re-directed to Sign In page

  @ListOfScreensUnderDietician
  Scenario: Validating the functionality of  Confirm Conditions and Create Plan link user is  signed in
    Given User is on My Patients page after signing in
    When User selects the link   "Confirm Conditions and Create Plan "after signing in
    Then user is re-directed to  Confirm Conditions and Create plan
