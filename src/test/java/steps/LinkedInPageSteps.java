package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LinkedInPageActions;
import pages.locators.LinkedInPageLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class LinkedInPageSteps extends TestSetUp {

    LinkedInPageLocators linkedInPageLocators = new LinkedInPageLocators();
    LinkedInPageActions linkedInPageActions = new LinkedInPageActions();

    @Then("^User should see the \"([^\"]*)\" text in LinkedIn Page and close tab$")
    public void i_should_see_the_text_on_linkedIn_Page_and_close_tab(String linkheadertitle) throws Throwable {

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

    @Given("^User Navigate to LinkedIn Home Page$")
    public void user_Navigate_to_linkedIn_Template_Page() throws Throwable {
	linkedInPageActions.open_LP_Application();
    }

    @Given("^User Navigate to LinkedIn BBA Page$")
    public void user_Navigate_to_linkedIn_BBA_Page() throws Throwable {
	linkedInPageActions.open_LP_BBA_Application();
    }

    @When("^User Click on \"([^\"]*)\" link in LinkedIn Page$")
    public void i_Click_on_link_in_linkedIn_page(String link) throws Throwable {

	highlightElement(linkedInPageLocators.LinkedInPageLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(linkedInPageLocators.LinkedInPageLink.replace("value", link)))
		.click();
	Thread.sleep(3000);
    }

    @When("^User Click on LinkedInPage Header Logo$")
    public void i_Click_on_linkedIn_Page_Header_Logo() throws Throwable {
	linkedInPageActions.clickLogo();
    }

    @When("^User Click on LinkedInPage Footer Logo$")
    public void i_Click_on_Footer_Image() throws Throwable {
	linkedInPageActions.clickFooterLogo();
    }

    @When("^User move to LinkedInPage Utility Header Link Module$")
    public void i_move_to_UtilityHeaderLModule() throws Throwable {
	linkedInPageActions.clickUtilityHeaderLmodule();

    }

    @When("^User move to LinkedInPage Footer$")
    public void i_move_to_linkedInFooter() throws Throwable {
	linkedInPageActions.clicklinkedInFooter();

    }

    @When("^User move to LinkedInPage Footer Link Module$")
    public void i_move_to_linkedInFooter_module() throws Throwable {
	linkedInPageActions.clicklinkedInFootermodule();

    }

    @When("^User move to AboutUs Module$")
    public void i_move_to_AboutUs() throws Throwable {
	linkedInPageActions.clickAboutUs();

    }

    @Then("^User should see the \"([^\\\"]*)\" Header text on AboutUs Component$")
    public void i_should_see_the_text_on_AbtUs_Component(String expectedMenuText) throws Throwable {
	boolean result = linkedInPageActions.getTextAbtUs().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(linkedInPageActions.getTextAbtUs());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    // code to report the error in testng
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
	// throw new PendingException();
    }

    @Then("^User Should the \"([^\"]*)\" Title text on AboutUs Component$")
    public void i_should_see_the_text_on_AbtUs_Title_Component(String expectedMenuText) throws Throwable {
	boolean result = linkedInPageActions.getTextAbtUsTitle().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(linkedInPageActions.getTextAbtUsTitle());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    // code to report the error in testng
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
	// throw new PendingException();
    }

    @Then("^User should see the AboutUs Image$")
    public void i_should_see_the_AbtUs_Image() throws Throwable {
	linkedInPageActions.verifyImage();
    }

    @When("^User move to LinkedInPage Utility Navigation$")
    public void i_move_to_linkedInPage_Utility_Navigation() throws Throwable {
	linkedInPageActions.clickUtilityNav();
    }

    @Then("^User should see \"([^\"]*)\" Link in LinkedInpage Utility Navigation$")
    public void i_should_see_Link_in_LP_Utility_Navigation(String expectedMenuText) throws Throwable {

	boolean result = linkedInPageActions.getTxtLinkUNav().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(linkedInPageActions.getTxtLinkUNav());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}

    }

    @Then("^User should see the \"([^\"]*)\" text on LinkedIn Page footer$")
    public void i_should_see_the_text_on_LP_footer(String expectedMenuText) throws Throwable {
	boolean result = linkedInPageActions.getTxtcopyright().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(linkedInPageActions.getTxtcopyright());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {

	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

}
