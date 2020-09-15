Feature: VC Smoke Suite

  @VCMegaMenuValidations
  Scenario: TC001: Verify Mega Menus is disaplying in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Capella Exp Menu
    Then User should see the "CAPELLA EXPERIENCE" text on Capella Expereince Menu
    When User move to Financing Menu
    Then User should see the "FINANCING" text on Financing Menu
    When User move to Apply Menu
    Then User should see the "APPLY" text on Apply Menu

  @DegreeChildLinkValidations
  Scenario Outline: TC002:Verify Child Link navigations Under Degree and Program Link in Capella Home Page
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

  @ApplyLinkValidations
  Scenario Outline: TC003:Verify Child Link navigations Under Apply Link in Capella Home Page
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

  @CapellaResultsLinkValidations
  Scenario Outline: TC013:Verify Child Link navigations Under CAPELLA RESULTS Link in Capella Home Page Footer
    Given User is on Capella Home Page
    Then User move to VC Footer
    Then User should see the "CAPELLA RESULTS" text on Capella Results Module
    Then User should see the "<Footer_Link>" Child link Module
    When User Click on Child "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Footer_Link          | Link              | PageTitle         |
      | collapsepartnerTeams | Learning Outcomes | Learning Outcomes |

  @FooterLinkValidations
  Scenario Outline: TC015:Verify Fooer Link navigations  in Capella Home Page Footer
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

  @ScheduleConsultationFormVerification-2
  Scenario Outline: TC018:Verify  Schedule Consultation form is displaying in Key Pages
    Given User Navigate to " <URL>" page
    Then User move to Get The Details Module
    When User Click on  "<Button>" Button
    Then User should see Schedule Consultation Modal popup form

    Examples: 
      | URL                                                                  | Button                |
      | https://www.capella.edu/online-degrees/masters-msn-care-coordination | Schedule Consultation |
      | https://www.capella.edu/online-degrees/mba-health-care-management    | Schedule Consultation |
