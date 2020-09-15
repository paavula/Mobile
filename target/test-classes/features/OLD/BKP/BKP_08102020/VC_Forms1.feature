Feature: VC Forms Suite

  @PasswordRestForm
  Scenario: TC_003: Verify user is able to submit Password Reset form
    Given I am on Capella Home Page
    And I click Login link to check MC Login
    And I click Prospective Students link under Login
    Then I get MC Login modal form to enter credentials
    And I Clikc on Reset Password Link
    Then I get Forgot Password form
    And I enter as "automation1@gmail.com" Email Address in Form
    And I Clikc on Request Password Button
    Then I get Reset Password Sucess Window
    And I Click on Ok Button
 