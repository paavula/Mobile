package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CommencementPageActions;
import pages.locators.CommencementPageLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class CommencementPageSteps extends TestSetUp {

    CommencementPageLocators commencementPageLocators = new CommencementPageLocators();
    CommencementPageActions commencementPageActions = new CommencementPageActions();

    @Given("^User Navigate to Commencement Page$")
    public void user_navigate_to_commencement_page() throws Throwable {
	commencementPageActions.openCommencementPage();
    }

    @When("^User move to Commencement Page Utility Navigation$")
    public void i_move_to_commencement_page_util_navigations() throws Throwable {
	commencementPageActions.moveToUtlHeader();
    }

    @When("^User move to Commencement Page Menu Navigation$")
    public void i_move_to_commencement_page_menu_navigation() throws Throwable {
	commencementPageActions.moveToMenuNav();
    }

    @When("^User move to Commencement Page Banner With Timer module$")
    public void i_move_to_commencement_page_banner_with_timer_module() throws Throwable {
	commencementPageActions.moveToBnnerModule();
    }

    @Then("^User should see the \"([^\"]*)\" text on Banner$")
    public void i_should_see_the_something_text_on_banner(String expectedMenuText) throws Throwable {
	boolean result = commencementPageActions.getTxtBnner().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(commencementPageActions.getTxtBnner());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see \"([^\"]*)\" Link in Commencement Page Utility Navigation$")
    public void i_should_see_something_link_in_commencement_page_utility_navigation(String expectedMenuText)
	    throws Throwable {
	boolean result = commencementPageActions.getTxtLinkUNav().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(commencementPageActions.getTxtLinkUNav());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on Commencement Page Header Logo$")
    public void i_click_on_commencement_page_header_logo() throws Throwable {
	commencementPageActions.clickLogo();
    }

    @When("^User move to Commencement Page Footer$")
    public void i_move_to_commencement_page_footer() throws Throwable {
	commencementPageActions.movetocommencementFooter();
    }

    @When("^User Click on Commencement Page Footer Logo$")
    public void i_click_on_commencement_page_footer_logo() throws Throwable {
	commencementPageActions.clickFooterLogo();
    }

    @When("^User move to Commencement Page FooterLink Module$")
    public void i_move_to_commencement_page_footerlink_module() throws Throwable {
	commencementPageActions.movetocommFooterlm();
    }

    @When("^User move to Commencement Page SocialLink Module$")
    public void i_move_to_commencement_page_sociallink_module() throws Throwable {
	commencementPageActions.movetoSocialMed();
    }

    @When("^User move to Commencement Page Table Module$")
    public void i_move_to_commencement_page_table_module() throws Throwable {
	commencementPageActions.movetoTable();
    }

    @When("^User Click on CTA Button in TablewithCTA Module in Commencement Page$")
    public void i_click_on_cta_button_in_tablewithcta_module_in_commencement_page() throws Throwable {
	commencementPageActions.clickCtaTbl();
    }

    @Then("^User should see the \"([^\"]*)\" text on Commencement Page Table$")
    public void i_should_see_the_something_text_on_commencement_page_table(String expectedMenuText) throws Throwable {
	boolean result = commencementPageActions.getTxtTable().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(commencementPageActions.getTxtTable());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on Commencement Page footer$")
    public void i_should_see_the_something_text_on_commencement_page_footer(String expectedMenuText) throws Throwable {
	boolean result = commencementPageActions.getTxtFooter().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(commencementPageActions.getTxtFooter());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User Should see \"([^\"]*)\" Link in Commencement Page Utility Navigation$")
    public void i_should_see_something_text_in_commencement_page_utility_header_Navigation(String expectedMenuText)
	    throws Throwable {
	boolean result = commencementPageActions.getTxtLinkUNav().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(commencementPageActions.getTxtLinkUNav());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @When("^User Click on \"([^\"]*)\" link in Commencement Page$")
    public void i_Click_on_link_in_commencement_page(String link) throws Throwable {

	highlightElement(commencementPageLocators.CommencementPageLink.replace("value", link));
	DriverManager.driver.get()
		.findElement(By.xpath(commencementPageLocators.CommencementPageLink.replace("value", link))).click();

    }

    @Then("^User Should see \"([^\"]*)\" Link in Commencement Page Menu Navigation$")
    public void i_should_see_something_link_in_commencement_page_menu_navigation(String expectedMenuText)
	    throws Throwable {
	boolean result = commencementPageActions.getMenuTxt().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(commencementPageActions.getMenuTxt());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Given("^User Navigate to Nominate Teacher Page$")
    public void user_navigate_to_nominate_teacher_page() throws Throwable {
	commencementPageActions.openNomTeacherPage();
    }

    @Given("^User Navigate to Valedictorian Teacher Page$")
    public void user_navigate_to_Valedictorian_teacher_page() throws Throwable {
	commencementPageActions.openValedictorianPage();
    }

}