Feature: DragonPage

  @DragonPageUI
  Scenario: TC001: Verify UI of Dragon Page
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Utility Header
    Then I Should see "We're here to help!" text in Utility Header
    Then I should see "1 (877) 217-3418" phonenumber in Utility Header
    When I move to DragonPage Utility Navigation
    Then I should see "TUITION COSTS" Link in Utility Navigation
    When I Click on DragonPage Header Logo
    Then I should see the "Dragon page" text on "Home" Page and close tab
    When I move to DragonPage Footer
    When I Click on DragonPage Footer Logo
    Then I should see the "Dragon page" text on "Home" Page and close tab
		When I move to DragonPage Footer
		Then I should see the "2019 Strayer University" text on LinkedIn Page footer
		
  @HeaderNavigation
  Scenario Outline: TC002: Verify Child Link navigations in Header Navigation module in Dragon Page
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Utility Header Link Module
    When I Click on "<Link>" link in Dragon Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link          | PageTitle |
      | TUITION COSTS | Home page |
      | FLEXIBILITY   | Home page |
      | PROGRAMS      | Home page |
      | ACCREDITATION | Home page |

  @FooterNavigation
  Scenario Outline: TC003: Verify Child Link navigations in Footer module in Dragon Page
    Given User Navigate to Dragon Template Page
    When I move to DragonPage Footer
    When I Click on "<Link>" link in Dragon Page
    Then I should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                | PageTitle |
      | TERMS OF USE        | All-comps |
      | PRIVACY POLICY      | All-comps |
      | STATE LICENSURE     | All-comps |
      | OPT OUT             | All-comps |
      | Program Disclosures | All-comps |
