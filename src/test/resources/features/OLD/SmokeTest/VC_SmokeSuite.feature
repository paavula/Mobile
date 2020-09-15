Feature: VC Smoke Suite

  @VCMegaMenuValidations
  Scenario: TC001: Verify Mega Menus is disaplying in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Capella Exp Menu
    Then User should see the "CAPELLA EXPERIENCE" text on Capella Expereince Menu
    When User move to Financing Menu
    Then User should see the "FINANCING" text on Financing Menu
    When User move to Apply Menu
    Then User should see the "APPLY" text on Apply Menu

  @DegreeChildLinkValidations
  Scenario Outline: TC002:Verify Child Link navigations Under Degree and Program Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Degrees and Program Left Links Trail
    When User Click on Child "<Left_Link>" Left Trail Link
    Then User should see the "<Left_Link>" Child link Module

    Examples: 
      | Left_Link         |
      | doctoraldegrees   |
      | mastersdegrees    |
      | bachelorsdegrees  |
      | certificates      |
      | individualcourses |

  @ApplyLinkValidations
  Scenario Outline: TC003:Verify Child Link navigations Under Apply Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Apply Menu
    Then User should see the "APPLY" text on Apply Menu
    When User move to Apply ChildLinksModule
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                   | PageTitle                 |
      | Admissions             | Admissions                |
      | Admission Requirements | Admission Requirements    |
      | International Students | International Students    |
      | Transferring Credits   | Transferring Credits      |
      | Apply Now              | Application for Admission |

  @FINANCINGLinkValidations
  Scenario Outline: TC004:Verify Child Link navigations Under FINANCING Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Financing Menu
    Then User should see the "FINANCING" text on Financing Menu
    When User move to Financing ChildLinksModule
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                                      | PageTitle                                                      |
      | Paying for Your Degree                    | Paying for Your Degree                                         |
      | Tuition & Fees                            | Tuition & Fees                                                 |
      | Return on Your Investment                 | Return on Your Investment                                      |
      | Ways To Save                              | Ways to Save - Capella University                              |
      | Capella Progress Rewards and Scholarships | Capella Progress Rewards and Scholarships - Capella University |
      | Grants                                    | Grants                                                         |
      | Low Cost Education Courses                | Low Cost Education Courses                                     |
      | Prior Learning Assessment                 | Prior Learning Assessment                                      |
      | Military Benefits                         | Military Benefits                                              |
      | Federal Financial Aid                     | Federal Financial Aid                                          |
      | Financial Aid Policies                    | Financial Aid Policies                                         |
      | Net Price Calculator                      | Net Price Calculator                                           |

  @CAPELLAEXPERIENCELinkValidations
  Scenario Outline: TC005:Verify Child Link navigations Under CAPELLA EXPERIENCE Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Capella Exp Menu
    Then User should see the "CAPELLA EXPERIENCE" text on Capella Expereince Menu
    When User move to Capella Exp ChildLinksModule
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                            | PageTitle                                      |
      | Why Choose Capella?             | Why Choose Capella                             |
      | Accreditation                   | University Accreditation - Capella University  |
      | Competency-Based Education      | What is competency-based education?            |
      | Student Experience              | Student Experience                             |
      | The Doctoral Journey            | The Doctoral Journey                           |
      | Compare Online Learning Formats | Compare Learning Formats                       |
      | FlexPath Learning Format        | FlexPath Self-Paced Online Learning            |
      | GuidedPath Learning Format      | GuidedPath Original Online Learning            |
      | Path Finder Quiz                | Which online learning format is right for you? |
      | Support                         | Support                                        |
      | Faculty                         | Faculty                                        |
      | Career Services                 | Career Services                                |
      | Search Faculty                  | Search Faculty                                 |
      | Capella University Blog         | Capella University Blog                        |
      | Campus Center Locations         | Campus Locations                               |

  @DoctoraldegreesLinkValidations
  Scenario Outline: TC006:Verify Child Link navigations Under Doctoraldegrees Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Degrees and Program Left Links Trail
    When User Click on Child "<Left_Link>" Left Trail Link
    Then User should see the "<Left_Link>" Child link Module
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Left_Link       | Link                                      | PageTitle                                                             |
      | doctoraldegrees | Compare All Doctoral Degrees              | Online PhD Programs & Doctoral Degrees                                |
      | doctoraldegrees | Business                                  | Online Business Degree - Doctoral                                     |
      | doctoraldegrees | DBA                                       | DBA Degree Programs Online                                            |
      | doctoraldegrees | PhD in Business Management                | PhD in Business Management Online Degree Program - Capella University |
      | doctoraldegrees | Counseling                                | Online Counseling Degree - Doctoral Programs                          |
      | doctoraldegrees | PhD in Advanced Studies in Human Behavior | PhD in Human Behavior Studies Online Program                          |
      | doctoraldegrees | PhD in Counselor Education & Supervision  | PhD in Counselor Education & Supervision Online                       |
      #| doctoraldegrees | Education                                 | Online Education Doctoral Programs                        |
      | doctoraldegrees | EdD                                       | Online EdD Degree Programs                                            |
      #| doctoraldegrees | EdS                                       | Online EdS Degree Programs                                            |
      | doctoraldegrees | PhD in Education                          | PhD in Education Online Degree Program                                |
      | doctoraldegrees | Health Sciences                           | Health Science Doctoral Programs Online                               |
      | doctoraldegrees | DHA                                       | Online DHA Degree Programs                                            |
      | doctoraldegrees | DrPH                                      | DrPH Public Health Doctorate Degree Online                            |
      | doctoraldegrees | Information Technology                    | Information Technology (IT) Doctoral Programs Online                  |
      | doctoraldegrees | DIT                                       | DIT Degree Programs Online                                            |
      | doctoraldegrees | PhD in Information Technology             | PhD in Information Technology Online Degree Program                   |
      | doctoraldegrees | Nursing                                   | Nursing Doctoral Programs Online                                      |
      | doctoraldegrees | DNP                                       | Doctor of Nursing Practice DNP Degree Program Online                  |
      | doctoraldegrees | Psychology                                | Psychology Doctoral Programs Online                                   |
      | doctoraldegrees | PhD in Psychology                         | PhD in Psychology Online Degree Program                               |
      #   | doctoraldegrees | PsyD                                      | PsyD in School Psychology Online Degree Program                                 |
      | doctoraldegrees | Doctor of Psychology School Psychology    | PsyD in School Psychology Online Degree Program                       |
      | doctoraldegrees | Public Service                            | Public Service Doctoral Programs Online                               |
      | doctoraldegrees | DPA                                       | Doctor of Public Administration DPA Degree Program Online             |
      | doctoraldegrees | DEM                                       | Doctor of Emergency Management Online Degree Program                  |
      #   | doctoraldegrees | PhD in Criminal Justice                   | PhD in Criminal Justice Online Degree Program                         |
      #   | doctoraldegrees | PhD in Emergency Management               | PhD in Emergency Management Online Degree Program                     |
      | doctoraldegrees | Social Work & Human Services              | Doctoral Degrees in Social Work And Human Services                    |
      | doctoraldegrees | DSW                                       | Online Doctor of Social Work (DSW) Program                            |
      | doctoraldegrees | DHS                                       | Doctor in Human Services Online Degree Program                        |
      | doctoraldegrees | PhD in Human Services                     | Human Services PhD Program Online                                     |

  @MasterdegreesLinkValidations
  Scenario Outline: TC007:Verify Child Link navigations Under Master degrees Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Degrees and Program Left Links Trail
    When User Click on Child "<Left_Link>" Left Trail Link
    Then User should see the "<Left_Link>" Child link Module
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Left_Link      | Link                           | PageTitle                                                   |
      #|mastersdegrees|Business|Business Masters Programs Online                       |
      | mastersdegrees | MBA                            | Online MBA Degree Program                                   |
      | mastersdegrees | MS in Human Resource Managem   | Online Masters in Human Resource Management Degree          |
      #|mastersdegrees|Counseling|Counseling Masters Programs Online|
      #   | mastersdegrees | MS in Marriage & Family Coun   | Marriage & Family Counseling Master Program Online          |
      | mastersdegrees | MS in Clinical Mental Health   | Earn an accredited, master                                  |
      | mastersdegrees | MS in School Counseling        | Earn an accredited, online master                           |
      | mastersdegrees | MS in Addiction Studies        | Online Masters Degree in Addiction Studies                  |
      #|mastersdegrees|Education|Masters in Education Online Degree Programs|
      | mastersdegrees | MEd in Teaching and Learning   | Online Master                                               |
      | mastersdegrees | MS in Education                | Online Masters in Education Program                         |
      | mastersdegrees | MS in Education Innovation     | Online Masters in Education Technology & Innovation Program |
      | mastersdegrees | MS in Higher Education         | Masters in Higher Education Online Program                  |
      #|mastersdegrees|Health Sciences|Health Science Masters Programs Online|
      | mastersdegrees | MHA                            | Online MHA Degree Programs                                  |
      | mastersdegrees | MPH                            | Master of Public Health Online (MPH) Program                |
      #|mastersdegrees|Information Technology|Information Technology (IT) Masters Programs Online|
      | mastersdegrees | MS in Analytics                | Online Master                                               |
      | mastersdegrees | MS in Information Assurance    | Online MS in Information Assurance & Cybersecurity          |
      | mastersdegrees | MS in Information Technology   | Online Master                                               |
      #|mastersdegrees|Nursing|Nursing Masters Programs Online|
      | mastersdegrees | MSN                            | Online MSN Program                                          |
      #|mastersdegrees|Psychology| Psychology Masters Programs Online |
      | mastersdegrees | MS in Clinical Psychology      | Masters in Clinical Psychology Online Program               |
      #  | mastersdegrees | MS In Psychology               | Masters in Psychology Online Program                        |
      #|mastersdegrees|Public Service| Public Service Masters Programs Online |
      | mastersdegrees | MPA                            | MPA in Public Administration Online Degree Program          |
      | mastersdegrees | MS in Criminal Justice         | Master                                                      |
      | mastersdegrees | MS in Emergency Management     | Master's in Emergency Management Online Degree Program      |
      #|mastersdegrees|Social Work & Human Services| Social Work Masters Programs |
      | mastersdegrees | MSW                            | Master of Social Work (MSW) Online Program                  |
      | mastersdegrees | Master of Social Work Advanced | Online Master of Social Work (MSW) Advanced Standing        |
      | mastersdegrees | MS in Human Services           | Online Masters in Human Services Degree Program             |

  @BachelordegreesLinkValidations
  Scenario Outline: TC008:Verify Child Link navigations Under Bachelors degrees Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Degrees and Program Left Links Trail
    When User Click on Child "<Left_Link>" Left Trail Link
    Then User should see the "<Left_Link>" Child link Module
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Left_Link        | Link                             | PageTitle                                                      |
      # | bachelorsdegrees | Business       | Business Bachelor Programs Online |
      | bachelorsdegrees | BS in Business                   | Online Bachelor                                                |
      #| bachelorsdegrees | Health Sciences                  | Health Science Bachelor Programs Online                        |
      | bachelorsdegrees | BS in Health Care Administration | BS in Health Care Administration Online Program                |
      | bachelorsdegrees | BS in Public Health              | Online Bachelor                                                |
      #| bachelorsdegrees | Information Technology           | Information Technology (IT) Bachelor Programs Online           |
      | bachelorsdegrees | BS in Information Technology     | Online Bachelor                                                |
      #  | bachelorsdegrees | Nursing                          | Nursing Bachelor Programs Online                               |
      | bachelorsdegrees | BSN                              | Online Nursing Degree - RN-to-BSN                              |
      # | bachelorsdegrees | Psychology                       | Psychology Bachelor Programs Online                            |
      | bachelorsdegrees | BS in Psychology                 | Online Bachelor                                                |
      | bachelorsdegrees | BS in Psychology Pre             | Bachelor of Science in Psychology Pre-Counseling Online Degree |
      #| bachelorsdegrees | Public Service                   | Public Service Bachelor Programs Online                        |
      | bachelorsdegrees | BS in Criminal Justice           | Bachelor                                                       |

  @CertificatesdegreesLinkValidations
  Scenario Outline: TC009:Verify Child Link navigations Under Certificates degrees Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Degrees and Program Left Links Trail
    When User Click on Child "<Left_Link>" Left Trail Link
    Then User should see the "<Left_Link>" Child link Module
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Left_Link    | Link                     | PageTitle                                 |
      #   | certificates | Certificates                       | Online Business Certificate Programs              |
      | certificates | Professional Development | Online Education Professional Development |

  #  | certificates | Health Administration Certificates | Online Health Administration Certificate Programs |
  #  | certificates | Public Health Certificates         | Online Public Health Certificate Programs         |
  @IndividualcoursesLinkValidations
  Scenario Outline: TC010:Verify Child Link navigations Under individualcourses  Link in Capella Home Page
    Given User is on Capella Home Page
    When User move to Degrees and Program Menu
    Then User should see the "DEGREES + PROGRAMS" text on Degrees and Program Menu
    When User move to Degrees and Program Left Links Trail
    When User Click on Child "<Left_Link>" Left Trail Link
    Then User should see the "<Left_Link>" Child link Module
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Left_Link         | Link                           | PageTitle                                                  |
      | individualcourses | Compare All Individual Courses | Individual Courses                                         |
      | individualcourses | Counseling & Psychology        | Counseling and Psychology Individual Courses               |
      # | individualcourses | Business                       | Business Individual Courses                                |
      | individualcourses | Division of Arts and Sciences  | General Education Individual Courses                       |
      # | individualcourses | Education                      | Education Individual Courses                               |
      #  | individualcourses | Information Technology         | IT Individual Courses                                      |
      | individualcourses | Nursing and Health Sciences    | Health Administration and Public Health Individual Courses |
      | individualcourses | Public Services                | Public Service Individual Courses                          |

  @AreaOfStyduLinkValidations
  Scenario Outline: TC011:Verify Child Link navigations Under AREAS OF STUDY  Link in Capella Home Page Footer
    Given User is on Capella Home Page
    Then User move to VC Footer
    Then User should see the "AREAS OF STUDY" text on AREAS OF STUDY Module
    Then User should see the "<Footer_Link>" Child link Module
    When User Click on Child "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Footer_Link     | Link                         | PageTitle                                                       |
      | collapsedegrees | Business                     | Online Business Degree Programs                                 |
      | collapsedegrees | Counseling                   | Online Counseling Degree                                        |
      | collapsedegrees | Education                    | Online Education Degrees                                        |
      | collapsedegrees | Health Care Administration   | Health Administration Degrees Online                            |
      | collapsedegrees | Information Technology       | Information Technology (IT) Degrees Online - Capella University |
      | collapsedegrees | Nursing                      | Online Nursing Programs & Degrees                               |
      | collapsedegrees | Public Health                | Online Public Health Degree Programs                            |
      | collapsedegrees | Public Service Leadership    | Online Public Service Degree Programs                           |
      | collapsedegrees | Psychology                   | Online Psychology Degree Programs                               |
      | collapsedegrees | Social Work & Human Services | Social Work & Human Services Degrees                            |

  @AboutUsLinkValidations
  Scenario Outline: TC012:Verify Child Link navigations Under ABOUT US Link in Capella Home Page Footer
    Given User is on Capella Home Page
    Then User move to VC Footer
    Then User should see the "ABOUT US" text on About Us Module
    Then User should see the "<Footer_Link>" Child link Module
    When User Click on Child "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Footer_Link             | Link                 | PageTitle               |
      | collapsecurrentLearners | Contact Us           | Contact Us              |
      | collapsecurrentLearners | CU Blog              | Capella University Blog |
      | collapsecurrentLearners | Mission & Leadership | Mission & Leadership    |
      | collapsecurrentLearners | Tuition & Fees       | Tuition & Fees          |
      | collapsecurrentLearners | Tuition Policies     | Financial Aid Policies  |
      | collapsecurrentLearners | University Catalog   | HOME                    |

  @CapellaResultsLinkValidations
  Scenario Outline: TC013:Verify Child Link navigations Under CAPELLA RESULTS Link in Capella Home Page Footer
    Given User is on Capella Home Page
    Then User move to VC Footer
    Then User should see the "CAPELLA RESULTS" text on Capella Results Module
    Then User should see the "<Footer_Link>" Child link Module
    When User Click on Child "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Footer_Link          | Link              | PageTitle         |
      | collapsepartnerTeams | Learning Outcomes | Learning Outcomes |

  @InformationLinkValidations
  Scenario Outline: TC014:Verify Child Link navigations Under INFORMATION FOR Link in Capella Home Page Footer
    Given User is on Capella Home Page
    Then User move to VC Footer
    Then User should see the "INFORMATION FOR" text on Information For Module
    Then User should see the "<Footer_Link>" Child link Module
    When User Click on Child "<Link>" Footer link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Footer_Link              | Link                  | PageTitle                       |
      | collapsecapellaCommunity | Alumni Association    | Capella Alumni Association      |
      | collapsecapellaCommunity | Commencement          | Commencement                    |
      | collapsecapellaCommunity | Careers at Capella    | Workday                         |
      | collapsecapellaCommunity | Employers             | Recruiting tools for employers  |
      | collapsecapellaCommunity | Military              | Military Benefits               |
      | collapsecapellaCommunity | News & Media          | News                            |
      | collapsecapellaCommunity | Recruiting at Capella | Recruiting tools for employers  |
      | collapsecapellaCommunity | Refer a Friend        | Refer a Friend                  |
      | collapsecapellaCommunity | Transcripts           | Transcript Request Instructions |
      | collapsecapellaCommunity | University Policies   | University Policies             |

  @FooterLinkValidations
  Scenario Outline: TC015:Verify Fooer Link navigations  in Capella Home Page Footer
    Given User is on Capella Home Page
    Then User move to VC Footer
    Then User should see the Fotter Link Child link Module
    When User Click on Child "<Link>" link
    Then User should see the "<PageTitle>" text on Child "<Link>" Page and close tab

    Examples: 
      | Link                      | PageTitle                       |
      | Strategic Education, Inc. | Home, Strategic Education, Inc. |
      | Strayer University        | Strayer University              |
      | Site Map                  | Site Map                        |
      | Privacy Policy            | Privacy Policy                  |
      | Legal                     | Legal                           |
      | Terms of Use              | Terms of Use                    |
      | Ad Choices                | Advertising Choices             |

  @RequestInformationFormVerification
  Scenario Outline: TC016:Verify Request Information form is displaying in Key Pages
    Given User Navigate to " <URL>" page
    Then User move to Get More Info Module
    When User Click on  "<Button>" Button
    Then User should see Request Information Modal popup form

    Examples: 
      | URL                                                     | Button              |
      | https://www.capella.edu/online-phd-programs/            | Request Information |
      | https://www.capella.edu/online-masters-degree-programs/ | Request Information |
      | https://www.capella.edu/online-bachelors-degree/        | Request Information |

  @RequestInformationFormVerification1
  Scenario Outline: TC016:Verify Request Information form is displaying in Key Pages
    Given User Navigate to " <URL>" page
    Then User move to Get more Info Module
    When User Click on  "<Button>" Button
    Then User should see Request Information Modal popup form

    Examples: 
      | URL                                                  | Button              |
      | https://www.capella.edu/online-certificate-programs/ | Request Information |

  @ScheduleConsultationFormVerification
  Scenario Outline: TC017:Verify  Schedule Consultation form is displaying in Key Pages
    Given User Navigate to " <URL>" page
    Then User move to Ready For Next Module
    When User Click on  "<Button>" Button
    Then User should see Schedule Consultation Modal popup form

    Examples: 
      | URL                                                                               | Button                |
      | https://www.capella.edu/online-business-degrees/                                  | Schedule Consultation |
      | https://www.capella.edu/online-masters-degree-programs/                           | Schedule Consultation |
      | https://www.capella.edu/online-public-service-degrees/                            | Schedule Consultation |
      | https://www.capella.edu/online-social-work-degrees/                               | Schedule Consultation |
      | https://www.capella.edu/online-health-science-degrees/doctoral-programs/          | Schedule Consultation |
      | https://www.capella.edu/online-education-degrees/doctoral-programs/               | Schedule Consultation |
      | https://www.capella.edu/online-public-service-degrees/masters-programs/           | Schedule Consultation |
      | https://www.capella.edu/online-business-degrees/bachelor-programs/                | Schedule Consultation |
      | https://www.capella.edu/online-degrees/doctor-of-business-administration-program/ | Schedule Consultation |
      | https://www.capella.edu/online-mba-programs/                                      | Schedule Consultation |

  @ScheduleConsultationFormVerification-2
  Scenario Outline: TC018:Verify  Schedule Consultation form is displaying in Key Pages
    Given User Navigate to " <URL>" page
    Then User move to Get The Details Module
    When User Click on  "<Button>" Button
    Then User should see Schedule Consultation Modal popup form

    Examples: 
      | URL                                                                            | Button                |
      | https://www.capella.edu/online-degrees/masters-msn-care-coordination           | Schedule Consultation |
      | https://www.capella.edu/online-degrees/mba-health-care-management              | Schedule Consultation |
      #    | https://www.capella.edu/online-degrees/phd-general-business-management         | Schedule Consultation |
      | https://www.capella.edu/online-degrees/phd-information-assurance-cybersecurity | Schedule Consultation |
      | https://www.capella.edu/online-degrees/phd-counselor-education-supervision     | Schedule Consultation |
      | https://www.capella.edu/online-degrees/psyd-clinical-psychology                | Schedule Consultation |
      | https://www.capella.edu/online-degrees/bs-public-health-program/               | Schedule Consultation |

  @RegistrationFormAnalytics
  Scenario: TC_019:  Verify user is able to submit My Capella Registration form
    Given User is on Capella Home Page
    And User click Login link to check MC Login
    And User click Prospective Students link under Login
    Then User get MC Login modal form to enter credentials
    And User click Create a new Account link in Login modal
    Then User get Create Account modal form
    And User enter "Capella" First Name Create Account form
    And User enter "Userlr" Last Name in Create Account form
    And User enter an Email Address in Create Account form
    And User enter "Admin*12" Password in Create Account form
    And User enter "Admin*12" Confirm Password in Create Account form
    And User click the Create Account button in form
    Then User should see the "MY PROFILE" text on My Capella Dashboard
    Then User capture the Adobe Analytics logs
    Then User Should see the availability of Open events Adobe Analytics as "event8,event70"
    And User Should see availability of Submit Events Adobe Analytics as "event69,event71"
    And User Should see availability of Open Trigger Adobe Analytics as "mycapella_form"
    And User Should see availability of Submit Trigger Adobe Analytics as "mycapella_submit"

  @EMailUsFormAnalytics
  Scenario: TC_019:  Verify user is able to submit My Capella Registration form
    Given User is on Capella Home Page
    And User click Email Us link under the menu
    Then User move to Email Us Form
    And User select "Certificate" as Degree in Email form
    And User select "Business" as Area of Study in Email form
    And User select "Undergrad Cert - Accounting" as Specialization Study in Email form
    And User enter "Email" as First Name in Email form
    And User enter "Form" as Last Name in Email form
    And User enter email in Email Address in Email form
    And User enter PhoneNo as Phone Number in Email form
    And User enter "Test Comments" user Comments in Email form
    And User submit the Email form
    Then User should see the "200" Success Response Status code
    And User should get Thank you window for Email form
    And User should see "Thank you,Email." in the Thankyou Page for EmailUs Form
    Then User capture the Adobe Analytics logs
    Then User Should see the availability of Open events Adobe Analytics as "event5,event72"
    And User Should see availability of Submit Events Adobe Analytics as "event73,event74,purchase"
    And User Should see availability of Open Trigger Adobe Analytics as "email_form"
    And User Should see availability of Submit Trigger Adobe Analytics as "email_submit"

  @ENewsFormAnalytics
  Scenario: TC_020: Verify Adobe Analytics Triggers for ENews Letter form
    Given User have ENews Letter Form Page
    And User enter First Name as "ENews" in ENews Letter form
    And User enter Last Name as "Form" in ENews Letter form
    And User enter email in Email Address in ENews Letter form
    And User submit the ENews Letter form
    Then User capture the Adobe Analytics logs
    Then User Should see the availability of Open events Adobe Analytics as "event8, event68"
    # And User Should see availability of Submit Events Adobe Analytics as "event69, purchase"
    And User Should see availability of Open Trigger Adobe Analytics as "enews_form"
    And User Should see availability of Submit Trigger Adobe Analytics as "enews_submit"

  @ScheduleConsultationformFormAnalytics
  Scenario: TC_021: Verify Adobe Analytics Triggers for Schedule Consultation formform
    Given User is on Capella Home Page
    And User click Schedule Consultation link under the menu
    Then User move to Consultation form
    And User select "Certificate" as Degree in Consultation form
    And User select "Business" as Area of Study in Consultation form
    And User select "Undergrad Cert - Accounting" as Specialization Study in Consultation form
    And User select "As soon as possible" as Start Date in Consultation form
    And User enter "Schedule Consultation" as First Name in Consultation form
    And User enter "Form" as Last Name in Consultation form
    And User enter email in Email Address in Consultation form
    And User enter PhoneNumber as Phone Number in Consultation form
    And User enter "55111" as ZipCode in Consultation form
    And User submit the Consultation form
    Then User should see the "200" Success Response Status code
    And User should get Thank you window for Consultation form

  # Then User capture the Adobe Analytics logs
  # Then User Should see the availability of Open events Adobe Analytics as " event2,event19"
  #And User Should see availability of Submit Events Adobe Analytics as "event67,event74,purchase"
  #And User Should see availability of Open Trigger Adobe Analytics as "irf_form_modal"
  #And User Should see availability of Submit Trigger Adobe Analytics as "irf_submit_modal"
  @PasswordRestForm
  Scenario: TC_022: Verify user is able to submit Password Reset form
    Given User is on Capella Home Page
    And User click Login link to check MC Login
    And User click Prospective Students link under Login
    Then User get MC Login modal form to enter credentials
    And User Clikc on Reset Password Link
    Then User get Forgot Password form
    And User enter as "automation1@gmail.com" Email Address in Form
    And User Clikc on Request Password Button
    Then User get Reset Password Sucess Window

  # And User Click on Ok Button
  @LoginForm
  Scenario: TC_023: Verify User is able to Log into My Capella Application
    Given User is on Capella Home Page
    And User click Login link to check MC Login
    And User click Prospective Students link under Login
    Then User get MC Login modal form to enter credentials
    And User enter "automation@mailinator.com" username or email
    And User enter "Admin*12" password
    And User click LogIn button in form
    # And User Click on Close Button
    Then User should see the "MY PROFILE" text on My Capella Dashboard
