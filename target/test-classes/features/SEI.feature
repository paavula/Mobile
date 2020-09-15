#Author: Pradeep Kumar Aavula
#Keywords Summary : This feature contains SEI Application functionalities
Feature: SEI Automation Suite

  @SmokeTest @Regression @Forms @SUEDU
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
    And User enter "3232344567" as PhoneNumber in PEP Form
    And User enter "55111" as Zip in PEP Form
    When User click "AgreeandGo" button in PEP Form
    Then User should see the "200" Success Response Status code
    Then User should navigate to "Thank You" Thank you page

  @SmokeTest @Regression @Forms @SUEDU
  Scenario: TC001: Verify User is able to submit Banner form
    Given User Navigate to EDU Banner Forms Page
    When User move to BannerRFI
    And User enter "Banner" as FirstName in Banner form
    And User enter "Form" as LastName in Banner form
    And User enter "Bannerform@cunet.com" as Email in Banner form
    And User enter "3232377767" as PhoneNumber in Banner form
    And User enter "55111" as Zip in Banner form
    When User click "AgreeandGo" button in Banner form
    Then User should see the "200" Success Response Status code
    Then User should navigate to "Thank You" Thank you page

  @SmokeTest @Regression @Forms @SUEDU
  Scenario: TC002: Verify User is able to submit footer  form
    Given User Navigate to EDU Forms Page
    When User move to footerRFI
    And User enter "Footer" as FirstName in form
    And User enter "Form" as LastName in form
    And User enter "footerform@cunet.com" as Email in form
    And User enter "3232344567" as PhoneNumber in Footer form
    And User enter "55111" as Zip in form
    When User click "AgreeandGo" button in form
    Then User should see the "200" Success Response Status code
    Then User should navigate to "Thank You" Thank you page

  @SmokeTest @Regression @Forms @SUEDU
  Scenario: TC003: Verify Error validations in Footer form
    Given User Navigate to EDU Forms Page
    When User move to footerRFI
    When User click "AgreeandGo" button in form
    Then User should see the "*Please enter all required Fields" for FirstName field
    When User move to footerRFI
    And User enter "Footer" as FirstName in form
    When User click "AgreeandGo" button in form
    Then User should see the "*Please enter all required Fields" for LastName field
    When User move to footerRFI
    And User enter "Form" as LastName in form
    When User click "AgreeandGo" button in form
    When User move to footerRFI
    Then User should see the "*Please enter all required Fields" for Email field
    And User enter "footerform@cunet.com" as Email in form
    When User click "AgreeandGo" button in form
    Then User should see the "*Please enter all required Fields" for PhoneNumber field
    When User move to footerRFI
    And User enter "3232344567" as PhoneNumber in form
    When User click "AgreeandGo" button in form
    Then User should see the "*Please enter all required Fields" for ZipCode field

  @SmokeTest @Regression @Forms @SUEDU
  Scenario: TC004: Verify Error validations in Banner  form
    Given User Navigate to EDU Banner Forms Page
    When User move to BannerRFI
    When User click "AgreeandGo" button in Banner form
    Then User should see the "*Please enter all required Fields" for FirstName field
    When User move to BannerRFI
    And User enter "Banner" as FirstName in Banner form
    When User click "AgreeandGo" button in Banner form
    Then User should see the "*Please enter all required Fields" for LastName field
    When User move to BannerRFI
    And User enter "Form" as LastName in Banner form
    When User click "AgreeandGo" button in Banner form
    When User move to BannerRFI
    Then User should see the "*Please enter all required Fields" for Email field
    And User enter "Bannerform@cunet.com" as Email in Banner form
    When User click "AgreeandGo" button in Banner form
    Then User should see the "*Please enter all required Fields" for PhoneNumber field
    When User move to BannerRFI
    And User enter "3232344567" as PhoneNumber in Banner form
    When User click "AgreeandGo" button in Banner form
    Then User should see the "*Please enter all required Fields" for ZipCode field

  @SmokeTest @Regression @Forms @OMS
  Scenario: TC005: Verify user is able to submit Degree header form
    Given User Navigate to Degree Page
    When User move to Degree Page Utility Navigation
    When User Click on "LEARN MORE" link in Degree Page
    When User move to Degree Form
    And User enter "Degree" as FirstName in Degree form
    And User enter "Form" as LastName in Degree form
    And User enter "TA DIGITAL" as Company in Degree form
    And User enter "Mr Pradeep" as Title in Degree form
    And User enter "degreeform@cunet.com" as Email in Degree form
    And User enter "BEST COMPANY" as Comments in Degree form
    When User click "Submit" button in Degree form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you for your interest in Degrees@Work." text on Window

  @SmokeTest @Regression @Forms @OMS
  Scenario: TC006: Verify User is able to submit MBA download form
    Given User Navigate to Mobile Mba Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "downloadform@cunet.com" as Email in Download form
    And User enter "3232344567" as PhoneNumber in Download form
    And User enter "55111" as Zip in Download form
    When User click "Submit" button in Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page

  @SmokeTest @Regression @Forms @OMS
  Scenario: TC007: Verify User is able to submit Banner with Microsite form
    Given User Navigate to Cheddar Page
    When User move to MicroSite form
    And User enter "Cheddar" as FirstName in MicroSite form
    And User enter "Form" as LastName in MicroSite form
    And User enter "55111" as Zip in MicroSite form
    And User enter "cheddarform@cunet.com" as Email in MicroSite form
    And User enter "3232344567" as PhoneNumber in MicroSite form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @SmokeTest @Regression @Forms @OMS
  Scenario: TC008: Verify User is able to submit Banner with Microsite form in Mobile-Mba Page
    Given User Navigate to Mobile Mba Page
    When User move to MicroSite form
    And User enter "Mobile" as FirstName in MicroSite form
    And User enter "MBA" as LastName in MicroSite form
    And User enter "55111" as Zip in MicroSite form
    And User enter "mobilemba@cunet.com" as Email in MicroSite form
    And User enter "3232344567" as PhoneNumber in MicroSite form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @SmokeTest @Regression @Forms @OMS
  Scenario: TC009: Verify User is able to submit Download form
    Given User Navigate to Cheddar Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "downloadform@cunet.com" as Email in Download form
    And User enter "3232344567" as PhoneNumber in Download form
    And User enter "55111" as Zip in Download form
    When User click "Submit" button in Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page

  @SmokeTest @Regression @Forms @OMS
  Scenario: TC010: Verify User is able to submit Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When User move to Nominate Teacher form
    And User enter "Nomitate" as Faculty First Name in Nominate form
    And User enter "Form" as Faculty Last Name in Nominate form
    And User enter "Osmania" as Campus in Nominate form
    And User enter "Automation Program" as Course in Nominate form
    And User enter "Reason" as Reason in Nominate form
    And User enter "Automation" as Student First Name in Nominate form
    And User enter "Script" as Student Last Name in Nominate form
    And User enter "Selenium" as Student Campus in Nominate form
    And User enter "4338" as Student Id in Nominate form
    When User click "Submit" button in Nominate form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you | Strayer Commencement" text on page

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario: TC011: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User enter "Linkedin" as FirstName in LinkedIn form
    And User enter "MBA" as LastName in LinkedIn form
    And User enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And User enter "6434567890" as PhoneNumber in LinkedIn form
    And User enter "55111" as Zip in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario: TC012: Verify User is able to submit form in Linked In BBA page
    Given User Navigate to LinkedIn BBA Page
    When User enter "Linkedin" as FirstName in LinkedIn form
    And User enter "MBA" as LastName in LinkedIn form
    And User enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And User enter "6434567890" as PhoneNumber in LinkedIn form
    And User enter "55111" as Zip in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario: TC013: Verify User is able to submit Short form
    Given User move to Short form Page
    And User enter "Short" as FirstName in Short form
    And User enter "Form" as LastName in Short form
    And User enter "shortform@cunet.com" as Email in Short form
    And User enter "6434567890" as PhoneNumber in Short form
    And User enter "55111" as Zip in Short form
    And User Selects "Yes" as TransferCreditInterest Option in Short form
    And User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario: TC014: Verify User is able to submit Short form with drop downs
    Given User move to Short form with drop down Page
    When User select "MBA" as Degree in Short form
    And User select "Business Administration" as program of interest in Short form
    And User enter "Short" as FirstName in Short form
    And User enter "dropdown" as LastName in Short form
    And User enter "shortformdd@cunet.com" as Email in Short form
    And User enter "6434567890" as PhoneNumber in Short form
    And User enter "55111" as Zip in Short form
    And User Selects "Yes" as TransferCreditInterest Option in Short form with dropdown
    And User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University : Thank You" text on page

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario: TC015: Verify User is able to submit Two Step  form
    Given User move to Two step  form Page
    When User enter "Two Step" as FirstName in Two Step form
    And User enter "Form" as LastName in Two Step form
    And User enter "HQA" as Address in Two Step form
    And User enter "55111" as Zip in Two Step form
    And User enter "6434567890" as PhoneNumber in Two Step form
    And User enter " twostepform@cunet.com" as Email in Two Step form
    When User click "Next" Button in Two Step form
    And User select "MBA" as Degree in Two Step form
    And User select "Business Administration" as program of interest in Two Step form
    And User Selects "Yes" as TransferCreditInterest Option in Two Step form
    When User click "AgreeandGo" button in Two Step form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario: TC016: Verify User is able to submit Long form
    Given User move to Long  form Page
    And User enter "Long" as FirstName in Long form
    And User enter "Form" as LastName in Long form
    And User enter "HYDERABAD" as Address in Long form
    And User enter "longform@cunet.com" as Email in Long form
    And User enter "6434567890" as PhoneNumber in Long form
    And User enter "55111" as Zip in Long form
    #  And User select "Some post graduate" as Education Level in Long form
    And User select "Certificates" as Degree in Long form
    And User select "Digital Entrepreneurship" as program of interest in Long form
    And User Selects "Yes" as TransferCreditInterest Option in Long form
    When User click "AgreeandGo" button in Long form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @SmokeTest @Regression @Forms @OMS
  Scenario: TC017: Verify User is able to submit Cheddar form
    Given User Navigate to Cheddar Application Page
    When User move to MicroSite form
    And User enter "Cheddar with drop down" as FirstName in MicroSite form
    And User enter "Form" as LastName in MicroSite form
    And User enter "55111" as Zip in MicroSite form
    And User enter "cheddarformdd@cunet.com" as Email in MicroSite form
    And User enter "3232344567" as PhoneNumber in MicroSite form
    And User select "High School Graduate" as education level in form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @SmokeTest @Regression @Forms @OMS
  Scenario: TC018: Verify User is able to submit Cheddar Download form
    Given User Navigate to Cheddar Application Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Cheddar Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "cheddardownloadform@cunet.com" as Email in Download form
    And User enter "3232344567" as PhoneNumber in Download form
    And User enter "55111" as Zip in Download form
    And User select "High School Graduate" as education level in download form
    When User click "Submit" button in Cheddar Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario Outline: TC019: Verify User is able to see PURL Data
    Given User Navigate to Lets Go Forms Page
    Then User move to Form
    And User see "<FirstName>" as FirstName in Form
    And User see "<LastName>" as LastName in Form
    And User see "<Address>" as Street Address in Form
    And User see "<EMAIL>" as Email in Form
    And User see "<PhoneNo>" as PhoneNumber in Form
    And User see "<ZIP>" as Zip in Form
    And User see "<Degree>" as Degree in Form
    And User see "<Area>" as Area of Interest in Form

    Examples: 
      | FirstName | LastName | Address              | EMAIL               | PhoneNo      | ZIP   | Degree     | Area                     |
      #| Morgan    | Washington | 2700 S Travis St Apt 201 | morgan.cherrelle.washington@gmail.com | 903-623-1105 | 75090 | Bachelor's | Select Area of Interest* |
      | Vanessa   | Truong   | 2801 Glen Sharon Way | huutho_tr@yahoo.com | 408-971-3937 | 95148 | Bachelor's | Select Area of Interest* |

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario Outline: : TC021: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User Enter "<Email>" ,  "<Password>" and Clicked on "Signin with LinkedIn" Button
    And User Click on "Auto fill with LinkedIn" Button
    Then User see "<FirstName>" as FirstName in LinedIn Form
    And User see "<LastName>" as LastName in LinedIn Form
    And User see "<Email>" as Email in LinedIn Form
    And User see "<PhoneNo>" as PhoneNumber in LinedIn Form
    And User see "<ZIP>" as Zip in LinedIn Form

    Examples: 
      | FirstName  | LastName | Email                        | Password | PhoneNo    | ZIP   |
      | Automation | Report   | StrayerAutoReports@gmail.com | Admin*12 | 6466469977 | 55111 |

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario Outline: : TC022: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User Enter "<Email>" ,  "<Password>" and Clicked on "Signin with LinkedIn" Button
    And User Click on "Auto fill with LinkedIn" Button
    Then User see "<FirstName>" as FirstName in LinedIn Form
    And User see "<LastName>" as LastName in LinedIn Form
    And User see "<Email>" as Email in LinedIn Form
    And User see "<PhoneNo>" as PhoneNumber in LinedIn Form
    And User see "<ZIP>" as Zip in LinedIn Form
    And User enter "6434567890" as PhoneNumber in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

    Examples: 
      | FirstName  | LastName | Email                        | Password | PhoneNo    | ZIP   |
      | Automation | Report   | StrayerAutoReports@gmail.com | Admin*12 | 6466469977 | 55111 |

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario Outline: : TC023: Verify User is able see Bemore Form Pre-population values in Bemore Page
    Given User Navigate to Bemore Forms Page
    Then User see "<FirstName>" as FirstName in Bemore Form
    And User see "<LastName>" as LastName in Bemore Form
    And User see "<Email>" as Email in Bemore Form
    And User see "<PhoneNo>" as PhoneNumber in Bemore Form
    And User see "<ZIP>" as Zip in Bemore Form

    Examples: 
      | FirstName  | LastName | Email                | PhoneNo      | ZIP |
      | Automation | Report   | Automation@cunet.com | 987-654-3210 |     |

  @SmokeTest @Regression @Forms @CUEDU
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

  @SmokeTest @Regression @Forms @CUEDU
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

  @SmokeTest @Regression @Forms @CUEDU
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

  @SmokeTest @Regression @Forms @CUEDU
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

  @SmokeTest @Regression @Forms @CUEDU
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

  @SmokeTest @Regression @Forms @CUEDU
  Scenario: TC_029: Verify user is able to submit Password Reset form
    Given User is on Capella Home Page
    And User click Login link to check MC Login
    And User click Prospective Students link under Login
    Then User get MC Login modal form to enter credentials
    And User Clikc on Reset Password Link
    Then User get Forgot Password form
    And User enter as "automation1@gmail.com" Email Address in Form
    And User Clikc on Request Password Button
    Then User get Reset Password Sucess Window

  @SmokeTest @Regression @Forms @CUEDU
  Scenario: TC_030: Verify User is able to Log into My Capella Application
    Given User is on Capella Home Page
    And User click Login link to check MC Login
    And User click Prospective Students link under Login
    Then User get MC Login modal form to enter credentials
    And User enter "johnsin@gmail.com" username or email
    And User enter "Admin*12" password
    And User click LogIn button in form
    Then User should see the "MY PROFILE" text on My Capella Dashboard

  @SmokeTest @Regression @Forms @CUEDU
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

  @SmokeTest @Regression @Forms @CUPMLP
  Scenario: TC032:Verify user is able to submit Request Information form in Lp Bachelors Page
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

  @SmokeTest @Regression @CUPMLP
  Scenario Outline: TC033: Verify Link navigations in Header Navigation module in LP Home Page
    Given User am on Capella LP Home Page
    When User move to LP Utility Navigation
    And User Click on "<Link>" link
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                    | PageTitle                 |
      | Apply                   | Application for Admission |
      | 1.877.884.0733          | Online Degree Programs    |
      | Request Program Details | Online Degree Programs    |

  @SmokeTest @Regression @CUPMLP
  Scenario Outline: TC034: Verify Footer Link navigations in LP Home Page
    Given User am on Capella LP Home Page
    When User move to Footer
    And User Click on  "<Link>" Footer Link
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                | PageTitle                  |
      | Apply               | Application for Admission  |
      | University Policies | University Policies        |
      | Privacy Policy      | Privacy Policy             |
      | Legal               | Capella University - Legal |
      | Terms of Use        | Terms of Use               |
      | Ad Choices          | Advertising Choices        |

  @SmokeTest @Regression @CUPMLP
  Scenario Outline: TC035:Verify Jump Links are working in Capella LP Home Page
    Given User am on Capella LP Home Page
    When User move to Jumplink Menu
    And User Click on  "<Jump_Link>" Jump Link
    Then User should see the "<Jump_Link_Module>" Jump link Module

    Examples: 
      | Jump_Link    | Jump_Link_Module                           |
      | overview     | container online-degree                    |
      | request      | form-wrapper  clearfix                     |
      | programs     | container heading-section pmlp-tab-section |
      | scholarships | container start-save py-4 pt-5 pb-5        |

  @Regression @CUPMLP
  Scenario Outline: TC036: Verify Link navigations in Header Navigation module in LP Home Page
    Given User am on Capella LP PHD Page
    When User move to LP Accordion Module
    And User Clicks on "<Tab_Link>" on Tab Link
    And User Clicks on "<Accordion>" Accordion Button
    Then User Should See "<Programon>" In LP Accordion Module

    Examples: 
      | Tab_Link                     | Accordion                                          | Programon                                                 |
      | Counseling                   | PhD in Advanced Studies in Human Behavior          | Program Evaluation in Counselor Education and Supervision |
      | Counseling                   | PhD in Counselor Education & Supervision           | Counselor Education Teaching and                          |
      | Education                    | PhD in Education                                   | Instructional Design for                                  |
      | Education                    | EdD - Doctor of Education                          | Educational Leadership                                    |
      | Health Sciences              | DHA - Doctor of Health Administration              | General Health Administration                             |
      | Health Sciences              | DrPH - Doctor of Public Health                     | Design and Implementation of Public Health Strateg        |
      | Nursing                      | DNP - Doctor of Nursing Practice                   | DNP*                                                      |
      | Psychology                   | PhD in Psychology                                  | General Psychology                                        |
      | Psychology                   | PsyD - Doctor of Psychology in Clinical Psychology | Advanced Psychopathology                                  |
      | Psychology                   | PsyD - Doctor of Psychology in School Psychology   | Consultation and Collaboration in the Schools             |
      | Public Administration        | DPA - Doctor of Public Administration              | Theories and Concepts in Public Administration            |
      | Social Work & Human Services | DSW - Doctor of Social Work                        | Advanced Social Work Practice: Theoretical Perspec        |
      | Social Work & Human Services | DHS - Doctor of Human Services                     | Leadership and Organizational Management                  |
      | Social Work & Human Services | PhD in Human Services                              | Multidisciplinary Human Services                          |

  @SmokeTest @Regression @CUPMLP
  Scenario: TC037:Verify user is able to submit Request Information form in Lp Bachelors Page
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
    When User Clicks on View Programs Button in Thank you Hero
    Then User should see the "Online Graduate IT Certificate in Analytics: SAS | Capella University" text and close tab

  @Regression @CUPMLP
  Scenario Outline: TC038:Verify Request Information form is displaying in Key Pages
    Given User Navigate to " <Child_Page_URL>" LP page
    When User Click on  "<Link>" LP RFP
    Then User should navigate to Request Information form

    Examples: 
      | Child_Page_URL | Link                    |
      | home           | Request Program Details |
      | masters        | Request Program Details |
      | psychology     | Request Program Details |
      | flexpath       | Request Program Details |
      | bachelors      | Request Program Details |
      | rn-to-bsn      | Request Program Details |
      | it             | Request Program Details |
      | scholarships   | Request Program Details |
      | healthadmin    | Request Program Details |
      | mba            | Request Program Details |

  @SmokeTest @Regression @Forms @CUPMLP
  Scenario: TC039:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    And User submit the LP form
    Then User should see the "Please enter your degree" for Degree field in LP Form
    Then User should see the "Please enter your area of study" for AOS field in LP Form
    Then User should see the "Please enter your specialization." for Program field in LP Form
    Then User should see the "Please enter your first name" for FirstName field in LP Form
    Then User should see the "Please enter your last name" for LastName field in LP Form
    Then User should see the "Email is required" for Email field in LP Form
    Then User should see the "Phone number is required" for PhoneNumber field in LP Form
    Then User should see the "Please enter your ZIP/postal code" for ZipCode field in LP Form

  @SmokeTest @Regression @Forms @CUPMLP
  Scenario: TC040:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    Then User should navigate to Request Information form
    And User select "Bachelor's" as Degree in LP form
    And User select "Public Health" as Area of Study in LP form
    And User select "BS - Public Health" as Bachelors Specialization Study in LP form
    And User select "High School Diploma" as Education Level in LP form
    And User select "18-23" as Age in LP form
    And User select "No" as Military option in LP form
    And User enter "LP" as First Name in LP form
    And User enter "Form" as Last Name in LP form
    And User enter "Email" in Email Address in LP form
    And User enter PhoneNumber as Phone Number in LP form
    And User enter "55111" as ZipCode in LP form
    And User submit the LP form
    Then User should see Thank you for your interest window
    When User Click on  "Visit Strayer University" CTA Link
    Then User should see the "Strayer University" text and close tab
    When User Click on  "Download the Strayer Guide" CTA Link
    Then User should see the "StrayerUniversityGuide" text and close tab

  @SmokeTest @Regression @Forms @SUPMLP
  Scenario Outline: : TC041: Verify User is able see Bemore Form Pre-population values in Bemore Page
    Given User Navigate to Bemore Forms Error Page
    And User enter "RFG" as Address in Long form
    And User see "<PhoneNo>" as PhoneNumber in Bemore Form
    When User click "AgreeandGo" button in Long form
    Then User should see the "Please enter a valid phone number" for PhoneNumber field in Form

    Examples: 
      | PhoneNo      |
      | 187-654-3210 |

  @Regression @CUPMLP
  Scenario Outline: TC042: Verify Footer Link navigations in LP Home Page
    Given User am on Capella LP Accessibility commitment Page
    When User move to Accessibility Footer
    And User Click on "<Link>" link
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                      | PageTitle                                                  |
      | Strategic Education, Inc. | Home, Strategic Education, Inc.                            |
      | Strayer University        | Strayer University - Accredited Online & On-Campus Degrees |
      | Site Map                  | Site Map                                                   |
      | Privacy Policy            | Privacy Policy                                             |
      | Legal                     | Capella University - Legal                                 |
      | Terms of Use              | Terms of Use                                               |
      | Ad Choices                | Advertising Choices                                        |

  @SmokeTest @Regression @Forms @CUPMLP
  Scenario: TC043:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    Then User should navigate to Request Information form
    And User select "Certificate" as Degree in LP form
    And User select "Analytics" as Area of Study in LP form
    And User select "Grad Cert - Analytics Using SAS" as Bachelors Specialization Study in LP form
    And User enter "LP" as First Name in LP form
    And User enter "Form" as Last Name in LP form
    And User enter "test@test.com" in Test Email Address in LP form
    And User enter PhoneNumber as Phone Number in LP form
    And User enter "55111" as ZipCode in LP form
    And User submit the LP form
    Then User should see the "email test@test.com is an invalid email address." for Email field validations in LP Form

  @SmokeTest @Regression @SUEDU
  Scenario: TC044: Verify Mega Menus is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to Academic Programs Menu
    Then User should see the "Academic Programs" text on Academic Programs Menu
    When User move to Student Experience Menu
    Then User should see the "Student Experience" text on Student Experience Menu
    When User move to Tution and Financial AID Menu
    Then User should see the "Tuition & Aid" text on Tution and Financial AID Menu
    When User move to Strayer ADMISSIONS Menu
    Then User should see the "Admissions" text on Strayer ADMISSIONS Menu

  @SmokeTest @Regression @SUEDU
  Scenario: TC045: Verify UtilityHeader module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to UtilityHeader
    When User Click on CampusLocationLink Link
    Then User should see the "Campus Locations" text on CampusLocation Page
    When User Click on Logo Image
    When User Click on CampusLoginLink Link
    Then User should see the "iCampus Login" text on CampusLogin Page
    Then User close tab
    Given User Navigate to Strayer University Application
    When User Click on ApplyNowLink Link
    Then User should see the "Strayer University Student Application" text on ApplyNowLink Page

  @SmokeTest @Regression @SUEDU
  Scenario: TC046: Verify Search results are disaplying in Search Results page
    Given User Navigate to Error Page
    When User Enter "MBA" text in Searchbox
    Then User Should see the "MBA" text on Search Results
    Then User should see the "Search Results" text and close tab

  @SmokeTest @Regression @SUEDU
  Scenario: TC047: Verify Social Links module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to SocialLink

  @SmokeTest @Regression @SUEDU
  Scenario: TC048: Verify Footer module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    Then User should see the "2020 Strayer University" text on footer
    When User Click on footerLogo Image
    Then User should see the "Strayer University - Accredited Online & On-Campus Degrees" text on StrayerHome Page

  @SmokeTest @Regression @SUEDU
  Scenario: TC049: Verify QuickLink Module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to AOSModule
    Then User should see the "Areas of Study" text in AOSModule
    When User move to QUICKLINKModule
    Then User should see the "Quick Links" text in QuickLinksModule
    When User move to MORELINKModule
    Then User should see the "More" text in MoreLinksModule
    When User move to LEGALLINKModule
    Then User should see the "Legal" text in LegalLinksModule

  @SmokeTest @Regression @SUEDU
  Scenario: TC050: Verify Header Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to UtilityHeader
    When User Click on Logo Image in Header
    Then User should see the "Strayer University - Accredited Online & On-Campus Degrees" text on StrayerHome Page

  @SmokeTest @Regression @SUEDU
  Scenario: TC051: Verify Footer Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    Then User should see the "2020 Strayer University" text on footer
    When User Click on footerLogo Image
    Then User should see the "Strayer University - Accredited Online & On-Campus Degrees" text on StrayerHome Page

  @SmokeTest @Regression @SUEDU
  Scenario: TC052: Verify Home page Banner is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    #When User Click on Logo Image in Header
    When User move to HomeBanner
    Then User Should see the "Start your bachelor" text on HomeBanner

  @SmokeTest @Regression @SUEDU
  Scenario: TC053 Verify Chat window is disaplying in Strayer Home Page
    Given User Navigate to Error Page
    When User Enter "MBA" text in Searchbox
    Then User Should see the "MBA" text on Search Results
    When User Click on ClickToStart Link
    Then User should see the "Thank you for choosing to chat with us. An agent will be with you shortly." text on ChatWindow

  @SmokeTest @Regression @SUEDU
  Scenario Outline: TC054: Verify User is able to navigate Sitemap page from Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to LEGALLINKModule
    When User Click on SiteMap Link
    Then User should see the "<PageTitle>" text on Child "SiteMap" Page and close tab

    Examples: 
      | PageTitle |
      | Site Map  |

  @Regression @SUEDU
  Scenario Outline: TC055:Verify Child Link navigations Under  Academic Programs Link in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to Academic Programs Menu
    Then User should see the "Academic Programs" text on Academic Programs Menu
    When User move to Academic Programs ChildLinksModule
    When User Click on "<Child_Link>" link
    When User Click on "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Qualification     | Child_Link   | Link                                    | PageTitle                                        |
      | Academic Programs | Bachelor     | Accounting                              | Bachelor of Science in Accounting Online         |
      | Academic Programs | Bachelor     | Applied Science in Management           | Bachelor of Applied Science in Management Online |
      | Academic Programs | Master       | Information Assurance                   | Master's in Information Assurance Online         |
      | Academic Programs | Master       | Jack Welch Management Institute MBA     | Jack Welch Management Institute                  |
      | Academic Programs | Certificates | Devmountain: IOS Development Bootcamp   | iOS Development Immersive Bootcamp               |
      | Academic Programs | Certificates | Grad Cert in Digital Entrepreneurship   | Certificate in Entrepreneurship Online           |
      | Academic Programs | Certificates | Jack Welch (JWMI) Graduate Certificates | Jack Welch Management Institute                  |

  @Regression @SUEDU
  Scenario Outline: TC056: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given User Navigate to Strayer University Application
    When User move to Strayer ADMISSIONS Menu
    Then User should see the "<Qualification>" text on Strayer ADMISSIONS Menu
    When User move to ADMISSIONS ChildLinksModule
    When User Click on "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Qualification | Child_Link             | Link                   | PageTitle                                 |
      | Admissions    | How to Apply           | How to Apply           | How to Apply to College                   |
      | Admissions    | Admission Requirements | Admission Requirements | Online College Admission Requirements     |
      | Admissions    | Transfer Credits       | Transfer Credits       | Transfer Credits                          |
      | Admissions    | International Students | International Students | Online Degrees for International Students |
      | Admissions    | Apply now              | Apply now              | Strayer University Student Application    |

  @Regression @SUEDU
  Scenario Outline: TC057: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given User Navigate to Strayer University Application
    When User move to Tution and Financial AID Menu
    Then User should see the "<Qualification>" text on Tution and Financial AID Menu
    When User move to TUITION ChildLinksModule
    When User Click on "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Qualification | Link                         | PageTitle                                    |
      | Tuition & Aid | Tuition & Fees               | Tuition and Fees: How much does college cost |
      | Tuition & Aid | Calculate cost               | Net Price Calculator: Strayer University     |
      | Tuition & Aid | Financial Planning Checklist | How to pay for college                       |
      | Tuition & Aid | Scholarships & Discounts     | Online College Scholarships                  |
      | Tuition & Aid | Other Ways to Earn Credit    | Earn College Credit Online                   |
      | Tuition & Aid | Military Assistance          | Military Assistance & Benefits               |
      | Tuition & Aid | Financial Aid                | Financial Aid Assistance                     |
      | Tuition & Aid | Get Your Personalized Plan   | Personal Education Plan                      |

  @Regression @SUEDU
  Scenario Outline: TC058: Verify Child Link navigations Under  Student Experience Link in Strayer Home Page Mega Menu
    Given User Navigate to Strayer University Application
    When User move to Student Experience Menu
    Then User should see the "<Qualification>" text on Student Experience Menu
    When User move to Student Experience ChildLinksModule
    When User Click on "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Qualification      | Link                | PageTitle                         |
      | Student Experience | Online Experience   | Online Learning Experience        |
      | Student Experience | On-Campus Services  | On                                |
      | Student Experience | Video Learning      | Docu                              |
      | Student Experience | Support             | Support                           |
      | Student Experience | 10 Essential Skills | Top Employable Skills             |
      | Student Experience | About Strayer       | About Strayer                     |
      | Student Experience | Accreditation       | Accredited Online College Degrees |
      | Student Experience | Strayer Blog        | Strayer University Buzz Blog      |

  @SmokeTest @Regression @SUEDU
  Scenario: TC059: Verify UtilityHeader module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to UtilityHeader
    When User Click on CampusLocationLink Link
    Then User should see the "Campus Locations" text on CampusLocation Page
    When User Click on Logo Image
    When User Click on CampusLoginLink Link
    Then User should see the "iCampus Login" text on CampusLogin Page
    Then User close tab
    Given User Navigate to Strayer University Application
    When User Click on ApplyNowLink Link
    Then User should see the "Strayer University Student Application" text on ApplyNowLink Page

  @Regression @SUEDU
  Scenario Outline: TC060: Verify Social Links module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to SocialLink
    When User Click on "<Icon>" icon
    Then User should see the "<PageTitle>" text on "<Icon>" iconPage and close tab

    Examples: 
      | Icon      | PageTitle                               |
      | twitter   | Strayer University (@StrayerU)          |
      | facebook  | Strayer University - Home               |
      | linkedin  | LinkedIn                                |
      | youtube   | Strayer University - YouTube            |
      | instagram | Strayer University (@strayeruniversity) |

  @SmokeTest @Regression @SUPMLP
  Scenario: TC061: Verify UI of Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header
    Then User Should see "We're here to help!" text in Cobra Page Utility Header
    Then User should see "1.888.388.7430" phonenumber in Cobra Page Utility Header
    When User move to CobraPage Utility Navigation
    Then User should see "Affordability" Link in Cobra Page Utility Navigation
    When User Click on CobraPage Header Logo
    Then User should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Footer
    When User Click on CobraPage Footer Logo
    Then User should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Footer
    Then User should see the "2020 Strayer University" text on Cobra Page footer

  @Regression @SUPMLP
  Scenario Outline: TC062: Verify Child Link navigations in Header Navigation module in Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    When User Click on "<Link>" link in Cobra Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                           |
      | affordability   | Strayer University:Affordability    |
      | programs        | Strayer University:Programs         |
      | Online Learning | Strayer University:Online Learning  |
      | Transfer Credit | Strayer University:Transfer credits |

  @Regression @SUPMLP
  Scenario Outline: TC063: Verify Child Link navigations in Footer module in Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Footer
    When User Click on "<Link>" link in Cobra Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | Terms of Use    | Terms of Use                      |
      | Privacy Policy  | Privacy Policy                    |
      | State Licensure | State Licensure and Authorization |
      | Opt Out         | Opt Out                           |

  @SmokeTest @Regression @SUPMLP
  Scenario: TC064: Verify UI of Dragon Page
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Utility Header
    Then User Should see "We're here to help!" text in Utility Header
    Then User should see "1.888.622.5374" phonenumber in Utility Header
    When User move to DragonPage Utility Navigation
    Then User should see "Programs" Link in Utility Navigation
    When User Click on DragonPage Header Logo
    Then User should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Footer
    When User Click on DragonPage Footer Logo
    Then User should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Footer
    Then User should see the "2020 Strayer University" text on Dragon Page footer

  @Regression @SUPMLP
  Scenario Outline: TC065: Verify Child Link navigations in Header Navigation module in Dragon Page
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Utility Header Link Module
    When User Click on "<Link>" link in Dragon Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                             |
      | Affordability   | Strayer University :: Affordability   |
      | Programs        | Strayer University :: Programs        |
      | Online learning | Strayer University :: Online Learning |
      | Transfer credit | Strayer University :: Transfer Credit |

  @Regression @SUPMLP
  Scenario Outline: TC066: Verify Child Link navigations in Footer module in Dragon Page
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Footer
    When User Click on "<Link>" link in Dragon Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | Terms of Use    | Terms of Use                      |
      | Privacy Policy  | Privacy Policy                    |
      | State Licensure | State Licensure and Authorization |
      | Opt Out         | Opt Out                           |

  @SmokeTest @Regression @SUPMLP
  Scenario: TC067: Verify UI of LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When User move to LinkedInPage Utility Navigation
    Then User should see "CONCENTRATIONS" Link in LinkedInpage Utility Navigation
    When User Click on LinkedInPage Header Logo
    Then User should see the "Strayer University: Accredited Online College" text on "Home" Page and close tab
    When User move to LinkedInPage Footer
    When User Click on LinkedInPage Footer Logo
    Then User should see the "Strayer University: Accredited Online College" text on "Home" Page and close tab
    When User move to LinkedInPage Footer
    Then User should see the "2020 Strayer University" text on LinkedIn Page footer

  @Regression @SUPMLP
  Scenario Outline: TC068: Verify Child Link navigations in Header Navigation module in LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When User move to LinkedInPage Utility Header Link Module
    When User Click on "<Link>" link in LinkedIn Page
    Then User should see the "<PageTitle>" text in LinkedIn Page and close tab

    Examples: 
      | Link            | PageTitle                                     |
      | WHY STRAYER?    | Strayer University: Accredited Online College |
      | CONCENTRATIONS  | Strayer University: Accredited Online College |
      | ONLINE LEARNING | Strayer University: Accredited Online College |
      | TRANSFER CREDIT | Strayer University: Accredited Online College |

  @Regression @SUPMLP
  Scenario Outline: TC069: Verify Child Link navigations in Footer module in LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When User move to LinkedInPage Footer
    When User move to LinkedInPage Footer Link Module
    When User Click on "<Link>" link in LinkedIn Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | TERMS OF USE    | Terms of Use                      |
      | PRIVACY POLICY  | Privacy Policy                    |
      | STATE LICENSURE | State Licensure and Authorization |
      | OPT OUT         | Opt Out                           |

  @Regression @SUPMLP
  Scenario Outline: TC070: Verify User is able to View Disclaimer Modals in Degree Page
    Given User Navigate to Degree Home Page
    When User Click on "<Disclaimer_Link>" on Disclaimer_Link
    Then User Should See "<Disclaimer_Modal>" Disclaimer_Modal
    And User Clicks on "<Disclaimer_Modal>" Disclaimer_Modal Close Window Link

    Examples: 
      | Disclaimer_Link                                                                   | Disclaimer_Modal    |
      | *Laptop eligibility requirements                                                  | laptop-disclaimer   |
      | Laptop Disclaimer                                                                 | laptop-disclaimer   |
      | Eligibility and participation rules apply                                         | gradfund            |
      | Please click here for important information regarding transfer credit eligibility | transfer-credit-rtb |
      | Accreditation Details                                                             | carouselModal       |

  @Regression @SUPMLP
  Scenario Outline: TC071: Verify User is able to View Video Modals in Achieve Transfer-Credits Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Link>" link in Cobra Page
    And User Click on "<Video_Link>" on Video_Link
    Then User Should See "<Video_Modal>" Video_Modal
    And User Clicks on "<Video_Modal>" Video_Modal Close Window Link

    Examples: 
      | Video_Link              | Video_Modal    | Link            |
      | Strayer Graduation Fund | graduation-1   | Transfer Credit |
      | new laptop              | transfer-tools | Transfer Credit |

  # | Student Services Coach  | success-1        | Transfer Credit |
  @Regression @SUPMLP
  Scenario: TC072: Verify Accredation component module is disaplying in Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Accredation
    Then User should see the Accredation Image
    When User Click on Accredation Image
    Then User should see the "Strayer University Accreditation" text on Accredation window
    When User Click on Accredation Link
    Then User should see the "Strayer University Accreditation" text on Accredation window

  @Regression @SUPMLP
  Scenario Outline: TC073: Verify User is able to View Bachelors Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    And User Click on "<Accordion_Link>" on Accordion_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link     | Accordion_Link                | Accordion_Text                                           |
      | programs        | Bachelor | Applied Science in Management | Build from your years of industry experience             |
      | programs        | Bachelor | Business Administration       | A Strayer business degree opens the doors to your future |
      | programs        | Bachelor | Criminal Justice              | With a bachelor of science degree in criminal justice    |
      | programs        | Bachelor | Information Technology        | A Strayer bachelor                                       |

  @Regression @SUPMLP
  Scenario Outline: TC074: Verify User is able to View Masters Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    And User Click on "<Accordion_Link>" on Accordion_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link   | Accordion_Link                        | Accordion_Text                                                                     |
      | programs        | Master | Education                             | In a time of challenge and opportunity for education and training                  |
      | programs        | Master | Health Services Administration        | Health services administration graduates are charting the future of human health   |
      | programs        | Master | Human Resource Management             | From understanding the strategic role of HR to the core functions of total rewards |
      | programs        | Master | Information Assurance (Cybersecurity) | Our information assurance degree allows you to develop your cybersecurity          |
      | programs        | Master | Information Systems                   | Learn to design                                                                    |
      #| programs        | Master | Management                            | At Strayer                                                                         |
      | programs        | Master | Public Administration                 | The Strayer master of public administration                                        |

  @Regression @SUPMLP
  Scenario Outline: TC075: Verify User is able to View MBA Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    And User Click on "<Accordion_Link>" on Accordion_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link | Accordion_Link                   | Accordion_Text                                                      |
      | programs        | MBA  | Digital Entrepreneurship MBA     | In collaboration with Cheddar CEO Jon Steinberg                     |
      | programs        | MBA  | Jack Welch MBA                   | The Jack Welch MBA delivers all the fundamentals                    |
      | programs        | MBA  | Jack Welch Executive Certificate | Shorter in length and more intensely focused than the Executive MBA |

  @Regression @SUPMLP
  Scenario Outline: TC076: Verify User is able to View Associate Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    And User Click on "<Accordion_Link>" on Accordion_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link      | Accordion_Link                      | Accordion_Text                                                              |
      | programs        | Associate | Acquisition and Contract Management | A Strayer associate degree in acquisition and contract management helps you |
      # | programs        | Associate | Business Administration             | Take the first step toward a rewarding career in business or government     |
      #| programs        | Associate | Information Technology              | A Strayer associate degree in information technology gives you              |
      | programs        | Associate | Marketing                           | An associate degree in marketing from Strayer prepares you                  |

  @Regression @SUPMLP
  Scenario Outline: TC077: Verify User is able to View Deafult Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link      | Accordion_Text                                                                 |
      | programs        | Bachelor  | At Strayer, we pair your functional and focused accounting degree with courses |
      | programs        | Master    | A Strayer master                                                               |
      | programs        | MBA       | Each one of our business management                                            |
      | programs        | Associate | A Strayer associate degree in accounting gives you the foundational accounting |

  @Regression @SUPMLP
  Scenario Outline: TC078: Verify User is able to View Deafult Accordion Text in Achieve Affordability Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    And User Click on "<Accordion_Link>" on Tab_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Accordion_Link               | Accordion_Text                                             |
      | affordability   | Strayer Graduation Fund      | Save on your bachelor                                      |
      | affordability   | Strayer Referral Scholarship | Do you know a Strayer student, graduate, or faculty member |
      | affordability   | Alumni Scholarship           | All you need to do is register for an eligible             |

  @Regression @SUPMLP
  Scenario Outline: TC079: Verify User is able to Navigate Home page when clicks on Header Logo in child page
    Given User Navigate to Degree Home Page
    When User move to CobraPage Utility Header Link Module
    When User Click on "<Link>" link in Cobra Page
    Then User should see the "<PageTitle>" text and close tab
    And User Click on CobraPage Header Logo
    Then User should see the "<Home_PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                           | Home_PageTitle             |
      | affordability   | Strayer University:Affordability    | Strayer University:Degrees |
      | programs        | Strayer University:Programs         | Strayer University:Degrees |
      | Online Learning | Strayer University:Online Learning  | Strayer University:Degrees |
      | Transfer Credit | Strayer University:Transfer credits | Strayer University:Degrees |

  @Regression @OMS
  Scenario: TC080: Verify UI of Studios Page
    Given User Navigate to Studios Page
    When User move to Studios Page Utility Navigation
    Then User Should see "ABOUT" Link in Studios Page Utility Navigation
    When User Click on Studios Page Header Logo
    Then User should see the "Innovation in Online Education | sEI Studios" text on "Home" Page and close tab
    Given User Navigate to Studios Page
    When User move to Studios Page Footer
    When User Click on Studios Page Footer Logo
    Then User should see the "Innovation in Online Education | sEI Studios" text on "Home" Page and close tab
    Given User Navigate to Studios Page
    When User move to Studios Page Footer
    Then User should see the "Copyright" text on Studios Page footer

  @SmokeTest @Regression @SUEDU
  Scenario: TC081: Verify Header Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to UtilityHeader
    When User Click on Logo Image in Header
    Then User should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  @SmokeTest @Regression @SUEDU
  Scenario: TC082: Verify Footer Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    When User Click on footerLogo Image
    Then User should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  @SmokeTest @Regression @SUEDU
  Scenario: TC083: Verify Home page Banner is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User Click on Logo Image in Header
    When User move to HomeBanner
    Then User Should see the "Get the degree you need for the life you want" text on HomeBanner

  @Regression @SUEDU
  Scenario Outline: TC084: Verify Footer Link availble in AOS Module is Global footer
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to AOSModule
    Then User should see the "Areas of Study" text in AOSModule
    When User Click on "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                  | PageTitle                                        |
      | Business              | Accredited Business Degrees Online               |
      | IT                    | Accredited Information Technology Degrees Online |
      | Criminal Justice      | Bachelor's in Criminal Justice Online            |
      | Education             | Master's in Education Online                     |
      | Health Services       | Master's in Healthcare Administration Online     |
      | Public Administration | Master of Public Administration Online           |

  @Regression @SUEDU
  Scenario Outline: TC085: Verify Footer Link availble in QuickLink Module is Global footer
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to QUICKLINKModule
    Then User should see the "Quick Links" text in QuickLinksModule
    When User Click on "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                   | PageTitle                                             |
      | Campus Locations       | College Campus Locations                              |
      | Course Catalog         | Strayer University                                    |
      | Honors Program         | Online Honors Courses                                 |
      | Refer a Friend         | Refer a Friend                                        |
      | Graduation Information | Strayer Commencement                                  |
      | Strayer Alumni         | Homepage                                              |
      | Scholar Magazine       | Scholar Magazine                                      |
      | Careers at Strayer     | Strayer University Careers                            |
      | Capella University     | Capella University: Online Accredited Degree Programs |

  @Regression @SUEDU
  Scenario Outline: TC086: Verify Footer Link availble in More Module is Global footer
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to MORELINKModule
    Then User should see the "More" text in MoreLinksModule
    When User Click on "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                         | PageTitle                    |
      | Student Consumer Information | Student Consumer Information |
      | Campus Safety                | Campus Safety                |
      | Title IX                     | Strayer University           |
      | Strayer University Blog      | Strayer University Buzz Blog |
      | Contact Us                   | Contact Us                   |

  @Regression @SUEDU
  Scenario Outline: TC087: Verify Footer Link availble in Legal Module is Global footer
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to LEGALLINKModule
    Then User should see the "Legal" text in LegalLinksModule
    When User Click on "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                          | PageTitle                         |
      | Terms of Use                  | Terms of Use                      |
      | Privacy Policy                | Privacy Policy                    |
      | State Licensure/Authorization | State Licensure and Authorization |
      | Site Map                      | Site Map                          |
      | Opt Out                       | Opt Out                           |
      | Contact Us                    | Contact Us                        |

  @SmokeTest @Regression @SUEDU
  Scenario: TC088: Verify User is able to Search Valid Multi Keywods
    Given User Navigate to Error Page
    When User Enter "Strayer MBA" text in Searchbox
    Then User Should see the "Strayer MBA" text on Search Results
    Then User should see the "Search Results" text and close tab

  @SmokeTest @Regression @SUEDU
  Scenario: TC089: Verify Chat window is disaplying in Strayer Home Page
    Given User Navigate to Error Page
    When User Enter "MBA" text in Searchbox
    Then User Should see the "MBA" text on Search Results
    When User Click on ClickToStart Link
    Then User should see the "Thank you for choosing to chat with us. An agent will be with you shortly." text on ChatWindow

  @SmokeTest @Regression @CUEDU
  Scenario: TC090: Verify Mega Menus is disaplying in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Capella Exp Menu
    Then User should see the "CAPELLA EXPERIENCE" text on Capella Expereince Menu
    When User move to Financing Menu
    Then User should see the "FINANCING" text on Financing Menu
    When User move to Apply Menu
    Then User should see the "APPLY" text on Apply Menu

  @Regression @CUEDU
  Scenario Outline: TC091:Verify Child Link navigations Under Degree and Program Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Degrees and Program Left Links Trail
    When User Click on Child "<Left_Link>" Left Trail Link
    Then User should see the "<Left_Link>" Child link Module

    Examples: 
      | Left_Link         |
      | doctoraldegrees   |
      | mastersdegrees    |
      | bachelorsdegrees  |
      | certificates      |
      | individualcourses |

  @Regression @CUEDU
  Scenario Outline: TC092:Verify Child Link navigations Under Apply Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Apply Menu
    Then User should see the "APPLY" text on Apply Menu
    When User move to Apply ChildLinksModule
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                   | PageTitle                 |
      | Admissions             | Admissions                |
      | Admission Requirements | Admission Requirements    |
      | International Students | International Students    |
      | Transferring Credits   | Transferring Credits      |
      | Apply Now              | Application for Admission |

  @Regression @CUEDU
  Scenario Outline: TC093:Verify Child Link navigations Under CAPELLA RESULTS Link in Capella Home Page Footer
    Given User is on Capella Home Page
    Then User move to VC Footer
    Then User should see the "CAPELLA RESULTS" text on Capella Results Module
    Then User should see the "<Footer_Link>" Child link Module
    When User Click on Child "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Footer_Link          | Link              | PageTitle         |
      | collapsepartnerTeams | Learning Outcomes | Learning Outcomes |

  @Regression @CUEDU
  Scenario Outline: TC094:Verify Fooer Link navigations  in Capella Home Page Footer
    Given User is on Capella Home Page
    Then User move to VC Footer
    Then User should see the Fotter Link Child link Module
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                      | PageTitle                       |
      | Strategic Education, Inc. | Home, Strategic Education, Inc. |
      | Strayer University        | Strayer University              |
      | Site Map                  | Site Map                        |
      | Privacy Policy            | Privacy Policy                  |
      | Legal                     | Legal                           |
      | Terms of Use              | Terms of Use                    |
      | Ad Choices                | Advertising Choices             |
