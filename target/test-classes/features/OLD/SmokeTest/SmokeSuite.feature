Feature: Strayer Drupal-AEM Migration Project Smoke Suite

  @MegaMenuValidationsinHomePage
  Scenario: TC001: Verify Mega Menus is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to Academic Programs Menu
    Then User should see the "Academic Programs" text on Academic Programs Menu
    When User move to Student Experience Menu
    Then User should see the "Student Experience" text on Student Experience Menu
    When User move to Tution and Financial AID Menu
    Then User should see the "Tuition & Aid" text on Tution and Financial AID Menu
    When User move to Strayer ADMISSIONS Menu
    Then User should see the "Admissions" text on Strayer ADMISSIONS Menu

  @UtilityHeaderinHomePage
  Scenario: TC002: Verify UtilityHeader module is disaplying in Strayer Home Page
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

  #Then User close tab
  @SearchFunctionality
  Scenario: TC003: Verify Search results are disaplying in Search Results page
    Given User Navigate to Error Page
    When User Enter "MBA" text in Searchbox
    Then User Should see the "MBA" text on Search Results
    Then User should see the "Search Results" text and close tab

  @SocialLinks
  Scenario: TC004: Verify Social Links module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to SocialLink

  @HomePageFooter
  Scenario: TC005: Verify Footer module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    Then User should see the "2020 Strayer University" text on footer
    When User Click on footerLogo Image
    Then User should see the "Strayer University - Accredited Online & On-Campus Degrees" text on StrayerHome Page

  # @FooterRibbon
  # Scenario: TC006: Verify Footer Ribbon module is disaplying in Strayer Home Page
  #  Given User Navigate to Strayer University Application
  # When User move to footerribbon
  #Then User should see the "877.445.7180" text in FooterRibbonModule
  @QuickLinksinFooter
  Scenario: TC007: Verify QuickLink Module is disaplying in Strayer Home Page
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

  @HeaderLogo
  Scenario: TC008: Verify Header Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to UtilityHeader
    When User Click on Logo Image in Header
    Then User should see the "Strayer University - Accredited Online & On-Campus Degrees" text on StrayerHome Page

  @FooterLogo
  Scenario: TC009: Verify Footer Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    Then User should see the "2020 Strayer University" text on footer
    When User Click on footerLogo Image
    Then User should see the "Strayer University - Accredited Online & On-Campus Degrees" text on StrayerHome Page

  @HomePageBanner
  Scenario: TC010: Verify Home page Banner is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    #When User Click on Logo Image in Header
    When User move to HomeBanner
    Then User Should see the "Start your bachelor" text on HomeBanner

  #  @DragonPageUI
  # Scenario: TC011: Verify UI of Dragon Page
  #  Given User Navigate to Dragon Template Page
  #When User move to DragonPage Utility Header
  #   Then User Should see "We're here to help!" text in Utility Header
  #  Then User should see "1.877.217.3418" phonenumber in Utility Header
  #  When User move to DragonPage Utility Navigation
  # Then User should see "TUITION COSTS" Link in Utility Navigation
  #  When User Click on DragonPage Header Logo
  #Then User should see the "Strayer University" text on "Home" Page and close tab
  # Given User Navigate to Dragon Template Page
  #When User move to DragonPage Footer
  #When User Click on DragonPage Footer Logo
  #Then User should see the "Strayer University" text on "Home" Page and close tab
  #Given User Navigate to Dragon Template Page
  #When User move to DragonPage Footer
  #Then User should see the "2020 Strayer University" text on LinkedIn Page footer
  @CobraPageUI
  Scenario: TC012: Verify UI of Cobra Page
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

  #@Chat
  #Scenario: TC014: Verify Chat window is disaplying in Strayer Home Page
  #Given User Navigate to Strayer University Application
  #When User move to footerribbon
  #When User Click on ClickToStart Link
  #Then User should see the "Thank you for choosing to chat with us. An agent will be with you shortly." text on ChatWindow
  @SiteMapNavigation
  Scenario Outline: TC015: Verify User is able to navigate Sitemap page from Strayer Home Page
    Given User Navigate to Strayer University Application
    When User move to footer
    When User move to LEGALLINKModule
    When User Click on SiteMap Link
    Then User should see the "<PageTitle>" text on Child "SiteMap" Page and close tab

    Examples: 
      | PageTitle |
      | Site Map  |

  @LinkedInPageUI
  Scenario: TC017: Verify UI of LinkedIn Page
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

 @Accredation
  Scenario: TC021: Verify Accredation component module is disaplying in Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Accredation
    Then User should see the Accredation Image
    When User Click on Accredation Image
    Then User should see the "Strayer University Accreditation" text on Accredation window
    When User Click on Accredation Link
    Then User should see the "Strayer University Accreditation" text on Accredation window

  #@TabComponent
  # Scenario: TC022: Verify Tab Component is avaliable in Cobra Page
  # Given User Navigate to Cobra All Comps Page
  #  Given User Navigate to Cobra Template Page
  # When User move to TabComponent
  #  When User move to BacheloresTab
  #  Then User should see "BACHELOR" text on BacheloresTab
  # When User move to MastersTab
  # Then User should see "MASTER" text on MastersTab
  # When User move to MBA Tab
  #  Then User should see "MBA" text on MBA Tab
  #When User move to AssociatesTab
  #Then User should see "ASSOCIATE" text on AssociatesTab
  #@QuoteComponent
  #  Scenario: TC023: Verify Quote Component is avaliable in Dragon Page
  #  Given User Navigate to Dragon Page
  #  When User move to Quote Component
  # Then User Should see "YOU ARE ABOUT TO CHANGE YOUR LIFE. WELCOME TO STRAYER UNIVERSITY." text in Quote Component
  @DegreesPageUI
  Scenario: TC024: Verify UI of DegreesStudio Page
    Given User Navigate to Degree Page
    When User move to Degree Page Utility Navigation
    Then User Should see "OVERVIEW" Link in Degree Page Utility Navigation
    When User Click on Degree Page Header Logo
    Then User should see the "Employers | Degrees at Work" text on "Home" Page and close tab
    When User move to Degree Page Footer
    When User Click on Degree Page Footer Logo
    Then User should see the "Employers | Degrees at Work" text on "Home" Page and close tab

  @StudiosPageUI
  Scenario: TC025: Verify UI of Studios Page
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

  @CheddarPageUI
  Scenario: TC026: Verify UI of Cheddar Page
    Given User Navigate to Cheddar Page
    When User move to Cheddar Page Utility Navigation
    Then User Should see "Request Info" Link in Cheddar Page Utility Navigation
    Then User Close Cheddar Page menu Close Button
    When User Click on Cheddar Page Header Logo
    Then User should see the "Strayer's Digital Entrepreneurship MBA | Digital Entrepreneurship MBA" text on "Home" Page and close tab
    When User move to Cheddar Page Footer
    #  When User Click on Cheddar Page Footer Logo
    #  Then User should see the "Strayer's Digital Entrepreneurship MBA | Digital Entrepreneurship MBA" text on "Home" Page and close tab
    # When User move to Cheddar Page Footer
    Then User should see the "2019 Digital Entrepreneurship MBA" text on Cheddar Page footer

  @BannerwithQuoteStudiosPage
  Scenario: TC027: Verify Banner with quote  module in Studios Page

  #   Given User Navigate to Studios Page
  #  When User move to Studios Page Banner Module
  #    Then User should see the "Strayer Studios Outcomes Report" text on Studios Page Banner
  @BannerwithCTAStudiosPage
  Scenario: TC028: Verify user is able to click on CTA button in Banner module in Studios Page

  # Given User Navigate to Studios Page
  # When User move to Studios Page BannerwithCTA Module
  # When User Click on CTA Button in BannerwithCTA Module
  # Then User should see the "Closing the Workforce Skills Gap" text on "Home" Page and close tab
  @ImagewithCTAButton
  Scenario: TC029: Verify user is able to click on CTA button in Image module in Cheddar Page
    Given User Navigate to Cheddar Page
    When User move to Cheddar Page ImagewithCTA Module
    When User Click on CTA Button in ImagewithCTA Module
    Then User should see the "What You'll Learn | Digital Entrepreneurship MBA" text and close tab

  @CommencementPageUI
  Scenario: TC030: Verify UI of Commencement Page
    Given User Navigate to Commencement Page
    When User move to Commencement Page Utility Navigation
    Then User Should see "REGISTRATION" Link in Commencement Page Utility Navigation
    When User move to Commencement Page Menu Navigation
    Then User Should see "CAP & GOWN" Link in Commencement Page Menu Navigation
    When User Click on Commencement Page Header Logo
    Then User should see the "Strayer Commencement" text on "Home" Page and close tab
    Given User Navigate to Commencement Page
    When User move to Commencement Page Footer
    When User Click on Commencement Page Footer Logo
    Then User should see the "Strayer Commencement" text on "Home" Page and close tab
    Given User Navigate to Commencement Page
    When User move to Commencement Page Footer
    Then User should see the "QUESTIONS? EMAIL US AT COMMENCEMENT@STRAYER.EDU" text on Commencement Page footer

  @TablewithCTACommencementpage
  Scenario: TC031: Verify Table with CTA module is avaliable in Commencement Page
    Given User Navigate to Commencement Page
    When User move to Commencement Page Table Module
    Then User should see the "DATES AND DEADLINES" text on Commencement Page Table
    When User Click on CTA Button in TablewithCTA Module in Commencement Page
    Then User should see the "SCommencement Registration" text and close tab

  @BannerRFI @EDU
  Scenario: TC035: Verify User is able to submit Banner form
    Given User Navigate to EDU Banner Forms Page
    When User move to BannerRFI
    # When User select "MBA" as Degree in Banner form
    #When User select "Business Administration" as program of interest in Banner form
    And User enter "Banner" as FirstName in Banner form
    And User enter "Form" as LastName in Banner form
    And User enter "Bannerform@cunet.com" as Email in Banner form
    And User enter "3232344567" as PhoneNumber in Banner form
    And User enter "99501" as Zip in Banner form
    When User click "AgreeandGo" button in Banner form
    Then User should see the "200" Success Response Status code
    Then User should navigate to "Thank You" Thank you page

  @FooterRFI @EDU
  Scenario: TC036: Verify User is able to submit footer  form
    Given User Navigate to EDU Forms Page
    When User move to footerRFI
    #When User select "MBA" as Degree in form
    #When User select "Business Administration" as program of interest in form
    And User enter "Footer" as FirstName in form
    And User enter "Form" as LastName in form
    And User enter "footerform@cunet.com" as Email in form
    And User enter "3232344567" as PhoneNumber in Footer form
    And User enter "99501" as Zip in form
    When User click "AgreeandGo" button in form
    Then User should see the "200" Success Response Status code
    Then User should navigate to "Thank You" Thank you page

  @FooterRFIValidations @EDU
  Scenario: TC037: Verify Error validations in Footer form
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
  Scenario: TC038: Verify Error validations in Banner  form
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
  Scenario: TC039: Verify user is able to submit Degree header form
    Given User Navigate to Degree Page
    When User move to Degree Page Utility Navigation
    When User Click on "LEARN MORE" link in Degree Page
    When User move to Degree Form
    And User enter "Degree" as FirstName in Degree form
    And User enter "Form" as LastName in Degree form
    And User enter "TA DIGIT" as Company in Degree form
    And User enter "Mr Pradeep" as Title in Degree form
    And User enter "degreeform@cunet.com" as Email in Degree form
    And User enter "BEST COMPANY" as Comments in Degree form
    When User click "Submit" button in Degree form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you for your interest in Degrees@Work." text on Window

  #When User click "Close" button in Sucess window in form
  @DownloadFormMBA @OMS
  Scenario: TC040: Verify User is able to submit MBA download form
    Given User Navigate to Mobile Mba Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "downloadform@cunet.com" as Email in Download form
    And User enter "3232344567" as PhoneNumber in Download form
    And User enter "99501" as Zip in Download form
    When User click "Submit" button in Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page

  @MicroSiteForminMBAEntrepreneurship @OMS
  Scenario: TC040: Verify User is able to submit Banner with Microsite form
    Given User Navigate to Cheddar Page
    When User move to MicroSite form
    And User enter "Cheddar" as FirstName in MicroSite form
    And User enter "Form" as LastName in MicroSite form
    And User enter "99501" as Zip in MicroSite form
    And User enter "cheddarform@cunet.com" as Email in MicroSite form
    And User enter "3232344567" as PhoneNumber in MicroSite form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @MicroSiteForminMBAPage @OMS
  Scenario: TC041: Verify User is able to submit Banner with Microsite form in Mobile-Mba Page
    Given User Navigate to Mobile Mba Page
    When User move to MicroSite form
    And User enter "Mobile" as FirstName in MicroSite form
    And User enter "MBA" as LastName in MicroSite form
    And User enter "99501" as Zip in MicroSite form
    And User enter "mobilemba@cunet.com" as Email in MicroSite form
    And User enter "3232344567" as PhoneNumber in MicroSite form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @DownloadFormCheddar @OMS
  Scenario: TC042: Verify User is able to submit Download form
    Given User Navigate to Cheddar Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "downloadform@cunet.com" as Email in Download form
    And User enter "3232344567" as PhoneNumber in Download form
    And User enter "99501" as Zip in Download form
    When User click "Submit" button in Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page

  @NominateTeacherform @OMS
  Scenario: TC043: Verify User is able to submit Nominate a Teacher form
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
  Scenario: TC044: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    And User enter "Linkedin" as FirstName in LinkedIn form
    And User enter "MBA" as LastName in LinkedIn form
    And User enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And User enter "1234567890" as PhoneNumber in LinkedIn form
    And User enter "99501" as Zip in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @LinkedInpageBBAForm @LP
  Scenario: TC045: Verify User is able to submit form in Linked In BBA page
    Given User Navigate to LinkedIn BBA Page
    And User enter "LinkedIn" as FirstName in LinkedIn form
    And User enter "BBA" as LastName in LinkedIn form
    And User enter "linkedformbba@cunet.com " as Email in LinkedIn form
    And User enter "1234567890" as PhoneNumber in LinkedIn form
    And User enter "99501" as Zip in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @ShortForm @LP
  Scenario: TC046: Verify User is able to submit Short form
    When User move to Short form Page
    And User enter "Deepu" as FirstName in Short form
    And User enter "Kumar" as LastName in Short form
    And User enter "shortform@cunet.com" as Email in Short form
    And User enter "1234567890" as PhoneNumber in Short form
    And User enter "99501" as Zip in Short form
    And User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @ShortFormwithDropdown @LP
  Scenario: TC047: Verify User is able to submit Short form with drop downs
    When User move to Short form with drop down Page
    When User select "MBA" as Degree in Short form
    And User select "Business Administration" as program of interest in Short form
    And User enter "Shortform" as FirstName in Short form
    And User enter "Dropdown" as LastName in Short form
    And User enter "shortfromdd@cunet.com" as Email in Short form
    And User enter "1234567890" as PhoneNumber in Short form
    And User enter "99501" as Zip in Short form
    When User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @TwoStepForm @Afford @LP
  Scenario: TC048: Verify User is able to submit Two Step  form
    When User move to Two step  form Page
    And User enter "Two Step" as FirstName in Two Step form
    And User enter "Form" as LastName in Two Step form
    And User enter "HYDERABAD" as Address in Two Step form
    And User enter "99501" as Zip in Two Step form
    And User enter "1234567890" as PhoneNumber in Two Step form
    And User enter " twostepform@cunet.com" as Email in Two Step form
    When User click "Next" Button in Two Step form
    And User select "MBA" as Degree in Two Step form
    And User select "Business Administration" as program of interest in Two Step form
    When User click "AgreeandGo" button in Two Step form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @LongForm @LP
  Scenario: TC049: Verify User is able to submit Long form
    When User move to Long  form Page
    And User enter "Long" as FirstName in Long form
    And User enter "Form" as LastName in Long form
    And User enter "HYDERABAD" as Address in Long form
    And User enter "longform@cunet.com" as Email in Long form
    And User enter "1234567890" as PhoneNumber in Long form
    And User enter "99501" as Zip in Long form
    # And User select "Some post graduate" as Education Level in Long form
    And User select "Certificates" as Degree in Long form
    And User select "Digital Entrepreneurship" as program of interest in Long form
    When User click "AgreeandGo" button in Long form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

  @CheddarFormWithDropdown @OMS
  Scenario: TC050: Verify User is able to submit Cheddar form
    Given User Navigate to Cheddar Application Page
    When User move to MicroSite form
    And User enter "Cheddar with drop down" as FirstName in MicroSite form
    And User enter "Form" as LastName in MicroSite form
    And User enter "99501" as Zip in MicroSite form
    And User enter "cheddarformdd@cunet.com" as Email in MicroSite form
    And User enter "3232344567" as PhoneNumber in MicroSite form
    And User select "High School Graduate" as education level in form
    When User click "Agree and Go" button in MicroSite form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @CheddarDownloadForm @OMS
  Scenario: TC051: Verify User is able to submit Cheddar Download form
    Given User Navigate to Cheddar Application Page
    When User Click on "Download Now" Form link in Cheddar Page
    And User enter "Cheddar Download" as FirstName in Download form
    And User enter "Form" as LastName in Download form
    And User enter "cheddardownloadform@cunet.com" as Email in Download form
    And User enter "3232344567" as PhoneNumber in Download form
    And User enter "99501" as Zip in Download form
    And User select "High School Graduate" as education level in download form
    When User click "Submit" button in Cheddar Download form
    Then User should see the "200" Response Status code
    Then User should see the "Thank you page - RFI " text on page

  @AutoFillLinkedInForm @LP
  Scenario Outline: : TC052: Verify User is able to submit form in Linked In Home page
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
  Scenario Outline: : TC053: Verify User is able to submit form in Linked In Home page
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
    Then User should see the "Strayer University :: Thank You" text on page

    Examples: 
      | FirstName  | LastName | Email                        | Password | PhoneNo    | ZIP   |
      | Automation | Report   | StrayerAutoReports@gmail.com | Admin*12 | 6466469977 | 55111 |

      @Disclaimer_Modal @LP
  Scenario Outline: TC054: Verify User is able to View Disclaimer Modals in Degree Page
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
      