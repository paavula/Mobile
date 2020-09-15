package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.AllCompsPageActions;
import pages.locators.AllCompsPageLocators;
import setup.TestSetUp;
import utils.ErrorUtil;

public class AllCompsPageSteps extends TestSetUp {

    AllCompsPageLocators AllCompsPageLocators = new AllCompsPageLocators();
    AllCompsPageActions AllCompsPageActions = new AllCompsPageActions();

    @Given("^User Navigate to All Component Page$")
    public void user_Navigate_to_All_Comps_Page() throws Throwable {
	AllCompsPageActions.open_ACP_Application();
    }

    @Given("^User Navigate to Buzz Page$")
    public void user_Navigate_to_Buzz_Page() throws Throwable {
	AllCompsPageActions.open_Buzz_Application();
    }

    @When("^User move to Blog Component Blog Subscription Module in All Component Page$")
    public void i_move_to_Blogmps_Page_Blog_All() throws Throwable {
	AllCompsPageActions.clickBuzzSubs();

    }

    @When("^User move to Blog Component Blog Subscription Module in Buzz Page$")
    public void i_move_to_Buzz_Page_Blog_All() throws Throwable {
	AllCompsPageActions.clickBuzzSubs();

    }

    @When("^User enter \"([^\"]*)\" as Email in Blog Subsciprtion Field$")
    public void i_enter_as_Email_in_blog_All_Comp_Page(String email) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	AllCompsPageActions.enterEmail(email);
    }

    @When("^User Click on \"([^\"]*)\" button in Blog Module in All Component Page$")
    public void i_click_button_in_blog_All(String arg1) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	AllCompsPageActions.clickSubmitBtn();
    }

    @Then("^User should see the \"([^\"]*)\" for Email field in Blog Module$")
    public void i_should_see_the_for_Email_field_Blog_All_Page(String expectedErrorMsg) throws Throwable {

	boolean result = AllCompsPageActions.getEmailError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(AllCompsPageActions.getEmailError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }
}
