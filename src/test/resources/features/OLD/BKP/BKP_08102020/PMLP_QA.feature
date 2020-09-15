Feature: PMLP FORMS In QA Environment

  @RFIinBussinessPage
  Scenario Outline: TC001:Verify user is able to submit Request Information form in Lp Bachelors Page
    Given User Navigate to " <URL>" page
    When I Click on  "<Link>" RFP
    #Then I should navigate to Request Information form
    And I select "Certificate" as Degree in LP form
    And I select "Analytics" as Area of Study in LP form
    And I select "Grad Cert - Business Administration'" as Bachelors Specialization Study in LP form
    And I select "As soon as possible" Start date in Lp Form
    And I enter "LP" as First Name in LP form
    And I enter "Form" as Last Name in LP form
    And I enter "<Email>" in Email Address in LP form
    And I enter PhoneNumber as Phone Number in LP form
    And I enter "55111" as ZipCode in LP form
    And I submit the LP form
    # And I should see "Thank you," in the Thankyou Page for LP Form
   # And I should see "trigger=irf_submit" in Thankyou Page URL

    Examples: 
      | URL                                  | Link                    | Email                                |
 |	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2501@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2502@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2503@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2504@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2505@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2506@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2507@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2508@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2509@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2510@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2511@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2512@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2513@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2514@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2515@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2516@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2517@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2518@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2519@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2520@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2521@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2522@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2523@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2524@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2525@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2526@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2527@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2528@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2529@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2530@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2531@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2532@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2533@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2534@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2535@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2536@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2537@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2538@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2539@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2540@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2541@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2542@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2543@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2544@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2545@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2546@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2547@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2548@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2549@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2550@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2551@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2552@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2553@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2554@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2555@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2556@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2557@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2558@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2559@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2560@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2561@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2562@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2563@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2564@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2565@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2566@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2567@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2568@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2569@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2570@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2571@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2572@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2573@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2574@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2575@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2576@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2577@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2578@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2579@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2580@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2581@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2582@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2583@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2584@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2585@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2586@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2587@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2588@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2589@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2590@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2591@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2592@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2593@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2594@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2595@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2596@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2597@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2598@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2599@gmail.com	|
|	https://qawww.capella.edu/lp/bachelors	|	Request Program Details 	|	4KWsQIXxxUu3Kmb7gj3ImA2600@gmail.com	|
 