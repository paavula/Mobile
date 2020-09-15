Feature: Social Links validations in Strayer Home Page 

@SocialLinks
Scenario Outline: TC001: Verify Social Links module is disaplying in Strayer Home Page 

	Given I am on the Home page "https://strayer.edu/" of Staryer Home Page website
	When I move to footer
	Then I should see the "Contact Us" text on footer
	When I move to SocialLink 
	Then I should see the "CONNECT WITH US" text on SocialLink
	Then I should see the "Facebook,Twitter,LinkedIn,Youtube,Instagram,Pintrest,Buzz Blog" icons in SocialLinkModule
	When I Click on "<Icon>" icon
	Then I should see the "<PageTitle>" text on "<Icon>" iconPage and close tab
	
Examples: 
	|Icon					|PageTitle																															|
	|facebook			|Strayer University - Home																							|
	|twitter			|Strayer University (@StrayerU)																					|
	|linkedin			|Strayer University																											|
	|youtube			|Strayer University - YouTube																						|
	|instagram		|Strayer University (@strayeruniversity) • Instagram photos and videos	|			
	|pinterest		|Strayer University (strayeru) on Pinterest															|
	|buzz					|Strayer University Buzz Blog																						|		
							 
							 