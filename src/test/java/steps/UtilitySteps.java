package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.UtilityNavActions;
import pages.locators.UtilityNavLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class UtilitySteps extends TestSetUp {
    UtilityNavLocators utilityLocators = new UtilityNavLocators();
    UtilityNavActions utilityActions = new UtilityNavActions();

    @When("^User move to UtilityHeader$")
    public void i_move_to_UtilityHeader() throws Throwable {
	utilityActions.movetoUtilityHeader();
    }

    @When("^User Click on CampusLocationLink Link$")
    public void i_Click_on_cLocationLink() throws Throwable {
	utilityActions.clickCampusLocationLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on CampusLocation Page$")
    public void i_should_see_the_text_on_CampusLocation_Page(String expectedMenuText) throws Throwable {
	boolean result = utilityActions.getTxtCampusLocationPage().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on CampusLoginLink Link$")
    public void i_Click_on_CampusLoginLink() throws Throwable {
	utilityActions.clickCampusLoginLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on CampusLogin Page$")
    public void i_should_see_the_text_on_cLogin_Page(String expectedMenuText) throws Throwable {
	boolean result = utilityActions.getTxtCampusLoginPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(utilityActions.getTxtCampusLoginPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on ApplyNowLink Link$")
    public void i_Click_on_ApplyNowLink() throws Throwable {
	utilityActions.clickApplyNowLink();
	Thread.sleep(3000);
    }

    @Then("^User should see the \"([^\"]*)\" text on ApplyNowLink Page$")
    public void i_should_see_the_text_on_ApplyNowLink_Page(String expectedMenuText) throws Throwable {
	int tabsize = DriverManager.driver.get().getWindowHandles().size();
	if (tabsize >= 2) {
	    ArrayList<String> tabs = new ArrayList<String>(DriverManager.driver.get().getWindowHandles());
	    DriverManager.driver.get().switchTo().window(tabs.get(1));
	    closeTabs();
	} else {
	    Thread.sleep(3000);
	    String HeaderText = DriverManager.driver.get().getTitle();
	    boolean result = HeaderText.contains(expectedMenuText);
	    try {
		Assert.assertEquals(result, true, "Title didn't match");
	    } catch (Throwable t) {
		ErrorUtil.addVerificationFailure(t);
		throw t;
	    }
	}
    }

    @Then("^User Should see the \"([^\"]*)\" text on Searchbox$")
    public void i_Should_see_the_text_on_Searchbox(String expectedMenuText) throws Throwable {
	boolean result = utilityActions.getTxtSearchbox().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(utilityActions.getTxtSearchbox());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Enter \"([^\"]*)\" text in Searchbox$")
    public void i_Should_enter_text_in_Searchbox(String arg1) throws Throwable {
	utilityActions.enterSearchkey(arg1);
	utilityActions.clickSearchButton();
    }

    @Then("^User Should see the \"([^\"]*)\" text on Search Results$")
    public void i_Should_see_the_text_on_Search_results(String expectedMenuText) throws Throwable {
	boolean result = utilityActions.getTxtSearchResults().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(utilityActions.getTxtSearchResults());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text and close tab$")
    public void User_should_see_the_text_on_some_Page_and_close_tab(String pagetitle) throws Throwable {
	int tabsize = DriverManager.driver.get().getWindowHandles().size();
	if (tabsize >= 2) {
	    ArrayList<String> tabs = new ArrayList<String>(DriverManager.driver.get().getWindowHandles());
	    DriverManager.driver.get().switchTo().window(tabs.get(1));
	    String HeaderText = DriverManager.driver.get().getTitle();
	    System.out.println("Page Title : " + HeaderText);
	    boolean result = HeaderText.contains(pagetitle);
	    try {
		Assert.assertEquals(result, true, "Title didn't match");
	    } catch (Throwable t) {
		ErrorUtil.addVerificationFailure(t);
		throw t;
	    }
	    DriverManager.driver.get().switchTo().window(tabs.get(0));
	    closeTabs();
	} else {
	    Thread.sleep(3000);
	    String HeaderText = DriverManager.driver.get().getTitle();
	    boolean result = HeaderText.contains(pagetitle);
	    try {
		Assert.assertEquals(result, true, "Title didn't match");
	    } catch (Throwable t) {
		ErrorUtil.addVerificationFailure(t);
		throw t;
	    }
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on StrayerHome Page$")
    public void i_should_see_the_text_on_StrayerHome_Page(String expectedMenuText) throws Throwable {
	boolean result = utilityActions.getTxtHomePage().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // ********************************************************

    @When("^User Click on \"([^\"]*)\" UtilityNavigationlink$")
    public void i_Click_on_link(String Link) throws Throwable {
	DriverManager.driver.get().findElement(By.cssSelector(utilityLocators.uLink.replace("", Link))).click();
    }

    @When("^User Click on Searchbox$")
    public void i_Click_on_Searchbox() throws Throwable {
	utilityActions.clickSearchButton();
    }

    @Then("^User click enter button in searchbox$")
    public void i_click_enter_button_in_searchbox() throws Throwable {
	utilityActions.enterSearchBox();
    }

    @Then("^User Should navigate to \"([^\"]*)\" Search Results Page$")
    public void i_Should_naviagte_to_SearchResults_page(String expectedMenuText) throws Throwable {
	boolean result = utilityActions.getTxtSearchResultsPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(utilityActions.getTxtSearchResultsPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }
}
