Feature: Mobile Automation Demo

 @LinkedInForm
  Scenario: TC001: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User enter "Linkedin" as FirstName in LinkedIn form
    And User enter "MBA" as LastName in LinkedIn form
    And User enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And User enter "6434567890" as PhoneNumber in LinkedIn form
    And User enter "55111" as Zip in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page
    
   @ShortForm 
  Scenario: TC002: Verify User is able to submit Short form
    Given User move to Short form Page
    When User Clicks on "Request Info" Link in Footer Ribbon
    And User enter "Short" as FirstName in Short form
    And User enter "Form" as LastName in Short form
    And User enter "shortform@cunet.com" as Email in Short form
    And User enter "6434567890" as PhoneNumber in Short form
    And User enter "55111" as Zip in Short form
    And User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page