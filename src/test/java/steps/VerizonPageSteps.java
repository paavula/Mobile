package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.VerizonPageActions;
import pages.locators.VerizonPageLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class VerizonPageSteps extends TestSetUp {

    VerizonPageLocators verizonPageLocators = new VerizonPageLocators();
    VerizonPageActions verzionPageActions = new VerizonPageActions();

    @Given("^User Navigate to Verizon Page$")
    public void user_navigate_to_verizon_page() throws Throwable {
	verzionPageActions.openVerizionPage();
    }

    @When("^User move to Verizon Page Utility Navigation$")
    public void i_move_to_Verizon_page_utility_navigation() throws Throwable {
	verzionPageActions.moveToUtilityNav();
    }

    @When("^User move to Verizon Page Utility Navigation Links Module$")
    public void i_move_to_Verizon_page_utility_navigation_Links_Module() throws Throwable {
	verzionPageActions.moveToUtilityNavLkink();
    }

    @Then("^User should see \"([^\"]*)\" Link in Verizon Page Utility Navigation$")
    public void i_should_see_something_link_in_verizon_page_utility_navigation(String expectedMenuText)
	    throws Throwable {
	boolean result = verzionPageActions.getTxtLinkUNav().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(verzionPageActions.getTxtLinkUNav());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on Verizon Page Header Logo$")
    public void i_click_on_Verizon_page_header_logo() throws Throwable {
	verzionPageActions.clickLogo();
    }

    @When("^User move to Verizon Page Footer$")
    public void i_move_to_Verizon_page_footer() throws Throwable {
	verzionPageActions.movetoVerizonFooter();
    }

    @When("^User Click on Verizon Page Footer Logo$")
    public void i_click_on_Verizon_page_footer_logo() throws Throwable {
	VerizonPageActions.clickFooterLogo();
    }

    @Then("^User should see the \"([^\"]*)\" text on Verizon Page footer$")
    public void i_should_see_the_something_text_on_verizon_page_footer(String expectedMenuText) throws Throwable {
	boolean result = verzionPageActions.getTxtFooter().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(verzionPageActions.getTxtFooter());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User Should see \"([^\"]*)\" Link in Verizon Page Utility Navigation$")

    public void i_should_see_something_link_in_Verizon_page_utility_navigation(String expectedMenuText)
	    throws Throwable {
	boolean result = verzionPageActions.getTxtLinkUNav().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(verzionPageActions.getTxtLinkUNav());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @When("^User move to Verizon Page Utility Header$")
    public void i_move_to_verizon_page_utility_header() throws Throwable {
	verzionPageActions.movetoUtilityHeader();
    }

    @Then("^User Should see \"([^\"]*)\" text in Verizon Page Utility Header$")
    public void i_should_see_something_text_in_verizon_page_utility_header(String expectedMenuText) throws Throwable {
	boolean result = verzionPageActions.getCampustxt().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(verzionPageActions.getCampustxt());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @Then("^User should see \"([^\"]*)\" phonenumber in Verizon Utility Header$")
    public void i_should_see_something_phonenumber_in_verizon_utility_header(String expectedMenuText) throws Throwable {
	;
	boolean result = verzionPageActions.getPhoneno().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(verzionPageActions.getPhoneno());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on \"([^\"]*)\" link in Verizon Page$")
    public void i_Click_on_link_in_Verizon_page(String link) throws Throwable {

	highlightElement(verizonPageLocators.VerizonPageLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(verizonPageLocators.VerizonPageLink.replace("value", link)))
		.click();

    }

}