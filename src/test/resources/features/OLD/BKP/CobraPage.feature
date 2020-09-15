Feature: CobraPage

  @CobraPageUI
  Scenario: TC001: Verify UI of Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Utility Header
    Then I Should see "We are here to help!" text in Cobra Page Utility Header
    Then I should see "1 (888) 406-2557" phonenumber in Cobra Page Utility Header
    When I move to CobraPage Utility Navigation
    Then I should see "HOME" Link in Cobra Page Utility Navigation
    When I Click on CobraPage Header Logo
    Then I should see the "Cobra Test Page-1" text on "Home" Page and close tab
    When I move to CobraPage Footer
    When I Click on CobraPage Footer Logo
    Then I should see the "Cobra Test Page-1" text on "Home" Page and close tab
    When I move to CobraPage Footer
    Then I should see the "2018 Strayer University" text on Cobra Page footer

  @HeaderNavigation
  Scenario Outline: TC002: Verify Child Link navigations in Header Navigation module in Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Utility Header Link Module
    When I Click on "<Link>" link in Cobra Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle |
      | Home            | Home page |
      | Affordability   | Home page |
      | Programs        | Home page |
      | Online Learning | Home page |
      | Accredation     | Home page |

  @FooterNavigation
  Scenario Outline: TC003: Verify Child Link navigations in Footer module in Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Footer
    When I Click on "<Link>" link in Cobra Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                | PageTitle |
      | Terms of use        | All-comps |
      | Privacy Policy      | All-comps |
      | State licensure     | All-comps |
      | Opt out             | All-comps |
      | Program Disclousers | All-comps |
