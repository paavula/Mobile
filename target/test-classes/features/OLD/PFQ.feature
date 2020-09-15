Feature: PFQ FORMS In PROD Environment

  Scenario Outline: TC001:Verify PFQ Leads Form is Working fine or Not
    Given User Navigate to " <URL>" page
    Then User should see the "200" Response Status code

    Examples: 
      | URL                                                                         |
      | http://staepb20.capella.edu:4503/bin/capella/servlet/readinessResultServlet |
      | http://staepb21.capella.edu:4503/bin/capella/servlet/readinessResultServlet |
      | http://staepb22.capella.edu:4503/bin/capella/servlet/readinessResultServlet |

      
   