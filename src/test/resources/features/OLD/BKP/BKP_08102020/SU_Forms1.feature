Feature: Strayer Forms Suite


  @DegreeHeaderForm @OMS
  Scenario: TC001: Verify user is able to submit Degree header form
    Given User Navigate to Degree Page
    When I move to Degree Page Utility Navigation
    When I Click on "LEARN MORE" link in Degree Page
    When I move to Degree Form
    And I enter "Degree" as FirstName in Degree form
    And I enter "Form" as LastName in Degree form
    And I enter "TA DIGITAL" as Company in Degree form
    And I enter "Mr Pradeep" as Title in Degree form
    And I enter "degreeform@cunet.com" as Email in Degree form
    And I enter "BEST COMPANY" as Comments in Degree form
    When I click "Submit" button in Degree form
    Then I should see the "200" Response Status code
    Then I should see the "Thank you for your interest in Degrees@Work." text on Window

 @LinkedInpageMBAForm @LP
  Scenario: TC002: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    And I enter "Linkedin" as FirstName in LinkedIn form
    And I enter "MBA" as LastName in LinkedIn form
    And I enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And I enter "1234567890" as PhoneNumber in LinkedIn form
    And I enter "99501" as Zip in LinkedIn form
    When I click "Submit" button in LinkedIn form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page