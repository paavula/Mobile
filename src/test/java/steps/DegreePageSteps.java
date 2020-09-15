package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.DegreePageActions;
import pages.locators.DegreePageLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class DegreePageSteps extends TestSetUp {

    DegreePageLocators degreePageLocators = new DegreePageLocators();
    DegreePageActions degreePageActions = new DegreePageActions();

    @Given("^User Navigate to Degree Page$")
    public void user_Navigate_to_Degree_Template_Page() throws Throwable {
	degreePageActions.open_DP_Application();
    }

    @When("^User Click on \"([^\"]*)\" link in Degree Page$")
    public void i_Click_on_link_in_Degree_page(String link) throws Throwable {

	highlightElement(degreePageLocators.DegreePageLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(degreePageLocators.DegreePageLink.replace("value", link)))
		.click();
	Thread.sleep(3000);

    }

    @When("^User Click on Degree Page Header Logo$")
    public void i_click_on_degree_page_header_logo() throws Throwable {
	degreePageActions.clickLogo();
    }

    @When("^User Click on Degree Page Footer Logo$")
    public void i_click_on_degree_page_footer_logo() throws Throwable {
	degreePageActions.clickFooterLogo();
    }

    @When("^User move to Degree Page Utility Navigation$")
    public void i_move_to_Utility_Header_Degree() throws Throwable {
	degreePageActions.clickUtilityHeader();

    }

    @When("^User move to DegreePage Utility Header Link Module$")
    public void i_move_to_UtilityHeaderLModule_Degree() throws Throwable {
	degreePageActions.clickUtilityHeaderLmodule();

    }

    @When("^User move to Degree Page Footer$")
    public void i_move_to_degree_page_footer_Degree() throws Throwable {
	degreePageActions.movetoDegreeFooter();

    }

    @Then("^User Should see \"([^\"]*)\" Link in Degree Page Utility Navigation$")
    public void i_should_see_link_in_degree_page_utility_navigation_Degree_page(String expectedMenuText)
	    throws Throwable {
	boolean result = degreePageActions.getTxtLinkUHeader().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(degreePageActions.getTxtLinkUHeader());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @Then("^User should see \"([^\"]*)\" phonenumber in Degree Page Utility Header$")
    public void i_should_see_phonenumber_in_Utility_Header_Degree(String expectedMenuText) throws Throwable {
	boolean result = degreePageActions.getTxtLinkUpno().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(degreePageActions.getTxtLinkUpno());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to DegreePage Utility Navigation$")
    public void i_move_to_DegreePage_Utility_Navigation_Degree() throws Throwable {
	degreePageActions.clickUtilityNav();
    }

    @Then("^User should see the \"([^\"]*)\" text on Degree Page footer$")
    public void i_should_see_the_text_on_Dp_footer_Degree(String expectedMenuText) throws Throwable {
	boolean result = degreePageActions.getTxtcopyright().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(degreePageActions.getTxtcopyright());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    /*
     * @When("^User move to Degree Form$") public void i_move_to_degree_form()
     * throws Throwable { degreePageActions.movetoDegreeForm(); }
     * 
     * @When("^User click \"([^\"]*)\" button in Degree form$") public void
     * i_click_something_button_in_degree_form(String Submit) throws Throwable {
     * degreePageActions.ClickSUbmitBtn(); Thread.sleep(1000); }
     * 
     * @And("^User enter \"([^\"]*)\" as FirstName in Degree form$") public void
     * i_enter_something_as_firstname_in_degree_form(String fName) throws Throwable
     * { degreePageActions.enterFNameDF(fName); }
     * 
     * @And("^User enter \"([^\"]*)\" as LastName in Degree form$") public void
     * i_enter_something_as_lastname_in_degree_form(String lName) throws Throwable {
     * degreePageActions.enterlNameDF(lName); }
     * 
     * @And("^User enter \"([^\"]*)\" as Company in Degree form$") public void
     * i_enter_something_as_company_in_degree_form(String company) throws Throwable
     * { degreePageActions.enterCompany(company); }
     * 
     * @And("^User enter \"([^\"]*)\" as Title in Degree form$") public void
     * i_enter_something_as_title_in_degree_form(String title) throws Throwable {
     * degreePageActions.enterTitle(title); }
     * 
     * @And("^User enter \"([^\"]*)\" as Email in Degree form$") public void
     * i_enter_something_as_email_in_degree_form(String email) throws Throwable {
     * degreePageActions.enterEmail(email); }
     * 
     * @And("^User enter \"([^\"]*)\" as Comments in Degree form$") public void
     * i_enter_something_as_comments_in_degree_form(String comments) throws
     * Throwable { degreePageActions.enterCeomments(comments); }
     * 
     * @When("^User click \"([^\"]*)\" button in Sucess window in form$") public
     * void i_click_something_button_in_sucess_window_in_form(String strArg1) throws
     * Throwable { degreePageActions.clickCloseBtn(); }
     * 
     * @Then("^User should see the \"([^\"]*)\" text on Window$") public void
     * i_should_see_the_something_text_on_window(String expectedMenuText) throws
     * Throwable { boolean result = degreePageActions.getTxtwinodw().contains(
     * expectedMenuText); System.out.println(expectedMenuText);
     * System.out.println(degreePageActions.getTxtwinodw()); try {
     * Assert.assertEquals(result, true, "Title didn't match"); } catch (Throwable
     * t) {
     * 
     * ErrorUtil.addVerificationFailure(t); throw t; } }
     */
}
