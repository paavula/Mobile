Feature: Links validations under Mega menu in Strayer Home Page

  @MegaMenu
  Scenario: TC001: Verify Mega Menus is disaplying in Strayer Home Page
    Given I am on the Home page "https://strayer.edu/" of Staryer Home Page website
    When I move to Degrees Menu
    Then I should see the "DEGREES" text on Degrees Menu
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "ADMISSIONS" text on Strayer ADMISSIONS Menu
    When I move to Tution and Financial AID Menu
    Then I should see the "TUITION & FINANCIAL AID" text on Tution and Financial AID Menu
    When I move to Why Strayer Menu
    Then I should see the "WHY STRAYER" text on Why Strayer Menu

  @DegreeLink
  Scenario Outline: Verify Child Link navigations Under Degree Link in Strayer Home Page
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Degrees Menu
    Then I should see the "<Qualification>" text on Degrees Menu
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab

    Examples: 
      | URL                  | Qualification | Link                           | PageTitle                                     |
      | https://strayer.edu/ | DEGREES       | MBA                            | MBA For Working Professionals                 |
      | https://strayer.edu/ | DEGREES       | Master                         | Online Master's Degree                        |
      | https://strayer.edu/ | DEGREES       | Bachelor                       | Online Bachelor's Degree                      |
      | https://strayer.edu/ | DEGREES       | Course                         | Online College Courses                        |
      | https://strayer.edu/ | DEGREES       | Accounting                     | Online Accounting Degrees                     |
      | https://strayer.edu/ | DEGREES       | Business & Finance             | Online Business Degrees                       |
      | https://strayer.edu/ | DEGREES       | Criminal Justice               | Online Criminal Justice Degrees               |
      | https://strayer.edu/ | DEGREES       | Education & Training           | Online Education Degrees                      |
      | https://strayer.edu/ | DEGREES       | Entrepreneurship MBA           | Strayer's Digital Entrepreneurship MBA        |
      | https://strayer.edu/ | DEGREES       | Health Services Administration | Online Health Services Administration Degrees |
      | https://strayer.edu/ | DEGREES       | Information Technology         | Online Information Technology Degrees         |
      | https://strayer.edu/ | DEGREES       | Leadership & Management MBA    | Jack Welch Management Institute               |
      | https://strayer.edu/ | DEGREES       | Performance Management         | Joe Gibbs Performance Management Programs     |

  @AdmissionsLink
  Scenario Outline: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "<Qualification>" text on Strayer ADMISSIONS Menu
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab

    Examples: 
      | URL                  | Qualification | Link                            | PageTitle                                 |
      | https://strayer.edu/ | ADMISSIONS    | Admissions Process              | College Admission Requirements            |
      | https://strayer.edu/ | ADMISSIONS    | Other Ways to Earn Credits      | Earn College Credit Online                |
      | https://strayer.edu/ | ADMISSIONS    | Personal Education Plan         | Personal Education Plan                   |
      | https://strayer.edu/ | ADMISSIONS    | Apply Now                       | Strayer University Student Application    |
      | https://strayer.edu/ | ADMISSIONS    | Corporate Partnership Employees | Corporate Alliance Partnerships           |
      | https://strayer.edu/ | ADMISSIONS    | Active Duty Military Students   | Military Friendly Online College          |
      | https://strayer.edu/ | ADMISSIONS    | Transfer Students               | Support for Transfer Students             |
      | https://strayer.edu/ | ADMISSIONS    | International Students          | Online Degrees for International Students |

  @TutionFinancialLink
  Scenario Outline: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Tution and Financial AID Menu
    Then I should see the "<Qualification>" text on Tution and Financial AID Menu
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab

    Examples: 
      | URL                  | Qualification           | Link                  | PageTitle                                         |
      | https://strayer.edu/ | TUITION & FINANCIAL AID | Tuition & Fees        | Tuition & Fees: How Much Does Online College Cost |
      | https://strayer.edu/ | TUITION & FINANCIAL AID | Scholarships & Funds  | Online College Scholarships                       |
      | https://strayer.edu/ | TUITION & FINANCIAL AID | Graduation Fund       | Online Colleges with Financial Aid                |
      | https://strayer.edu/ | TUITION & FINANCIAL AID | Financial Aid & Tools | Financial Assistance & Tools                      |
      | https://strayer.edu/ | TUITION & FINANCIAL AID | Net Price Calculator  | Net Price Calculator: Strayer University          |

  @WhyStrayerLink
  Scenario Outline: Verify Child Link navigations Under Admissions Link in Strayer Home Page Mega Menu
    Given I am on the Home page "<URL>" of Staryer Home Page website
    When I move to Why Strayer Menu
    Then I should see the "<Qualification>" text on Why Strayer Menu
    When I Click on "<Link>" link
    Then I should see the "<PageTitle>" text on "<Link>" Page and close tab

    Examples: 
      | URL                  | Qualification | Link               | PageTitle                                       |
      | https://strayer.edu/ | WHY STRAYER   | Respected          | Accredited Online College Degrees               |
      | https://strayer.edu/ | WHY STRAYER   | Affordable         | Affordable Online College Degree Programs       |
      | https://strayer.edu/ | WHY STRAYER   | Flexible           | Online Learning                                 |
      | https://strayer.edu/ | WHY STRAYER   | Innovative         | Innovative Online Learning Program              |
      | https://strayer.edu/ | WHY STRAYER   | For MBA Students   | Online MBA (Masters of Business Administration) |
      | https://strayer.edu/ | WHY STRAYER   | For Master         | Online Master's Degree Programs                 |
      | https://strayer.edu/ | WHY STRAYER   | For Undergraduates | Online Undergraduate Degrees & Courses          |
