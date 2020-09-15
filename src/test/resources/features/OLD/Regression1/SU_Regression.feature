Feature: Strayer Application Regression Suite

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


  @SocialLinks @Regression @EDU
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

  @HomePageFooter @Regression @EDU
  Scenario: TC008: Verify Footer module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    Then I should see the "2020 Strayer University" text on footer
    When I Click on footerLogo Image
    Then I should see the "Strayer University - Accredited Online & On-Campus Degrees" text on StrayerHome Page

  @FooterRFI @Regression @EDU
  Scenario: TC010: Verify User is able to submit form in Footer in Strayer Home Page
    Given User Navigate to EDU Forms Page
    When I move to footerRFI
    And I enter "Footer" as FirstName in form
    And I enter "Form" as LastName in form
    And I enter "footerform@cunet.com" as Email in form
    And I enter "3232344567" as PhoneNumber in Footer form
    And I enter "99501" as Zip in form
    When I click "AgreeandGo" button in form
    Then I should see the "200" Success Response Status code
    Then I should navigate to "Thank You" Thank you page

  @FooterRFIValidations @EDU
  Scenario: TC011: Verify Error validations in Footer form
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

  @QuickLinksinFooter @Regression @EDU
  Scenario: TC012: Verify QuickLink Module is disaplying in Strayer Home Page
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
  Scenario: TC013: Verify Header Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to UtilityHeader
    When I Click on Logo Image in Header
    Then I should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  @FooterLogo @Regression @EDU
  Scenario: TC014: Verify Footer Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I Click on footerLogo Image
    Then I should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  @HomePageBanner @Regression @EDU
  Scenario: TC015: Verify Home page Banner is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I Click on Logo Image in Header
    When I move to HomeBanner
    Then I Should see the "Get the degree you need for the life you want" text on HomeBanner

  @AOSLinksModuleinFooter @Regression @EDU
  Scenario Outline: TC016: Verify Footer Link availble in AOS Module is Global footer
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to AOSModule
    Then I should see the "Areas of Study" text in AOSModule
    When I Click on "<Link>" Footer link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                  | PageTitle                                        |
      | Business              | Accredited Business Degrees Online               |
      | IT                    | Accredited Information Technology Degrees Online |
      | Criminal Justice      | Bachelor's in Criminal Justice Online            |
      | Education             | Master's in Education Online                     |
      | Health Services       | Master's in Healthcare Administration Online     |
      | Public Administration | Master of Public Administration Online           |

  @QuickLinksModuleinFooter @Regression @EDU
  Scenario Outline: TC017: Verify Footer Link availble in QuickLink Module is Global footer
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to QUICKLINKModule
    Then I should see the "Quick Links" text in QuickLinksModule
    When I Click on "<Link>" Footer link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

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

  @MoreQuickLinksModuleinFooter @Regression @EDU
  Scenario Outline: TC018: Verify Footer Link availble in More Module is Global footer
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to MORELINKModule
    Then I should see the "More" text in MoreLinksModule
    When I Click on "<Link>" Footer link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                         | PageTitle                    |
      | Student Consumer Information | Student Consumer Information |
      | Campus Safety                | Campus Safety                |
      | Title IX                     | Strayer University           |
      | Strayer University Blog      | Strayer University Buzz Blog |
      | Contact Us                   | Contact Us                   |

  @LegalQuickLinksModuleinFooter @Regression @EDU
  Scenario Outline: TC019: Verify Footer Link availble in Legal Module is Global footer
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to LEGALLINKModule
    Then I should see the "Legal" text in LegalLinksModule
    When I Click on "<Link>" Footer link
    Then I should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                          | PageTitle                         |
      | Terms of Use                  | Terms of Use                      |
      | Privacy Policy                | Privacy Policy                    |
      | State Licensure/Authorization | State Licensure and Authorization |
      | Site Map                      | Site Map                          |
      | Opt Out                       | Opt Out                           |
      | Contact Us                    | Contact Us                        |

  @Search @Regression @EDU
  Scenario: TC020: Verify User is able to Search Valid Keywods
    Given User Navigate to Error Page
    When I Enter "MBA" text in Searchbox
    Then I Should see the "MBA" text on Search Results
    Then I should see the "Search Results" text and close tab

  @Search_MultiKeywork @Regression @EDU
  Scenario: TC021: Verify User is able to Search Valid Multi Keywods
    Given User Navigate to Error Page
    When I Enter "Strayer MBA" text in Searchbox
    Then I Should see the "Strayer MBA" text on Search Results
    Then I should see the "Search Results" text and close tab

  @Chat @Regression @EDU
  Scenario: TC022: Verify Chat window is disaplying in Strayer Home Page
    Given User Navigate to Error Page
    When I Enter "MBA" text in Searchbox
    Then I Should see the "MBA" text on Search Results
    When I Click on ClickToStart Link
    Then I should see the "Thank you for choosing to chat with us. An agent will be with you shortly." text on ChatWindow

  @SiteMap @Regression @EDU
  Scenario Outline: TC023: Verify User is able to navigate Sitemap page from Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I Click on SiteMap Link
    Then I should see the "<PageTitle>" text on Child "SiteMap" Page and close tab

    Examples: 
      | PageTitle |
      | Site Map  |

  @Accredation @Regression @EDU
  Scenario: TC024: Verify Accredation component module is disaplying in Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Footer
    When I move to CobraPage Accredation
    Then I should see "125+ years of quality higher education" text in Accredation
    Then I should see the Accredation Image
    When I Click on Accredation Link
    Then I should see the "Strayer University Accreditation" text on Accredation window

