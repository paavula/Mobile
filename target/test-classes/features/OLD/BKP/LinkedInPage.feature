Feature: LinkedInPage

 @LinkedInPageUI @Sprint-2-Regression
  Scenario: TC031: Verify UI of LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When I move to LinkedInPage Utility Navigation
    Then I should see "ACCREDITATION" Link in LinkedInpage Utility Navigation
    When I Click on LinkedInPage Header Logo
    Then I should see the "LinkedIn Page" text on "Home" Page and close tab
    When I move to LinkedInPage Footer
    When I Click on LinkedInPage Footer Logo
    Then I should see the "LinkedIn Page" text on "Home" Page and close tab
    When I move to LinkedInPage Footer
    Then I should see the "2019 Strayer University" text on LinkedIn Page footer

  @HeaderNavigationinLinkedInPage @Sprint-2-Regression
  Scenario Outline: TC032: Verify Child Link navigations in Header Navigation module in LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When I move to LinkedInPage Utility Header Link Module
    When I Click on "<Link>" link in LinkedIn Page
    Then I should see the "<PageTitle>" text in LinkedIn Page and close tab

    Examples:
      | Link            | PageTitle                                        |
      | AFFORDABILITY   |Strayer University: Accredited Online College |
      | PROGRAMS        | Strayer University: Accredited Online College |
      | ONLINE LEARNING | Strayer University: Accredited Online College |
      | ACCREDITATION   |Strayer University: Accredited Online College |

  @FooterNavigationinLinkedInPage @Sprint-2-Regression
  Scenario Outline: TC033: Verify Child Link navigations in Footer module in LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When I move to LinkedInPage Footer
    When I Click on "<Link>" link in LinkedIn Page
    Then I should see the "<PageTitle>" text and close tab

    Examples:
      | Link                | PageTitle             |
      | TERMS OF USE        | Terms of Use          |
      | PRIVACY POLICY      | Privacy Policy        |
      | STATE LICENSURE     | LinkedIn Page         |
      | OPT OUT             | LinkedIn Page         |
      | PROGRAM DISCLOSURES | Academic Program List |