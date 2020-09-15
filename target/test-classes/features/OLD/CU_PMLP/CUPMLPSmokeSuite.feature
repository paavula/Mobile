#Author: Pradeep Kumar Aavula
#Keywords Summary : This feature contains CU PMLP Smoke suite functionalities
Feature: CU PMLP Smoke Suite

  @IRFForm @CUPMLP @Forms
  Scenario: TC001:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    Then User should navigate to Request Information form
    And User select "Certificate" as Degree in LP form
    And User select "Analytics" as Area of Study in LP form
       And User select "Grad Cert - Analytics Using SAS" as Bachelors Specialization Study in LP form
    And User enter "LP" as First Name in LP form
    And User enter "Form" as Last Name in LP form
    And User enter "Email" in Email Address in LP form
    And User enter PhoneNumber as Phone Number in LP form
    And User enter "55111" as ZipCode in LP form
    And User submit the LP form
    And User should see "Thank you," in the Thankyou Page for LP Form
    And User should see "trigger=irf_submit" in Thankyou Page URL

  @LPHeaderNavigation @CUPMLP 
  Scenario Outline: TC002: Verify Link navigations in Header Navigation module in LP Home Page
    Given User am on Capella LP Home Page
    When User move to LP Utility Navigation
    And User Click on "<Link>" link
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                    | PageTitle                 |
      | Apply                   | Application for Admission |
      | 1.877.884.0733          | Online Degree Programs    |
      | Request Program Details | Online Degree Programs    |

  @LPFooterNavigation @CUPMLP 
  Scenario Outline: TC003: Verify Footer Link navigations in LP Home Page
    Given User am on Capella LP Home Page
    When User move to Footer
    And User Click on  "<Link>" Footer Link
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                | PageTitle                  |
      | Apply               | Application for Admission  |
      | University Policies | University Policies        |
      | Privacy Policy      | Privacy Policy             |
      | Legal               | Capella University - Legal |
      | Terms of Use        | Terms of Use               |
      | Ad Choices          | Advertising Choices        |

  @JumpLinks @CUPMLP 
  Scenario Outline: TC004:Verify Jump Links are working in Capella LP Home Page
    Given User am on Capella LP Home Page
    When User move to Jumplink Menu
    And User Click on  "<Jump_Link>" Jump Link
    Then User should see the "<Jump_Link_Module>" Jump link Module

    Examples: 
      | Jump_Link    | Jump_Link_Module                           |
      | overview     | container online-degree                    |
      | request      | form-wrapper  clearfix                     |
      | programs     | container heading-section pmlp-tab-section |
      | scholarships | container start-save py-4 pt-5 pb-5        |

  @TAB_Accordion_ProgListing @CUPMLP 
  Scenario Outline: TC005: Verify Link navigations in Header Navigation module in LP Home Page
    Given User am on Capella LP PHD Page
    When User move to LP Accordion Module
    And User Clicks on "<Tab_Link>" on Tab Link
    And User Clicks on "<Accordion>" Accordion Button
    Then User Should See "<Program>" In LP Accordion Module

    Examples: 
      | Tab_Link                     | Accordion                                          | Program                                                 |
      | Counseling                   | PhD in Advanced Studies in Human Behavior          | Program Evaluation in Counselor Education and Supervision |
      | Counseling                   | PhD in Counselor Education & Supervision           | Counselor Education Teaching and                          |
      | Education                    | PhD in Education                                   | Instructional Design for                                  |
      | Education                    | EdD - Doctor of Education                          | Educational Leadership                                    |
      | Health Sciences              | DHA - Doctor of Health Administration              | General Health Administration                             |
      | Health Sciences              | DrPH - Doctor of Public Health                     | Design and Implementation of Public Health Strateg        |
      | Nursing                      | DNP - Doctor of Nursing Practice                   | DNP*                                                      |
      | Psychology                   | PhD in Psychology                                  | General Psychology                                        |
      | Psychology                   | PsyD - Doctor of Psychology in Clinical Psychology | Advanced Psychopathology                                  |
      | Psychology                   | PsyD - Doctor of Psychology in School Psychology   | Consultation and Collaboration in the Schools             |
      | Public Administration        | DPA - Doctor of Public Administration              | Theories and Concepts in Public Administration            |
      | Social Work & Human Services | DSW - Doctor of Social Work                        | Advanced Social Work Practice: Theoretical Perspec        |
      | Social Work & Human Services | DHS - Doctor of Human Services                     | Leadership and Organizational Management                  |
      | Social Work & Human Services | PhD in Human Services                              | Multidisciplinary Human Services                          |

  @PMLP_Thank_You_Hero @CUPMLP 
  Scenario: TC006:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    Then User should navigate to Request Information form
    And User select "Certificate" as Degree in LP form
    And User select "Analytics" as Area of Study in LP form
   And User select "Grad Cert - Analytics Using SAS" as Bachelors Specialization Study in LP form
    And User enter "LP" as First Name in LP form
    And User enter "Form" as Last Name in LP form
    And User enter "Email" in Email Address in LP form
    And User enter PhoneNumber as Phone Number in LP form
    And User enter "55111" as ZipCode in LP form
    And User submit the LP form
    And User should see "Thank you," in the Thankyou Page for LP Form
    And User should see "trigger=irf_submit" in Thankyou Page URL
    When User Clicks on View Programs Button in Thank you Hero
    Then User should see the "Online Graduate IT Certificate in Analytics: SAS | Capella University" text and close tab

  @IRF_Verification_LP_Pages @CUPMLP 
  Scenario Outline: TC007:Verify Request Information form is displaying in Key Pages
    Given User Navigate to " <Child_Page_URL>" LP page
    When User Click on  "<Link>" LP RFP
    Then User should navigate to Request Information form

    Examples: 
      | Child_Page_URL | Link                    |
      | home           | Request Program Details |
      | masters        | Request Program Details |
      | psychology     | Request Program Details |
      | flexpath       | Request Program Details |
      | bachelors      | Request Program Details |
      | rn-to-bsn      | Request Program Details |
      | it             | Request Program Details |
      | scholarships   | Request Program Details |
      | healthadmin    | Request Program Details |
      | mba            | Request Program Details |

      @IRF_Errorvalidatios @CUPMLP @Forms
  Scenario: TC008:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    And User submit the LP form
    Then User should see the "Please enter your degree" for Degree field in LP Form
    Then User should see the "Please enter your area of study" for AOS field in LP Form
    Then User should see the "Please enter your specialization." for Program field in LP Form
    Then User should see the "Please enter your first name" for FirstName field in LP Form
    Then User should see the "Please enter your last name" for LastName field in LP Form
    Then User should see the "Email is required" for Email field in LP Form
    Then User should see the "Phone number is required" for PhoneNumber field in LP Form
    Then User should see the "Please enter your ZIP/postal code" for ZipCode field in LP Form
       
   @IRFForm_Modal @CUPMLP @Forms
  Scenario: TC009:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    Then User should navigate to Request Information form
    And User select "Bachelor's" as Degree in LP form
    And User select "Public Health" as Area of Study in LP form
    And User select "BS - Public Health" as Bachelors Specialization Study in LP form
    And User select "High School Diploma" as Education Level in LP form
    And User select "18-23" as Age in LP form
    And User select "No" as Military option in LP form
    And User enter "LP" as First Name in LP form
    And User enter "Form" as Last Name in LP form
    And User enter "Email" in Email Address in LP form
    And User enter PhoneNumber as Phone Number in LP form
    And User enter "55111" as ZipCode in LP form
    And User submit the LP form
    Then User should see Thank you for your interest window
    When User Click on  "Visit Strayer University" CTA Link
    Then User should see the "Strayer University" text and close tab
    When User Click on  "Download the Strayer Guide" CTA Link
    Then User should see the "StrayerUniversityGuide" text and close tab 
    
     @AccessibilitycommitmentFooterNavigation @CUPMLP 
  Scenario Outline: TC010: Verify Footer Link navigations in LP Home Page
    Given User am on Capella LP Accessibility commitment Page
    When User move to Accessibility Footer
       And User Click on "<Link>" link
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link                | PageTitle                  |
      | Strategic Education, Inc.               | Home, Strategic Education, Inc.  |
      | Strayer University | Strayer University - Accredited Online & On-Campus Degrees       |
      | Site Map    | Site Map           |
      | Privacy Policy      | Privacy Policy             |
      | Legal               | Capella University - Legal |
      | Terms of Use        | Terms of Use               |
      | Ad Choices          | Advertising Choices        |
      
        @IRFFormErrorValidations @CUPMLP @Forms
  Scenario: TC011:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User am on Capella LP Home Page
    When User Click on  "Request Program Details" RFP
    Then User should navigate to Request Information form
    And User select "Certificate" as Degree in LP form
    And User select "Analytics" as Area of Study in LP form
       And User select "Grad Cert - Analytics Using SAS" as Bachelors Specialization Study in LP form
    And User enter "LP" as First Name in LP form
    And User enter "Form" as Last Name in LP form
    And User enter "test@test.com" in Test Email Address in LP form
    And User enter PhoneNumber as Phone Number in LP form
    And User enter "55111" as ZipCode in LP form
    And User submit the LP form
    Then User should see the "email test@test.com is an invalid email address." for Email field validations in LP Form