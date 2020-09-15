Feature: Strayer Drupal-AEM Migration Project Regression Suite

  @MegaMenuValidations @Regression @EDU
  Scenario: TC001: Verify Mega Menus is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to Academic Programs Menu
    Then I should see the "Academic Programs" text on Academic Programs Menu
    When I move to Student Experience Menu
    Then I should see the "Student Experience" text on Student Experience Menu
    When I move to Tution and Financial AID Menu
    Then I should see the "Tuition & Aid" text on Tution and Financial AID Menu
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "Admissions" text on Strayer ADMISSIONS Menu

  @AcademicProgramsLinkValidations @Regression @EDU
  Scenario Outline: TC002:Verify Child Link navigations Under  Academic Programs Link in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to Academic Programs Menu
    Then I should see the "Academic Programs" text on Academic Programs Menu
    When I move to Academic Programs ChildLinksModule
    When I Click on "<Child_Link>" link
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Qualification     | Child_Link   | Link                                    | PageTitle                                        |
      | Academic Programs | Bachelor     | Accounting                              | Bachelor of Science in Accounting Online         |
      | Academic Programs | Bachelor     | Applied Science in Management           | Bachelor of Applied Science in Management Online |
      | Academic Programs | Master       | Information Assurance                   | Master's in Information Assurance Online         |
      | Academic Programs | Master       | Jack Welch Management Institute MBA     | Jack Welch Management Institute                  |
      #| Academic Programs | Associate  | Accounting                          | Associate Degree in Accounting Online                          |
      #| Academic Programs | Associate  | Acquisition and Contract Management | Associate Degree in Acquisition and Contract Management Online |
      # | Academic Programs | Associate  | Business Administration             | Associate Degree in Business Online                            |
      #| Academic Programs | Associate  | Information Systems                 | Associate Degree in Information Systems Online                 |
      #| Academic Programs | Associate  | Information Technology              | Associate Degree in Information Technology Online              |
      #| Academic Programs | Associate  | Marketing                           | Associate Degree in Marketing Online                           |
      | Academic Programs | Certificates | Devmountain: IOS Development Bootcamp   | iOS Development Immersive Bootcamp               |
      | Academic Programs | Certificates | Grad Cert in Digital Entrepreneurship   | Certificate in Entrepreneurship Online           |
      | Academic Programs | Certificates | Jack Welch (JWMI) Graduate Certificates | Jack Welch Management Institute                  |

  @Regression @AdmissionLinkValidations @EDU
  Scenario Outline: TC003: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given User Navigate to Strayer University Application
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "<Qualification>" text on Strayer ADMISSIONS Menu
    When I move to ADMISSIONS ChildLinksModule
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Qualification | Child_Link             | Link                   | PageTitle                                 |
      | Admissions    | How to Apply           | How to Apply           | How to Apply to College                   |
      | Admissions    | Admission Requirements | Admission Requirements | Online College Admission Requirements     |
      | Admissions    | Transfer Credits       | Transfer Credits       | Transfer Credits                          |
      | Admissions    | International Students | International Students | Online Degrees for International Students |
      | Admissions    | Apply now              | Apply now              | Strayer University Student Application    |

  @TutionFinancialLinkValidations @Regression @EDU
  Scenario Outline: TC004: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given User Navigate to Strayer University Application
    When I move to Tution and Financial AID Menu
    Then I should see the "<Qualification>" text on Tution and Financial AID Menu
    When I move to TUITION ChildLinksModule
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

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

  @StudentExperienceLinksValidations @Regression @EDU
  Scenario Outline: TC005: Verify Child Link navigations Under  Student Experience Link in Strayer Home Page Mega Menu
    Given User Navigate to Strayer University Application
    When I move to Student Experience Menu
    Then I should see the "<Qualification>" text on Student Experience Menu
    When I move to Student Experience ChildLinksModule
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

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

  @UtilityHeader @Regression @EDU
  Scenario: TC006: Verify UtilityHeader module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to UtilityHeader
    When I Click on CampusLocationLink Link
    Then I should see the "Campus Locations" text on CampusLocation Page
    When I Click on Logo Image
    When I Click on CampusLoginLink Link
    Then I should see the "iCampus Login" text on CampusLogin Page
    Then I close tab
    Given User Navigate to Strayer University Application
    When I Click on ApplyNowLink Link
    Then I should see the "Strayer University Student Application" text on ApplyNowLink Page
    Then I close tab

  @SocialLinks @Sprint-1-Regression @EDU
  Scenario Outline: TC007: Verify Social Links module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to SocialLink
    When I Click on "<Icon>" icon
    Then I should see the "<PageTitle>" text on "<Icon>" iconPage and close tab

    Examples: 
      | Icon      | PageTitle                               |
      | twitter   | Strayer University (@StrayerU)          |
      | facebook  | Strayer University - Home               |
      | linkedin  | LinkedIn                                |
      | youtube   | Strayer University - YouTube            |
      | instagram | Strayer University (@strayeruniversity) |

  @HomePageFooter @-Regression @EDU
  Scenario: TC008: Verify Footer module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    Then I should see the "2019 Strayer University" text on footer
    When I Click on footerLogo Image
    Then I should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  # When I move to footer
  # When I move to footerRFI
  #Then I should see the "Take the first step" text on footerRFI
  #@FooterRibbon @Sprint-1-Regression @EDU
  #Scenario: TC009: Verify Footer Ribbon module is disaplying in Strayer Home Page
  # Given User Navigate to Strayer University Application
  #  When I move to footerribbon
  # Then I should see the "877.445.7180" text in FooterRibbonModule
  @FooterRFI @Regression @EDU
  Scenario: TC010: Verify User is able to submit form in Footer in Strayer Home Page
    Given User Navigate to EDU Forms Page
    When I move to footerRFI
    #When I select "MBA" as Degree in form
    #When I select "Business Administration" as program of interest in form
    And I enter "Footer" as FirstName in form
    And I enter "Form" as LastName in form
    And I enter "footerform@cunet.com" as Email in form
    And I enter "3232344567" as PhoneNumber in Footer form
    And I enter "99501" as Zip in form
    When I click "AgreeandGo" button in form
    Then I should see the "200" Success Response Status code
    Then I should navigate to "Thank You" Thank you page

  @QuickLinksinFooter @Regression @EDU
  Scenario: TC011: Verify QuickLink Module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to AOSModule
    Then I should see the "Areas of Study" text in AOSModule
    When I move to QUICKLINKModule
    Then I should see the "Quick Links" text in QuickLinksModule
    When I move to MORELINKModule
    Then I should see the "More" text in MoreLinksModule
    When I move to LEGALLINKModule
    Then I should see the "Legal" text in LegalLinksModule

  @HeaderLogo @Regression @EDU
  Scenario: TC012: Verify Header Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to UtilityHeader
    When I Click on Logo Image in Header
    Then I should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  @FooterLogo @-Regression @EDU
  Scenario: TC013: Verify Footer Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I Click on footerLogo Image
    Then I should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  @HomePageBanner @Regression @EDU
  Scenario: TC014: Verify Home page Banner is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I Click on Logo Image in Header
    When I move to HomeBanner
    Then I Should see the "Get the degree you need for the life you want" text on HomeBanner

  @DragonPageUI @Sprint-2-Regression
  Scenario: TC016: Verify UI of Dragon Page
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Utility Header
    Then I Should see "We're here to help!" text in Utility Header
    Then I should see "1.877.217.3418" phonenumber in Utility Header
    When I move to DragonPage Utility Navigation
    Then I should see "TUITION COSTS" Link in Utility Navigation
    When I Click on DragonPage Header Logo
    Then I should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Footer
    When I Click on DragonPage Footer Logo
    Then I should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Footer
    Then I should see the "2019 Strayer University" text on LinkedIn Page footer

  @DragonTemplatePageHeaderNavigation @DragonTemplate
  Scenario Outline: TC017: Verify Child Link navigations in Header Navigation module in Dragon Page
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Utility Header Link Module
    When I Click on "<Link>" link in Dragon Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                             |
      | Affordability   | Strayer University :: Affordability   |
      | Programs        | Strayer University :: Programs        |
      | Online learning | Strayer University :: Online Learning |
      | Transfer credit | Strayer University :: Transfer Credit |

  @DragonTemplatePageFooterNavigation @DragonTemplate
  Scenario Outline: TC018: Verify Child Link navigations in Footer module in Dragon Page
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Footer
    When I Click on "<Link>" link in Dragon Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | Terms of Use    | Terms of Use                      |
      | Privacy Policy  | Privacy Policy                    |
      | State Licensure | State Licensure and Authorization |
      | Opt Out         | Opt Out                           |

  @CobraPageUI @Sprint-2-Regression
  Scenario: TC019: Verify UI of Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Utility Header
    Then I Should see "We're here to help!" text in Cobra Page Utility Header
    Then I should see "1.877.212.4508" phonenumber in Cobra Page Utility Header
    When I move to CobraPage Utility Navigation
    Then I should see "AFFORDABILITY" Link in Cobra Page Utility Navigation
    When I Click on CobraPage Header Logo
    Then I should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Footer
    When I Click on CobraPage Footer Logo
    Then I should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Footer
    Then I should see the "2019 Strayer University" text on Cobra Page footer

  @CobraPageHeaderNavigation @Sprint-2-Regression
  Scenario Outline: TC020: Verify Child Link navigations in Header Navigation module in Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Utility Header Link Module
    When I Click on "<Link>" link in Cobra Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                           |
      | affordability   | Strayer University:Affordability    |
      | programs        | Strayer University:Programs         |
      | Online Learning | Strayer University:Online Learning  |
      | Transfer Credit | Strayer University:Transfer credits |

  @CobraPageFooterNavigation @Sprint-2-Regression
  Scenario Outline: TC021: Verify Child Link navigations in Footer module in Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Footer
    When I Click on "<Link>" link in Cobra Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | Terms of Use    | Terms of Use                      |
      | Privacy Policy  | Privacy Policy                    |
      | State Licensure | State Licensure and Authorization |
      | Opt Out         | Opt Out                           |

  @DragonPageUI @Sprint-2-Regression
  Scenario: TC023: Verify UI of Dragon Page
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Utility Header
    Then I Should see "We're here to help!" text in Utility Header
    Then I should see "1.888.622.5374" phonenumber in Utility Header
    When I move to DragonPage Utility Navigation
    Then I should see "Programs" Link in Utility Navigation
    When I Click on DragonPage Header Logo
    Then I should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Footer
    When I Click on DragonPage Footer Logo
    Then I should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Footer
    Then I should see the "2020 Strayer University" text on Dragon Page footer

  @FooterRFIValidations @Sprint-1-Regression @EDU
  Scenario: TC027: Verify Error validations in Footer form in Strayer Home Page
    Given User Navigate to EDU Forms Page
    When I move to footerRFI
    When I click "AgreeandGo" button in form
    Then I should see the "*Please enter all required Fields" for FirstName field
    When I move to footerRFI
    And I enter "Footer" as FirstName in form
    When I click "AgreeandGo" button in form
    Then I should see the "*Please enter all required Fields" for LastName field
    When I move to footerRFI
    And I enter "Form" as LastName in form
    When I click "AgreeandGo" button in form
    When I move to footerRFI
    Then I should see the "*Please enter all required Fields" for Email field
    And I enter "footerform@cunet.com" as Email in form
    When I click "AgreeandGo" button in form
    Then I should see the "*Please enter all required Fields" for PhoneNumber field
    When I move to footerRFI
    And I enter "3232344567" as PhoneNumber in form
    When I click "AgreeandGo" button in form
    Then I should see the "*Please enter all required Fields" for ZipCode field

  @Chat @Sprint-1-Regression @EDU
  Scenario: TC028: Verify Chat window is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footerribbon
    When I Click on ClickToStart Link
    Then I should see the "Thank you for choosing to chat with us. An agent will be with you shortly." text on ChatWindow

  @SiteMap @Sprint-2-Regression @EDU
  Scenario Outline: TC029: Verify User is able to navigate Sitemap page from Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I Click on SiteMap Link
    Then I should see the "<PageTitle>" text on Child "SiteMap" Page and close tab

    Examples: 
      | PageTitle |
      | Site Map  |

  @TitleText @Sprint-2-Regression
  Scenario: TC030: Verify Title text Component is available in Home Page
    Given User Navigate to Strayer University Application ChildPage
    When I move to Title Text Component
    Then I should see the "MEET STUDENT SERVICE COACH TANIKA FEASTER" text on TitleText Component
    Then I should see the Image
    Then I Should the "In 2009, Tanika Feaster of Newport News," text on Title Text Component

  @LinkedInPageUI @Sprint-2-Regression
  Scenario: TC031: Verify UI of LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When I move to LinkedInPage Utility Navigation
    Then I should see "CONCENTRATIONS" Link in LinkedInpage Utility Navigation
    When I Click on LinkedInPage Header Logo
    Then I should see the "Strayer University: Accredited Online College" text on "Home" Page and close tab
    When I move to LinkedInPage Footer
    When I Click on LinkedInPage Footer Logo
    Then I should see the "Strayer University: Accredited Online College" text on "Home" Page and close tab
    When I move to LinkedInPage Footer
    Then I should see the "2020 Strayer University" text on LinkedIn Page footer

  @HeaderNavigationinLinkedInPage @Sprint-2-Regression
  Scenario Outline: TC032: Verify Child Link navigations in Header Navigation module in LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When I move to LinkedInPage Utility Header Link Module
    When I Click on "<Link>" link in LinkedIn Page
    Then I should see the "<PageTitle>" text in LinkedIn Page and close tab

    Examples: 
      | Link            | PageTitle                                     |
      | WHY STRAYER?    | Strayer University: Accredited Online College |
      | CONCENTRATIONS  | Strayer University: Accredited Online College |
      | ONLINE LEARNING | Strayer University: Accredited Online College |
      | TRANSFER CREDIT | Strayer University: Accredited Online College |

  @FooterNavigationinLinkedInPage @Sprint-2-Regression
  Scenario Outline: TC033: Verify Child Link navigations in Footer module in LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When I move to LinkedInPage Footer
    When I move to LinkedInPage Footer Link Module
    When I Click on "<Link>" link in LinkedIn Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | TERMS OF USE    | Terms of Use                      |
      | PRIVACY POLICY  | Privacy Policy                    |
      | STATE LICENSURE | State Licensure and Authorization |
      | OPT OUT         | Opt Out                           |

  @BlogsSubscription @Sprint-3-Regression @EDU
  Scenario: TC0034: Verify User is able to subscribe for Blog
    Given User Navigate to Buzz Page
    When I move to Blog Component Blog Subscription Module in Buzz Page
    When I enter "test@cunet.com" as Email in Blog Subsciprtion Field
    When I Click on "Submit" button in Blog Module in All Component Page
    Then I should see the "200" Response Status code
    Then I should see the "Buzz Subscription Confirmation | Strayer University" text on page

  @BlogsSubscriptionValidations @Sprint-3-Regression @EDU
  Scenario: TC0035: Verify Error Validations in Blog Subscription Module
    Given User Navigate to Buzz Page
    When I move to Blog Component Blog Subscription Module in Buzz Page
    When I enter "" as Email in Blog Subsciprtion Field
    When I Click on "Submit" button in Blog Module in All Component Page
    Then I should see the "*Please enter a valid email address" for Email field in Blog Module

  @LinkedInpageForm @Sprint-3-Regression
  Scenario: TC036: Verify User is able to submit form in Linked In page
    Given User Navigate to LinkedIn Home Page
    And I enter "Ind" as FirstName in LinkedIn form
    And I enter "Team" as LastName in LinkedIn form
    And I enter "test@cunet.com" as Email in LinkedIn form
    And I enter "3232344567" as PhoneNumber in LinkedIn form
    And I enter "99501" as Zip in LinkedIn form
    When I click "Submit" button in LinkedIn form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

  #@AboutUs @Sprint-3-Regression
  #Scenario: TC037: Verify User is able View AboutUs Information
  #Given User Navigate to LinkedIn Home Page
  #When I move to AboutUs Module
  #Then I should see the AboutUs Image
  #Then I should see the "Plus we have over 125 year history of changing lives." Header text on AboutUs Component
  #Then I Should the "BE A PART OF THAT KIND OF LEGACY." Title text on AboutUs Component
  @Accredation @Sprint-3-Regression
  Scenario: TC038: Verify Accredation component module is disaplying in Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Footer
    When I move to CobraPage Accredation
    Then I should see "STRAYER UNIVERSITY ACCREDITATION" text in Accredation
    Then I should see the Accredation Image
    When I Click on Accredation Link
    Then I should see the "STRAYER UNIVERSITY ACCREDITATION" text on Accredation window

  @TabComponent @Sprint-3-Regression @EDU
  Scenario: TC039: Verify Tab Component is avaliable in Cobra Page
    Given User Navigate to Cobra All Comps Page
    When I move to TabComponent
    When I move to BacheloresTab
    Then I should see "BACHELOR" text on BacheloresTab
    When I move to MastersTab
    Then I should see "MASTER" text on MastersTab
    When I move to MBA Tab
    Then I should see "MBA" text on MBA Tab
    When I move to AssociatesTab
    Then I should see "ASSOCIATE" text on AssociatesTab

  @QuoteComponent @Sprint-3-Regression
  Scenario: TC040: Verify Quote Component is avaliable in Dragon Page
    Given User Navigate to Dragon Page
    When I move to Quote Component

  #Then I Should see "YOU ARE ABOUT TO CHANGE YOUR LIFE. WELCOME TO STRAYER UNIVERSITY." text in Quote Component
  @LongForm @Sprint-4-Regression
  Scenario: TC041: Verify User is able to submit Long form
    Given User Navigate to Cobra All Comps Page
    And I enter "Deepu" as FirstName in Long form
    And I enter "Kumar" as LastName in Long form
    And I enter "HYDERABAD" as Address in Long form
    And I enter "test@cunet.com" as Email in Long form
    And I enter "3232344567" as PhoneNumber in Long form
    And I enter "99501" as Zip in Long form
    And I select "Some post graduate" as Education Level in Long form
    And I select "Certificates" as Degree in Long form
    And I select "Entrepreneurial Leadership" as program of interest in Long form
    When I click "AgreeandGo" button in Long form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

  @ShortForm @Sprint-4-Regression
  Scenario: TC042: Verify User is able to submit Short form
    Given User Navigate to Achieve Page
    And I enter "Deepu" as FirstName in Short form
    And I enter "Kumar" as LastName in Short form
    And I enter "test@cunet.com" as Email in Short form
    And I enter "3232344567" as PhoneNumber in Short form
    And I enter "99501" as Zip in Short form
    When I click "AgreeandGo" button in Long form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

  @TwoStepForm @Sprint-4-Regression
  Scenario: TC043: Verify User is able to submit Two Step  form
    Given User Navigate to Dragon Template Page
    # When I move to Two Step Form
    And I enter "Deepu" as FirstName in Two Step form
    And I enter "Kumar" as LastName in Two Step form
    And I enter "HYDERABAD" as Address in Two Step form
    And I enter "99501" as Zip in Two Step form
    And I enter "3232344567" as PhoneNumber in Two Step form
    And I enter "test@cunet.com" as Email in Two Step form
    When I click "Next" Button in Two Step form
    And I select "Certificates" as Degree in Two Step form
    And I select "Digital Entrepreneurship" as program of interest in Two Step form
    When I click "AgreeandGo" button in Two Step form
    Then I should see the "200" Response Status code

  #Then I should see the "Strayer University :: Thank You" text on page
  @DegreesPageUI @Sprint-4-Regression @OMS
  Scenario: TC044: Verify UI of DegreesStudio Page
    Given User Navigate to Degree Page
    When I move to Degree Page Utility Navigation
    Then I Should see "OVERVIEW" Link in Degree Page Utility Navigation
    When I Click on Degree Page Header Logo
    Then I should see the "Employers | Degrees at Work" text on "Home" Page and close tab
    When I move to Degree Page Footer
    When I Click on Degree Page Footer Logo
    Then I should see the "Employers | Degrees at Work" text on "Home" Page and close tab

  @DegreesPageHeaderNavigation @Sprint-4-Regression @OMS
  Scenario Outline: TC045: Verify Child Link navigations in Header Navigation module in DegreesStudio Page
    Given User Navigate to Degree Page
    When I move to Degree Page Utility Navigation
    When I Click on "<Link>" link in Degree Page
    Then I should see the "<PageTitle>" text on "Home" Page and close tab

    Examples: 
      | Link         | PageTitle |
      | OVERVIEW     | Employers |
      | HOW IT WORKS | Employers |
      | RESULTS      | Employers |

  @DegreesPageFooterNavigation @Sprint-4-Regression @OMS
  Scenario Outline: TC046: Verify Child Link navigations in Footer module in DegreesStudio Page
    Given User Navigate to Degree Page
    When I move to Degree Page Footer
    When I Click on "<Link>" link in Degree Page
    Then I should see the "<PageTitle>" text on "Home" Page and close tab

    Examples: 
      | Link                         | PageTitle                         |
      | Terms of Use                 | Terms of Use                      |
      | Privacy Policy               | Privacy Policy                    |
      | Student Consumer Information | Student Consumer Information      |
      | State Licensure              | State Licensure and Authorization |
      | Program Disclosure           | Academic Program List             |
      | Opt Out                      | Opt Out                           |

  @StudiosPageUI @Sprint-4-Regression @OMS
  Scenario: TC047: Verify UI of Studios Page
    Given User Navigate to Studios Page
    When I move to Studios Page Utility Navigation
    Then I Should see "ABOUT" Link in Studios Page Utility Navigation
    When I Click on Studios Page Header Logo
    Then I should see the "Innovation in Online Education | Strayer Studios" text on "Home" Page and close tab
    Given User Navigate to Studios Page
    When I move to Studios Page Footer
    When I Click on Studios Page Footer Logo
    Then I should see the "Innovation in Online Education | Strayer Studios" text on "Home" Page and close tab
    Given User Navigate to Studios Page
    When I move to Studios Page Footer
    Then I should see the "2019 Strayer University" text on Studios Page footer

  @MenuNavigationinStudiosPage @Sprint-4-Regression @OMS
  Scenario Outline: TC048: Verify Child Link navigations in Menu Navigation module in Studios Page
    Given User Navigate to Studios Page
    When I move to Studios Page Utility Navigation
    When I Click on "<Link>" link in Studios Page
    Then I should see the "<PageTitle>" text on "Home" Page and close tab

    Examples: 
      | Link               | PageTitle                      |
      | About              | Innovation in Online Education |
      | The Stories        | Innovation in Online Education |
      | Go Inside a Course | Innovation in Online Education |
      | Share              | Innovation in Online Education |

  @FooterNavigationinStudiosPage @Sprint-4-Regression
  Scenario Outline: TC049: Verify Child Link navigations in Footer module in Studios Page
    Given User Navigate to Studios Page
    When I move to Studios Page Footer
    When I Click on "<Link>" link in Studios Page
    Then I should see the "<PageTitle>" text on "Home" Page and close tab

    Examples: 
      | Link                          | PageTitle                                        |
      | Strayer University            | Strayer University: Accredited Online University |
      | Strayer Education             | Home, Strategic Education, Inc.                  |
      | Terms of Use                  | Terms of Use                                     |
      | Privacy Policy                | Privacy Policy                                   |
      | State Licensure/Authorization | State Licensure and Authorization                |

  @CheddarPageUI @Sprint-4-Regression @OMS
  Scenario: TC050: Verify UI of Cheddar Page
    Given User Navigate to Cheddar Page
    When I move to Cheddar Page Utility Navigation
    Then I Should see "Request Info" Link in Cheddar Page Utility Navigation
    Then I Close Cheddar Page menu Close Button
    When I Click on Cheddar Page Header Logo
    Then I should see the "Strayer's Digital Entrepreneurship MBA | Digital Entrepreneurship MBA" text on "Home" Page and close tab
    # When I move to Cheddar Page Footer
    # When I Click on Cheddar Page Footer Logo
    # Then I should see the "Strayer's Digital Entrepreneurship MBA | Digital Entrepreneurship MBA" text on "Home" Page and close tab
    When I move to Cheddar Page Footer
    Then I should see the "2019 Digital Entrepreneurship MBA" text on Cheddar Page footer

  @FooterNavigationinCheddarpage @Sprint-4-Regression @OMS
  Scenario Outline: TC051: Verify Child Link navigations in Footer module in Cheddar Page
    Given User Navigate to Cheddar Page
    When I move to Cheddar Page Footer
    When I move to Cheddar Page Footer Link Module
    When I Click on "<Link>" link in Cheddar Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle       |
      | Terms of Use    | Terms of Use    |
      | Privacy Policy  | Privacy Policy  |
      | State Licensure | State Licensure |
      | Opt Out         | Opt Out         |

  @BannerwithQuoteStudiosPage @Sprint-4-Regression @OMS
  Scenario: TC052: Verify Banner with quote  module in Studios Page
    Given User Navigate to Studios Page
    When I move to Studios Page Banner Module
    Then I should see the "Strayer Studios Outcomes Report" text on Studios Page Banner

  @BannerwithCTAStudiosPage @Sprint-4-Regression @OMS
  Scenario: TC053: Verify user is able to click on CTA button in Banner module in Studios Page

  # Given User Navigate to Studios Page
  #When I move to Studios Page BannerwithCTA Module
  #When I Click on CTA Button in BannerwithCTA Module
  # Then I should see the "Closing the Workforce Skills Gap" text on "Home" Page and close tab
  @ImagewithCTAButton @Sprint-4-Regression @OMS
  Scenario: TC054: Verify user is able to click on CTA button in Image module in Cheddar Page
    Given User Navigate to Cheddar Page
    When I move to Cheddar Page ImagewithCTA Module
    When I Click on CTA Button in ImagewithCTA Module
    Then I should see the "What You'll Learn | Digital Entrepreneurship MBA" text and close tab

  @CommencementPageUI @Sprint-4-Regression @OMS
  Scenario: TC055: Verify UI of Commencement Page
    Given User Navigate to Commencement Page
    When I move to Commencement Page Utility Navigation
    Then I Should see "REGISTRATION" Link in Commencement Page Utility Navigation
    When I move to Commencement Page Menu Navigation
    Then I Should see "CAP & GOWN" Link in Commencement Page Menu Navigation
    When I Click on Commencement Page Header Logo
    Then I should see the "Strayer Commencement" text on "Home" Page and close tab
    Given User Navigate to Commencement Page
    When I move to Commencement Page Footer
    When I Click on Commencement Page Footer Logo
    Then I should see the "Strayer Commencement" text on "Home" Page and close tab
    Given User Navigate to Commencement Page
    When I move to Commencement Page Footer
    Then I should see the "QUESTIONS? EMAIL US AT COMMENCEMENT@STRAYER.EDU" text on Commencement Page footer

  @UtilityNavigationinCommencementPage @Sprint-4-Regression @OMS
  Scenario Outline: TC056: Verify Child Link navigations in Utility Navigation module in Commencement Page
    Given User Navigate to Commencement Page
    When I move to Commencement Page Utility Navigation
    When I Click on "<Link>" link in Commencement Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link              | PageTitle                 |
      | registration      | Commencement Registration |
      | Guest Visa/Travel | Guest Visa/Travel         |
      | FAQ               | FAQ                       |

  @MenuNavigationinCommencementPage @Sprint-4-Regression @OMS
  Scenario Outline: TC057: Verify Child Link navigations in Menu Navigation module in Commencement Page
    Given User Navigate to Commencement Page
    When I move to Commencement Page Menu Navigation
    When I Click on "<Link>" link in Commencement Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle       |
      | CAP & GOWN      | Cap & Gown      |
      | awards & honors | Awards & Honors |
      | diplomas        | Diplomas        |
      | jwmi students   | JWMI Students   |

  @FooterNavigationinCommencementpage @Sprint-4-Regression @OMS
  Scenario Outline: TC058: Verify Child Link navigations in Footer module in Commencement Page
    Given User Navigate to Commencement Page
    When I move to Commencement Page Footer
    When I move to Commencement Page FooterLink Module
    When I Click on "<Link>" link in Commencement Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link              | PageTitle            |
      | registration      | Strayer Commencement |
      | Guest Visa/Travel | Guest Visa/Travel    |
      | FAQ               | FAQ                  |
      | awards & honors   | Awards & Honors      |
      | diplomas          | Diplomas             |
      | JWMI Students     | JWMI Students        |
      | Terms of Use      | Terms of Use         |
      | Privacy Policy    | Privacy Policy       |

  @SocialNavigationinCommencementpage @Sprint-4-Regression @OMS
  Scenario Outline: TC059: Verify Child Link navigations in Social Link module in Commencement Page
    Given User Navigate to Commencement Page
    When I move to Commencement Page Footer
    When I move to Commencement Page SocialLink Module
    When I Click on "<Icon>" icon
    Then I should see the "<PageTitle>" text on "<Icon>" iconPage and close tab

    Examples: 
      | Icon              | PageTitle                               |
      | twitter           | Strayer University (@StrayerU)          |
      | StrayerUniversity | Strayer University - Home               |
      | instagram         | Strayer University (@strayeruniversity) |

  @TablewithCTACommencementpage @Sprint-4-Regression @OMS
  Scenario: TC060: Verify Table with CTA module is avaliable in Commencement Page
    Given User Navigate to Commencement Page
    When I move to Commencement Page Table Module
    Then I should see the "The 2020 ceremony dates and locations will be released in January 2020." text on Commencement Page Table
    When I Click on CTA Button in TablewithCTA Module in Commencement Page
    Then I should see the "SCommencement Registration" text and close tab

  @CarouselinCheddarPage @Sprint-5-Regression @OMS
  Scenario: TC061: Verify Carousel Moduleis  displaying in Cheddar Page
    Given User Navigate to Cheddar Page

  # When I move to Cheddar Page Carousel Module
  #When I Click on Cheddar Page Carousel First Text Module
  # Then I should see the "The Digital Entrepreneurship MBA exemplifies what most MBA programs should seek to deliver." text on Cheddar Page Carousel First Text Module
  #When I Click on Cheddar Page Carousel Second Text Module
  #Then I should see the "I felt like I had a motivational speaker every week with a new topic!" text on Cheddar Page Carousel Second Text Module
  @VerizonPageUI @Sprint-5-Regression
  Scenario: TC062: Verify UI of Verizon Page
    Given User Navigate to Verizon Page
    When I move to Verizon Page Utility Header
    Then I Should see "CAMPUS LOCATION" text in Verizon Page Utility Header
    Then I should see "1.866.514.3924" phonenumber in Verizon Utility Header
    When I move to Verizon Page Utility Navigation
    Then I should see "PROGRAMS" Link in Verizon Page Utility Navigation
    When I Click on Verizon Page Header Logo
    Then I should see the "Strayer University | Partner Sites Home" text on "Home" Page and close tab
    When I move to Verizon Page Footer
    When I move to Verizon Page Footer
    Then I should see the "2019 Strayer University" text on Verizon Page footer

  @HeaderNavigationinVerizonPage @Sprint-5-Regression
  Scenario Outline: TC063: Verify Child Link navigations in Header Navigation module in Verizon Page
    Given User Navigate to Verizon Page
    When I move to Verizon Page Utility Navigation Links Module
    When I Click on "<Link>" link in Verizon Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link       | PageTitle                       |
      | BENEFITS   | Strayer University              |
      | ABOUT      | Strayer University              |
      | PROGRAMS   | Strayer University              |
      | ADMISSIONS | Strayer University              |
      | JACK WELCH | Jack Welch Management Institute |

  @FooterNavigationinVerizonPage @Sprint-5-Regression
  Scenario Outline: TC064: Verify Child Link navigations in Footer module in Verizon Page
    Given User Navigate to Verizon Page
    When I move to Verizon Page Footer
    When I Click on "<Link>" link in Verizon Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle       |
      | Terms of Use    | Terms of Use    |
      | Privacy Policy  | Privacy Policy  |
      | State Licensure | State Licensure |
      | Opt Out         | Opt Out         |

  @BannerRFIinVerizonPage @Sprint-5-Regression
  Scenario: TC065: Verify User is able to submit Banner with form in Verizon Page
    Given User Navigate to Verizon Page
    When I enter "Deepu" as FirstName in Verizon Banner form
    And I enter "Kumar" as LastName in Verizon Banner form
    And I enter "test@cunet.com" as Email in Verizon Banner form
    And I enter "3232344567" as PhoneNumber in Verizon Banner form
    And I enter "99501" as Zip in Verizon Banner form
    When I click "AgreeandGo" button in Verizon Banner form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

  @DegreeHeaderForm @Sprint-6-Regression @OMS
  Scenario: TC066: Verify user is able to submit header form in Degrees Page
    Given User Navigate to Degree Page
    When I move to Degree Page Utility Navigation
    When I Click on "LEARN MORE" link in Degree Page
    When I move to Degree Form
    And I enter "Deepu" as FirstName in Degree form
    And I enter "Kumar" as LastName in Degree form
    And I enter "APR" as Company in Degree form
    And I enter "SOLUTIONS" as Title in Degree form
    And I enter "test@cunet.com" as Email in Degree form
    And I enter "BEST COMPANY" as Comments in Degree form
    When I click "Submit" button in Degree form
    Then I should see the "200" Response Status code
    Then I should see the "Thank you for your interest in Degrees@Work." text on Window
    When I click "Close" button in Sucess window in form

  @BannerCTAinCommencementPageUI @Sprint-6-Regression @OMS
  Scenario Outline: TC067: Verify Banner with Timer and CTA in Commencement Page
    Given User Navigate to Commencement Page
    When I move to Commencement Page Banner With Timer module
    Then I should see the "COMMENCEMENT 2019" text on Banner
    When I Click on "<Link>" link in Commencement Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                   | PageTitle            |
      | Dates & Deadlines      | Strayer Commencement |
      | Cap & Gown Information | Strayer Commencement |

  @DownloadForm @Sprint-6-Regression @OMS
  Scenario: TC068: Verify User is able to submit Banner with form in Cheddar Page
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

  @BannerWithQuote @Sprint-6-Regression @OMS
  Scenario: TC069: Verify Banner with Quote Component is avaliable in Studios Page
    Given User Navigate to Studios Page
    When I move to Banner Quote Component
    Then I Should see "The challenge was, how do we grab a student" text in Banner Quote Component

  @MicroSiteForm @Sprint-6-Regression @OMS
  Scenario: TC070: Verify User is able to submit Banner with Microsite form in Cheddar Page
    Given User Navigate to Cheddar Page
    When I move to MicroSite form
    And I enter "Deepu" as FirstName in MicroSite form
    And I enter "Kumar" as LastName in MicroSite form
    And I enter "test@cunet.com" as Email in MicroSite form
    And I enter "3232344567" as PhoneNumber in MicroSite form
    And I enter "99501" as Zip in MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "200" Response Status code
    Then I should see the "Thank you page - RFI | Digital Entrepreneurship MBA" text on page

  @MicroSiteForminMBAPage @OMS
  Scenario: TC071: Verify User is able to submit Banner with Microsite form in Mobile-Mba Page
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

  @MicroSiteForminMBAPage_ErrorValidations @OMS
  Scenario: TC072: Verify Error validations in Microsite form in Mobile-Mba Page
    Given User Navigate to Mobile Mba Page
    When I move to MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @MicroSiteForminMBAEntrepreneurshipPage_ErrorValidations @OMS
  Scenario: TC073: Verify Error validations in Microsite form in MBAEntrepreneurship Page
    Given User Navigate to Cheddar Page
    When I move to MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @OtherErrorValidationsinMicroSiteForminMBAPage @OMS
  Scenario: TC074: Verify other Error validations in Microsite form in Mobile-Mba Page
    Given User Navigate to Mobile Mba Page
    When I move to MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @OtherErrorValidationsinMicroSiteForminMBAEntrepreneurshipPage @OMS
  Scenario: TC075: Verify other Error validations in Microsite form in MBAEntrepreneurship Page
    Given User Navigate to Cheddar Page
    When I move to MicroSite form
    When I click "Agree and Go" button in MicroSite form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @DownloadFormErrorValidations @OMS
  Scenario: TC076: Verify Error validations in Degree form
    Given User Navigate to Cheddar Page
    When I Click on "Download Now" Form link in Cheddar Page
    When I click "Submit" button in Download form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR PHONE NUMBER" for PhoneNumber field in MicroSite form

  @DownloadFormErrorValidations @OMS
  Scenario: TC077:Verify Error validations in Degree form
    Given User Navigate to Cheddar Page
    When I Click on "Download Now" Form link in Cheddar Page
    And I enter " " as FirstName in Download form
    And I enter " " as LastName in Download form
    And I enter "testcunet.com" as Email in Download form
    And I enter "9950134" as Zip in Download form
    When I click "Submit" button in Download form
    Then I should see the "PLEASE ENTER YOUR FIRST NAME." for FirstName field in MicroSite form
    Then I should see the "PLEASE ENTER YOUR LAST NAME." for LastName field in MicroSite form
    Then I should see the "PLEASE ENTER A 5-DIGIT ZIP CODE" for ZipCode field in MicroSite form
    Then I should see the "PLEASE ENTER VALID EMAIL ADDRESS" for Email field in MicroSite form

  @QuickLinksModuleinFooter @EDU
  Scenario Outline: TC078: Verify Footer Link availble in QuickLink Module is Global footer
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to QUICKLINKModule
    Then I should see the "QUICK LINKS" text in QuickLinksModule
    When I Click on "<Link>" Footer link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                   | PageTitle                                             |
      | Campus Locations       | Colleges Near You                                     |
      | Course Catalog         | Online College Courses                                |
      | Honors Program         | Online Honors Courses                                 |
      | Graduation Information | Strayer Commencement                                  |
      | Strayer Alumni         | Homepage                                              |
      | Buzz Blog              | Strayer University Buzz Blog                          |
      | Scholar Magazine       | Scholar Magazine                                      |
      | Careers at Strayer     | Strayer University Careers                            |
      | Capella University     | Capella University: Online Accredited Degree Programs |

  @MoreQuickLinksModuleinFooter @EDU
  Scenario Outline: TC079: Verify Footer Link availble in More Module is Global footer
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to MORELINKModule
    Then I should see the "MORE" text in MoreLinksModule
    When I Click on "<Link>" Footer link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                         | PageTitle                    |
      | Student Consumer Information | Student Consumer Information |
      | Campus Safety                | Campus Safety                |
      | Title IX                     | Strayer University           |

  @LegalQuickLinksModuleinFooter @EDU
  Scenario Outline: TC080: Verify Footer Link availble in Legal Module is Global footer
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to LEGALLINKModule
    Then I should see the "LEGAL" text in LegalLinksModule
    When I Click on "<Link>" Footer link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                            | PageTitle                         |
      | Terms of Use                    | Terms of Use                      |
      | Privacy Policy                  | Privacy Policy                    |
      | State Licensure / Authorization | State Licensure and Authorization |
      | Site Map                        | Site Map                          |
      | Opt Out                         | Opt Out                           |
      | Contact Us                      | Contact Us                        |

  @NominateTeacherform @OMS
  Scenario: TC081: Verify User is able to submit Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
    And I enter "Automation" as Student First Name in Nominate form
    And I enter "Script" as Student Last Name in Nominate form
    And I enter "Selenium" as Student Campus in Nominate form
    And I enter "4338" as Student Id in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

  @NominateTeacherform @OMS
  Scenario: TC082: Verify Error validation for first name in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    When I click "Submit" button in Nominate form
    Then I should see the "Faculty Member's First Name field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC082: Verify Error validation for last name in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Faculty Member's Last Name field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC083: Verify Error validation for Campus in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Campus field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC084: Verify Error validation for Program in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Campus" as Campus in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Which course(s) did this faculty member teach in your program? field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC084: Verify Error validation for Program in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Campus" as Campus in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Which course(s) did this faculty member teach in your program? field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC085: Verify Error validation for Reason in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Please describe the reason why you believe the faculty member should be recognized as a outstanding faculty member? field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC086: Verify Error validation for Student fist name in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Student's First Name field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC087: Verify Error validation for Student last name in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
    And I enter "Automation" as Student First Name in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Student's Last Name field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC088: Verify Error validation for Student Home Campus  in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
    And I enter "Automation" as Student First Name in Nominate form
    And I enter "Script" as Student Last Name in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Student's Home Campus field is required." Error Meeage in Nominate form

  @NominateTeacherform @OMS
  Scenario: TC089: Verify Error validation for Student ID in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
    And I enter "Automation" as Student First Name in Nominate form
    And I enter "Script" as Student Last Name in Nominate form
    And I enter "Selenium" as Student Campus in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Student ID field is required." Error Meeage in Nominate form
