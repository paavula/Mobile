package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CheddarPageActions;
import pages.locators.CheddarPageLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class CheddarPageSteps extends TestSetUp {

    CheddarPageLocators cheddarPageLocators = new CheddarPageLocators();
    CheddarPageActions CheddarPageActions = new CheddarPageActions();

    @Given("^User Navigate to Cheddar Page$")
    public void user_navigate_to_cheddar_page() throws Throwable {
	CheddarPageActions.open_CTP_Application();
    }

    @Given("^User Navigate to Mobile Mba Page$")
    public void user_navigate_to_mmba_page() throws Throwable {
	CheddarPageActions.open_mobilemba_Application();
    }

    @When("^User move to Cheddar Page Utility Navigation$")
    public void i_move_to_cheddar_page_utility_navigation() throws Throwable {
	CheddarPageActions.clickUtilityHeader();
    }

    @When("^User Click on Cheddar Page Header Logo$")
    public void i_click_on_cheddar_page_header_logo() throws Throwable {
	CheddarPageActions.clickLogo();
    }

    @When("^User move to Cheddar Page Footer$")
    public void i_move_to_cheddar_page_footer() throws Throwable {
	CheddarPageActions.movetoCheddarFooter();
    }

    @When("^User move to Cheddar Page Footer Link Module$")
    public void i_move_to_cheddar_page_footer_Link_Mdl() throws Throwable {
	CheddarPageActions.movetoCheddarFooterLM();
    }

    @When("^User Click on Cheddar Page Footer Logo$")
    public void i_click_on_cheddar_page_footer_logo() throws Throwable {
	CheddarPageActions.clickFooterLogo();
    }

    @Then("^User Should see \"([^\"]*)\" Link in Cheddar Page Utility Navigation$")
    public void i_should_see_something_link_in_Cheddar_page_utility_navigation(String expectedMenuText)
	    throws Throwable {
	boolean result = CheddarPageActions.getTxtLinkUHeader().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CheddarPageActions.getTxtLinkUHeader());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @Then("^User Close Cheddar Page menu Close Button$")
    public void i_close_cheddar_page_menu_close_button() throws Throwable {
	CheddarPageActions.closeMenu();
    }

    @Then("^User should see the \"([^\"]*)\" text on Cheddar Page footer$")
    public void i_should_see_something_link_in_Cheddar_page_footer(String expectedMenuText) throws Throwable {
	boolean result = CheddarPageActions.getTxtFooter().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CheddarPageActions.getTxtFooter());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @When("^User Click on \"([^\"]*)\" Form link in Cheddar Page$")
    public void i_Click_on_form_link_in_Cheddar_page(String link) throws Throwable {

	CheddarPageActions.clickDwnFromBtn();

    }

    @When("^User Click on \"([^\"]*)\" link in Cheddar Page$")
    public void i_Click_on_link_in_Cheddar_page(String link) throws Throwable {

	highlightElement(cheddarPageLocators.CheddarPageLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(cheddarPageLocators.CheddarPageLink.replace("value", link)))
		.click();

    }

    @When("^User move to Cheddar Page ImagewithCTA Module$")
    public void i_move_to_cheddar_page_imagewithcta_module() throws Throwable {
	CheddarPageActions.movetoBanner();
    }

    @When("^User Click on CTA Button in ImagewithCTA Module$")
    public void i_click_on_cta_button_in_imagewithcta_module() throws Throwable {
	CheddarPageActions.clickonBannerLink();
    }

    /*
     * 
     * @When("^User move to MicroSite form$") public void i_move_to_microsite_form()
     * throws Throwable { CheddarPageActions.moveToMForm(); }
     * 
     * @When("^User click \"([^\"]*)\" button in MicroSite form$") public void
     * i_click_something_button_in_microsite_form(String strArg1) throws Throwable {
     * CheddarPageActions.ClickAnGobtn(); Thread.sleep(4000); }
     * 
     * 
     * @And("^User enter \"([^\"]*)\" as FirstName in Download form$") public void
     * i_enter_something_as_firstname_in_download_form(String fName) throws
     * Throwable { CheddarPageActions.enterfNamedw(fName); }
     * 
     * @And("^User enter \"([^\"]*)\" as LastName in Download form$") public void
     * i_enter_something_as_lastname_in_download_form(String lName) throws Throwable
     * { CheddarPageActions.enterlNamedw(lName); }
     * 
     * @And("^User enter \"([^\"]*)\" as Email in Download form$") public void
     * i_enter_something_as_email_in_download_form(String email) throws Throwable {
     * CheddarPageActions.enterEmaildw(email); }
     * 
     * @And("^User enter \"([^\"]*)\" as PhoneNumber in Download form$") public void
     * i_enter_something_as_phonenumber_in_download_form(String phone) throws
     * Throwable { CheddarPageActions.enterphoneNumberdw(phone); }
     * 
     * @And("^User enter \"([^\"]*)\" as Zip in Download form$") public void
     * i_enter_something_as_zip_in_download_form(String zip) throws Throwable {
     * CheddarPageActions.enterZipdw(zip); }
     * 
     * @When("^User click \"([^\"]*)\" button in Download form$") public void
     * i_click_something_button_in_download_form(String strArg1) throws Throwable {
     * CheddarPageActions.ClickAnGobtndw(); Thread.sleep(3000); }
     * 
     * 
     * 
     * @When("^User click \"([^\"]*)\" button in Cheddar Download form$") public
     * void i_click_something_button_in_cheddar_download_form(String strArg1) throws
     * Throwable { CheddarPageActions.ClickAnGobtncfdw(); Thread.sleep(3000); }
     * 
     * 
     * @And("^User enter \"([^\"]*)\" as FirstName in MicroSite form$") public void
     * i_enter_something_as_firstname_in_MicroSite_form(String fName) throws
     * Throwable { CheddarPageActions.enterfName(fName); }
     * 
     * @And("^User enter \"([^\"]*)\" as LastName in MicroSite form$") public void
     * i_enter_something_as_lastname_in_MicroSite_form(String lName) throws
     * Throwable { CheddarPageActions.enterlName(lName); }
     * 
     * @And("^User enter \"([^\"]*)\" as Email in MicroSite form$") public void
     * i_enter_something_as_email_in_MicroSite_form(String email) throws Throwable {
     * CheddarPageActions.enterEmail(email); }
     * 
     * @And("^User enter \"([^\"]*)\" as PhoneNumber in MicroSite form$") public
     * void i_enter_something_as_phonenumber_in_MicroSite_form(String phone) throws
     * Throwable { CheddarPageActions.enterphoneNumber(phone); }
     * 
     * @And("^User select \"([^\"]*)\" as education level in download form$") public
     * void as_education_of_level_in_cheddar_download_form(String elVal) throws
     * Throwable {
     * 
     * CheddarPageActions.selecteldf(elVal); }
     * 
     * 
     * 
     * @And("^User enter \"([^\"]*)\" as Zip in MicroSite form$") public void
     * i_enter_something_as_zip_in_MicroSite_form(String zip) throws Throwable {
     * CheddarPageActions.enterZip(zip); }
     * 
     * 
     * @And("^User select \"([^\"]*)\" as education level in form$") public void
     * as_education_of_level_in_micro_cheddar_form(String elvVal) throws Throwable {
     * 
     * CheddarPageActions.selectel(elvVal); }
     */
    // Micro-site form error

    @Then("^User should see the \"([^\"]*)\" for FirstName field in MicroSite form$")
    public void i_should_see_the_for_FirstName_field_mf(String expectedErrorMsg) throws Throwable {

	boolean result = CheddarPageActions.getfNameError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(CheddarPageActions.getfNameError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for LastName field in MicroSite form$")
    public void i_should_see_the_for_LastName_field_mf(String expectedErrorMsg) throws Throwable {

	boolean result = CheddarPageActions.getlNameError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(CheddarPageActions.getlNameError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for Email field in MicroSite form$")
    public void i_should_see_the_for_Email_field_mf(String expectedErrorMsg) throws Throwable {

	boolean result = CheddarPageActions.getEmailError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(CheddarPageActions.getEmailError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for PhoneNumber field in MicroSite form$")
    public void i_should_see_the_for_PhoneNumber_field_mf(String expectedErrorMsg) throws Throwable {

	boolean result = CheddarPageActions.getPhoneError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(CheddarPageActions.getPhoneError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for ZipCode field in MicroSite form$")
    public void i_should_see_the_for_ZipCode_field_mf(String expectedErrorMsg) throws Throwable {

	boolean result = CheddarPageActions.getZipeError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(CheddarPageActions.getZipeError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

}