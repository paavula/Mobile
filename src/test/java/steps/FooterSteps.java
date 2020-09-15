package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.FooterActions;
import pages.locators.FooterLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;
import utils.ProjectVariables;

public class FooterSteps extends TestSetUp {
    FooterLocators footerLocators = new FooterLocators();
    FooterActions footerActions = new FooterActions();

    @When("^User move to footer$")
    public void i_move_to_footer() throws Throwable {
	footerActions.clickFooter();
    }

    @Then("^User should see the \"([^\"]*)\" text on footer$")
    public void i_should_see_the_text_on_footer(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtcopyright().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on \"([^\"]*)\" Footer link$")
    public void i_Click_on_Footeer_link(String link) throws Throwable {
	highlightElement(footerLocators.FooterQuickLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(footerLocators.FooterQuickLink.replace("value", link))).click();
	Thread.sleep(3000);
    }

    @When("^User move to SocialLink$")
    public void i_move_to_SocialLink() throws Throwable {
	footerActions.clickSocialLinks();
    }

    @When("^User Click on \"([^\"]*)\" icon$")
    public void i_Click_on_icon(String icon) throws Throwable {
	highlightElement(footerLocators.iconLink.replace("value", icon));
	DriverManager.driver.get().findElement(By.xpath(footerLocators.iconLink.replace("value", icon))).click();
	Thread.sleep(3000);
    }

    @Then("^User should see the \"([^\"]*)\" text on \"([^\"]*)\" iconPage and close tab$")
    public void i_should_see_the_text_on_iconPage_and_close_tab(String linkheadertitle, String Degreeoptionslink)
	    throws Throwable {
	int tabsize = DriverManager.driver.get().getWindowHandles().size();
	if (tabsize >= 2) {
	    ArrayList<String> tabs = new ArrayList<String>(DriverManager.driver.get().getWindowHandles());
	    DriverManager.driver.get().switchTo().window(tabs.get(1));
	    String HeaderText = DriverManager.driver.get().getTitle();
	    Assert.assertTrue(HeaderText.contains(linkheadertitle),
		    Degreeoptionslink + " link header was not matched with UI header");
	    closeTabs();
	} else {
	    String HeaderText = DriverManager.driver.get().getTitle();
	    Assert.assertTrue(HeaderText.contains(linkheadertitle),
		    Degreeoptionslink + " link header was not matched with UI header");
	}
    }

    @When("^User Click on footerLogo Image$")
    public void i_Click_on_footerLogo_link() throws Throwable {
	footerActions.clickfooterLogo();
    }

    @When("^User move to AOSModule$")
    public void i_move_to_AOSModule() throws Throwable {
	footerActions.clickAOSLink();
    }

