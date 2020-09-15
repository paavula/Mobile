Feature: Link Navigations

 @MegaMenuValidationsinHomePage
  Scenario: TC001: Verify Mega Menus is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to Degrees Menu
    Then I should see the "Degrees" text on Degrees Menu
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "Admissions" text on Strayer ADMISSIONS Menu
    When I move to Tution and Financial AID Menu
    Then I should see the "Tuition & Aid" text on Tution and Financial AID Menu
    When I move to Why Strayer Menu
    Then I should see the "Why Strayer" text on Why Strayer Menu

  @UtilityHeaderinHomePage
  Scenario: TC002: Verify UtilityHeader module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to UtilityHeader
    When I Click on CampusLocationLink Link
    Then I should see the "Campus Locations" text on CampusLocation Page
    When I Click on Logo Image
    When I move to UtilityHeader
    When I Click on CampusLoginLink Link
    Then I should see the "iCampus Login" text on CampusLogin Page
    Then I close tab
    Given User Navigate to Strayer University Application
    When I move to UtilityHeader
    When I Click on ApplyNowLink Link
    Then I should see the "Strayer University Student Application" text on ApplyNowLink Page
    Then I close tab
    