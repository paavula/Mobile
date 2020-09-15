Feature: Links validations under footer in Strayer Home Page

  @Footer
  Scenario: TC001: Verify Footer module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    Then I should see the "2018 Strayer University" text on footer
    When I Click on footerLogo link
    When I move to footer
    When I Click on ContactUs link
    Then I should see "Contact Us | Request Information | Strayer University" text on ContactUs Page and close tab
    When I Click on Logo Image
    When I move to footerRFI
    Then I should see the "REQUEST INFORMATION" text on footerRFI
    When I Click on Logo Image
    When I move to footerribbon
    Then I should see the "877.445.7180 CHAT NOW REQUEST INFO" text in FooterRibbonModule

  @FooterRFI
  Scenario: TC002: Verify User is able to submit form in Footer in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footerRFI
    Then I should see the "REQUEST INFORMATION" text on footerRFI
    When I select "Masters" as Degree in form
    When I select "MBA" as program of interest in form
    And I enter "Pradeep" as FirstName in form
    And I enter "Kumar" as LastName in form
    And I enter "pradeep@cunet.com" as Email in form
    And I enter "3232344567" as PhoneNumber in form
    And I enter "99501" as Zip in form
    When I click "AgreeandGo" button in form
    Then I should see the "THANK YOU" text on page

  @QuickLinksinFooter
  Scenario: TC003: Verify QuickLink Module is disaplying in Strayer Home Page
    Given User Navigate to Strayer University Application
    When I move to footer
    When I move to QUICKLINKModule
    Then I should see the "QUICK LINK" text in QuickLinksModule
    When I move to MORELINKModule
    Then I should see the "MORE" text in MoreLinksModule
    When I move to LEGALLINKModule
    Then I should see the "LEGAL" text in LegalLinksModule
