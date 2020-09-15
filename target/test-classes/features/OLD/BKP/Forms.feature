Feature: Strayer Drupal-AEM Migration Project Forms Suite

  @FooterRFI @EDU
  Scenario: TC001: Verify User is able to submit footer  form
    #Given User Navigate to Strayer University Application
    Given User Navigate to BannerRFI Page
    When I move to footerRFI
    #  Then I should see the "REQUEST INFORMATION" text on footerRFI
    When I select "MBA" as Degree in form
    When I select "Business Administration" as program of interest in form
    And I enter "Footer" as FirstName in form
    And I enter "Form" as LastName in form
    And I enter "footerform@cunet.com" as Email in form
    And I enter "3232344567" as PhoneNumber in form
    And I enter "99501" as Zip in form
    When I click "AgreeandGo" button in form
    Then I should see the "200" Response Status code
    Then I should navigate to "Thank You" page

  @BannerRFI
  Scenario: TC002: Verify User is able to submit form in Banner in Banner with RFI Page
    Given User Navigate to BannerRFI Page
    When I move to BannerRFI
    # Then I should see the "REQUEST INFORMATION" text on BannerRFI
    When I select "MBA" as Degree in Banner form
    When I select "Business Administration" as program of interest in Banner form
    And I enter "Banner" as FirstName in Banner form
    And I enter "Form" as LastName in Banner form
    And I enter "Bannerform@cunet.com" as Email in Banner form
    And I enter "3232344567" as PhoneNumber in Banner form
    And I enter "99501" as Zip in Banner form
    When I click "AgreeandGo" button in Banner form
    Then I should see the "200" Response Status code
    Then I should navigate to "Thank You" page



  

  @BannerRFIinVerizonPage
  Scenario: TC008: Verify User is able to submit Banner with form in Verizon Page
    Given User Navigate to Verizon Page
    When I enter "Deepu" as FirstName in Verizon Banner form
    And I enter "Kumar" as LastName in Verizon Banner form
    And I enter "test@cunet.com" as Email in Verizon Banner form
    And I enter "3232344567" as PhoneNumber in Verizon Banner form
    And I enter "99501" as Zip in Verizon Banner form
    When I click "AgreeandGo" button in Verizon Banner form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

  @DegreeHeaderForm
  Scenario: TC009: Verify user is able to submit header form in Degrees Page
    Given User Navigate to Degree Page
    When I move to Degree Page Utility Navigation
    When I Click on "LEARN MORE" link in Degree Page
    When I move to Degree Form
    And I enter "Degree" as FirstName in Degree form
    And I enter "Form" as LastName in Degree form
    And I enter "TA DIGIT" as Company in Degree form
    And I enter "Mr Pradeep" as Title in Degree form
    And I enter "degreeform@cunet.com" as Email in Degree form
    And I enter "BEST COMPANY" as Comments in Degree form
    When I click "Submit" button in Degree form
    Then I should see the "200" Response Status code
    Then I should see the "Thank you for your interest in Degrees@Work." text on Window
    When I click "Close" button in Sucess window in form

  @DownloadForm
  Scenario: TC010: Verify User is able to submit Banner with form in Cheddar Page
    Given User Navigate to Cheddar Page
    When I Click on "Download Now" Form link in Cheddar Page
    And I enter "Deepu" as FirstName in Download form
    And I enter "Kumar" as LastName in Download form
    And I enter "test@cunet.com" as Email in Download form
    And I enter "3232344567" as PhoneNumber in Download form
    And I enter "99501" as Zip in Download form
    When I click "Submit" button in Download form
    Then I should see the "200" Response Status code
    Then I should see the "Thank you page - RFI " text on page

  @MicroSiteForminMBAEntrepreneurship
  Scenario: TC011: Verify User is able to submit Banner with Microsite form in MBAEntrepreneurship  Page
    Given User Navigate to Cheddar Page
    When I move to MicroSite form
    And I enter "Deepu" as FirstName in MicroSite form
    And I enter "Kumar" as LastName in MicroSite form
    And I enter "99501" as Zip in MicroSite form
    And I enter "test@cunet.com" as Email in MicroSite form
    And I enter "3232344567" as PhoneNumber in MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "200" Response Status code
    Then I should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @MicroSiteForminMBAPage
  Scenario: TC012: Verify User is able to submit Banner with Microsite form in Mobile-Mba Page
    Given User Navigate to Mobile Mba Page
    When I move to MicroSite form
    And I enter "Deepu" as FirstName in MicroSite form
    And I enter "Kumar" as LastName in MicroSite form
    And I enter "99501" as Zip in MicroSite form
    And I enter "test@cunet.com" as Email in MicroSite form
    And I enter "3232344567" as PhoneNumber in MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "200" Response Status code
    Then I should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @MicroSiteForminMBAPage_ErrorValidations
  Scenario: TC013: Verify Error validations in Microsite form in Mobile-Mba Page
    Given User Navigate to Mobile Mba Page
    When I move to MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @MicroSiteForminMBAEntrepreneurshipPage_ErrorValidations
  Scenario: TC014: Verify Error validations in Microsite form in MBAEntrepreneurship Page
    Given User Navigate to Cheddar Page
    When I move to MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @OtherErrorValidationsinMicroSiteForminMBAPage
  Scenario: TC015: Verify other Error validations in Microsite form in Mobile-Mba Page
    Given User Navigate to Mobile Mba Page
    When I move to MicroSite form
    And I enter " " as FirstName in MicroSite form
    And I enter " " as LastName in MicroSite form
    And I enter "995013" as Zip in MicroSite form
    And I enter "testcunet.com" as Email in MicroSite form
    And I enter "" as PhoneNumber in MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "ZIP CODE SHOULD NOT BE MORE THAN 5 DIGITS" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @OtherErrorValidationsinMicroSiteForminMBAEntrepreneurshipPage
  Scenario: TC016: Verify other Error validations in Microsite form in MBAEntrepreneurship Page
    Given User Navigate to Cheddar Page
    When I move to MicroSite form
    And I enter " " as FirstName in MicroSite form
    And I enter " " as LastName in MicroSite form
    And I enter "995013" as Zip in MicroSite form
    And I enter "testcunet.com" as Email in MicroSite form
    And I enter "" as PhoneNumber in MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "ZIP CODE SHOULD NOT BE MORE THAN 5 DIGITS" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @DownloadFormErrorValidations
  Scenario: TC017: Verify Error validations in Degree form
    Given User Navigate to Cheddar Page
    When I Click on "Download Now" Form link in Cheddar Page
    When I click "Submit" button in Download form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @DownloadFormErrorValidations
  Scenario: TC018:Verify Error validations in Degree form
    Given User Navigate to Cheddar Page
    When I Click on "Download Now" Form link in Cheddar Page
    And I enter " " as FirstName in Download form
    And I enter " " as LastName in Download form
    And I enter "testcunet.com" as Email in Download form
    And I enter "9950134" as Zip in Download form
    When I click "Submit" button in Download form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "ZIP CODE SHOULD NOT BE MORE THAN 5 DIGITS" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form

  @LinkedInpageForm @LinkedIn
  Scenario Outline: TC001: Verify User is able to submit form in Linked In page
    Given User Navigate to " <URL>" page
    And I enter "Ind" as FirstName in LinkedIn form
    And I enter "Team" as LastName in LinkedIn form
    And I enter "<EMAIL>" as Email in LinkedIn form
    And I enter "1234567890" as PhoneNumber in LinkedIn form
    And I enter "99501" as Zip in LinkedIn form
    When I click "Submit" button in LinkedIn form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                              | EMAIL                 |
      | https://linkedin.strayer.edu/mba | linkedform1@cunet.com |
      | https://linkedin.strayer.edu/bba | linkedform2@cunet.com |

  @ShortForm @Succeed
  Scenario Outline: TC002: Verify User is able to submit Short form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Short form
    And I enter "Kumar" as LastName in Short form
    And I enter "<EMAIL>" as Email in Short form
    And I enter "1234567890" as PhoneNumber in Short form
    And I enter "99501" as Zip in Short form
    And I click "AgreeandGo" button in Short form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                | EMAIL                |
      | https://succeed.strayer.edu/information-technology | shortform1@cunet.com |

  @ShortFormwithDropdown @Succeed
  Scenario Outline: TC003: Verify User is able to submit Short form
    Given User Navigate to " <URL>" page
    When I move to Short form
    When I select "MBA" as Degree in Short form
    And I select "Business Administration" as program of interest in Short form
    And I enter "Deepu" as FirstName in Short form
    And I enter "Kumar" as LastName in Short form
    And I enter "<EMAIL>" as Email in Short form
    And I enter "1234567890" as PhoneNumber in Short form
    And I enter "99501" as Zip in Short form
    When I click "AgreeandGo" button in Short form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                           | EMAIL                 |
      | https://succeed.strayer.edu/military-benefits | shortformdd@cunet.com |

  @TwoStepForm @Afford @1Days @Achieve @Succeed @Bemore
  Scenario Outline: TC004: Verify User is able to submit Two Step  form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Two Step form
    And I enter "Kumar" as LastName in Two Step form
    And I enter "HYDERABAD" as Address in Two Step form
    And I enter "99501" as Zip in Two Step form
    And I enter "1234567890" as PhoneNumber in Two Step form
    And I enter "<EMAIL>" as Email in Two Step form
    When I click "Next" Button in Two Step form
    And I select "Certificates" as Degree in Two Step form
    And I select "Digital Entrepreneurship" as program of interest in Two Step form
    When I click "AgreeandGo" button in Two Step form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                 | EMAIL                  |
      | https://afford.strayer.edu/joegibbs | twostepform1@cunet.com |

  @LongForm @Explore @CollegeDegrees @Referral @Afford @Cusa @Path @Study @letsgo @Bemore
  Scenario Outline: TC005: Verify User is able to submit Long form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Long form
    And I enter "Kumar" as LastName in Long form
    And I enter "HYDERABAD" as Address in Long form
    And I enter "<EMAIL>" as Email in Long form
    And I enter "1234567890" as PhoneNumber in Long form
    And I enter "99501" as Zip in Long form
    And I select "Some post graduate" as Education Level in Long form
    And I select "Certificates" as Degree in Long form
    And I select "Digital Entrepreneurship" as program of interest in Long form
    When I click "AgreeandGo" button in Long form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                         | EMAIL               |
      | https://explore.strayer.edu | longform1@cunet.com |
