Feature: Strayer Home Page

  @MegaMenu @MegaMenuValidations @HomePage
  Scenario: TC001: Verify Mega Menus is disaplying in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu/" of Staryer Home Page website
    When I move to Degrees Menu
    Then I should see the "DEGREES" text on Degrees Menu
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "ADMISSIONS" text on Strayer ADMISSIONS Menu
    When I move to Tution and Financial AID Menu
    Then I should see the "TUITION & FINANCIAL AID" text on Tution and Financial AID Menu
    When I move to Why Strayer Menu
    Then I should see the "WHY STRAYER" text on Why Strayer Menu

  @DegreeLink @MegaMenuValidations @HomePage
  Scenario Outline: TC002:Verify Child Link navigations Under Degree Link in Strayer Home Page
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Degrees Menu
    Then I should see the "<Qualification>" text on Degrees Menu
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab

    Examples: 
      | URL                         | Qualification | Link                           | PageTitle                                     |
      | https://qawww2.strayer.edu/ | DEGREES       | MBA                            | MBA For Working Professionals                 |
      | https://qawww2.strayer.edu/ | DEGREES       | Master                         | Online Master's Degree                        |
      | https://qawww2.strayer.edu/ | DEGREES       | Bachelor                       | Online Bachelor's Degree                      |
      | https://qawww2.strayer.edu/ | DEGREES       | Course                         | Online College Courses                        |
      | https://qawww2.strayer.edu/ | DEGREES       | Accounting                     | Online Accounting Degrees                     |
      | https://qawww2.strayer.edu/ | DEGREES       | Business & Finance             | Online Business Degrees                       |
      | https://qawww2.strayer.edu/ | DEGREES       | Criminal Justice               | Online Criminal Justice Degrees               |
      | https://qawww2.strayer.edu/ | DEGREES       | Education & Training           | Online Education Degrees                      |
      | https://qawww2.strayer.edu/ | DEGREES       | Entrepreneurship MBA           | Strayer's Digital Entrepreneurship MBA        |
      | https://qawww2.strayer.edu/ | DEGREES       | Health Services Administration | Online Health Services Administration Degrees |
      | https://qawww2.strayer.edu/ | DEGREES       | Information Technology         | Online Information Technology Degrees         |
      | https://qawww2.strayer.edu/ | DEGREES       | Leadership & Management MBA    | Jack Welch Management Institute               |
      | https://qawww2.strayer.edu/ | DEGREES       | Performance Management         | Joe Gibbs Performance Management Programs     |

  @AdmissionsLink @MegaMenuValidations @HomePage
  Scenario Outline: TC003: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "<Qualification>" text on Strayer ADMISSIONS Menu
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab

    Examples: 
      | URL                         | Qualification | Link                            | PageTitle                                 |
      | https://qawww2.strayer.edu/ | ADMISSIONS    | Admissions Process              | College Admission Requirements            |
      | https://qawww2.strayer.edu/ | ADMISSIONS    | Other Ways to Earn Credits      | Earn College Credit Online                |
      | https://qawww2.strayer.edu/ | ADMISSIONS    | Personal Education Plan         | Personal Education Plan                   |
      | https://qawww2.strayer.edu/ | ADMISSIONS    | Apply Now                       | Strayer University Student Application    |
      | https://qawww2.strayer.edu/ | ADMISSIONS    | Corporate Partnership Employees | Corporate Alliance Partnerships           |
      | https://qawww2.strayer.edu/ | ADMISSIONS    | Active Duty Military Students   | Military Friendly Online College          |
      | https://qawww2.strayer.edu/ | ADMISSIONS    | Transfer Students               | Support for Transfer Students             |
      | https://qawww2.strayer.edu/ | ADMISSIONS    | International Students          | Online Degrees for International Students |

  @TutionFinancialLink @MegaMenuValidations @HomePage
  Scenario Outline: TC004: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Tution and Financial AID Menu
    Then I should see the "<Qualification>" text on Tution and Financial AID Menu
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab

    Examples: 
      | URL                         | Qualification           | Link                  | PageTitle                                         |
      | https://qawww2.strayer.edu/ | TUITION & FINANCIAL AID | Tuition & Fees        | Tuition & Fees: How Much Does Online College Cost |
      | https://qawww2.strayer.edu/ | TUITION & FINANCIAL AID | Scholarships & Funds  | Online College Scholarships                       |
      | https://qawww2.strayer.edu/ | TUITION & FINANCIAL AID | Graduation Fund       | Online Colleges with Financial Aid                |
      | https://qawww2.strayer.edu/ | TUITION & FINANCIAL AID | Financial Aid & Tools | Financial Assistance & Tools                      |
      | https://qawww2.strayer.edu/ | TUITION & FINANCIAL AID | Net Price Calculator  | Net Price Calculator: Strayer University          |

  @WhyStrayerLink @MegaMenuValidations @HomePage
  Scenario Outline: TC005: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Why Strayer Menu
    Then I should see the "<Qualification>" text on Why Strayer Menu
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab

    Examples: 
      | URL                         | Qualification | Link               | PageTitle                                       |
      | https://qawww2.strayer.edu/ | WHY STRAYER   | Respected          | Accredited Online College Degrees               |
      | https://qawww2.strayer.edu/ | WHY STRAYER   | Affordable         | Affordable Online College Degree Programs       |
      | https://qawww2.strayer.edu/ | WHY STRAYER   | Flexible           | Online Learning                                 |
      | https://qawww2.strayer.edu/ | WHY STRAYER   | Innovative         | Innovative Online Learning Program              |
      | https://qawww2.strayer.edu/ | WHY STRAYER   | For MBA Students   | Online MBA (Masters of Business Administration) |
      | https://qawww2.strayer.edu/ | WHY STRAYER   | For Master         | Online Master's Degree Programs                 |
      | https://qawww2.strayer.edu/ | WHY STRAYER   | For Undergraduates | Online Undergraduate Degrees & Courses          |

  @UtilityHeader @HomePage
  Scenario: TC006: Verify Footer module is disaplying in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu/" of Staryer Home Page website
    When I move to UtilityHeader
    When I Click on CampusLocationLink Link
    Then I should see the "Colleges Near You | Campus Locations | Strayer University" text on CampusLocation Page
    When I Click on Logo Image
    When I Click on CampusLoginLink Link
    Then I should see the "iCampus Login" text on CampusLogin Page
    Then I close tab
    When I Click on Logo Image
    When I Click on ApplyNowLink Link
    Then I should see the "Strayer University Student Application" text on ApplyNowLink Page
    Then I close tab
    When I Click on Searchbox
    Then I Should enter "MBA" text in Searchbox
    Then I Should see the "MBA" text on Searchbox

  @SocialLinks @HomePage
  Scenario Outline: TC007: Verify Social Links module is disaplying in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu/" of Staryer Home Page website
    When I move to footer
    Then I should see the "Contact Us" text on footer
    When I move to SocialLink
    Then I should see the "CONNECT WITH US" text on SocialLink
    When I Click on "<Icon>" icon
    Then I should see the "<PageTitle>" text on "<Icon>" iconPage and close tab

    Examples: 
      | Icon      | PageTitle                                                             |
      | facebook  | Strayer University - Home                                             |
      | twitter   | Strayer University (@StrayerU)                                        |
      | linkedin  | Strayer University                                                    |
      | youtube   | Strayer University - YouTube                                          |
      | instagram | Strayer University (@strayeruniversity) • Instagram photos and videos |
      | pinterest | Strayer University (strayeru) on Pinterest                            |
      | buzz      | Strayer University Buzz Blog                                          |

  @Footer @HomePage
  Scenario: TC008: Verify Footer module is disaplying in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu/" of Staryer Home Page website
    When I move to footer
    Then I should see the "2018 Strayer University" text on footer
    When I Click on footerLogo link
    When I move to footer
    When I Click on ContactUs link
    Then I should see "Contact Us | Request Information | Strayer University" text on ContactUs Page and close tab
    When I Click on Logo Image
    When I move to footerRFI
    Then I should see the "REQUEST INFORMATION" text on footerRFI

  @FooterRibbon @HomePage
  Scenario: TC009: Verify Footer Ribbon module is disaplying in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu" of Staryer Home Page website
    When I move to footerribbon
    Then I should see the "877.445.7180" text in FooterRibbonModule

  @FooterRFI @HomePage
  Scenario: TC010: Verify User is able to submit form in Footer in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu" of Staryer Home Page website
    When I move to footerRFI
    Then I should see the "REQUEST INFORMATION" text on footerRFI
    When I select "MBA" as Degree in form
    When I select "Business Administration" as program of interest in form
    And I enter "QA First Name" as FirstName in form
    And I enter "QA Last Name" as LastName in form
    And I enter "qa@qa.com" as Email in form
    And I enter "8771431232" as PhoneNumber in form
    And I enter "12345" as Zip in form
    And I check "no" as MilitaryAffiliation in form
    When I click "AgreeandGo" button in form
    Then I should see the "Error while processing /content/strayer/en" text on page

  @QuickLinksinFooter @HomePage
  Scenario: TC011: Verify QuickLink Module is disaplying in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu" of Staryer Home Page website
    When I move to footer
    When I move to QUICKLINKModule
    Then I should see the "QUICK LINK" text in QuickLinksModule
    When I move to MORELINKModule
    Then I should see the "MORE" text in MoreLinksModule
    When I move to LEGALLINKModule
    Then I should see the "LEGAL" text in LegalLinksModule

  @HeaderLogo @HomePage
  Scenario: TC012: Verify Header Logo is disaplying in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu" of Staryer Home Page website
    When I move to UtilityHeader
    When I Click on Logo Image
    Then I should see the "Home Page" text on StrayerHome Page

  @FooterLogo @HomePage
  Scenario: TC013: Verify Footer Logo is disaplying in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu" of Staryer Home Page website
    When I move to footer
    When I Click on footerLogo link
    Then I should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  @HomePageBanner @HomePage
  Scenario Outline: TC014: Verify Home page Banner is disaplying in Strayer Home Page
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to HomeBanner
    Then I Should see the "YOUR FUTURE IS AFFORDABLE" text on HomeBanner
    When I Click on "<button>" Button
    Then I should see the "<PageTitle>" text on "<button>" Page and close tab

    Examples: 
      | URL                         | button               | PageTitle |
      | https://qawww2.strayer.edu/ | FIND A NEARBY CAMPUS | Home Page |
      | https://qawww2.strayer.edu/ | BROWSE OUR PROGRAMS  | Home Page |
      | https://qawww2.strayer.edu/ | THE GRADUATION FUND  | Home Page |

  @HomePae @DegreeMenu
  Scenario Outline: TC015: Verify Child Links are avaliable under Degree Menu in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu/" of Staryer Home Page website
    When I move to Degrees Menu
    Then I should see the "DEGREES" text on Degrees Menu
    When I move to Degrees ChildLinksModule
    Then I should see the "<Link>" text on Degress ChildLinksModule

    Examples: 
      | Link                           |
      | DEGREES & PROGRAMS             |
      | MBA                            |
      | Master's Degrees               |
      | Bachelor's Degrees             |
      | Associate Degrees              |
      | Certificates                   |
      | Course Catalog                 |
      | AREAS OF INTEREST              |
      | Accounting                     |
      | Business & Finance             |
      | Criminal Justice               |
      | Education & Training           |
      | Entrepreneurship MBA           |
      | Health Services Administration |
      | Information Technology         |
      | Leadership & Management MBA    |
      | Performance Management         |

  @Homepage @AdmissionsMenu
  Scenario Outline: TC015: Verify Child Links are avaliable under Admissions Menu in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu" of Staryer Home Page website
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "ADMISSIONS" text on Strayer ADMISSIONS Menu
    When I move to ADMISSIONS ChildLinksModule
    Then I should see the "<Link>" text on ADMISSIONS ChildLinksModule

    Examples: 
      | Link                            |
      | ADMISSIONS                      |
      | Admissions Process              |
      | Other Ways to Earn Credits      |
      | Personal Education Plan         |
      | Apply Now                       |
      | SPECIAL INFORMATION FOR         |
      | Corporate Partnership Employees |
      | Active Duty Military Students   |
      | Transfer Students               |
      | International Students          |

  @HomePage @Tutions
  Scenario Outline: TC016: Verify Child Links are avaliable under TUITION & FINANCIAL AID Menu in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu" of Staryer Home Page website
    When I move to Tution and Financial AID Menu
    Then I should see the "TUITION & FINANCIAL AID" text on Tution and Financial AID Menu
    When I move to TUITION ChildLinksModule
    Then I should see the "<Link>" text on TUITION ChildLinksModule

    Examples: 
      | Link                  |
      | Tuition & Fees        |
      | Graduation Fund       |
      | Financial Aid & Tools |
      | Net Price Calculator  |

  @Homepage @WhyStrayer
  Scenario Outline: TC017: Verify Child Links are avaliable under WHY STRAYER Menu in Strayer Home Page
    Given I am on the Home page "https://qawww2.strayer.edu" of Staryer Home Page website
    When I move to Why Strayer Menu
    Then I should see the "WHY STRAYER" text on Why Strayer Menu
    When I move to WHYSTRAYER ChildLinksModule
    Then I should see the "<Link>" text on WHYSTRAYER ChildLinksModule

    Examples: 
      | Link                  |
      | HOW WE'RE DIFFERENT   |
      | Respected             |
      | Affordable            |
      | Flexible              |
      | Innovative            |
      | STUDENT EXPERIENCE    |
      | For MBA Students      |
      | For Master's Students |
      | For Undergraduates    |
      
      

 @DegreeLink @MegaMenuValidations @HomePage
  Scenario Outline: TC002:Verify Child Link navigations Under Degree Link in Strayer Home Page
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Degrees Menu
    Then I should see the "<Qualification>" text on Degrees Menu
    When I move to Degrees ChildLinksModule
    Then I should see the "<Child_Link>" text on Degress ChildLinksModule
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab
    
