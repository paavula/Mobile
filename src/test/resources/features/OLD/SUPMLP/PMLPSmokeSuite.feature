#Author: Pradeep Kumar Aavula
#Keywords Summary : This feature contains SU PMLP Smoke suite functionalities
Feature: SU PMLP Smoke Suite

  @LinkedInpageMBAForm @LinkedInTemplate
  Scenario: TC001: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User enter "Linkedin" as FirstName in LinkedIn form
    And User enter "MBA" as LastName in LinkedIn form
    And User enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And User enter "1234567890" as PhoneNumber in LinkedIn form
    And User enter "55111" as Zip in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @LinkedInpageBBAForm @LinkedInTemplate
  Scenario: TC002: Verify User is able to submit form in Linked In BBA page
    Given User Navigate to LinkedIn BBA Page
    When User enter "Linkedin" as FirstName in LinkedIn form
    And User enter "MBA" as LastName in LinkedIn form
    And User enter "linkedformmba@cunet.com" as Email in LinkedIn form
    And User enter "1234567890" as PhoneNumber in LinkedIn form
    And User enter "55111" as Zip in LinkedIn form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @ShortForm
  Scenario: TC003: Verify User is able to submit Short form
    Given User move to Short form Page
    And User enter "Deepu" as FirstName in Short form
    And User enter "Kumar" as LastName in Short form
    And User enter "shortform@cunet.com" as Email in Short form
    And User enter "1234567890" as PhoneNumber in Short form
    And User enter "55111" as Zip in Short form
    And User Selects "Yes" as TransferCreditInterest Option in Short form
    And User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @ShortFormwithDropdown
  Scenario: TC004: Verify User is able to submit Short form with drop downs
    Given User move to Short form with drop down Page
    When User select "MBA" as Degree in Short form
    And User select "Business Administration" as program of interest in Short form
    And User enter "Deepu" as FirstName in Short form
    And User enter "Kumar" as LastName in Short form
    And User enter "shortformdd@cunet.com" as Email in Short form
    And User enter "1234567890" as PhoneNumber in Short form
    And User enter "55111" as Zip in Short form
    And User Selects "Yes" as TransferCreditInterest Option in Short form with dropdown
    And User click "AgreeandGo" button in Short form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @TwoStepForm
  Scenario: TC005: Verify User is able to submit Two Step  form
    Given User move to Two step  form Page
    When User enter "Two Step" as FirstName in Two Step form
    And User enter "Form" as LastName in Two Step form
    And User enter "HQA" as Address in Two Step form
    And User enter "55111" as Zip in Two Step form
    And User enter "1234567890" as PhoneNumber in Two Step form
    And User enter " twostepform@cunet.com" as Email in Two Step form
    When User click "Next" Button in Two Step form
    And User select "MBA" as Degree in Two Step form
    And User select "Business Administration" as program of interest in Two Step form
    And User Selects "Yes" as TransferCreditInterest Option in Two Step form
    When User click "AgreeandGo" button in Two Step form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @LongForm
  Scenario: TC006: Verify User is able to submit Long form
    Given User move to Long  form Page
    And User enter "Long" as FirstName in Long form
    And User enter "Form" as LastName in Long form
    And User enter "HYDERABAD" as Address in Long form
    And User enter "longform@cunet.com" as Email in Long form
    And User enter "1234567890" as PhoneNumber in Long form
    And User enter "55111" as Zip in Long form
    #  And User select "Some post graduate" as Education Level in Long form
    And User select "Certificates" as Degree in Long form
    And User select "Digital Entrepreneurship" as program of interest in Long form
    And User Selects "Yes" as TransferCreditInterest Option in Long form
    When User click "AgreeandGo" button in Long form
    Then User should see the "200" Response Status code
    And User should see the "Strayer University :: Thank You" text on page

  @PURL
  Scenario Outline: TC008: Verify User is able to see PURL Data
    Given User Navigate to Lets Go Forms Page
    Then User move to Form
    And User see "<FirstName>" as FirstName in Form
    And User see "<LastName>" as LastName in Form
    And User see "<Address>" as Street Address in Form
    And User see "<EMAIL>" as Email in Form
    And User see "<PhoneNo>" as PhoneNumber in Form
    And User see "<ZIP>" as Zip in Form
    And User see "<Degree>" as Degree in Form
    And User see "<Area>" as Area of Interest in Form

    Examples: 
      | FirstName | LastName | Address              | EMAIL               | PhoneNo      | ZIP   | Degree     | Area                     |
      #  | Morgan    | Washington | 2700 S Travis St Apt 201 | morgan.cherrelle.washington@gmail.com | 903-623-1105 | 75090 | Bachelor's | Select Area of Interest* |
      | Vanessa   | Truong   | 2801 Glen Sharon Way | huutho_tr@yahoo.com | 408-971-3937 | 95148 | Bachelor's | Select Area of Interest* |

  @AutoFillLinkedInForm @LinkedInTemplate
  Scenario Outline: : TC009: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User Enter "<Email>" ,  "<Password>" and Clicked on "Signin with LinkedIn" Button
    And User Click on "Auto fill with LinkedIn" Button
    Then User see "<FirstName>" as FirstName in LinedIn Form
    And User see "<LastName>" as LastName in LinedIn Form
    And User see "<Email>" as Email in LinedIn Form
    And User see "<PhoneNo>" as PhoneNumber in LinedIn Form
    And User see "<ZIP>" as Zip in LinedIn Form

    Examples: 
      | FirstName  | LastName | Email                        | Password | PhoneNo    | ZIP   |
      | Automation | Report   | StrayerAutoReports@gmail.com | Admin*12 | 6466469977 | 55111 |

  @AutoFillLinkedInFormSubmission @LinkedInTemplate
  Scenario Outline: : TC010: Verify User is able to submit form in Linked In Home page
    Given User Navigate to LinkedIn Home Page
    When User Enter "<Email>" ,  "<Password>" and Clicked on "Signin with LinkedIn" Button
    And User Click on "Auto fill with LinkedIn" Button
    Then User see "<FirstName>" as FirstName in LinedIn Form
    And User see "<LastName>" as LastName in LinedIn Form
    And User see "<Email>" as Email in LinedIn Form
    And User see "<PhoneNo>" as PhoneNumber in LinedIn Form
    And User see "<ZIP>" as Zip in LinedIn Form
    And User Selects "Yes" as TransferCreditInterest Option in LinkedIn form
    When User click "Submit" button in LinkedIn form
    Then User should see the "200" Response Status code
    Then User should see the "Strayer University :: Thank You" text on page

    Examples: 
      | FirstName  | LastName | Email                        | Password | PhoneNo    | ZIP   |
      | Automation | Report   | StrayerAutoReports@gmail.com | Admin*12 | 6466469977 | 55111 |

  @CobraTemplatePageUI @CobraTemplate
  Scenario: TC011: Verify UI of Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header
    Then User Should see "We're here to help!" text in Cobra Page Utility Header
    Then User should see "1.888.388.7430" phonenumber in Cobra Page Utility Header
    When User move to CobraPage Utility Navigation
    Then User should see "Affordability" Link in Cobra Page Utility Navigation
    When User Click on CobraPage Header Logo
    Then User should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Footer
    When User Click on CobraPage Footer Logo
    Then User should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Footer
    Then User should see the "2020 Strayer University" text on Cobra Page footer

  @CobraTemplatePageHeaderNavigation @CobraTemplate
  Scenario Outline: TC012: Verify Child Link navigations in Header Navigation module in Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    When User Click on "<Link>" link in Cobra Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                           |
      | affordability   | Strayer University:Affordability    |
      | programs        | Strayer University:Programs         |
      | Online Learning | Strayer University:Online Learning  |
      | Transfer Credit | Strayer University:Transfer credits |

  @CobraTemplatePageFooterNavigation @CobraTemplate
  Scenario Outline: TC013: Verify Child Link navigations in Footer module in Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Footer
    When User Click on "<Link>" link in Cobra Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | Terms of Use    | Terms of Use                      |
      | Privacy Policy  | Privacy Policy                    |
      | State Licensure | State Licensure and Authorization |
      | Opt Out         | Opt Out                           |

  @DragonTemplatePageUI @DragonTemplate
  Scenario: TC014: Verify UI of Dragon Page
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Utility Header
    Then User Should see "We're here to help!" text in Utility Header
    Then User should see "1.888.622.5374" phonenumber in Utility Header
    When User move to DragonPage Utility Navigation
    Then User should see "Programs" Link in Utility Navigation
    When User Click on DragonPage Header Logo
    Then User should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Footer
    When User Click on DragonPage Footer Logo
    Then User should see the "Strayer University" text on "Home" Page and close tab
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Footer
    Then User should see the "2020 Strayer University" text on Dragon Page footer

  @DragonTemplatePageHeaderNavigation @DragonTemplate
  Scenario Outline: TC015: Verify Child Link navigations in Header Navigation module in Dragon Page
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Utility Header Link Module
    When User Click on "<Link>" link in Dragon Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                             |
      | Affordability   | Strayer University :: Affordability   |
      | Programs        | Strayer University :: Programs        |
      | Online learning | Strayer University :: Online Learning |
      | Transfer credit | Strayer University :: Transfer Credit |

  @DragonTemplatePageFooterNavigation @DragonTemplate
  Scenario Outline: TC016: Verify Child Link navigations in Footer module in Dragon Page
    Given User Navigate to Dragon Template Page
    When User move to DragonPage Footer
    When User Click on "<Link>" link in Dragon Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | Terms of Use    | Terms of Use                      |
      | Privacy Policy  | Privacy Policy                    |
      | State Licensure | State Licensure and Authorization |
      | Opt Out         | Opt Out                           |

  @LinkedInTemplatePageUI @LinkedInTemplate
  Scenario: TC017: Verify UI of LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When User move to LinkedInPage Utility Navigation
    Then User should see "CONCENTRATIONS" Link in LinkedInpage Utility Navigation
    When User Click on LinkedInPage Header Logo
    Then User should see the "Strayer University: Accredited Online College" text on "Home" Page and close tab
    When User move to LinkedInPage Footer
    When User Click on LinkedInPage Footer Logo
    Then User should see the "Strayer University: Accredited Online College" text on "Home" Page and close tab
    When User move to LinkedInPage Footer
    Then User should see the "2020 Strayer University" text on LinkedIn Page footer

  @HeaderNavigationinLinkedInTemplatePage @LinkedInTemplate
  Scenario Outline: TC018: Verify Child Link navigations in Header Navigation module in LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When User move to LinkedInPage Utility Header Link Module
    When User Click on "<Link>" link in LinkedIn Page
    Then User should see the "<PageTitle>" text in LinkedIn Page and close tab

    Examples: 
      | Link            | PageTitle                                     |
      | WHY STRAYER?    | Strayer University: Accredited Online College |
      | CONCENTRATIONS  | Strayer University: Accredited Online College |
      | ONLINE LEARNING | Strayer University: Accredited Online College |
      | TRANSFER CREDIT | Strayer University: Accredited Online College |

  @FooterNavigationinLinkedInTemplatePage @LinkedInTemplate
  Scenario Outline: TC019: Verify Child Link navigations in Footer module in LinkedIn Page
    Given User Navigate to LinkedIn Home Page
    When User move to LinkedInPage Footer
    When User move to LinkedInPage Footer Link Module
    When User Click on "<Link>" link in LinkedIn Page
    Then User should see the "<PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                         |
      | TERMS OF USE    | Terms of Use                      |
      | PRIVACY POLICY  | Privacy Policy                    |
      | STATE LICENSURE | State Licensure and Authorization |
      | OPT OUT         | Opt Out                           |

  @Disclaimer_Modal
  Scenario Outline: TC020: Verify User is able to View Disclaimer Modals in Degree Page
    Given User Navigate to Degree Home Page
    When User Click on "<Disclaimer_Link>" on Disclaimer_Link
    Then User Should See "<Disclaimer_Modal>" Disclaimer_Modal
    And User Clicks on "<Disclaimer_Modal>" Disclaimer_Modal Close Window Link

    Examples: 
      | Disclaimer_Link                                                                   | Disclaimer_Modal    |
      | *Laptop eligibility requirements                                                  | laptop-disclaimer   |
      | Laptop Disclaimer                                                                 | laptop-disclaimer   |
      | Eligibility and participation rules apply                                         | gradfund            |
      | Please click here for important information regarding transfer credit eligibility | transfer-credit-rtb |
      | Accreditation Details                                                             | carouselModal       |

  @Video_Modal
  Scenario Outline: TC021: Verify User is able to View Video Modals in Achieve Transfer-Credits Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Link>" link in Cobra Page
    And User Click on "<Video_Link>" on Video_Link
    Then User Should See "<Video_Modal>" Video_Modal
    And User Clicks on "<Video_Modal>" Video_Modal Close Window Link

    Examples: 
      | Video_Link              | Video_Modal    | Link            |
      | Strayer Graduation Fund | graduation-1   | Transfer Credit |
      | new laptop              | transfer-tools | Transfer Credit |

  # | Student Services Coach  | success-1        | Transfer Credit |
  @BemoreFormPre-population
  Scenario Outline: : TC022: Verify User is able see Bemore Form Pre-population values in Bemore Page
    Given User Navigate to Bemore Forms Page
    Then User see "<FirstName>" as FirstName in Bemore Form
    And User see "<LastName>" as LastName in Bemore Form
    And User see "<Email>" as Email in Bemore Form
    And User see "<PhoneNo>" as PhoneNumber in Bemore Form
    And User see "<ZIP>" as Zip in Bemore Form

    Examples: 
      | FirstName  | LastName | Email                | PhoneNo      | ZIP |
      | Automation | Report   | Automation@cunet.com | 987-654-3210 |     |

  @Accredation
  Scenario: TC023: Verify Accredation component module is disaplying in Cobra Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Accredation
    Then User should see the Accredation Image
    When User Click on Accredation Image
    Then User should see the "Strayer University Accreditation" text on Accredation window
    When User Click on Accredation Link
    Then User should see the "Strayer University Accreditation" text on Accredation window

  @Bachelor_Accordion_Text
  Scenario Outline: TC024: Verify User is able to View Bachelors Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    And User Click on "<Accordion_Link>" on Accordion_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link     | Accordion_Link                | Accordion_Text                                           |
      | programs        | Bachelor | Applied Science in Management | Build from your years of industry experience             |
      | programs        | Bachelor | Business Administration       | A Strayer business degree opens the doors to your future |
      | programs        | Bachelor | Criminal Justice              | With a bachelor of science degree in criminal justice    |
      | programs        | Bachelor | Information Technology        | A Strayer bachelor                                       |

  @Masters_Accordion_Text
  Scenario Outline: TC025: Verify User is able to View Masters Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    And User Click on "<Accordion_Link>" on Accordion_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link   | Accordion_Link                        | Accordion_Text                                                                     |
      | programs        | Master | Education                             | In a time of challenge and opportunity for education and training                  |
      | programs        | Master | Health Services Administration        | Health services administration graduates are charting the future of human health   |
      | programs        | Master | Human Resource Management             | From understanding the strategic role of HR to the core functions of total rewards |
      | programs        | Master | Information Assurance (Cybersecurity) | Our information assurance degree allows you to develop your cybersecurity          |
      | programs        | Master | Information Systems                   | Learn to design                                                                    |
      #| programs        | Master | Management                            | At Strayer                                                                         |
      | programs        | Master | Public Administration                 | The Strayer master of public administration                                        |

  @MBA_Accordion_Text
  Scenario Outline: TC026: Verify User is able to View MBA Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    And User Click on "<Accordion_Link>" on Accordion_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link | Accordion_Link                   | Accordion_Text                                                      |
      | programs        | MBA  | Digital Entrepreneurship MBA     | In collaboration with Cheddar CEO Jon Steinberg                     |
      | programs        | MBA  | Jack Welch MBA                   | The Jack Welch MBA delivers all the fundamentals                    |
      | programs        | MBA  | Jack Welch Executive Certificate | Shorter in length and more intensely focused than the Executive MBA |

  @Associate_Accordion_Text
  Scenario Outline: TC027: Verify User is able to View Associate Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    And User Click on "<Accordion_Link>" on Accordion_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link      | Accordion_Link                      | Accordion_Text                                                              |
      | programs        | Associate | Acquisition and Contract Management | A Strayer associate degree in acquisition and contract management helps you |
      # | programs        | Associate | Business Administration             | Take the first step toward a rewarding career in business or government     |
      #| programs        | Associate | Information Technology              | A Strayer associate degree in information technology gives you              |
      | programs        | Associate | Marketing                           | An associate degree in marketing from Strayer prepares you                  |

  @Accordion_Text
  Scenario Outline: TC028: Verify User is able to View Deafult Accordion Text in Achieve Programs Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    Then User Navigate to Accordion Module
    When User Click on "<Link>" link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Link      | Accordion_Text                                                                 |
      | programs        | Bachelor  | At Strayer, we pair your functional and focused accounting degree with courses |
      | programs        | Master    | A Strayer master                                                               |
      | programs        | MBA       | Each one of our business management                                            |
      | programs        | Associate | A Strayer associate degree in accounting gives you the foundational accounting |

  @Aaffordability_Accordion_Text
  Scenario Outline: TC029: Verify User is able to View Deafult Accordion Text in Achieve Affordability Page
    Given User Navigate to Cobra Template Page
    When User move to CobraPage Utility Header Link Module
    And User Click on "<Child_Page_Link>" link in Cobra Page
    And User Click on "<Accordion_Link>" on Tab_Link
    Then User Should See "<Accordion_Text>" Accordion Text

    Examples: 
      | Child_Page_Link | Accordion_Link               | Accordion_Text                                             |
      | affordability   | Strayer Graduation Fund      | Save on your bachelor                                      |
      | affordability   | Strayer Referral Scholarship | Do you know a Strayer student, graduate, or faculty member |
      | affordability   | Alumni Scholarship           | All you need to do is register for an eligible             |

  @DegreeChildPageLogoNavigation
  Scenario Outline: TC030: Verify User is able to Navigate Home page when clicks on Header Logo in child page
    Given User Navigate to Degree Home Page
    When User move to CobraPage Utility Header Link Module
    When User Click on "<Link>" link in Cobra Page
    Then User should see the "<PageTitle>" text and close tab
    And User Click on CobraPage Header Logo
    Then User should see the "<Home_PageTitle>" text and close tab

    Examples: 
      | Link            | PageTitle                           | Home_PageTitle             |
      | affordability   | Strayer University:Affordability    | Strayer University:Degrees |
      | programs        | Strayer University:Programs         | Strayer University:Degrees |
      | Online Learning | Strayer University:Online Learning  | Strayer University:Degrees |
      | Transfer Credit | Strayer University:Transfer credits | Strayer University:Degrees |
