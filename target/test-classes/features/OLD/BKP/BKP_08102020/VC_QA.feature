Feature: Strayer Forms Suite

      @LoginForm
  Scenario: TC_001: Verify User is able to Log into My Capella Application
    Given I am on Capella Home Page
    And I click Login link to check MC Login
    And I click Prospective Students link under Login
    Then I get MC Login modal form to enter credentials
    And I enter "4KWsQIXxxUu3Kmb7gj3ImA@gmail20200204-201121.com" username or email
    And I enter "Welcome@123" password
    And I click LogIn button in form
        And I Click on Close Button
    Then I should see the "MY PROFILE" text on My Capella Dashboard