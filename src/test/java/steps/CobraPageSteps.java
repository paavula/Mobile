package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CobraPageActions;
import pages.locators.CobraPageLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class CobraPageSteps extends TestSetUp {

    CobraPageLocators CobraPageLocators = new CobraPageLocators();
    CobraPageActions CobraPageActions = new CobraPageActions();

    @Then("^User should see the \"([^\"]*)\" text on Cobra Page and close tab$")
    public void i_should_see_the_text_on_Cobra_Page_and_close_tab(String linkheadertitle) throws Throwable {

	int tabsize = DriverManager.driver.get().getWindowHandles().size();

	if (tabsize >= 2) {
	    ArrayList<String> tabs = new ArrayList<String>(DriverManager.driver.get().getWindowHandles());
	    DriverManager.driver.get().switchTo().window(tabs.get(1));

	    String HeaderText = DriverManager.driver.get().getTitle();
	    System.out.println("Actual Header:" + HeaderText);
	    System.out.println("Expected Header:" + linkheadertitle);

	    closeTabs();

	} else {

	    String HeaderText = DriverManager.driver.get().getTitle();
	    System.out.println("Actual Header:" + HeaderText);
	    System.out.println("Expected Header:" + linkheadertitle);
	    boolean result = HeaderText.contains(linkheadertitle);
	    try {
		Assert.assertEquals(result, true, "Title didn't match");
	    } catch (Throwable t) {

		ErrorUtil.addVerificationFailure(t);
		throw t;
	    }
	}

    }

    @When("^User move to TabComponent$")
    public void i_move_to_TabComponent() throws Throwable {
	CobraPageActions.clickTabComponent();

    }

    @Given("^User Navigate to Cobra Template Page$")
    public void user_Navigate_to_Cobra_Template_Page() throws Throwable {
	CobraPageActions.open_CP_Application();
    }

    @Given("^User Navigate to Cobra All Comps Page$")
    public void user_Navigate_to_Cobra_AllComps_Page() throws Throwable {
	CobraPageActions.open_CobraACP_Application();
    }

    @Given("^User Navigate to Explore Page$")
    public void user_Navigate_to_Cobra_Explore_Page() throws Throwable {
	CobraPageActions.open_Explore_Application();
    }

    @Given("^User Navigate to MBA Page$")
    public void user_Navigate_to_MBA_Page() throws Throwable {
	CobraPageActions.open_MBA_Application();
    }

    @Given("^User Navigate to Achieve Page$")
    public void user_Navigate_to_Achieve_Page() throws Throwable {
	CobraPageActions.open_Achieve_Application();
    }

    @When("^User Click on \"([^\"]*)\" link in Cobra Page$")
    public void i_Click_on_link_in_Cobra_page(String link) throws Throwable {
	// megamenuActions.highLighterMethod(megamenuLocators.DegreesMenusLink.replace("value",
	// link));
	highlightElement(CobraPageLocators.cobraPageLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(CobraPageLocators.cobraPageLink.replace("value", link)))
		.click();

    }

    @When("^User Navigate to Accordion Module$")
    public void i_Move_to_Accordion_module() throws Throwable {
	CobraPageActions.moveToAccordion();
    }

    @When("^User Click on CobraPage Header Logo$")
    public void i_Click_on_Cobra_Page_Header_Logo() throws Throwable {
	CobraPageActions.clickLogo();
    }

    @When("^User Click on CobraPage Footer Logo$")
    public void i_Click_on_Cobra_Page_Footer_Image() throws Throwable {
	CobraPageActions.clickFooterLogo();
    }

    @When("^User move to CobraPage Utility Header$")
    public void i_move_to_Cobra_Page_UtilityHeader() throws Throwable {
	CobraPageActions.clickUtilityHeader();

    }

    @When("^User move to CobraPage Utility Header Link Module$")
    public void i_move_to_Cobra_Page_UtilityHeaderLModule() throws Throwable {
	CobraPageActions.clickUtilityHeaderLmodule();

    }

    @When("^User move to CobraPage Footer$")
    public void i_move_to_Cobra_Page_Footer() throws Throwable {
	CobraPageActions.clickCobraFooter();

    }

    @When("^User move to CobraPage Accredation$")
    public void i_move_to_Cobra_Page_Accredation() throws Throwable {
	CobraPageActions.moveCobraAccredation();

    }

    @Then("^User should see \"([^\"]*)\" text in Accredation$")
    public void i_Should_see_text_in_Accredation(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTextAccredation().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTextAccredation());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @When("^User Click on Accredation Link$")
    public void i_Click_on_Accredation_Link() throws Throwable {
	CobraPageActions.clickCobraAccredationClick();
	Thread.sleep(3000);
    }

    @Then("^User should see the Accredation Image$")
    public void i_should_see_the_Accredation_Image() throws Throwable {
	CobraPageActions.verifyImage();
    }

    @Then("^User Click on Accredation Image$")
    public void i_click_the_Accredation_Image() throws Throwable {
	CobraPageActions.ClickAccImage();
    }

    @Then("^User should see the \"([^\"]*)\" text on Accredation window$")
    public void i_should_see_the_something_text_on_accredation_window(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTxtAccwindow().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtAccwindow());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
	CobraPageActions.closeAccwindow();
    }

    @Then("^User Should see \"([^\"]*)\" text in Cobra Page Utility Header$")
    public void i_Should_see_text_in_Cobra_Page_Utility_Header(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTxtLinkUHeader().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtLinkUHeader());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @Then("^User should see \"([^\"]*)\" phonenumber in Cobra Page Utility Header$")
    public void i_should_see_phonenumber_in_Cobra_Page_Utility_Header(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTxtLinkUpno().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtLinkUpno());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to CobraPage Utility Navigation$")
    public void i_move_to_CobraPage_Utility_Navigation() throws Throwable {
	CobraPageActions.clickUtilityNav();
    }

    @Then("^User should see \"([^\"]*)\" Link in Cobra Page Utility Navigation$")
    public void i_should_see_Link_in_Cobra_Page_Utility_Navigation(String expectedMenuText) throws Throwable {

	boolean result = CobraPageActions.getTxtLinkUNav().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtLinkUNav());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @Then("^User should see the \"([^\"]*)\" text on Cobra Page footer$")
    public void i_should_see_the_text_on_CP_footer(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTxtCpcopyright().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtCpcopyright());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to MastersTab$")
    public void i_move_to_MastersTab() throws Throwable {
	CobraPageActions.clickMastersTab();

    }

    @Then("^User should see \"([^\"]*)\" text on MastersTab$")
    public void i_should_see_Tab_text_on_MastersTab(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTxtMastersTab().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtMastersTab());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to BacheloresTab$")
    public void i_move_to_BacheloresTab() throws Throwable {
	CobraPageActions.clickBacheloresTab();

    }

    @Then("^User should see \"([^\"]*)\" text on BacheloresTab$")
    public void i_should_see_Tab_text_on_BacheloresTab(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTxtBacheloresTab().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtBacheloresTab());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to AssociatesTab$")
    public void i_move_to_AssociatesTab() throws Throwable {
	CobraPageActions.clickAssociatesTab();

    }

    @Then("^User should see \"([^\"]*)\" text on AssociatesTab$")
    public void i_should_see_Tab_text_on_AssociatesTab(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTxtAssociatesTab().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtAssociatesTab());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to MBA Tab$")
    public void i_move_to_MBA_Tab() throws Throwable {
	CobraPageActions.clickMbaTab();

    }

    @Then("^User should see \"([^\"]*)\" text on MBA Tab$")
    public void i_should_see_Tab_text_on_MBA_Tab(String expectedMenuText) throws Throwable {
	boolean result = CobraPageActions.getTxtMbaTab().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(CobraPageActions.getTxtMbaTab());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Given("^User Navigate to Degree Home Page$")
    public void userNavigateTo_Degree_HomePage() throws Throwable {
	CobraPageActions.open_Disclamier_Application();
    }

    @When("^User Click on \"([^\"]*)\" on Disclaimer_Link$")
    public void userClickOnSomethingOnDisclaimerLink(String disclaimerlink) throws Throwable {
	Thread.sleep(3000);
	highlightElement(CobraPageLocators.disclamierLink.replace("value", disclaimerlink));
	DriverManager.driver.get()
		.findElement(By.xpath(CobraPageLocators.disclamierLink.replace("value", disclaimerlink))).click();
	Thread.sleep(3000);
    }

    @Then("^User Should See \"([^\"]*)\" Disclaimer_Modal$")
    public void userShouldSeeSomethingDisclaimerModal(String disclaimermodal) throws Throwable {
	Thread.sleep(3000);
	highlightElement(CobraPageLocators.disclamierWindow.replace("value", disclaimermodal));
	DriverManager.driver.get()
		.findElement(By.xpath(CobraPageLocators.disclamierWindow.replace("value", disclaimermodal))).click();
	Thread.sleep(3000);
    }

    @And("^User Clicks on \"([^\"]*)\" Disclaimer_Modal Close Window Link$")
    public void userClicksOnSomethingDisclaimerModalCloseWindowLink(String disclaimermodal) throws Throwable {
	highlightElement(CobraPageLocators.disclamierCloseLink.replace("value", disclaimermodal));
	DriverManager.driver.get()
		.findElement(By.xpath(CobraPageLocators.disclamierCloseLink.replace("value", disclaimermodal))).click();
	Thread.sleep(3000);
    }

    @When("^User Click on \"([^\"]*)\" on Video_Link$")
    public void userClickOnSomethingOn_videoLink(String videorLink) throws Throwable {
	Thread.sleep(3000);
	highlightElement(CobraPageLocators.videorLink.replace("value", videorLink));
	DriverManager.driver.get().findElement(By.xpath(CobraPageLocators.videorLink.replace("value", videorLink)))
		.click();
	Thread.sleep(3000);
    }

    @Then("^User Should See \"([^\"]*)\" Video_Modal$")
    public void userShouldSeeSomething_videoModal(String videomodal) throws Throwable {
	Thread.sleep(3000);
	highlightElement(CobraPageLocators.videoWindow.replace("value", videomodal));
	DriverManager.driver.get().findElement(By.xpath(CobraPageLocators.videoWindow.replace("value", videomodal)))
		.click();
	Thread.sleep(3000);
    }

    @And("^User Clicks on \"([^\"]*)\" Video_Modal Close Window Link$")
    public void userClicksOnSomething_videoModalCloseWindowLink(String videomodal) throws Throwable {
	highlightElement(CobraPageLocators.videoCloseLink.replace("value", videomodal));
	DriverManager.driver.get().findElement(By.xpath(CobraPageLocators.videoCloseLink.replace("value", videomodal)))
		.click();
	Thread.sleep(3000);
    }

    /*
     * @When("^User move to Long Form$") public void i_move_to_longForm() throws
     * Throwable { CobraPageActions.moveToLongForm(); }
     * 
     * 
     * @When("^User enter \"([^\"]*)\" as FirstName in Long form$") public void
     * i_enter_as_FirstName_in_Long_form(String fName) throws Throwable { // Write
     * code here that turns the phrase above into concrete actions
     * CobraPageActions.enterfName(fName); }
     * 
     * @When("^User enter \"([^\"]*)\" as LastName in Long form$") public void
     * i_enter_as_LastName_in_Long_form(String lName) throws Throwable { // Write
     * code here that turns the phrase above into concrete actions
     * CobraPageActions.enterlName(lName); }
     * 
     * @When("^User enter \"([^\"]*)\" as Email in Long form$") public void
     * i_enter_as_Email_in_Long_form(String email) throws Throwable { // Write code
     * here that turns the phrase above into concrete actions
     * CobraPageActions.enterEmail(email); }
     * 
     * @When("^User enter \"([^\"]*)\" as Address in Long form$") public void
     * i_enter_as_Address_in_Long_form(String address) throws Throwable { // Write
     * code here that turns the phrase above into concrete actions
     * CobraPageActions.enterAddress(address); }
     * 
     * 
     * @When("^User enter \"([^\"]*)\" as PhoneNumber in Long form$") public void
     * i_enter_as_PhoneNumber_in_Long_form(String phone) throws Throwable { // Write
     * code here that turns the phrase above into concrete actions
     * CobraPageActions.enterphoneNumber(phone); }
     * 
     * @When("^User enter \"([^\"]*)\" as Zip in Long form$") public void
     * i_enter_as_Zip_in_Long_form(String zip) throws Throwable { // Write code here
     * that turns the phrase above into concrete actions
     * CobraPageActions.enterZip(zip); }
     * 
     * @When("^User select \"([^\"]*)\" as Education Level in Long form$") public
     * void i_select_as_Education_Level_in_Long_form(String pgVal) throws Throwable
     * {
     * 
     * CobraPageActions.selectPG(pgVal); }
     * 
     * @When("^User select \"([^\"]*)\" as Degree in Long form$") public void
     * i_select_as_Degree_in_Long_form(String degVal) throws Throwable {
     * CobraPageActions.selectDegree(degVal); }
     * 
     * @When("^User select \"([^\"]*)\" as program of interest in Long form$")
     * public void as_program_of_interest_in_Long_form(String aosVal) throws
     * Throwable {
     * 
     * CobraPageActions.selectAOS(aosVal); }
     * 
     * @When("^User click \"([^\"]*)\" button in Long form$") public void
     * i_click_button_in_Long_form(String arg1) throws Throwable { // Write code
     * here that turns the phrase above into concrete actions
     * CobraPageActions.clickAnGobtnLF(); Thread.sleep(3000); }
     */
    // ************************* two step form with out phone

    @When("^User click \"([^\"]*)\" button in Short form1$")
    public void i_click_button_in_Short_sform1(String arg1) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	CobraPageActions.clickAnGobtnsf();
    }

    @When("^User enter \"([^\"]*)\" as Address in Short form1$")
    public void i_enter_as_Address_in_Short_form1(String address) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	CobraPageActions.enterAddresssf(address);
    }

    @When("^User select \"([^\"]*)\" as program of interest in Short form1$")
    public void as_program_of_interest_in_Bform1(String aosVal) throws Throwable {

	CobraPageActions.selectAOSsf(aosVal);
    }
    // **************************** Accordion Module
    // ********************************

    @When("^User Click on \"([^\"]*)\" on Accordion_Link$")
    public void userClickOnSomethingOn_Accordion_Link(String accordionlink) throws Throwable {
	Thread.sleep(3000);
	// CobraPageActions.moveToActiveTab();
	highlightElement(CobraPageLocators.accordionModuleLink.replace("value", accordionlink));
	DriverManager.driver.get()
		.findElement(By.xpath(CobraPageLocators.accordionModuleLink.replace("value", accordionlink))).click();
	Thread.sleep(3000);
    }

    @Then("^User Should See \"([^\"]*)\" Accordion Text$")
    public void User_should_see_Accordion_text(String Accordiontext) throws Throwable {
	Thread.sleep(2000);
	highlightElement(CobraPageLocators.accordionModuleText.replace("value", Accordiontext));
	DriverManager.driver.get()
		.findElement(By.xpath(CobraPageLocators.accordionModuleText.replace("value", Accordiontext))).click();
	Thread.sleep(5000);
    }

    @When("^User Click on \"([^\"]*)\" on Tab_Link$")
    public void user_ClickOn_SomethingOn_Tab_Link(String tablink) throws Throwable {
	Thread.sleep(3000);
	// CobraPageActions.moveToActiveTab();
	highlightElement(CobraPageLocators.tabModuleLink.replace("value", tablink));
	DriverManager.driver.get().findElement(By.xpath(CobraPageLocators.tabModuleLink.replace("value", tablink)))
		.click();
	Thread.sleep(3000);
    }
}