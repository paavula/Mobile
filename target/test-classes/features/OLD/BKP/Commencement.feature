Feature: Link Navigations

@NominateTeacherform @OMS
  Scenario: TC081: Verify User is able to submit Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
    And I enter "Automation" as Student First Name in Nominate form
    And I enter "Script" as Student Last Name in Nominate form
    And I enter "Selenium" as Student Campus in Nominate form
    And I enter "4338" as Student Id in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "200" Response Status code
    Then I should see the "Strayer University :: Thank You" text on page
    
      @NominateTeacherform @OMS
  Scenario: TC082: Verify Error validation for first name in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    When I click "Submit" button in Nominate form
    Then I should see the "Faculty Member's First Name field is required." Error Meeage in Nominate form
    
      @NominateTeacherform @OMS
  Scenario: TC082: Verify Error validation for last name in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Faculty Member's Last Name field is required." Error Meeage in Nominate form
    
          @NominateTeacherform @OMS
  Scenario: TC083: Verify Error validation for Campus in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
      And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Campus field is required." Error Meeage in Nominate form
    
              @NominateTeacherform @OMS
  Scenario: TC084: Verify Error validation for Program in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
      And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Campus" as Campus in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Which course(s) did this faculty member teach in your program? field is required." Error Meeage in Nominate form
    
     @NominateTeacherform @OMS
  Scenario: TC084: Verify Error validation for Program in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
      And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Campus" as Campus in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Which course(s) did this faculty member teach in your program? field is required." Error Meeage in Nominate form
      

       @NominateTeacherform @OMS
  Scenario: TC085: Verify Error validation for Reason in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
     When I click "Submit" button in Nominate form
    Then I should see the "Please describe the reason why you believe the faculty member should be recognized as a outstanding faculty member? field is required." Error Meeage in Nominate form
    
    
      @NominateTeacherform @OMS
  Scenario: TC086: Verify Error validation for Student fist name in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Student's First Name field is required." Error Meeage in Nominate form
    
     @NominateTeacherform @OMS
  Scenario: TC087: Verify Error validation for Student last name in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
         And I enter "Automation" as Student First Name in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Student's Last Name field is required." Error Meeage in Nominate form
    
         @NominateTeacherform @OMS
  Scenario: TC088: Verify Error validation for Student Home Campus  in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
         And I enter "Automation" as Student First Name in Nominate form
          And I enter "Script" as Student Last Name in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Student's Home Campus field is required." Error Meeage in Nominate form
    
         @NominateTeacherform @OMS
  Scenario: TC089: Verify Error validation for Student ID in Nominate a Teacher form
    Given User Navigate to Nominate Teacher Page
    When I move to Nominate Teacher form
    And I enter "Deepu" as Faculty First Name in Nominate form
    And I enter "Kumar" as Faculty Last Name in Nominate form
    And I enter "Osmania" as Campus in Nominate form
    And I enter "Automation Program" as Course in Nominate form
    And I enter "Reason" as Reason in Nominate form
         And I enter "Automation" as Student First Name in Nominate form
          And I enter "Script" as Student Last Name in Nominate form
           And I enter "Selenium" as Student Campus in Nominate form
    When I click "Submit" button in Nominate form
    Then I should see the "Student ID field is required." Error Meeage in Nominate form
