Feature: PMLP FORMS In QA Environment

  @Accredation 
  Scenario: TC023: Verify Accredation component module is disaplying in Cobra Page
    Given User Navigate to Cobra Template Page
    When I move to CobraPage Accredation
    Then I should see the Accredation Image
    When I Click on Accredation Image
    Then I should see the "Strayer University Accreditation" text on Accredation window
    When I Click on Accredation Link
    Then I should see the "Strayer University Accreditation" text on Accredation window

    
    