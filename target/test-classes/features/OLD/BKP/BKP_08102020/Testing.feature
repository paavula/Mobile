Feature: PMLP FORMS In STAGE Environment

@BannerRFI @EDU
  Scenario: TC035: Verify User is able to submit Banner form
    Given User Navigate to EDU Forms Page
    When I move to BannerRFI
    When I select "MBA" as Degree in Banner form
    When I select "Business Administration" as program of interest in Banner form
    And I enter "Banner" as FirstName in Banner form
    And I enter "Form" as LastName in Banner form
    And I enter "Bannerform@cunet.com" as Email in Banner form
    And I enter "3232344567" as PhoneNumber in Banner form
    And I enter "99501" as Zip in Banner form
    When I click "AgreeandGo" button in Banner form
    Then I should see the "200" Success Response Status code
    Then I should navigate to "Thank You" Thank you page