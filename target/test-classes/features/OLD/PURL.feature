Feature: PURL Test Suite


 @PURL 
  Scenario Outline: TC001: PURL In PROD Env
    Given User Navigate to " <URL>" page
    Then I move to Form
    And I see "<FirstName>" as FirstName in Form
      And I see "<LastName>" as LastName in Form
       And I see "<Address>" as Street Address in Form
    And I see "<EMAIL>" as Email in Form
    And I see "<PhoneNo>" as PhoneNumber in Form
    And I see "<ZIP>" as Zip in Form
    And I see "<Degree>" as Degree in Form
    And I see "<Area>" as Area of Interest in Form
     

    Examples: 
      | URL                                  | FirstName                 |LastName|Address|EMAIL|PhoneNo|ZIP|Degree|Area|
      | https://letsgo.strayer.edu/vanessatruong1 | Vanessa |Truong|2801 Glen Sharon Way|huutho_tr@yahoo.com|408-971-3937|95148|Bachelor's||
          |https://letsgo.strayer.edu/moniquesmall5| Monique |Small|240 E 92Nd St|moniquesmall53@gmail.com|262-749-2185|11212|Bachelor's||
    |https://letsgo.strayer.edu/tierrabrown19| Tierra |Brown|3571 Meridian Rd|brown.latrina22@gmail.com|662-629-2318|38642|Bachelor's||
    |https://letsgo.strayer.edu/ronniewashington1| Ronnie |Washington|3844 W 27Th St|ronniewash43@gmail.com|323-741-7643|90018|Bachelor's||
   |https://letsgo.strayer.edu/shannonanderson3| Shannon |Anderson|413 E Poplar St|shannonwillard55@gmail.com|507-525-6522|28164|Bachelor's||
   |https://letsgo.strayer.edu/nicholaswallick| Nicholas |Wallick|436 W Savory St|nawallick@msn.com|570-640-6630|17901|Bachelor's||
   |https://letsgo.strayer.edu/estherordenes1| Esther |Ordenes|8401 W Charleston Blvd|esther.colvin81@gmail.com||89117|Bachelor's|| 



 @PURL 
  Scenario Outline: TC004:PURL Test in STAGE Env
    Given User Navigate to " <URL>" page
    Then I move to Form
    And I see "<FirstName>" as FirstName in Form
    And I see "<LastName>" as LastName in Form
    And I see "<Address>" as Street Address in Form
    And I see "<EMAIL>" as Email in Form
    And I see "<PhoneNo>" as PhoneNumber in Form
    And I see "<ZIP>" as Zip in Form
    And I see "<Degree>" as Degree in Form
    And I see "<Area>" as Area of Interest in Form
     

    Examples: 
    | URL                                  | FirstName                 |LastName|Address|EMAIL|PhoneNo|ZIP|Degree|Area|
    | https://stgletsgo2.strayer.edu/vanessatruong1 | Vanessa |Truong|2801 Glen Sharon Way|huutho_tr@yahoo.com|408-971-3937|95148|Bachelor's||
    |https://stgletsgo2.strayer.edu/moniquesmall5| Monique |Small|240 E 92Nd St|moniquesmall53@gmail.com|262-749-2185|11212|Bachelor's||
    |https://stgletsgo2.strayer.edu/tierrabrown19| Tierra |Brown|3571 Meridian Rd|brown.latrina22@gmail.com|662-629-2318|38642|Bachelor's||
    |https://stgletsgo2.strayer.edu/ronniewashington1| Ronnie |Washington|3844 W 27Th St|ronniewash43@gmail.com|323-741-7643|90018|Bachelor's||
	|https://stgletsgo2.strayer.edu/shannonanderson3| Shannon |Anderson|413 E Poplar St|shannonwillard55@gmail.com|507-525-6522|28164|Bachelor's||
	|https://stgletsgo2.strayer.edu/nicholaswallick| Nicholas |Wallick|436 W Savory St|nawallick@msn.com|570-640-6630|17901|Bachelor's||
	|https://stgletsgo2.strayer.edu/estherordenes1| Esther |Ordenes|8401 W Charleston Blvd|esther.colvin81@gmail.com||89117|Bachelor's|| 
