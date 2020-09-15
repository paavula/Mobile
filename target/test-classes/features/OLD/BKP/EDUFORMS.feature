Feature: EDU FOOTER FORM

  @FooterRFI
  Scenario Outline: TC002: Verify User is able to submit form in Footer in Strayer Home Page
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in form
    And I enter "Kumar" as LastName in form
    And I enter "<EMAIL>" as Email in form
    And I enter "3232344567" as PhoneNumber in form
    And I enter "99501" as Zip in form
    When I click "AgreeandGo" button in form
    Then I should see the "200" Response Status code
    Then I should see the "Thank You | Strayer University" text on page

    Examples: 
      | URL                                                             | EMAIL              |
      | https://www.strayer.edu/                                    |prdauto1@cunet.com  |
      | https://www.strayer.edu/academic-program-disclosure         |prdauto2@cunet.com  |
      | https://www.strayer.edu/admissions                          |prdauto3@cunet.com  |
      | https://www.strayer.edu/alpha                               |prdauto5@cunet.com  |
      | https://www.strayer.edu/b                                   |prdauto6@cunet.com  |
      | https://www.strayer.edu/campus-locations                    |prdauto7@cunet.com  |
      | https://www.strayer.edu/careers                             |prdauto8@cunet.com  |
      | https://www.strayer.edu/decatur                             |prdauto10@cunet.com |
      | https://www.strayer.edu/decatur/confirmation                |prdauto11@cunet.com |
      | https://www.strayer.edu/ferpa                               |prdauto12@cunet.com |
      | https://www.strayer.edu/flexible-gradfundradio              |prdauto13@cunet.com |
      | https://www.strayer.edu/flexible-mbaradio                   |prdauto14@cunet.com |
      | https://www.strayer.edu/irving                              |prdauto15@cunet.com |
      | https://www.strayer.edu/launch                              |prdauto16@cunet.com |
      | https://www.strayer.edu/online-college-courses              |prdauto17@cunet.com |
      | https://www.strayer.edu/buzz/learning-your-time             |prdauto56@cunet.com |
      | https://www.strayer.edu/buzz/maintaining-professional-image |prdauto58@cunet.com |

  @FooterRFI
  Scenario Outline: TC001: Verify User is able to submit form in Footer in Strayer Home Page
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in form
    And I enter "Kumar" as LastName in form
    And I enter "<EMAIL>" as Email in form
    And I enter "3232344567" as PhoneNumber in form
    And I enter "99501" as Zip in form
    When I click "AgreeandGo" button in form
    Then I should see the "200" Response Status code
    Then I should see the "Thank You | Strayer University" text on page

    Examples: 
      | URL                                                                                                                                                                                                        | EMAIL                |
      | https://www.strayer.edu/?AffiliateID=TestAffId                                                                                                                                                         | edufroms2@cunet.com  |
      | https://www.strayer.edu/?MarketingCode=Test123                                                                                                                                                         | edufroms3@cunet.com  |
      | https://www.strayer.edu/?Partner=TestPart                                                                                                                                                              | edufroms4@cunet.com  |
      | https://www.strayer.edu/?GCLID=Testgclid                                                                                                                                                               | edufroms5@cunet.com  |
      | https://www.strayer.edu/?permguid=testuid                                                                                                                                                              | edufroms6@cunet.com  |
      | https://www.strayer.edu/?userguid=testuid                                                                                                                                                              | edufroms7@cunet.com  |
      | https://www.strayer.edu/?aoid=TestAoid1234&MarketingCode=Test123&userguid=testuid&GCLID=Testgclid&Partner=TestPart                                                                                     | edufroms8@cunet.com  |
      | https://www.strayer.edu/?MarketingCode=Test123&sessguid=test&userguid=test&permguid=test&gclid=abc123&AffiliateID=TestAffId1234&Partner=Pan_QL_Creative1                                               | edufroms9@cunet.com  |
      | https://www.strayer.edu/?MarketingCode=DG111&CR=TestCR&PL=TestPL&KW=TestKW&Keyword=TestKeyword&AFFID=TestAFFID&Matchtype=TestMatchtype&creative=TestCreative&GCLID=TEstgCLID&userguid=test&LPT=TestLPT | edufroms10@cunet.com |
      | https://www.strayer.edu/campus-locations/pennsylvania                                                                                                                                                  | edufroms11@cunet.com |
