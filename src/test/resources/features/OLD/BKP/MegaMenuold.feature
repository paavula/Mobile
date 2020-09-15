Feature: Mega Menus validations in Strayer Home Page 
	In order to validate that the Mega Menus in Strayer Home Page are available we will do acceptance testing

@MegaMenu 
Scenario: TC001: Verify Mega Menus is disaplying in Strayer Home Page 

	Given I am on the Home page "https://strayer.edu/" of Staryer Home Page website 
	When I move to Degrees Menu 
	Then I should see the "DEGREES" text on Degrees Menu 
	When I move to Strayer ADMISSIONS Menu 
	Then I should see "ADMISSIONS" on Strayer ADMISSIONS Menu 
	When I move to Tution and Financial AID Menu 
	Then I should see "TUITION & FINANCIAL AID" on Strayer Financing Menu 
	When I move to Why Strayer Menu 
	Then I should see "WHY STRAYER" on Why Strayer Menu 
@Degree 
Scenario: TC002: Verify Child Links navigation under Degree Link in Mega Menu in Strayer Home Page 

	Given I am on the Home page "https://strayer.edu/" of Staryer Home Page website 
	When I move to Degrees Menu 
	Then I should see the "DEGREES" text on Degrees Menu 
	When I move to Degrees Menu  
	When I Click on MBA link 
	Then I should see the "MBA For Working Professionals | Strayer University" text on MBA Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on MastersDegrees link 
	Then I should see the "Online Master's Degrees | Strayer University" text on MastersDegrees Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on BachelorsDegrees link 
	Then I should see the "Online Bachelor's Degree | Strayer University" text on BachelorsDegrees Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on Certificates link 
	Then I should see the "Online Certificate Programs & Online Diplomas | Strayer University" text on Certificates Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on CourseCatalog link 
	Then I should see the "Online College Courses | Course Catalog | Strayer University" text on CourseCatlog Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on Accounting link 
	Then I should see the "Online Accounting Degrees | Strayer University" text on Accounting Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on BusinessFinance link 
	Then I should see the "Online Business Degrees | Strayer University" text on BusinessFinance Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on CriminalJustice link
	Then I should see the "Online Criminal Justice Degrees | Strayer University" text on CriminalJustice Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on EducationTraining link 
	Then I should see the "Online Education Degrees | Strayer University" text on EducationTraining Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on LeadershipManagementMBA link 
	Then I should see the "Jack Welch Management Institute" text on LeadershipManagementMBA Page
	Then I close tab
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on EntrepreneurshipMBA link 
	Then I should see the "Strayer's Digital Entrepreneurship MBA | Digital Entrepreneurship MBA" text on EntrepreneurshipMBA Page 
	Then I close tab 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on HealthServicesAdministration link 
	Then I should see the "Online Health Services Administration Degrees | Strayer University" text on HealthServicesAdministration Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on InformationTechnology link 
	Then I should see the "Online Information Technology Degrees | Strayer University" text on InformationTechnology Page 
	When I Click on Logo Image 
	When I move to Degrees Menu 
	When I Click on PerformanceManagement link 
	Then I should see the "Joe Gibbs Performance Management Programs | Strayer University" text on PerformanceManagement Page 
	
