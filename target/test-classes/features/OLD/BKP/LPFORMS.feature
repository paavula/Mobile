Feature: EDU FOOTER FORM

  @LinkedInpageForm @LinkedIn
  Scenario Outline: TC004: Verify User is able to submit form in Linked In page
    Given User Navigate to " <URL>" page
    And I enter "Ind" as FirstName in LinkedIn form
    And I enter "Team" as LastName in LinkedIn form
    And I enter "<EMAIL>" as Email in LinkedIn form
    And I enter "3232344567" as PhoneNumber in LinkedIn form
    And I enter "99501" as Zip in LinkedIn form
    When I click "Submit" button in LinkedIn form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                  | EMAIL                 |
      | https://stglinkedin2.strayer.edu/mba | linkedform1@cunet.com |
      | https://stglinkedin2.strayer.edu/bba | linkedform2@cunet.com |

  @ShortForm @Succeed
  Scenario Outline: TC041: Verify User is able to submit Short form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Short form
    And I enter "Kumar" as LastName in Short form
    And I enter "<EMAIL>" as Email in Short form
    And I enter "3232344567" as PhoneNumber in Short form
    And I enter "99501" as Zip in Short form
    When I click "AgreeandGo" button in Short form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                                                                                                                                                                                                  | EMAIL                 |
      | https://stgsucceed2.strayer.edu/information-technology                                                                                                                                                                               | shortform1@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?AffiliateID=TestAffId                                                                                                                                                         | shortform2@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?MarketingCode=Test123                                                                                                                                                         | shortform3@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?Partner=TestPart                                                                                                                                                              | shortform4@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?GCLID=Testgclid                                                                                                                                                               | shortform5@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?permguid=testuid                                                                                                                                                              | shortform6@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?userguid=testuid                                                                                                                                                              | shortform7@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?aoid=TestAoid1234&MarketingCode=Test123&userguid=testuid&GCLID=Testgclid&Partner=TestPart                                                                                     | shortform8@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?MarketingCode=Test123&sessguid=test&userguid=test&permguid=test&gclid=abc123&AffiliateID=TestAffId1234&Partner=Pan_QL_Creative1                                               | shortform9@cunet.com  |
      | https://stgsucceed2.strayer.edu/information-technology?MarketingCode=DG111&CR=TestCR&PL=TestPL&KW=TestKW&Keyword=TestKeyword&AFFID=TestAFFID&Matchtype=TestMatchtype&creative=TestCreative&GCLID=TEstgCLID&userguid=test&LPT=TestLPT | shortform10@cunet.com |
      | https://stgsucceed2.strayer.edu/criminal-justice                                                                                                                                                                                     | shortform11@cunet.com |
      | https://stgsucceed2.strayer.edu/masters                                                                                                                                                                                              | shortform12@cunet.com |
      | https://stgsucceed2.strayer.edu/business                                                                                                                                                                                             | shortform13@cunet.com |
      | https://stgsucceed2.strayer.edu/mba                                                                                                                                                                                                  | shortform14@cunet.com |
      | https://stgsucceed2.strayer.edu/dc-md-scholarship                                                                                                                                                                                    | shortform15@cunet.com |
      | https://stgachieve2.strayer.edu/marketing                                                                                                                                                                                            | shortform16@cunet.com |
      | https://stgbegin2.strayer.edu                                                                                                                                                                                                        | shortform17@cunet.com |
      | https://stgdegrees2.strayer.edu/applied-science                                                                                                                                                                                      | shortform18@cunet.com |
      | https://stgafford2.strayer.edu/information-technology                                                                                                                                                                                | shortform19@cunet.com |
      | https://stgafford2.strayer.edu/accounting                                                                                                                                                                                            | shortform20@cunet.com |
      | https://stgafford2.strayer.edu/criminal-justice                                                                                                                                                                                      | shortform21@cunet.com |
      | https://stgafford2.strayer.edu/business                                                                                                                                                                                              | shortform22@cunet.com |
      | https://stgafford2.strayer.edu/health-services                                                                                                                                                                                       | shortform23@cunet.com |
      | https://stgafford2.strayer.edu/applied-science                                                                                                                                                                                       | shortform24@cunet.com |
      | https://stgafford2.strayer.edu/mba                                                                                                                                                                                                   | shortform25@cunet.com |
      | https://stgafford2.strayer.edu/masters                                                                                                                                                                                               | shortform26@cunet.com |
      | https://stgcusa2.strayer.edu/mba                                                                                                                                                                                                     | shortform27@cunet.com |
      | https://stgcusa2.strayer.edu/masters                                                                                                                                                                                                 | shortform28@cunet.com |
      | https://stgstudy2.strayer.edu/mba                                                                                                                                                                                                    | shortform29@cunet.com |
      | https://stgstudy2.strayer.edu/masters                                                                                                                                                                                                | shortform30@cunet.com |
      | https://stgbemore2.strayer.edu/charles                                                                                                                                                                                               | shortform31@cunet.com |
      | https://stgbemore2.strayer.edu/crystal                                                                                                                                                                                               | shortform32@cunet.com |
      | https://stgbemore2.strayer.edu/fos                                                                                                                                                                                                   | shortform33@cunet.com |
      | https://stgbemore2.strayer.edu/nick                                                                                                                                                                                                  | shortform34@cunet.com |
      | https://stgbemore2.strayer.edu/dc-md-scholarship                                                                                                                                                                                     | shortform35@cunet.com |
      | https://stgbemore2.strayer.edu/laptopb                                                                                                                                                                                               | shortform36@cunet.com |

  @ShortFormwithDropdown @Succeed
  Scenario Outline: TC041: Verify User is able to submit Short form
    Given User Navigate to " <URL>" page
    When I move to Short form
    When I select "MBA" as Degree in Short form
    And I select "Business Administration" as program of interest in Short form
    And I enter "Deepu" as FirstName in Short form
    And I enter "Kumar" as LastName in Short form
    And I enter "<EMAIL>" as Email in Short form
    And I enter "3232344567" as PhoneNumber in Short form
    And I enter "99501" as Zip in Short form
    When I click "AgreeandGo" button in Short form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                                                                                                                                                                                             | EMAIL                   |
      | https://stgsucceed2.strayer.edu/military-benefits                                                                                                                                                                               | shortformdd@cunet.com   |
      | https://stgsucceed2.strayer.edu/military-benefits                                                                                                                                                                               | shortformdd1@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?AffiliateID=TestAffId                                                                                                                                                         | shortformdd2@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?MarketingCode=Test123                                                                                                                                                         | shortformdd3@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?Partner=TestPart                                                                                                                                                              | shortformdd4@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?GCLID=Testgclid                                                                                                                                                               | shortformdd5@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?permguid=testuid                                                                                                                                                              | shortformdd6@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?userguid=testuid                                                                                                                                                              | shortformdd7@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?aoid=TestAoid1234&MarketingCode=Test123&userguid=testuid&GCLID=Testgclid&Partner=TestPart                                                                                     | shortformdd8@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?MarketingCode=Test123&sessguid=test&userguid=test&permguid=test&gclid=abc123&AffiliateID=TestAffId1234&Partner=Pan_QL_Creative1                                               | shortformdd9@cunet.com  |
      | https://stgsucceed2.strayer.edu/military-benefits?MarketingCode=DG111&CR=TestCR&PL=TestPL&KW=TestKW&Keyword=TestKeyword&AFFID=TestAFFID&Matchtype=TestMatchtype&creative=TestCreative&GCLID=TEstgCLID&userguid=test&LPT=TestLPT | shortformdd10@cunet.com |
      | https://stgsucceed2.strayer.edu/corporate-partners                                                                                                                                                                              | shortformdd11@cunet.com |
      | https://stgsucceed2.strayer.edu/transfer                                                                                                                                                                                        | shortformdd12@cunet.com |
      | https://stgachieve2.strayer.edu/transfer                                                                                                                                                                                        | shortformdd13@cunet.com |
      | https://stgexplore2.strayer.edu/transfer                                                                                                                                                                                        | shortformdd14@cunet.com |
      | https://stgstart2.strayer.edu                                                                                                                                                                                                   | shortformdd15@cunet.com |
      | https://stgbemore2.strayer.edu/anne                                                                                                                                                                                             | shortformdd16@cunet.com |
      | https://stgbemore2.strayer.edu/carl                                                                                                                                                                                             | shortformdd17@cunet.com |
      | https://stgbemore2.strayer.edu/cathy                                                                                                                                                                                            | shortformdd18@cunet.com |
      | https://stgbemore2.strayer.edu/eric                                                                                                                                                                                             | shortformdd19@cunet.com |
      | https://stgbemore2.strayer.edu/jessica                                                                                                                                                                                          | shortformdd20@cunet.com |
      | https://stgbemore2.strayer.edu/sareeta                                                                                                                                                                                          | shortformdd21@cunet.com |
      | https://stgbemore2.strayer.edu/tasha                                                                                                                                                                                            | shortformdd22@cunet.com |
      | https://stgbemore2.strayer.edu/mba                                                                                                                                                                                              | shortformdd23@cunet.com |

  @TwoStepForm @Afford @12Days @Achieve @Succeed @Bemore
  Scenario Outline: TC042: Verify User is able to submit Two Step  form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Two Step form
    And I enter "Kumar" as LastName in Two Step form
    And I enter "HYDERABAD" as Address in Two Step form
    And I enter "99501" as Zip in Two Step form
    And I enter "3232344567" as PhoneNumber in Two Step form
    And I enter "<EMAIL>" as Email in Two Step form
    When I click "Next" Button in Two Step form
    And I select "Certificates" as Degree in Two Step form
    And I select "Digital Entrepreneurship" as program of interest in Two Step form
    When I click "AgreeandGo" button in Two Step form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                                                                                                                                                                                   | EMAIL                   |
      | https://stgafford2.strayer.edu/joegibbs                                                                                                                                                                               | twostepform1@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?AffiliateID=TestAffId                                                                                                                                                         | twostepform2@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?MarketingCode=Test123                                                                                                                                                         | twostepform3@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?Partner=TestPart                                                                                                                                                              | twostepform4@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?GCLID=Testgclid                                                                                                                                                               | twostepform5@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?permguid=testuid                                                                                                                                                              | twostepform6@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?userguid=testuid                                                                                                                                                              | twostepform7@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?aoid=TestAoid1234&MarketingCode=Test123&userguid=testuid&GCLID=Testgclid&Partner=TestPart                                                                                     | twostepform8@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?MarketingCode=Test123&sessguid=test&userguid=test&permguid=test&gclid=abc123&AffiliateID=TestAffId1234&Partner=Pan_QL_Creative1                                               | twostepform9@cunet.com  |
      | https://stgafford2.strayer.edu/joegibbs?MarketingCode=DG111&CR=TestCR&PL=TestPL&KW=TestKW&Keyword=TestKeyword&AFFID=TestAFFID&Matchtype=TestMatchtype&creative=TestCreative&GCLID=TEstgCLID&userguid=test&LPT=TestLPT | twostepform10@cunet.com |
      | https://stgpath2.strayer.edu                                                                                                                                                                                          | twostepform11@cunet.com |
      | https://stg12days2.strayer.edu                                                                                                                                                                                        | twostepform12@cunet.com |
      | https://stgachieve2.strayer.edu/joegibbs                                                                                                                                                                              | twostepform13@cunet.com |
      | https://stgsucceed2.strayer.edu/joegibbs                                                                                                                                                                              | twostepform14@cunet.com |
      | https://stgbemore2.strayer.edu/fafsa2                                                                                                                                                                                 | twostepform15@cunet.com |
      | https://stgbemore2.strayer.edu/fafsa                                                                                                                                                                                  | twostepform16@cunet.com |

  @LongForm @Explore @CollegeDegrees @Referral @Afford @Cusa @Path @Study @letsgo @Bemore
  Scenario Outline: TC040: Verify User is able to submit Long form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Long form
    And I enter "Kumar" as LastName in Long form
    And I enter "HYDERABAD" as Address in Long form
    And I enter "<EMAIL>" as Email in Long form
    And I enter "3232344567" as PhoneNumber in Long form
    And I enter "99501" as Zip in Long form
    And I select "Some post graduate" as Education Level in Long form
    And I select "Certificates" as Degree in Long form
    And I select "Digital Entrepreneurship" as program of interest in Long form
    When I click "AgreeandGo" button in Long form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                                                                                                                                                                                             | EMAIL                |
      | https://stgexplore2.strayer.edu                                                                                                                                                                                                 | longform1@cunet.com  |
      | https://stgcollegedegrees2.strayer.edu/                                                                                                                                                                                         | longform2@cunet.com  |
      | https://stgcollegedegrees2.strayer.edu/military-benefits                                                                                                                                                                        | longform3@cunet.com  |
      | https://stgreferral2.strayer.edu/legacy                                                                                                                                                                                         | longform4@cunet.com  |
      | https://stgreferral2.strayer.edu/alumni                                                                                                                                                                                         | longform5@cunet.com  |
      | https://stgreferral2.strayer.edu                                                                                                                                                                                                | longform6@cunet.com  |
      | https://stgreferral2.strayer.edu/military-benefits                                                                                                                                                                              | longform7@cunet.com  |
      | http://stgafford2.strayer.edu/military-benefits                                                                                                                                                                                 | longform8@cunet.com  |
      | https://stgafford2.strayer.edu/corporate-partners                                                                                                                                                                               | longform9@cunet.com  |
      | https://stgafford2.strayer.edu/transfer                                                                                                                                                                                         | longform10@cunet.com |
      | https://stgcusa2.strayer.edu/dc-md-scholarship                                                                                                                                                                                  | longform11@cunet.com |
      | https://stgcusa2.strayer.edu/military-benefits                                                                                                                                                                                  | longform12@cunet.com |
      | https://stgcusa2.strayer.edu                                                                                                                                                                                                    | longform13@cunet.com |
      | https://stgpath2.strayer.edu/military-benefits                                                                                                                                                                                  | longform14@cunet.com |
      | https://stgpath2.strayer.edu/corporate-partners                                                                                                                                                                                 | longform15@cunet.com |
      | https://stgstudy2.strayer.edu/military-benefits                                                                                                                                                                                 | longform16@cunet.com |
      | https://stgstudy2.strayer.edu/corporate-partners                                                                                                                                                                                | longform17@cunet.com |
      | https://stgstudy2.strayer.edu                                                                                                                                                                                                   | longform18@cunet.com |
      | https://stgletsgo2.strayer.edu/military-benefits                                                                                                                                                                                | longform19@cunet.com |
      | https://stgletsgo2.strayer.edu/corporate-partners                                                                                                                                                                               | longform20@cunet.com |
      | https://stgletsgo2.strayer.edu                                                                                                                                                                                                  | longform21@cunet.com |
      | https://stgbemore2.strayer.edu/graduationfund                                                                                                                                                                                   | longform22@cunet.com |
      | https://stgbemore2.strayer.edu/tax                                                                                                                                                                                              | longform23@cunet.com |
      | https://stgbemore2.strayer.edu/military-benefits                                                                                                                                                                                | longform24@cunet.com |
      | https://stgbemore2.strayer.edu/fos-mothers                                                                                                                                                                                      | longform25@cunet.com |
      | https://stgbemore2.strayer.edu/gv                                                                                                                                                                                               | longform26@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners                                                                                                                                                                               | longform27@cunet.com |
      | https://stgbemore2.strayer.edu                                                                                                                                                                                                  | longform28@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?AffiliateID=TestAffId                                                                                                                                                         | longform29@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?MarketingCode=Test123                                                                                                                                                         | longform30@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?Partner=TestPart                                                                                                                                                              | longform31@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?GCLID=Testgclid                                                                                                                                                               | longform32@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?permguid=testuid                                                                                                                                                              | longform33@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?userguid=testuid                                                                                                                                                              | longform34@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?aoid=TestAoid1234&MarketingCode=Test123&userguid=testuid&GCLID=Testgclid&Partner=TestPart                                                                                     | longform35@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?MarketingCode=Test123&sessguid=test&userguid=test&permguid=test&gclid=abc123&AffiliateID=TestAffId1234&Partner=Pan_QL_Creative1                                               | longform35@cunet.com |
      | https://stgbemore2.strayer.edu/corporate-partners?MarketingCode=DG111&CR=TestCR&PL=TestPL&KW=TestKW&Keyword=TestKeyword&AFFID=TestAFFID&Matchtype=TestMatchtype&creative=TestCreative&GCLID=TEstgCLID&userguid=test&LPT=TestLPT | longform36@cunet.com |
