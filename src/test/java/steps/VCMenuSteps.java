package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.VCMegaMenuActions;
import pages.locators.VCMegaMenuLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class VCMenuSteps extends TestSetUp {

    VCMegaMenuLocators megamenuLocators = new VCMegaMenuLocators();
    VCMegaMenuActions megamenuActions = new VCMegaMenuActions();

    @Given("^User am on Capella LP Home Page$")
    public void userAmOnCapellaLPHomePage() throws Throwable {
	megamenuActions.OpenLpHomePage();
    }

    @Given("^User am on Capella LP Accessibility commitment Page$")
    public void userAmOnCapellaLPAccessibilityPage() throws Throwable {
	megamenuActions.OpenLpAccessibilityPage();
    }

    @Given("^User am on Capella LP PHD Page$")
    public void userAmOnCapellaLP_PHD_Page() throws Throwable {
	megamenuActions.OpenLpPhdPage();
    }

    @When("^User move to LP Accordion Module$")
    public void userMoveToLPAccordionModule() throws Throwable {
	megamenuActions.moveToLpAccordion();
    }

    @And("^User Clicks on \"([^\"]*)\" on Tab Link$")
    public void User_ClickOnSomethingOn_TabLink(String tablink) throws Throwable {
	highlightElement(megamenuLocators.culpTabsrlink.replace("value", tablink));
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.culpTabsrlink.replace("value", tablink)))
		.click();
	Thread.sleep(3000);
    }

    @And("^User Clicks on \"([^\"]*)\" Accordion Button$")
    public void user_ClicksOnSomething_AccordionButton(String button) throws Throwable {
	Thread.sleep(1500);
	highlightElement(megamenuLocators.culpAccrodionBtn.replace("value", button));
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.culpAccrodionBtn.replace("value", button)))
		.click();
	Thread.sleep(3000);
    }

    @Then("^User Should See \"([^\"]*)\" In LP Accordion Module$")
    public void User_should_see_Lp_Accordion_text(String Program) throws Throwable {
	Thread.sleep(2000);
	highlightElement(megamenuLocators.culpaccordionModuleText.replace("value", Program));
	DriverManager.driver.get()
		.findElement(By.xpath(megamenuLocators.culpaccordionModuleText.replace("value", Program))).click();
	Thread.sleep(3000);
    }

    @When("^User move to Jumplink Menu$")
    public void userMoveToJumplinkMenu() throws Throwable {
	megamenuActions.movetoJumpLinkMenu();
    }

    @When("^User move to LP Utility Navigation$")
    public void userMoveTo_LP_Utility_Navigation() throws Throwable {
	megamenuActions.movetoLPUtilityNav();
    }

    @Then("^User should see the \"([^\"]*)\" Jump link Module$")
    public void iShouldSeeTheSomethingJumpLinkModule(String jumplinkmodule) throws Throwable {
	highlightElement(megamenuLocators.culpjumplinkmodule.replace("value", jumplinkmodule));
	DriverManager.driver.get()
		.findElement(By.xpath(megamenuLocators.culpjumplinkmodule.replace("value", jumplinkmodule)))
		.isDisplayed();
	Thread.sleep(1000);
    }

    @And("^User Click on  \"([^\"]*)\" Jump Link$")
    public void userClickOnSomethingJumpLink(String jumplink) throws Throwable {
	highlightElement(megamenuLocators.culpjumplink.replace("value", jumplink));
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.culpjumplink.replace("value", jumplink)))
		.click();
	Thread.sleep(1000);
    }

    @When("^User move to Footer$")
    public void userMoveToFooter() throws Throwable {
	megamenuActions.moveToFooter();
    }

    @When("^User move to Accessibility Footer$")
    public void userMoveToAccessibilityFooter() throws Throwable {
	megamenuActions.moveToAccessabilityFooter();
    }

    @And("^User Click on  \"([^\"]*)\" Footer Link$")
    public void userClickOnSomethingFooterLink(String link) throws Throwable {
	megamenuActions.moveToFooterLinkModule();
	highlightElement(megamenuLocators.culpfooterlink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.culpfooterlink.replace("value", link)))
		.click();
	Thread.sleep(1000);
    }

    @When("^User move to Degrees and Program Menu$")
    public void i_move_to_Degrees_Programs_Menu() throws Throwable {
	megamenuActions.moveToDegrees();

    }

    @Then("^User should see the \"([^\"]*)\" text on Degrees and Program Menu$")
    public void i_should_see_the_text_on_Degrees_Program_Menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtDegreesandProgram().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtDegreesandProgram());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to Degrees and Program Left Links Trail$")
    public void i_move_to_Degrees_Programs_Left_link_Menu() throws Throwable {
	megamenuActions.moveToLeftTrail();

    }

    @Then("^User should see the \"([^\"]*)\" Child link Module$")
    public void i_should_see_the_something_child_link_module(String leftlink) throws Throwable {
	highlightElement(megamenuLocators.dnpLeftLinkChildModule.replace("value", leftlink));

	DriverManager.driver.get()
		.findElement(By.xpath(megamenuLocators.dnpLeftLinkChildModule.replace("value", leftlink)));

	Thread.sleep(2000);
    }

    @When("^User move to Capella Exp Menu$")
    public void i_move_to_capella_exp_Menu() throws Throwable {
	megamenuActions.moveToCapExp();

    }

    @Then("^User should see the \"([^\"]*)\" text on Capella Expereince Menu$")
    public void i_should_see_on_capella_exp_Menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtCapExp().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtCapExp());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to Financing Menu$")
    public void i_move_to_Fincance_Menu() throws Throwable {
	megamenuActions.moveToFinance();

    }

    @Then("^User should see the \"([^\"]*)\" text on Financing Menu$")
    public void i_should_see_on_Capella_Financing_Menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtFinancelLink().equals(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtFinancelLink());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to Apply Menu$")
    public void i_move_to_Apply_Menu() throws Throwable {
	megamenuActions.MoveToApply();

    }

    @Then("^User should see the \"([^\"]*)\" text on Apply Menu$")
    public void i_should_see_on_Why_Strayer_Menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtApplyLink().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtApplyLink());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @When("^User move to Apply ChildLinksModule$")
    public void i_move_to_Apply_ChildLinks_Module() throws Throwable {
	megamenuActions.moveToApplyChildLinks();

    }

    @When("^User move to Financing ChildLinksModule$")
    public void i_move_to_Finance_ChildLinks_Module() throws Throwable {
	megamenuActions.moveToFinancingChildLinks();

    }

    @When("^User move to Capella Exp ChildLinksModule$")
    public void i_move_to_Capella_exp_ChildLinks_Module() throws Throwable {
	megamenuActions.moveToCapellaExpChildLinks();

    }

    @When("^User Click on Child \"([^\"]*)\" link$")
    public void i_Click_on_VC_links(String link) throws Throwable {
	highlightElement(megamenuLocators.MenuLinks.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.MenuLinks.replace("value", link))).click();
	Thread.sleep(1500);
    }

    @When("^User Click on  \"([^\"]*)\" Button$")
    public void i_Click_on_VC_Button(String button) throws Throwable {

	highlightElement(megamenuLocators.Button.replace("value", button));

	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.Button.replace("value", button))).click();
	Thread.sleep(3000);
    }

    @When("^User Click on Child \"([^\"]*)\" Left Trail Link$")
    public void i_Click_on_left_trail_links(String link) throws Throwable {

	highlightElement(megamenuLocators.dnpLeftLinks.replace("value", link));

	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.dnpLeftLinks.replace("value", link))).click();
	Thread.sleep(1000);
    }

    @When("^User move to AREAS OF STUDY Module$")
    public void i_move_to_areas_of_study_module() throws Throwable {
	megamenuActions.moveToVcFooter();
    }

    @When("^User move to AREAS OF STUDY Links Module$")
    public void i_move_to_areas_of_study_links_module() throws Throwable {

    }

    @Then("^User move to VC Footer$")
    public void i_move_to_vc_footer() throws Throwable {
	megamenuActions.moveToVcFooter();
    }

    @Then("^User should see the \"([^\"]*)\" text on AREAS OF STUDY Module$")
    public void i_should_see_the_something_text_on_areas_of_study_menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtaosLink().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtaosLink());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on About Us Module$")
    public void i_should_see_the_something_text_on_about_us_menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtabtUsLink().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtabtUsLink());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on Capella Results Module$")
    public void i_should_see_the_something_text_on_capella_results_menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtCapResLink().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtCapResLink());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on Information For Module$")
    public void i_should_see_the_something_text_on_Information_menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtInfoForLink().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtInfoForLink());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the Fotter Link Child link Module$")
    public void i_should_see_the_fotter_link_child_link_module() throws Throwable {
	megamenuActions.moveToFooterModule();
    }

    @When("^User Click on Child \"([^\"]*)\" Footer link$")
    public void i_Click_on_VC_Footer_links(String link) throws Throwable {

	highlightElement(megamenuLocators.FooterLinks.replace("value", link));

	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.FooterLinks.replace("value", link))).click();
	Thread.sleep(1500);
    }

    @Then("^User move to Get More Info Module$")
    public void i_move_to_get_more_module() throws Throwable {
	megamenuActions.moveToGetInfoModule();
    }

    @Then("^User move to Get more Info Module$")
    public void i_move_to_get_more_module_one() throws Throwable {
	megamenuActions.moveToGetInfomoreModule();
    }

    @Then("^User should see Request Information Modal popup form$")
    public void i_should_see_request_information_modal_popup_form() throws Throwable {
	// highlightElement(megamenuLocators.RfiForm);
	boolean result = megamenuActions.verifyRfiForm();

	try {
	    Assert.assertTrue(result);
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on  \"([^\"]*)\" RFP$")
    public void i_click_on_something_rfp(String link) throws Throwable {
	megamenuActions.clickLink();
    }

    @When("^User Click on  \"([^\"]*)\" LP RFP$")
    public void i_click_on_something_LP_rfp(String link) throws Throwable {
	megamenuActions.clickRfpLink();
    }

    @When("^User Click on  \"([^\"]*)\" CTA Link$")
    public void i_click_on_something_cta_link(String link) throws Throwable {
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.MenuLinks.replace("value", link))).click();
	Thread.sleep(1500);
    }

    @Then("User should navigate to Request Information form$")
    public void i_should_navigate_to_request_information_form() throws Throwable {
	megamenuActions.movetoRfiForm();
	Thread.sleep(5000);
    }

    @Then("^User move to Get The Details Module$")
    public void i_move_to_get_details_module() throws Throwable {
	megamenuActions.moveTogGtDetailModuleModule();
    }

    @Then("^User move to Ready For Next Module$")
    public void i_move_to_ready_for_module() throws Throwable {
	megamenuActions.moveToreadyForNextModule();
    }

    @Then("^User should see Schedule Consultation Modal popup form$")
    public void i_should_see_Schedule_Consultation_modal_popup_form() throws Throwable {
	// highlightElement(megamenuLocators.RfiForm);
	boolean result = megamenuActions.verifySCForm();

	try {
	    Assert.assertTrue(result);
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

}