@BannerRFI @EDU @Regression
  Scenario: TC025: Verify User is able to submit Banner form
    Given User Navigate to EDU Banner Forms Page
    When I move to BannerRFI
    And I enter "Banner" as FirstName in Banner form
    And I enter "Form" as LastName in Banner form
    And I enter "Bannerform@cunet.com" as Email in Banner form
    And I enter "3232377767" as PhoneNumber in Banner form
    And I enter "99501" as Zip in Banner form
    When I click "AgreeandGo" button in Banner form
    Then I should see the "200" Success Response Status code
    Then I should navigate to "Thank You" Thank you page

  @FooterRFI @EDU @Regression
  Scenario: TC026: Verify User is able to submit footer  form
    Given User Navigate to EDU Forms Page
    When I move to footerRFI
    And I enter "Footer" as FirstName in form
    And I enter "Form" as LastName in form
    And I enter "footerform@cunet.com" as Email in form
    And I enter "3232344567" as PhoneNumber in Footer form
    And I enter "99501" as Zip in form
    When I click "AgreeandGo" button in form
    Then I should see the "200" Success Response Status code
    Then I should navigate to "Thank You" Thank you page

  @FooterRFIValidations @EDU @Regression
  Scenario: TC027: Verify Error validations in Footer form
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

  @BannerRFIValidations @EDU @Regression
  Scenario: TC028: Verify Error validations in Banner  form
    Given User Navigate to EDU Banner Forms Page
    When I move to BannerRFI
    When I click "AgreeandGo" button in Banner form
    Then I should see the "*Please enter all required Fields" for FirstName field
    When I move to BannerRFI
    And I enter "Banner" as FirstName in Banner form
    When I click "AgreeandGo" button in Banner form
    Then I should see the "*Please enter all required Fields" for LastName field
    When I move to BannerRFI
    And I enter "Form" as LastName in Banner form
    When I click "AgreeandGo" button in Banner form
    When I move to BannerRFI
    Then I should see the "*Please enter all required Fields" for Email field
    And I enter "Bannerform@cunet.com" as Email in Banner form
    When I click "AgreeandGo" button in Banner form
    Then I should see the "*Please enter all required Fields" for PhoneNumber field
    When I move to BannerRFI
    And I enter "3232344567" as PhoneNumber in Banner form
    When I click "AgreeandGo" button in Banner form
    Then I should see the "*Please enter all required Fields" for ZipCode field
    
    @PEPRFI @EDU
  Scenario: TC029: Verify User is able to submit PEP  form
    Given User Navigate to PEP Form Page
    When I move to PEP RFI
    When I enter "PEP" as FirstName in PEP  Form
    And I enter "Form" as LastName in PEP Form
    And I enter "pepform@cunet.com" as Email in PEP Form
    And I enter "3232344567" as PhoneNumber in PEP Form
    And I enter "99501" as Zip in PEP Form
    When I click "AgreeandGo" button in PEP Form
    Then I should see the "200" Success Response Status code
    Then I should navigate to "Thank You" Thank you page