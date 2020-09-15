Feature: Console Errors in PMLP Pages in QA

   @PEPRFI @Forms @SUEDU
  Scenario: TC020: Verify User is able to submit PEP  form
    Given User Navigate to PEP Form Page
    When User select "Business" as AOS in PEP form
    And User select "Associate" as Degree in PEP form
    And User select "Associate in Arts in Marketing" as Program in PEP form
    When User Fill PEP Form Data
    When User move to PEP RFI
    When User enter "PEP" as FirstName in PEP  Form
    And User enter "Form" as LastName in PEP Form
    And User enter "pepform@cunet.com" as Email in PEP Form
    And User enter "1232344567" as PhoneNumber in PEP Form
    And User enter "55111" as Zip in PEP Form
    When User click "AgreeandGo" button in PEP Form
    Then User should see the "200" Success Response Status code
    Then User should navigate to "Thank You" Thank you page

  @BannerRFI @SUEDU @Forms
  Scenario: TC001: Verify User is able to submit Banner form
    Given User Navigate to EDU Banner Forms Page
    When User move to BannerRFI
    And User enter "Banner" as FirstName in Banner form
    And User enter "Form" as LastName in Banner form
    And User enter "Bannerform@cunet.com" as Email in Banner form
    And User enter "1232377767" as PhoneNumber in Banner form
    And User enter "55111" as Zip in Banner form
    When User click "AgreeandGo" button in Banner form
    Then User should see the "200" Success Response Status code
    Then User should navigate to "Thank You" Thank you page

  @FooterRFI @SUEDU @Forms
  Scenario: TC002: Verify User is able to submit footer  form
    Given User Navigate to EDU Forms Page
    When User move to footerRFI
    And User enter "Footer" as FirstName in form
    And User enter "Form" as LastName in form
    And User enter "footerform@cunet.com" as Email in form
    And User enter "1232344567" as PhoneNumber in Footer form
    And User enter "55111" as Zip in form
    When User click "AgreeandGo" button in form
    Then User should see the "200" Success Response Status code
    Then User should navigate to "Thank You" Thank you page
    
    @DownloadFormMBA @OMS @Forms
  Scenario: TC006: Verify User is able to submit MBA download form
    Given User Navigate to Mobile Mba Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "downloadform@cunet.com" as Email in Download form
    And User enter "1232344567" as PhoneNumber in Download form
    And User enter "55111" as Zip in Download form
    When User click "Submit" button in Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page

  @MicroSiteForminMBAEntrepreneurship @OMS @Forms
  Scenario: TC007: Verify User is able to submit Banner with Microsite form
    Given User Navigate to Cheddar Page
    When User move to MicroSite form
    And User enter "Cheddar" as FirstName in MicroSite form
    And User enter "Form" as LastName in MicroSite form
    And User enter "55111" as Zip in MicroSite form
    And User enter "cheddarform@cunet.com" as Email in MicroSite form
    And User enter "1232344567" as PhoneNumber in MicroSite form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @MicroSiteForminMBAPage @OMS @Forms
  Scenario: TC008: Verify User is able to submit Banner with Microsite form in Mobile-Mba Page
    Given User Navigate to Mobile Mba Page
    When User move to MicroSite form
    And User enter "Mobile" as FirstName in MicroSite form
    And User enter "MBA" as LastName in MicroSite form
    And User enter "55111" as Zip in MicroSite form
    And User enter "mobilemba@cunet.com" as Email in MicroSite form
    And User enter "1232344567" as PhoneNumber in MicroSite form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @DownloadFormCheddar @OMS @Forms
  Scenario: TC009: Verify User is able to submit Download form
    Given User Navigate to Cheddar Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "downloadform@cunet.com" as Email in Download form
    And User enter "1232344567" as PhoneNumber in Download form
    And User enter "55111" as Zip in Download form
    When User click "Submit" button in Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page
    
    @LinkedInpageMBAForm @SUPMLP @Forms
  Scenario: TC011: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User enter "Linkedin" as FirstName in LinkedIn form
    And User enter "MBA" as LastName in LinkedIn form
    And User enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And User enter "1234567890" as PhoneNumber in LinkedIn form
    And User enter "55111" as Zip in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @LinkedInpageBBAForm @SUPMLP @Forms
  Scenario: TC012: Verify User is able to submit form in Linked In BBA page
    Given User Navigate to LinkedIn BBA Page
    When User enter "Linkedin" as FirstName in LinkedIn form
    And User enter "MBA" as LastName in LinkedIn form
    And User enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And User enter "1234567890" as PhoneNumber in LinkedIn form
    And User enter "55111" as Zip in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page
    
    @ShortForm @SUPMLP @Forms
  Scenario: TC013: Verify User is able to submit Short form
    Given User move to Short form Page
    And User enter "Deepu" as FirstName in Short form
    And User enter "Kumar" as LastName in Short form
    And User enter "shortform@cunet.com" as Email in Short form
    And User enter "1234567890" as PhoneNumber in Short form
    And User enter "55111" as Zip in Short form
    And User Selects "Yes" as TransferCreditInterest Option in Short form
    And User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @ShortFormwithDropdown @SUPMLP @Forms
  Scenario: TC014: Verify User is able to submit Short form with drop downs
    Given User move to Short form with drop down Page
    When User select "MBA" as Degree in Short form
    And User select "Business Administration" as program of interest in Short form
    And User enter "Deepu" as FirstName in Short form
    And User enter "Kumar" as LastName in Short form
    And User enter "shortformdd@cunet.com" as Email in Short form
    And User enter "1234567890" as PhoneNumber in Short form
    And User enter "55111" as Zip in Short form
    And User Selects "Yes" as TransferCreditInterest Option in Short form with dropdown
    And User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University : Thank You" text on page

  @TwoStepForm @SUPMLP @Forms
  Scenario: TC015: Verify User is able to submit Two Step  form
    Given User move to Two step  form Page
    When User enter "Two Step" as FirstName in Two Step form
    And User enter "Form" as LastName in Two Step form
    And User enter "HQA" as Address in Two Step form
    And User enter "55111" as Zip in Two Step form
    And User enter "1234567890" as PhoneNumber in Two Step form
    And User enter " twostepform@cunet.com" as Email in Two Step form
    When User click "Next" Button in Two Step form
    And User select "MBA" as Degree in Two Step form
    And User select "Business Administration" as program of interest in Two Step form
    And User Selects "Yes" as TransferCreditInterest Option in Two Step form
    When User click "AgreeandGo" button in Two Step form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @LongForm @SUPMLP @Forms
  Scenario: TC016: Verify User is able to submit Long form
    Given User move to Long  form Page
    And User enter "Long" as FirstName in Long form
    And User enter "Form" as LastName in Long form
    And User enter "HYDERABAD" as Address in Long form
    And User enter "longform@cunet.com" as Email in Long form
    And User enter "1234567890" as PhoneNumber in Long form
    And User enter "55111" as Zip in Long form
    #  And User select "Some post graduate" as Education Level in Long form
    And User select "Certificates" as Degree in Long form
    And User select "Digital Entrepreneurship" as program of interest in Long form
    And User Selects "Yes" as TransferCreditInterest Option in Long form
    When User click "AgreeandGo" button in Long form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @CheddarFormWithDropdown @OMS @Forms
  Scenario: TC017: Verify User is able to submit Cheddar form
    Given User Navigate to Cheddar Application Page
    When User move to MicroSite form
    And User enter "Cheddar with drop down" as FirstName in MicroSite form
    And User enter "Form" as LastName in MicroSite form
    And User enter "55111" as Zip in MicroSite form
    And User enter "cheddarformdd@cunet.com" as Email in MicroSite form
    And User enter "1232344567" as PhoneNumber in MicroSite form
    And User select "High School Graduate" as education level in form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @CheddarDownloadForm @OMS @Forms
  Scenario: TC018: Verify User is able to submit Cheddar Download form
    Given User Navigate to Cheddar Application Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Cheddar Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "cheddardownloadform@cunet.com" as Email in Download form
    And User enter "1232344567" as PhoneNumber in Download form
    And User enter "55111" as Zip in Download form
    And User select "High School Graduate" as education level in download form
    When User click "Submit" button in Cheddar Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page
    
     @EmailUsForm @CUEDU @Forms
  Scenario: TC_024: Verify user is able to subit Email Us form
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

  @RequestInfoForm @CUEDU @Forms
  Scenario: TC_0025: Verify user is able to subit RFI form
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

  @ScheduleConsultationForm @CUEDU @Forms
  Scenario: TC_026: Verify user is able to subit Schedule Consultation form
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

  @ReferaFriendForm @CUEDU @Forms
  Scenario: TC_027: Verify Single Course Registration form
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

  @RegistrationForm @CUEDU @Forms
  Scenario: TC_028:  Verify user is able to submit My Capella Registration form
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
    
     @PFQForm @CUEDU @Forms
  Scenario: TC_031: Verify User is able to Submit PFQ Form
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

 
  @IRFForm @CUPMLP @Forms
  Scenario: TC001:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    Then User should navigate to Request Information form
    And User select "Certificate" as Degree in LP form
    And User select "Analytics" as Area of Study in LP form
      And User select "Grad Cert - Analytics Using SAS" as Bachelors Specialization Study in LP form
    And User enter "LP" as First Name in LP form
    And User enter "Form" as Last Name in LP form
    And User enter "Email" in Email Address in LP form
    And User enter PhoneNumber as Phone Number in LP form
    And User enter "55111" as ZipCode in LP form
    And User submit the LP form
    And User should see "Thank you," in the Thankyou Page for LP Form
    And User should see "trigger=irf_submit" in Thankyou Page URL