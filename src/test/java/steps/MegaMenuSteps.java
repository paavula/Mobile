package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.MegaMenuActions;
import pages.locators.MegaMenuLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;
import utils.ProjectVariables;

public class MegaMenuSteps extends TestSetUp {

    MegaMenuLocators megamenuLocators = new MegaMenuLocators();
    MegaMenuActions megamenuActions = new MegaMenuActions();

    @When("^User Click on \"([^\"]*)\" link$")
    public void User_Click_on_link(String link) throws Throwable {
	highlightElement(megamenuLocators.degreesMenusLink.replace("value", link));
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.degreesMenusLink.replace("value", link)))
		.click();
	Thread.sleep(3000);
    }

    @When("^User Clicks on \"([^\"]*)\" Button$")
    public void Users_Click_on_Button(String button) throws Throwable {
	highlightElement(megamenuLocators.button.replace("value", button));
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.button.replace("value", button))).click();
    }

    @Then("^User close tab$")
    public void i_close_tab() throws Throwable {
	megamenuActions.closeTabs();
    }

    @When("^User Click on Logo Image$")
    public void i_Click_on_Logo_Image() throws Throwable {
	megamenuActions.clickLogo();
    }

    @When("^User Click on Logo Image in Header$")
    public void i_Click_on_Logo_Image_header() throws Throwable {
	megamenuActions.clickHeaderLogo();
    }

    @Then("^User should see the \"([^\"]*)\" text on Child \"([^\"]*)\" Page and close tab$")
    public void i_should_see_the_text_on_Chiild_Page_and_close_tab(String linkheadertitle, String Degreeoptionslink)
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
	    try {
		Assert.assertTrue(HeaderText.contains(linkheadertitle),
			Degreeoptionslink + " link header was not matched with UI header");
	    } catch (Throwable t) {
		ErrorUtil.addVerificationFailure(t);
		throw t;
	    }
	}
    }

    @Given("^User am on the Home page \"([^\"]*)\" of Staryer Home Page website$")
    public void i_am_on_the_Home_page_of_Staryer_Home_Page_website(String websiteURL) throws Throwable {
	navigateToURL(websiteURL);
    }

    @Given("^User Navigate to Strayer University Application$")
    public void user_Navigate_to_Strayer_University_Application() throws Throwable {
	megamenuActions.open_SA_Application();
    }

    @When("^User move to Academic Programs Menu$")
    public void i_move_to_Degrees_Menu() throws Throwable {
	megamenuActions.clickAcdPrograms();
    }

    @Then("^User should see the \"([^\"]*)\" text on Academic Programs Menu$")
    public void i_should_see_the_text_on_Academic_Programs_Menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtAccdProgLInk().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to Academic Programs ChildLinksModule$")
    public void i_move_to_Acd_prog_ChildLinks_Module() throws Throwable {
	megamenuActions.clickAcdProgChildLinks();
    }

    @When("^User move to Student Experience Menu$")
    public void i_move_to_Student_Experience_Menu() throws Throwable {
	megamenuActions.clickstudentExp();
    }

    @Then("^User should see the \"([^\"]*)\" text on Student Experience Menu$")
    public void i_should_see_on_Student_Experience_Menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtWhyStrayerLink().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to Student Experience ChildLinksModule$")
    public void i_move_to_Stu_exp_ChildLinks_Module() throws Throwable {
	megamenuActions.clickStudentExpChildLinks();
    }

    @When("^User move to Tution and Financial AID Menu$")
    public void i_move_to_Tution_and_Financial_AID_Menu() throws Throwable {
	megamenuActions.clickFinancialLinkElement();
    }

    @Then("^User should see the \"([^\"]*)\" text on Tution and Financial AID Menu$")
    public void i_should_see_on_Strayer_Financing_Menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtFinancialLink().equals(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to TUITION ChildLinksModule$")
    public void i_move_to_TUITION_ChildLinks_Module() throws Throwable {
	megamenuActions.clickTutionsChildLinks();
    }

    @When("^User move to Strayer ADMISSIONS Menu$")
    public void i_move_to_Strayer_ADMISSIONS_Menu() throws Throwable {
	megamenuActions.clickStrayerAdm();
    }

    @Then("^User should see the \"([^\"]*)\" text on Strayer ADMISSIONS Menu$")
    public void i_should_see_on_Strayer_ADMISSIONS_Menu(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtStrayerAdm().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User move to ADMISSIONS ChildLinksModule$")
    public void i_move_to_ADMISSIONS_ChildLinks_Module() throws Throwable {
	megamenuActions.clickAdmisionsChildLinks();
    }

    @When("^User move to HomeBanner$")
    public void i_move_to_HomeBanner() throws Throwable {
	megamenuActions.movetoHomeBanner();
    }

    @Then("^User Should see the \"([^\"]*)\" text on HomeBanner$")
    public void i_Should_see_the_text_on_HomeBanner(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtHomeBanner().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Given("^User Navigate to Error Page$")
    public void user_Navigate_to_Strayer_University_Error_Application() throws Throwable {
	megamenuActions.open_SA_Error_Application();
    }

    @Given("^User Navigate to Strayer University Degree Application$")
    public void user_Navigate_to_Strayer_University_Degree_Application() throws Throwable {
	megamenuActions.open_Degree_Application();
    }

    @Given("^User Navigate to Strayer University Application ChildPage$")
    public void user_Navigate_to_Strayer_University_Application_ChildPage() throws Throwable {
	megamenuActions.open_SA_Application_CP();
    }

    @When("^User move to Title Text Component$")
    public void i_move_to_footer() throws Throwable {
	megamenuActions.clickTitle();
    }

    @Then("^User should see the Image$")
    public void i_should_see_the_Image() throws Throwable {
	megamenuActions.verifyImage();
    }

    @Then("^User Should the \"([^\"]*)\" text on Title Text Component$")
    public void i_Should_the_text_on_Title_Text_Component(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.verifyText().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.verifyText());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    // code to report the error in testng
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\\\"]*)\" text on TitleText Component$")
    public void i_should_see_the_text_on_TitleText_Component(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTextTile().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTextTile());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Mouse hover on Degree link$")
    public void i_Mouse_hover_on_link() throws Throwable {
	highlightElement(megamenuLocators.degreeLinkElement);
	megamenuActions.clickAcdPrograms();
	throw new PendingException();
    }

    @Then("^User should see the \"([^\"]*)\" text on WHYSTRAYER ChildLinksModule$")
    public void i_should_see_the_text_on_WHYSTRAYER_ChildLinksModule(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtWhyStaryeChildLinks().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtWhyStaryeChildLinks());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User move to sub module$")
    public void iMoveToSubModule() throws Throwable {
	megamenuActions.movetoSubmenu();
    }

    @Then("^User should see the \"([^\"]*)\" text on Degress ChildLinksModule$")
    public void i_should_see_the_text_on_Degrees_ChildLinksModule(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtDegreesChildLinks().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtDegreesChildLinks());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on ADMISSIONS ChildLinksModule$")
    public void i_should_see_the_text_on_ADMISSIONS_ChildLinksModule(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtAdmisionsChildLinks().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtAdmisionsChildLinks());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the Links text on ADMISSIONS ChildLinksModule$")
    public void i_should_see_Link_text_on_ADMISSIONS_ChildLinksModule() throws Throwable {
	boolean result = megamenuActions.getTxtAdmisionsChildLinks().contains(ProjectVariables.expectedMenuText);
	System.out.println(ProjectVariables.expectedMenuText);
	System.out.println(megamenuActions.getTxtAdmisionsChildLinks());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on TUITION ChildLinksModule$")
    public void i_should_see_the_text_on_TUITION_ChildLinksModule(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtTutionsChildLinks().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtTutionsChildLinks());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on \"([^\"]*)\" Page and close tab$")
    public void User_should_see_the_text_on_Page_and_close_tab_verizon(String linkheadertitle, String Degreeoptionslink)
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
	    try {
		Assert.assertTrue(HeaderText.contains(linkheadertitle),
			Degreeoptionslink + " link header was not matched with UI header");
	    } catch (Throwable t) {
		ErrorUtil.addVerificationFailure(t);
		throw t;
	    }
	}
    }

    @When("^User move to Why Strayer Menu$")
    public void i_move_to_Why_Strayer_Menu() throws Throwable {
	megamenuActions.clickWhyStrayer();
    }

    // Child links under Degree
    // ###############################################################################################################
    // 1.MBA
    @When("^User Click on MBA link$")
    public void i_Click_on_link() throws Throwable {
	megamenuActions.clickMbaLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on MBA Page$")
    public void i_should_see_the_text_on_MBA_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtMbaPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtMbaPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 3.Masters Degree
    @When("^User Click on MastersDegrees link$")
    public void i_Click_on_MastersDegrees_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickMDegreeLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on MastersDegrees Page$")
    public void i_should_see_the_text_on_MastersDegrees_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtMDegreePage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtMDegreePage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 3.Bachelor's Degree
    @When("^User Click on BachelorsDegrees link$")
    public void i_Click_on_BachelorsDegrees_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickBDegreeLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on BachelorsDegrees Page$")
    public void i_should_see_the_text_on_BachelorsDegrees_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtBDegreePage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtBDegreePage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 4.Certificate Degree
    @When("^User Click on Certificates link$")
    public void i_Click_on_Certificate_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickCertificatesLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on Certificates Page$")
    public void i_should_see_the_text_on_Certificates_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtCertificatePage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtCertificatePage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 5.Course Catlog
    @When("^User Click on CourseCatalog link$")
    public void i_Click_on_CourseCatalog_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickCcatlogLink();
    }

    @Then("^User should see the \\\"([^\\\"]*)\\\" text on CourseCatalog Page$")
    public void i_should_see_the_text_on_Course_Catlog_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtCcatlogPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtCcatlogPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on CourseCatlog Page$")
    public void i_should_see_the_text_on_Course_CatlogPage(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtCcatlogPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtCcatlogPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 6.Accounting
    @When("^User Click on Accounting link$")
    public void i_Click_on_Accounting_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickAccountingLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on Accounting Page$")
    public void i_should_see_the_text_on_Accounting_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtAccountingPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtAccountingPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 7.Accounting
    @When("^User Click on BusinessFinance link$")
    public void i_Click_on_BusinessFinance_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickBusinessFinanceLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on BusinessFinance Page$")
    public void i_should_see_the_text_on_BusinessFinance_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtBusinessFinancePage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtBusinessFinancePage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 8.CriminalJustice
    @When("^User Click on CriminalJustice link$")
    public void i_Click_on_CriminalJustice_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickCriminalJusticeLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on CriminalJustice Page$")
    public void i_should_see_the_text_on_CriminalJustice_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtCriminalJusticePage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtCriminalJusticePage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 9.EducationTraining
    @When("^User Click on EducationTraining link$")
    public void i_Click_on_EducationTraining_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickEducationTrainingLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on EducationTraining Page$")
    public void i_should_see_the_text_on_EducationTraining_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtEducationTrainingPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtEducationTrainingPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 10.EntrepreneurshipMBA
    @When("^User Click on EntrepreneurshipMBA link$")
    public void i_Click_on_EntrepreneurshipMBA_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickEntrepreneurshipMBALink();
    }

    @Then("^User should see the \"([^\"]*)\" text on EntrepreneurshipMBA Page$")
    public void i_should_see_the_text_on_EntrepreneurshipMBA_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtEntrepreneurshipMBAPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtEntrepreneurshipMBAPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 11.HealthServicesAdministration
    @When("^User Click on HealthServicesAdministration link$")
    public void i_Click_on_HealthServicesAdministration_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickHealthServicesAdministrationLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on HealthServicesAdministration Page$")
    public void i_should_see_the_text_on_HealthServicesAdministration_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtHealthServicesAdministrationPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtHealthServicesAdministrationPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 12.InformationTechnology
    @When("^User Click on InformationTechnology link$")
    public void i_Click_on_InformationTechnology_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickInformationTechnologyLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on InformationTechnology Page$")
    public void i_should_see_the_text_on_InformationTechnology_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtInformationTechnologyPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtInformationTechnologyPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 13.LeadershipManagementMBA
    @When("^User Click on LeadershipManagementMBA link$")
    public void i_Click_on_LeadershipManagementMBA_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickLeadershipManagementMBALink();
    }

    @Then("^User should see the \"([^\"]*)\" text on LeadershipManagementMBA Page$")
    public void i_should_see_the_text_on_LeadershipManagementMBA_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtLeadershipManagementMBAPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtLeadershipManagementMBAPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // #############################################################################################################
    // 14.PerformanceManagement
    @When("^User Click on PerformanceManagement link$")
    public void i_Click_on_PerformanceManagement_link() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	megamenuActions.clickPerformanceManagementLink();
    }

    @Then("^User should see the \"([^\"]*)\" text on PerformanceManagement Page$")
    public void i_should_see_the_text_on_PerformanceManagement_Page(String expectedMenuText) throws Throwable {
	boolean result = megamenuActions.getTxtPerformanceManagementPage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(megamenuActions.getTxtPerformanceManagementPage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Click on \"([^\"]*)\" tab$")
    public void i_Click_on_tab(String tab) throws Throwable {
	highlightElement(megamenuLocators.tabLink.replace("value", tab));
	DriverManager.driver.get().findElement(By.xpath(megamenuLocators.tabLink.replace("value", tab))).click();
    }
}