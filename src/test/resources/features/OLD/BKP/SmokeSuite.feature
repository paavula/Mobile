Feature: SmokeTest Suite

  @MegaMenu
  Scenario: TC001: Verify Mega Menus is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to Degrees Menu
    Then I should see the "DEGREES" text on Degrees Menu
    When I move to Strayer ADMISSIONS Menu
    Then I should see the "ADMISSIONS" text on Strayer ADMISSIONS Menu
    When I move to Tution and Financial AID Menu
    Then I should see the "TUITION & FINANCIAL AID" text on Tution and Financial AID Menu
    When I move to Why Strayer Menu
    Then I should see the "WHY STRAYER" text on Why Strayer Menu

  @UtilityNavigation
  Scenario: TC002: Verify Utility Navigation Menus is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to UtilityHeader
    When I Click on CampusLocationLink Link
    Then I should see the "Home Page" text on CampusLocation Page
    Then I close tab
    When I Click on Logo Image
    When I Click on CampusLoginLink Link
    Then I should see the "iCampus Login" text on CampusLogin Page
    Then I close tab
    When I Click on Logo Image
    When I Click on ApplyNowLink Link
    Then I should see the "Strayer University: Accredited Online University" text on ApplyNowLink Page
    Then I close tab
    When I Click on Searchbox
    #Then I Should see the "" text on Searchbox

  @SearchFunctionality
  Scenario: TC003: Verify Search results are disaplying in Search Results box in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to UtilityHeader
    When I Click on Searchbox
    Then I Should enter "MBA" text in Searchbox
    Then I Should see the "MBA" text on Searchbox

  @HeaderLogo
  Scenario: TC004: Verify Header Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to UtilityHeader
    When I Click on Logo Image
    Then I should see the "Home Page" text on StrayerHome Page

  @Footer
  Scenario: TC005: Verify footer module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    Then I should see the "2018 Strayer University" text on footer

  @FooterRibbon
  Scenario: TC006: Verify Footer Ribbon module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footerribbon
    Then I should see the "877.445.7180" text in FooterRibbonModule

  @FooterRFI
  Scenario: TC007: Verify footer RFI module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footerRFI
    Then I should see the "REQUEST INFORMATION" text on footerRFI

  @SocialLinks
  Scenario: TC008: Verify Social Links module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    Then I should see the "Contact Us" text on footer
    When I move to SocialLink
    Then I should see the "CONNECT WITH US" text on SocialLink

  @FooterLogo
  Scenario: TC009: Verify Footer Logo is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I Click on footerLogo link
    Then I should see the "Strayer University: Accredited Online University" text on StrayerHome Page

  @QuickLinksinFooter
  Scenario: TC010: Verify QuickLink Module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to QUICKLINKModule
    Then I should see the "QUICK LINK" text in QuickLinksModule
    When I move to MORELINKModule
    Then I should see the "MORE" text in MoreLinksModule
    When I move to LEGALLINKModule
    Then I should see the "LEGAL" text in LegalLinksModule
    
    Scenario: TC011: Verify Tab Component is avaliable in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to TabComponent
    When I move to MastersTab
    Then I should see "Tab 1" text on MastersTab
    When I move to BacheloresTab
    Then I should see "Tab 2" text on BacheloresTab
    When I move to AssociatesTab
    Then I should see "Tab 3" text on AssociatesTab
    When I move to CertificatesTab
    Then I should see "Tab 4" text on CertificatesTab
