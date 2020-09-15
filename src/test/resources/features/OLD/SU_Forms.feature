Feature: Strayer Forms Suite

  @PEPRFI
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

  @BannerRFI @EDU
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

  @FooterRFI @EDU
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

  @FooterRFIValidations @EDU
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

  @BannerRFIValidations @BannerRFI @EDU
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

  @DegreeHeaderForm @OMS
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

  @DownloadFormMBA @OMS
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

  @MicroSiteForminMBAEntrepreneurship @OMS
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

  @MicroSiteForminMBAPage @OMS
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

  @DownloadFormCheddar @OMS
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

  @NominateTeacherform @OMS
  Scenario: TC010: Verify User is able to submit Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When User move to Nominate Teacher form
    And User enter "Deepu" as Faculty First Name in Nominate form
    And User enter "Kumar" as Faculty Last Name in Nominate form
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

  @LinkedInpageMBAForm @LP
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

  @LinkedInpageBBAForm @LP
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

  @ShortForm @LP
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

  @ShortFormwithDropdown @LP
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
    Then User should see the "Strayer University :: Thank You" text on page

  @TwoStepForm @LP
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

  @LongForm @LP
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

  @CheddarFormWithDropdown @OMS
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

  @CheddarDownloadForm @OMS
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

  @PURL
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
      | FirstName | LastName   | Address                  | EMAIL                                 | PhoneNo      | ZIP   | Degree     | Area                     |
      #| Morgan    | Washington | 2700 S Travis St Apt 201 | morgan.cherrelle.washington@gmail.com | 903-623-1105 | 75090 | Bachelor's | Select Area of Interest* |
      | Vanessa   | Truong     | 2801 Glen Sharon Way     | huutho_tr@yahoo.com                   | 408-971-3937 | 95148 | Bachelor's | Select Area of Interest* |

  @AutoFillLinkedInFormUIVerification @LP
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

  @AutoFillLinkedInFormSubmission @LP
  Scenario Outline: : TC022: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User Enter "<Email>" ,  "<Password>" and Clicked on "Signin with LinkedIn" Button
    And User Click on "Auto fill with LinkedIn" Button
     Then User see "<FirstName>" as FirstName in LinedIn Form
    And User see "<LastName>" as LastName in LinedIn Form
    And User see "<Email>" as Email in LinedIn Form
    And User see "<PhoneNo>" as PhoneNumber in LinedIn Form
    And User see "<ZIP>" as Zip in LinedIn Form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

    Examples: 
      | FirstName  | LastName | Email                        | Password | PhoneNo    | ZIP   |
      | Automation | Report   | StrayerAutoReports@gmail.com | Admin*12 | 6466469977 | 55111 |

  @BemoreFormPre-population
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