|Qualification 	|Child_Link      								|Link  													|PageTitle  																		|
|DEGREES  			|MBA 														|MBA   													|MBA For Working Professionals  								|
|DEGREES   			|Master's Degrees								|Master													|Online Master's Degree    											|
|DEGREES   			|Bachelor's Degrees 						|Bachelor   										|Online Bachelor's Degree  											|
|DEGREES   			|Associate Degrees							|
|DEGREES   			|Certificates    								|
|DEGREES   			|Course Catalog  								|Course                         | Online College Courses                        |
|DEGREES   			|Accounting 										|Accounting                     | Online Accounting Degrees                     |
|DEGREES   			|Business & Finance 						|Business & Finance             | Online Business Degrees                       |
|DEGREES   			|Criminal Justice								|Criminal Justice               | Online Criminal Justice Degrees               |
|DEGREES   			|Education & Training 					|Education & Training           | Online Education Degrees                      |
|DEGREES   			|Entrepreneurship MBA 					|Entrepreneurship MBA           | Strayer's Digital Entrepreneurship MBA        |
|DEGREES   			|Health Services Administration |Health Services Administration | Online Health Services Administration Degrees |
|DEGREES   			|Information Technology    			|Information Technology         | Online Information Technology Degrees         |
|DEGREES   			|Leadership & Management MBA    |Leadership & Management MBA    | Jack Welch Management Institute               |
|DEGREES   			|Performance Management    			|Performance Management         | Joe Gibbs Performance Management Programs     |
