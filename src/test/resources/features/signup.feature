@register
Feature: Register form

  @register
  Scenario: Sign up form
    Given user is on Dietician website
    When User Clicks Register button
    Then user is on sign up form

  @register
  Scenario Outline: Sign up form with valid credentials
    Given User is on Sign up form
    When User Enters "<First Name>" "<Last Name>" "<Mobile Number>" "<Any other field>" "<Email>" and "<Password>"
    Then User successfully signed up

    Examples: 
      | First Name | Last Name | Mobile Number | Any other field | Email              | Password  |
      | kalaiselvi | Ganesan   |    9234567695 | kumar           | kalaiabc@gmail.com | sathya123 |

  @register
  Scenario: Sign up form with email
    Given User on Dietician website
    When user clicks Register button
    Then user should navigate to sign up with your email page

  @register
  Scenario Outline: Sign up form with your email valid credentials
    Given User is on Sign up form with your email
    When User Enters "<Name>" "<First Name>" "<Last Name>" "<Email>" "<Password>"  and "<Confirm Password>"
    Then User successfully signed up

    Examples: 
      | Name  | First Name | Last Name | Email               | Password | Confirm Password |
      | kalai | kalaiselvi | Ganesan   | kalaiabcd@gmail.com | kalai123 | kalai123         |

  @register
  Scenario: Sign up using facebook
    Given user clicks Register
    When user clicks sign up with using facebook
    Then user navigate to sign up with facebook

  @register
  Scenario Outline: Sign up with Facebook by using valid credentials
    Given user is on sign up form with your facebook account
    When user enters "<Username>" And "<Password>"
     Then user successfully signed up through facebook

    Examples: 
      | Username   | Password  |
      | kalaiselvi | sathya243 |

  @register
  Scenario: Sign up using google
    Given  User clicks Register
    When user clicks Sign up with using google account
    Then user navigate to sign up using google account

  @register
  Scenario Outline: Sign up with Google by using valid credentials
    Given user is on sign up form with your facebook account
    When user enters "<Email>" And "<Password>" clicks sign up
    Then user successfully signed up through Google Account

    Examples: 
      | Email              | Password  |
      | kalaiabc@gmail.com | sathya123 |

  @register
  Scenario: login here when already have account
    Given user clicks register
    When user clicks "login here"link
    Then user should navigate to sign in page
