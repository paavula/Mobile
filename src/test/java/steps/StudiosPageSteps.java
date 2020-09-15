package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.StudiosPageActions;
import pages.locators.StudiosPageLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class StudiosPageSteps extends TestSetUp {

    StudiosPageLocators stuidosPageLocators = new StudiosPageLocators();
    StudiosPageActions StudiosPageActions = new StudiosPageActions();

    @When("^User move to Studios Page MenuBar$")
    public void i_move_to_studios_page_menubar() throws Throwable {

    }

    @When("^User move to Banner Quote Component$")
    public void i_move_to_banner_quote_component() throws Throwable {
	StudiosPageActions.moveQuoteComp();
    }

    @Then("^User Should see \"([^\"]*)\" text in Banner Quote Component$")
    public void i_should_see_something_text_in_banner_quote_component(String expectedMenuText) throws Throwable {
	boolean result = StudiosPageActions.getBannerquoteTxt().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(StudiosPageActions.getBannerquoteTxt());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Given("^User Navigate to Studios Page$")
    public void user_navigate_to_studios_page() throws Throwable {
	StudiosPageActions.open_STP_Application();
    }

    @When("^User Click on Studios Page Header Logo$")
    public void i_click_on_Studios_page_header_logo() throws Throwable {
	StudiosPageActions.clickLogo();
    }

    @When("^User move to Studios Page Utility Navigation$")
    public void i_move_to_UtilityHeader_studios_page() throws Throwable {
	StudiosPageActions.clickUtilityHeader();

    }

    @When("^User move to StudiosPage Utility Header Link Module$")
    public void i_move_to_UtilityHeaderLModule_studios_page() throws Throwable {
	StudiosPageActions.clickUtilityHeaderLmodule();

    }

    @When("^User move to Studios Page Footer$")
    public void i_move_to_studios_page_footer() throws Throwable {
	StudiosPageActions.moveFooter();
    }

    @When("^User Click on Studios Page Footer Logo$")
    public void i_click_on_Studios_page_footer_logo() throws Throwable {
	StudiosPageActions.clickFooterLogo();
    }

    @Then("^User Should see \"([^\"]*)\" Link in Studios Page Utility Navigation$")
    public void i_Should_see_Link_in_Studios_Page_Utility_Navigation(String expectedMenuText) throws Throwable {

	boolean result = StudiosPageActions.getTxtLinkUHeader().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(StudiosPageActions.getTxtLinkUHeader());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @When("^User Click on \"([^\"]*)\" link in Studios Page$")
    public void i_Click_on_link_in_Studios_page(String link) throws Throwable {

	highlightElement(stuidosPageLocators.StudiosPageLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(stuidosPageLocators.StudiosPageLink.replace("value", link)))
		.click();

    }

    @When("^User move to Studios Page Banner Module$")
    public void i_move_to_studios_page_banner_module() throws Throwable {
	StudiosPageActions.movetoBanner();
    }

    @When("^User move to Studios Page BannerwithCTA Module$")
    public void i_move_to_studios_page_bannerwithcta_module() throws Throwable {
	StudiosPageActions.movetoBannerCTA();
	// throw new PendingException();
    }

    @When("^User Click on CTA Button in BannerwithCTA Module$")
    public void i_click_on_cta_button_in_bannerwithcta_module() throws Throwable {
	// throw new PendingException();
	StudiosPageActions.clickOnBannerCTA();
    }

    @Then("^User should see the \"([^\"]*)\" text on Studios Page Banner$")
    public void i_should_see_the_something_text_on_studios_page_banner(String expectedMenuText) throws Throwable {
	boolean result = StudiosPageActions.getquoteTxt().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(StudiosPageActions.getquoteTxt());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @Then("^User should see \"([^\"]*)\" Link in Studios Page Utility Navigation$")
    public void i_should_see_Link_in_Utility_Navigation_studios_page(String expectedMenuText) throws Throwable {

	boolean result = StudiosPageActions.getTxtLinkUNav().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(StudiosPageActions.getTxtLinkUNav());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @Then("^User should see the \"([^\"]*)\" text on Studios Page footer$")
    public void i_should_see_the_text_on_Dp_footer_studios_page(String expectedMenuText) throws Throwable {
	boolean result = StudiosPageActions.getTxtcopyright().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(StudiosPageActions.getTxtcopyright());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

}
