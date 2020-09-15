package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.DragonPageActions;
import pages.locators.DragonPageLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;

public class DragonPageSteps extends TestSetUp {
    DragonPageLocators dragonPageLocators = new DragonPageLocators();
    DragonPageActions dragonPageActions = new DragonPageActions();

    @Given("^User Navigate to Dragon Template Page$")
    public void user_Navigate_to_Dragon_Template_Page() throws Throwable {
	dragonPageActions.open_DP_Application();
    }

    @Given("^User Navigate to Dragon Page$")
    public void user_Navigate_to_Dragon_Page() throws Throwable {
	dragonPageActions.open_DragonAllComps_Application();
    }

    @When("^User Click on \"([^\"]*)\" link in Dragon Page$")
    public void i_Click_on_link_in_Dragon_page(String link) throws Throwable {
	highlightElement(dragonPageLocators.dragonPageLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(dragonPageLocators.dragonPageLink.replace("value", link)))
		.click();
    }

    @When("^User Click on DragonPage Header Logo$")
    public void i_Click_on_Dragon_Page_Header_Logo() throws Throwable {
	dragonPageActions.clickLogo();
    }

    @When("^User Click on DragonPage Footer Logo$")
    public void i_Click_on_Footer_Image() throws Throwable {
	dragonPageActions.clickFooterLogo();
    }

    @When("^User move to DragonPage Utility Header$")
    public void i_move_to_UtilityHeader() throws Throwable {
	dragonPageActions.clickUtilityHeader();
    }

    @When("^User move to DragonPage Utility Header Link Module$")
    public void i_move_to_UtilityHeaderLModule() throws Throwable {
	dragonPageActions.clickUtilityHeaderLmodule();
    }

    @When("^User move to DragonPage Footer$")
    public void i_move_to_DragonFooter() throws Throwable {
	dragonPageActions.clickDragonFooter();
    }

    @Then("^User Should see \"([^\"]*)\" text in Utility Header$")
    public void i_Should_see_text_in_Utility_Header(String expectedMenuText) throws Throwable {
	boolean result = dragonPageActions.getTxtLinkUHeader().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(dragonPageActions.getTxtLinkUHeader());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to Quote Component$")
    public void i_move_to_Quote_Compr() throws Throwable {
	dragonPageActions.moveQuoteComp();
    }

    @Then("^User Should see \"([^\"]*)\" text in Quote Component$")
    public void i_Should_see_text_in_Quote_Comp(String expectedMenuText) throws Throwable {
	boolean result = dragonPageActions.getTxtQuoteComp().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(dragonPageActions.getTxtQuoteComp());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see \"([^\"]*)\" phonenumber in Utility Header$")
    public void i_should_see_phonenumber_in_Utility_Header(String expectedMenuText) throws Throwable {
	boolean result = dragonPageActions.getTxtLinkUpno().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(dragonPageActions.getTxtLinkUpno());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to DragonPage Utility Navigation$")
    public void i_move_to_DragonPage_Utility_Navigation() throws Throwable {
	dragonPageActions.clickUtilityNav();
    }

    @Then("^User should see \"([^\"]*)\" Link in Utility Navigation$")
    public void i_should_see_Link_in_Utility_Navigation(String expectedMenuText) throws Throwable {
	boolean result = dragonPageActions.getTxtLinkUNav().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(dragonPageActions.getTxtLinkUNav());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on Dragon Page footer$")
    public void i_should_see_the_text_on_Dp_footer(String expectedMenuText) throws Throwable {
	boolean result = dragonPageActions.getTxtcopyright().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(dragonPageActions.getTxtcopyright());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to Two Step Form$")
    public void i_move_to_ts_Form() throws Throwable {
	dragonPageActions.moveTotwoStepForm();
    }
}
// ******************* TWO STEP FORM
