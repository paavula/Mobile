Feature: PMLP FORMS In PROD Environment

  @RequestInformationFormVerification
  Scenario Outline: TC001:Verify Request Information form is displaying in Key Pages
    Given User Navigate to " <URL>" page
    When I Click on  "<Link>" RFP
    Then I should navigate to Request Information form

    Examples:
      | URL                                                  | Link                    |
      | https://stgwww.capella.edu/lp/home                   | Request Program Details |
      | https://www.capella.edu/lp/masters                   | Request Program Details |
      | https://www.capella.edu/lp/psychology                | Request Program Details |
      | https://www.capella.edu/lp/flexpath                  | Request Program Details |
      | https://www.capella.edu/lp/counselingnav             | Request Program Details |
      | https://www.capella.edu/lp/bachelors                 | Request Program Details |
      | https://www.capella.edu/lp/phd                       | Request Program Details |
      | https://www.capella.edu/lp/nursing                   | Request Program Details |
      | https://www.capella.edu/lp/businessnav               | Request Program Details |
      | https://www.capella.edu/lp/rn-to-bsn                 | Request Program Details |
      | https://www.capella.edu/lp/edmasters                 | Request Program Details |
      | https://www.capella.edu/lp/it                        | Request Program Details |
      | https://www.capella.edu/lp/accounting                | Request Program Details |
      | https://www.capella.edu/lp/scholarships              | Request Program Details |
      | https://www.capella.edu/lp/msn                       | Request Program Details |
      | https://www.capella.edu/lp/applied-behavior-analysis | Request Program Details |
      | https://www.capella.edu/lp/education                 | Request Program Details |
      | https://www.capella.edu/lp/publichealth              | Request Program Details |
      | https://www.capella.edu/lp/socialwork                | Request Program Details |
      | https://www.capella.edu/lp/humanresources            | Request Program Details |

  @RequestInformationFormSubmission
  Scenario Outline: TC002:Verify user is able to submit Request Information form in Key Pages
    Given User Navigate to " <URL>" page
    When I Click on  "<Link>" RFP
    Then I should navigate to Request Information form
    And I select "Certificate" as Degree in LP form
    And I select "Analytics" as Area of Study in LP form
    And I select "Grad Cert - Advanced Analytics Using SAS'" as Specialization Study in LP form
    And I enter "LP" as First Name in LP form
    And I enter "Form" as Last Name in LP form
    And I enter email in Email Address in LP form
    And I enter PhoneNumber as Phone Number in LP form
    And I enter "55111" as ZipCode in LP form
    And I submit the LP form
    Then I should see the "200" Success Response Status code
    And I should see "Thank you," in the Thankyou Page for LP Form
    And I should see "trigger=irf_submit" in Thankyou Page URL
    Then I capture the Adobe Analytics logs
    And I Should see availability of Submit Trigger Adobe Analytics as "irf_submit"

    Examples:
      | URL                                                  | Link                    |
      | https://stgwww.capella.edu/lp/home                   | Request Program Details |
      | https://www.capella.edu/lp/masters                   | Request Program Details |
      | https://www.capella.edu/lp/psychology                | Request Program Details |
      | https://www.capella.edu/lp/flexpath                  | Request Program Details |
      | https://www.capella.edu/lp/counselingnav             | Request Program Details |
      | https://www.capella.edu/lp/bachelors                 | Request Program Details |
      | https://www.capella.edu/lp/phd                       | Request Program Details |
      | https://www.capella.edu/lp/nursing                   | Request Program Details |
      | https://www.capella.edu/lp/businessnav               | Request Program Details |
      | https://www.capella.edu/lp/rn-to-bsn                 | Request Program Details |
      | https://www.capella.edu/lp/edmasters                 | Request Program Details |
      | https://www.capella.edu/lp/it                        | Request Program Details |
      | https://www.capella.edu/lp/accounting                | Request Program Details |
      | https://www.capella.edu/lp/scholarships              | Request Program Details |
      | https://www.capella.edu/lp/msn                       | Request Program Details |
      | https://www.capella.edu/lp/applied-behavior-analysis | Request Program Details |
      | https://www.capella.edu/lp/education                 | Request Program Details |
      | https://www.capella.edu/lp/publichealth              | Request Program Details |
      | https://www.capella.edu/lp/socialwork                | Request Program Details |
      | https://www.capella.edu/lp/humanresources            | Request Program Details |
