Feature: VC Forms Suite

  @EmailUsForm
  Scenario: TC_001: Verify user is able to subit Email Us form
    Given User is on Capella Home Page
    And User click Email Us link under the menu
    Then User move to Email Us Form
    And User select "Certificate" as Degree in Email form
    And User select "Business" as Area of Study in Email form
    And User select "Undergrad Cert - Accounting" as Specialization Study in Email form
    And User enter "Email" as First Name in Email form
    And User enter "Form" as Last Name in Email form
    And User enter email in Email Address in Email form
    And User enter PhoneNo as Phone Number in Email form
    And User enter "Test Comments" user Comments in Email form
    And User submit the Email form
    Then User should see the "200" Success Response Status code
    And User should get Thank you window for Email form
    And User should see "Thank you,Email." in the Thankyou Page for EmailUs Form
    And User click "Close" button in Thank you Sucess window in form

  @RequestInfoForm
  Scenario: TC_002: Verify user is able to subit RFI form
    Given User is on Capella Home Page
    And User click Request Information link under the menu
    And User select "Certificate" as Degree in RFI form
    And User select "Business" as Area of Study in RFI form
    And User select "Undergrad Cert - Accounting" as Specialization Study in RFI form
    And User select "As soon as possible" as Start Date in RFI form
    And User enter "Request Info" as First Name in RFI form
    And User enter "Form" as Last Name in RFI form
    And User enter email in Email Address in RFI form
    And User enter PhoneNumber as Phone Number in RFI form
    And User enter "55111" as ZipCode in RFI form
    And User submit the RFI form
    Then User should see the "200" Success Response Status code
    And User should get Thank you window for RFI form
    And User should see "Thank you,Request Info." in the Thankyou Page for EmailUs Form
    And User click "Close" button in Thank you Sucess window in form

  @ScheduleConsultationForm
  Scenario: TC_003: Verify user is able to subit Schedule Consultation form
    Given User is on Capella Home Page
    And User click Schedule Consultation link under the menu
    Then User move to Consultation form
    And User select "Certificate" as Degree in Consultation form
    And User select "Business" as Area of Study in Consultation form
    And User select "Undergrad Cert - Accounting" as Specialization Study in Consultation form
    And User select "As soon as possible" as Start Date in Consultation form
    And User enter "Schedule Consultation" as First Name in Consultation form
    And User enter "Form" as Last Name in Consultation form
    And User enter email in Email Address in Consultation form
    And User enter PhoneNumber as Phone Number in Consultation form
    And User enter "55111" as ZipCode in Consultation form
    And User submit the Consultation form
    Then User should see the "200" Success Response Status code
    And User should get Thank you window for Consultation form

  @ReferaFriendForm
  Scenario: TC_004: Verify Single Course Registration form
    Given User is on Refer Friend Form Page
    Then User move to Refer Friend form
    And User enter "Automation" as First Name in Refer Friend form
    And User enter "User" as Last Name in Refer Friend form
    And User enter email in Email Address in Refer Friend form
    And User select "Student" as Option  in Consultation form
    And User enter "Friend" as Friend First Name in Refer Friend form
    And User enter "User" as Friend Last Name in Refer Friend form
    And User enter email in Friend Email Address in Refer Friend form
    And User enter PhoneNumber as Phone Number in Refer Friend form
    And User submit the Refer Friend form
    Then User should see the "200" Success Response Status code
    And User should get Thank you window for Refer Friend form

  @RegistrationForm
  Scenario: TC_005:  Verify user is able to submit My Capella Registration form
    Given User is on Capella Home Page
    And User click Login link to check MC Login
    And User click Prospective Students link under Login
    Then User get MC Login modal form to enter credentials
    And User click Create a new Account link in Login modal
    Then User get Create Account modal form
    And User enter "Capellaone" First Name Create Account form
    And User enter "Userone" Last Name in Create Account form
    And User enter an Email Address in Create Account form
    And User enter "Admin*12" Password in Create Account form
    And User enter "Admin*12" Confirm Password in Create Account form
    And User click the Create Account button in form
    Then User should see the "MY PROFILE" text on My Capella Dashboard

  @PasswordRestForm
  Scenario: TC_006: Verify user is able to submit Password Reset form
    Given User is on Capella Home Page
    And User click Login link to check MC Login
    And User click Prospective Students link under Login
    Then User get MC Login modal form to enter credentials
    And User Clikc on Reset Password Link
    Then User get Forgot Password form
    And User enter as "automation1@gmail.com" Email Address in Form
    And User Clikc on Request Password Button
    Then User get Reset Password Sucess Window

  @LoginForm
  Scenario: TC_007: Verify User is able to Log into My Capella Application
    Given User is on Capella Home Page
    And User click Login link to check MC Login
    And User click Prospective Students link under Login
    Then User get MC Login modal form to enter credentials
    And User enter "johnsin@gmail.com" username or email
    And User enter "Admin*12" password
    And User click LogIn button in form
    Then User should see the "MY PROFILE" text on My Capella Dashboard

  @PFQForm
  Scenario: TC0008: Verify User is able to Submit PFQ Form
    Given User is on PFQ Page
    When User Fill Quiz
    Then User Navigate to PFQ Form
    And User select "Certificate" as Degree
    And User select "Counseling" as Area of Study
        And User select "Grad Cert - Addictive Behavior" as Specialization
    And User enter "PFQ" as FirstName in PFQ Form
    And User enter "Form" as LastName in PFQ Form
    And User enter email in Email Address in PFQ Form
    And User enter PhoneNo as Phone Number in PFQ Form
    And User enter "99501" as Zip in PFQ Form
    When User click "AgreenGo" button in PFQ Form
    Then User should see the "200" Response Status code
    Then User should see the "100%" text on PFQ Page

    @IRFForm
  Scenario: TC009:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    Then User should navigate to Request Information form
    And User select "Certificate" as Degree in LP form
    And User select "Analytics" as Area of Study in LP form
    And User select "Grad Cert - Business Administration'" as Bachelors Specialization Study in LP form
    And User enter "LP" as First Name in LP form
    And User enter "Form" as Last Name in LP form
    And User enter "Email" in Email Address in LP form
    And User enter PhoneNumber as Phone Number in LP form
    And User enter "55111" as ZipCode in LP form
    And User submit the LP form
    And User should see "Thank you," in the Thankyou Page for LP Form
    And User should see "trigger=irf_submit" in Thankyou Page URL