    @Then("^User should see the \"([^\"]*)\" text in AOSModule$")
    public void i_should_see_the_text_in_AOSModule(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtAOSLinksModule().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(footerActions.getTxtAOSLinksModule());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to QUICKLINKModule$")
    public void i_move_to_QUICKLINKModule() throws Throwable {
	footerActions.clickQuickLink();
    }

    @Then("^User should see the \"([^\"]*)\" text in QuickLinksModule$")
    public void i_should_see_the_text_in_QuickLinksModule(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtQuickLinksModule().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to MORELINKModule$")
    public void i_move_to_MoreLINKModule() throws Throwable {
	footerActions.clickMoreLink();
    }

    @Then("^User should see the \"([^\"]*)\" text in MoreLinksModule$")
    public void i_should_see_the_text_in_MoreLinksModule(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtMoreLinksModule().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to LEGALLINKModule$")
    public void i_move_to_LegalLINKModule() throws Throwable {
	footerActions.clickLegalLink();
    }

    @Then("^User should see the \"([^\"]*)\" text in LegalLinksModule$")
    public void i_should_see_the_text_in_LegalLinksModule(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtLegalLinksModule().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on SiteMap Link$")
    public void i_Click_on_sitemap_link() throws Throwable {
	footerActions.clickSiteMap();
	Thread.sleep(3000);
    }

    @When("^User Click on ClickToStart Link$")
    public void i_Click_on_ClickToStart_Link() throws Throwable {
	footerActions.ClickToStart();
	Thread.sleep(3000);
    }

    @Then("^User should see the \"([^\"]*)\" text on ChatWindow$")
    public void i_should_see_the_text_on_ChatWindow(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtChatWindow().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(footerActions.getTxtChatWindow());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on page$")
    public void i_should_see_the_text_on_pages(String expectedMenuText) throws Throwable {
   
	Thread.sleep(5000);
 	closeAlert();
	boolean result = footerActions.getTxtpage().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // *************************************************************************************************************

    @When("^User Click on ContactUs link$")
    public void i_Click_on_ContactUs_link() throws Throwable {
	footerActions.clickContactUs();
    }

    @Then("^User should see \"([^\"]*)\" text on ContactUs Page and close tab$")
    public void i_should_see_text_on_ContactUs_Page_and_close_tab(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtContactUsPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(footerActions.getTxtContactUsPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
	//
    }

    @Then("^User should see the \"([^\"]*)\" text in FooterRibbonModule$")
    public void i_should_see_the_text_in_FooterRibbonModule(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtfooterRibbon().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(footerActions.getTxtfooterRibbon());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
	//
    }

    @When("^User move to footerribbon$")
    public void i_move_to_footerribbon() throws Throwable {
	footerActions.clickFooterribbon();
    }

    @Then("^User should navigate to \"([^\"]*)\" page$")
    public void i_should_see_navigate_to_page(String expectedMenuText) throws Throwable {
	Thread.sleep(5000);
	boolean result = footerActions.getTxtpage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(footerActions.getTxtpage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" Response Status code$")
    public void i_should_see_the_200_code(int expectedStatusCode) throws Throwable {
	int result = footerActions.getPageCode();
	System.out.println(expectedStatusCode);
	System.out.println(result);
	try {
	    Assert.assertEquals(result, expectedStatusCode);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Given("^User Navigate to \"([^\"]*)\" page$")
    public void i_navigate_to_Page(String Url) throws Throwable {
	DriverManager.getDriver().get(Url);
	Thread.sleep(3000);
    }

    @Given("^User Navigate to \"([^\"]*)\" LP page$")
    public void i_navigate_to_Lp_Page(String Url) throws Throwable {
	String Childpage = Url.trim();
	String LPUrl = ProjectVariables.CULPPage_URL + Childpage;
	DriverManager.getDriver().get(LPUrl);
	Thread.sleep(3000);
    }

    @Then("^User Should See Console Errors and Warnings$")
    public void iShouldSeeConsoleErrorsAndWarnings() throws Throwable {
	footerActions.getErrors();
    }

    @Then("^User should see the Page Title of the Page$")
    public void i_should_see_the_page_title_of_the_page() throws Throwable {
	String pt = DriverManager.getDriver().getTitle();
	System.out.println("Page Title:" + pt);
    }

    @When("^User Click on \"([^\"]*)\" Footerlink$")
    public void i_Click_on_link(String link) throws Throwable {
	// megamenuActions.highLighterMethod(megamenuLocators.DegreesMenusLink.replace("value",
	// link));
	highlightElement(footerLocators.fLink.replace("value", link));
	// DriverManager.driver.get().findElement(By.css(footerLocators.FLink.replace("value",
	// link))).click();
	DriverManager.driver.get().findElement(By.xpath(footerLocators.fLink.replace("value", link))).click();
    }

    @Then("^User should see the \"([^\\\"]*)\" text on SocialLink$")
    public void i_should_see_the_text_on_SocialLinksModule(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getSocialLinkCS().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(footerActions.getSocialLinkCS());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    // code to report the error in testng
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
	//
    }

    @Then("^User should see the \"([^\\\"]*)\" icons in SocialLinkModule$")
    public void i_should_see_the_icons_in_SocialLinkModule(String expectedMenuText) throws Throwable {
	boolean result = footerActions.getTxtSocialLink().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	// System.out.println(footerActions.getTxtSocialLink());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    // code to report the error in testng
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
	//
    }

}
