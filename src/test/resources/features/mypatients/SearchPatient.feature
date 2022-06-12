@tag
Feature: Search Patient

  @Test1
  Scenario: Search feature
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then Name, email and phone number filter options and search button are displayed.

  @Test1
  Scenario: Verify search button text
    Given User is logged in
    When User is on my patients
    Then Button used for search has text as 'Search'

  @Test1
  Scenario: Search patients by name
    Given User is on my patients
    When User clicks on search with "name phrase" into name filter box.
    Then Records for "name phrase" are shown.

  @Test1
  Scenario: Search patients by email
    Given User is on my patients
    When User clicks on search with "email phrase" into email address filter.
    Then Records for "email phrase" are shown.

  @Test1
  Scenario: Search patients by phone number
    Given User is on my patients
    When User clicks on search with "phone number" into phone number filter.
    Then Records for "phone number" are shown.

  @Test1
  Scenario: Search patients by name and phone number
    Given User is on my patients
    When User clicks on search button with "name phrase" into name filter box, "phone number" into phone number filter
    Then Records for "name phrase" and "phone number" are shown.

  @Test1
  Scenario: Search patients by name and email address
    Given User is on my patients
    When User clicks on search button with "name phrase" into name filter box, "email phrase" into email address filter box
    Then Records for "name phrase" and "email phrase" are shown.

  @Test1
  Scenario: Search patients by email address and phone number
    Given User is on my patients
    When User clicks on search button with "phone number" into phone number filter box, "email phrase" into email address filter box
    Then Records for "phone number" and "email phrase" are shown.

  @Test1
  Scenario: Search Filters
    Given User is on my patients page
    When User types in anything other than numbers in phone number field
    Then It must throw error message and discontinue search action.

  @Test1
  Scenario: 
    Given User is on my patients page
    When User types in anything other valid character in email address field
    Then It must throw error message and discontinue search action.

  @Test1
  Scenario: 
    Given User is on my patients page
    When User types in anything other alphabets in name field
    Then It must throw error message and discontinue search action.

  @Test1
  Scenario: Display list of patients
    Given User is on my patients
    When User clicks on search button with all fields empty
    Then Displays all patients for that dietician only

  @Test1
  Scenario: Verify column names
    Given User is on my patients
    When User clicks on search button with or without all fields empty
    Then It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions

  @Test1
  Scenario: Verify Action column has buttons
    Given User is on my patients
    When User clicks on search button with or without all fields empty
    Then It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report/ Plan
