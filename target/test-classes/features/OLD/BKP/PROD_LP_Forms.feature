Feature: PMLP FORM

  @LinkedInpageForm @LinkedIn
  Scenario Outline: TC001: Verify User is able to submit form in Linked In page
    Given User Navigate to " <URL>" page
    And I enter "Ind" as FirstName in LinkedIn form
    And I enter "Team" as LastName in LinkedIn form
    And I enter "<EMAIL>" as Email in LinkedIn form
    And I enter "1234567890" as PhoneNumber in LinkedIn form
    And I enter "99501" as Zip in LinkedIn form
    When I click "Submit" button in LinkedIn form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                              | EMAIL                 |
      | https://linkedin.strayer.edu/mba | linkedform1@cunet.com |
      | https://linkedin.strayer.edu/bba | linkedform2@cunet.com |

  @ShortForm @Succeed
  Scenario Outline: TC002: Verify User is able to submit Short form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Short form
    And I enter "Kumar" as LastName in Short form
    And I enter "<EMAIL>" as Email in Short form
    And I enter "1234567890" as PhoneNumber in Short form
    And I enter "99501" as Zip in Short form
    And I click "AgreeandGo" button in Short form
     Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                                                                                                                                                                                           | EMAIL                 |
      | https://succeed.strayer.edu/information-technology                                                                                                                                                                            | shortform1@cunet.com  |
 

  @ShortFormwithDropdown @Succeed
  Scenario Outline: TC003: Verify User is able to submit Short form
    Given User Navigate to " <URL>" page
    When I move to Short form
    When I select "MBA" as Degree in Short form
    And I select "Business Administration" as program of interest in Short form
    And I enter "Deepu" as FirstName in Short form
    And I enter "Kumar" as LastName in Short form
    And I enter "<EMAIL>" as Email in Short form
    And I enter "1234567890" as PhoneNumber in Short form
    And I enter "99501" as Zip in Short form
    When I click "AgreeandGo" button in Short form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                                                                                                                                                                                      | EMAIL                   |
      | https://succeed.strayer.edu/military-benefits                                                                                                                                                                            | shortformdd@cunet.com   |
   
  @TwoStepForm @Afford @1Days @Achieve @Succeed @Bemore
  Scenario Outline: TC004: Verify User is able to submit Two Step  form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Two Step form
    And I enter "Kumar" as LastName in Two Step form
    And I enter "HYDERABAD" as Address in Two Step form
    And I enter "99501" as Zip in Two Step form
    And I enter "1234567890" as PhoneNumber in Two Step form
    And I enter "<EMAIL>" as Email in Two Step form
    When I click "Next" Button in Two Step form
    And I select "Certificates" as Degree in Two Step form
    And I select "Digital Entrepreneurship" as program of interest in Two Step form
    When I click "AgreeandGo" button in Two Step form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                                                                                                                                                                            | EMAIL                   |
      | https://afford.strayer.edu/joegibbs                                                                                                                                                                            | twostepform1@cunet.com  |
    

  @LongForm @Explore @CollegeDegrees @Referral @Afford @Cusa @Path @Study @letsgo @Bemore
  Scenario Outline: TC005: Verify User is able to submit Long form
    Given User Navigate to " <URL>" page
    And I enter "Deepu" as FirstName in Long form
    And I enter "Kumar" as LastName in Long form
    And I enter "HYDERABAD" as Address in Long form
    And I enter "<EMAIL>" as Email in Long form
    And I enter "1234567890" as PhoneNumber in Long form
    And I enter "99501" as Zip in Long form
    And I select "Some post graduate" as Education Level in Long form
    And I select "Certificates" as Degree in Long form
    And I select "Digital Entrepreneurship" as program of interest in Long form
    When I click "AgreeandGo" button in Long form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page

    Examples: 
      | URL                                                                                                                                                                                                                      | EMAIL                |
      | https://explore.strayer.edu                                                                                                                                                                                              | longform1@cunet.com  |
   