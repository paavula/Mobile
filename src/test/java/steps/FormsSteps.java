package steps;

import java.util.List;
import java.util.Map;

import org.jboss.netty.util.internal.ConcurrentHashMap;
import org.openqa.selenium.logging.LogEntry;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.FooterActions;
import pages.actions.FormsActions;
import pages.locators.FormsLocators;
import setup.TestSetUp;
import utils.DriverManager;
import utils.ErrorUtil;
import utils.ProjectVariables;

public class FormsSteps extends TestSetUp {
 //   private static final String logMsgs = null;
    FormsLocators formsLocators = new FormsLocators();
    FormsActions formsActions = new FormsActions();
    FooterActions footerActions = new FooterActions();
    private static List<LogEntry> adobeLogs;

    @Given("^User Navigate to Lets Go Forms Page$")
    public void user_Navigate_to_letsgo_forms_Page() throws Throwable {
	formsActions.open_letsgo_Page();
    }

    @Given("^User Navigate to EDU Forms Page$")
    public void user_Navigate_to_Edu_forms_Page() throws Throwable {
	formsActions.open_EDU_Forms_Page();
    }

    @Given("^User Navigate to EDU Banner Forms Page$")
    public void user_Navigate_to_Edu_Banner_forms_Page() throws Throwable {
	formsActions.open_EDU_Banner_Forms_Page();
    }

    @Given("^User Navigate to \"([^\"]*)\" Page$")
    public void i_navigate_to_Application_Page(String Url) throws Throwable {
	DriverManager.getDriver().get(Url);
	Thread.sleep(5000);
    }

    @Then("^User should see the \"([^\"]*)\" text on pages$")
    public void i_should_see_the_text_on_thankyou_pages(String expectedMenuText) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtpage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(formsActions.getTxtpage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should navigate to \"([^\"]*)\" Thank you page$")
    public void i_should_see_navigate_to_the_thank_page(String expectedMenuText) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtpage().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(formsActions.getTxtpage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" Success Response Status code$")
    public void i_should_see_the_200_code_in_page(int expectedStatusCode) throws Throwable {
	int result = formsActions.getPageCode();
	System.out.println(expectedStatusCode);
	System.out.println(result);
	try {
	    Assert.assertEquals(result, expectedStatusCode);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User shouldnt see the \"([^\"]*)\" Response Status code$")
    public void i_should_not_see_the_404_Fail_codeStatus(int expectedStatusCode) throws Throwable {
	int result = formsActions.getPageCode();
	System.out.println(expectedStatusCode);
	System.out.println(result);
	try {
	    // Assert.assertEquals(result, expectedStatusCode);
	    Assert.assertNotEquals(result, expectedStatusCode, "Page is navigated to 200");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // *************************Footer Form************************
    @When("^User move to footerRFI$")
    public void i_move_to_footerRFI() throws Throwable {
	formsActions.movetoFooterRFI();
    }

    @Then("^User should see the \"([^\"]*)\" text on footerRFI$")
    public void i_should_see_the_text_on_footerRFI(String expectedMenuText) throws Throwable {
	boolean result = formsActions.getTxtfooterRFI().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(formsActions.getTxtfooterRFI());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User select \"([^\"]*)\" as Degree in form$")
    public void i_select_as_Degree_in_form(String degVal) throws Throwable {
	formsActions.selectDegree(degVal);
    }

    @When("^User select \"([^\"]*)\" as program of interest in form$")
    public void as_program_of_interest_in_form(String aosVal) throws Throwable {
	formsActions.selectAOS(aosVal);
    }

    @When("^User enter \"([^\"]*)\" as FirstName in form$")
    public void i_enter_as_FirstName_in_form(String fName) throws Throwable {
	formsActions.enterfName(fName);
    }

    @When("^User enter \"([^\"]*)\" as LastName in form$")
    public void i_enter_as_LastName_in_form(String lName) throws Throwable {
	formsActions.enterlName(lName);
    }

    @When("^User enter \"([^\"]*)\" as Email in form$")
    public void i_enter_as_Email_in_form(String email) throws Throwable {
	formsActions.enterEmail(email);
    }

    @When("^User enter \"([^\"]*)\" as PhoneNumber in form$")
    public void i_enter_as_PhoneNumber_in_form(String phone) throws Throwable {
	formsActions.enterphoneNumber(phone);
    }

    @When("^User enter \"([^\"]*)\" as PhoneNumber in Footer form$")
    public void i_enter_as_PhoneNumber_in_fotter_form(String phone) throws Throwable {
	formsActions.enterphoneNumberinFF(phone);
    }

    @When("^User enter \"([^\"]*)\" as Zip in form$")
    public void i_enter_as_Zip_in_form(String zip) throws Throwable {
	formsActions.enterZip(zip);
    }

    @When("^User check \"([^\"]*)\" as MilitaryAffiliation in form$")
    public void i_check_as_MilitaryAffiliation_in_form(String arg1) throws Throwable {
	formsActions.checkmilitary();
    }

    @When("^User click \"([^\"]*)\" button in form$")
    public void i_click_button_in_form(String arg1) throws Throwable {
	formsActions.ClickAnGobtnrfi();
	Thread.sleep(5000);
    }

    // ************************** End of Footer Form
    // ************************* Banner Form ******************
    @When("^User move to BannerRFI$")
    public void i_move_to_BannerRFI() throws Throwable {
	formsActions.movetoBannerRFI();
    }

    @Then("^User should see the \"([^\"]*)\" text on BannerRFI$")
    public void i_should_see_the_text_on_BannerrRFI(String expectedMenuText) throws Throwable {
	boolean result = formsActions.getTxtBannerRFI().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(formsActions.getTxtBannerRFI());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User select \"([^\"]*)\" as Degree in Banner form$")
    public void i_select_as_Degree_in_Bform(String degVal) throws Throwable {
	formsActions.selectDegreeInBannerform(degVal);
    }

    @When("^User select \"([^\"]*)\" as program of interest in Banner form$")
    public void as_program_of_interest_in_Bform(String aosVal) throws Throwable {
	formsActions.selectAOSInBannerform(aosVal);
    }

    @When("^User enter \"([^\"]*)\" as FirstName in Banner form$")
    public void i_enter_as_FirstName_in_Bform(String fName) throws Throwable {
	formsActions.enterfNameInBR(fName);
    }

    @When("^User enter \"([^\"]*)\" as LastName in Banner form$")
    public void i_enter_as_LastName_in_Bform(String lName) throws Throwable {
	formsActions.enterlNameInBR(lName);
    }

    @When("^User enter \"([^\"]*)\" as Email in Banner form$")
    public void i_enter_as_Email_in_Bform(String email) throws Throwable {
	formsActions.enterEmailKInBR(email);
    }

    @When("^User enter \"([^\"]*)\" as PhoneNumber in Banner form$")
    public void i_enter_as_PhoneNumber_in_Bform(String phone) throws Throwable {
	formsActions.enterphoneNumberInBR1(phone);
    }

    @When("^User enter \"([^\"]*)\" as Zip in Banner form$")
    public void i_enter_as_Zip_in_Bform(String zip) throws Throwable {
	formsActions.enterZipinBR(zip);
    }

    @When("^User click \"([^\"]*)\" button in Banner form$")
    public void i_click_button_in_Bform(String arg1) throws Throwable {
	formsActions.ClickAnGobtninBR();
	Thread.sleep(5000);
    }

    // ********************* End of Banner Form********************
    // ******************************************** Error Messages for EDU Forms
    @Then("^User should see the \"([^\"]*)\" for FirstName field$")
    public void i_should_see_the_for_FirstName_field(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for LastName field$")
    public void i_should_see_the_for_LastName_field(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for Email field$")
    public void i_should_see_the_for_Email_field(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for PhoneNumber field$")
    public void i_should_see_the_for_PhoneNumber_field(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for ZipCode field$")
    public void i_should_see_the_for_ZipCode_field(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // ************ End Error Messages for EDU Forms **********************

    @Then("^User move to Form$")
    public void i_move_to_form() throws Throwable {
	formsActions.movetoLetsGoForm();
    }

    @And("^User see \"([^\"]*)\" as FirstName in Form$")
    public void i_see_something_as_firstname_in_form(String firstname) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtPurlFName().contains(firstname);
	System.out.println(firstname);
	System.out.println(formsActions.getTxtPurlFName());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as LastName in Form$")
    public void i_see_something_as_lastname_in_form(String lastname) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtPurlLName().contains(lastname);
	System.out.println(lastname);
	System.out.println(formsActions.getTxtPurlLName());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Street Address in Form$")
    public void i_see_something_as_street_address_in_form(String address) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtPurlAddress().contains(address);
	System.out.println(address);
	System.out.println(formsActions.getTxtPurlAddress());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Email in Form$")
    public void i_see_something_as_email_in_form(String email) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtPurlEmail().contains(email);
	System.out.println(email);
	System.out.println(formsActions.getTxtPurlEmail());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as PhoneNumber in Form$")
    public void i_see_something_as_phonenumber_in_form(String phoneno) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtPurlPhone().contains(phoneno);
	System.out.println(phoneno);
	System.out.println(formsActions.getTxtPurlPhone());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Zip in Form$")
    public void i_see_something_as_zip_in_form(String zip) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtPurlZip().contains(zip);
	System.out.println(zip);
	System.out.println(formsActions.getTxtPurlZip());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Degree in Form$")
    public void i_see_something_as_degree_in_form(String degree) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtPurlDegree().contains(degree);
	System.out.println(degree);
	System.out.println(formsActions.getTxtPurlDegree());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Area of Interest in Form$")
    public void i_see_something_as_area_of_interest_in_form(String area) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtPurlArea().contains(area);
	System.out.println(area);
	System.out.println(formsActions.getTxtPurlArea());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // ******************************************** Degree Forms
    @When("^User move to Degree Form$")
    public void i_move_to_degree_form() throws Throwable {
	formsActions.movetoDegreeForm();
    }

    @When("^User click \"([^\"]*)\" button in Degree form$")
    public void i_click_something_button_in_degree_form(String Submit) throws Throwable {
	formsActions.ClickSUbmitBtn();
	Thread.sleep(1000);
    }

    @And("^User enter \"([^\"]*)\" as FirstName in Degree form$")
    public void i_enter_something_as_firstname_in_degree_form(String fName) throws Throwable {
	formsActions.enterFNameDF(fName);
    }

    @And("^User enter \"([^\"]*)\" as LastName in Degree form$")
    public void i_enter_something_as_lastname_in_degree_form(String lName) throws Throwable {
	formsActions.enterlNameDF(lName);
    }

    @And("^User enter \"([^\"]*)\" as Company in Degree form$")
    public void i_enter_something_as_company_in_degree_form(String company) throws Throwable {
	formsActions.enterCompany(company);
    }

    @And("^User enter \"([^\"]*)\" as Title in Degree form$")
    public void i_enter_something_as_title_in_degree_form(String title) throws Throwable {
	formsActions.enterTitle(title);
    }

    @And("^User enter \"([^\"]*)\" as Email in Degree form$")
    public void i_enter_something_as_email_in_degree_form(String email) throws Throwable {
	formsActions.enterEmailinDF(email);
    }

    @And("^User enter \"([^\"]*)\" as Comments in Degree form$")
    public void i_enter_something_as_comments_in_degree_form(String comments) throws Throwable {
	formsActions.enterCeomments(comments);
    }

    @When("^User click \"([^\"]*)\" button in Sucess window in form$")
    public void i_click_something_button_in_sucess_window_in_form(String strArg1) throws Throwable {
	formsActions.clickCloseBtn();
    }

    @Then("^User should see the \"([^\"]*)\" text on Window$")
    public void i_should_see_the_something_text_on_window(String expectedMenuText) throws Throwable {
	boolean result = formsActions.getTxtwinodw().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(formsActions.getTxtwinodw());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // ******************************************** End Degree Forms
    // ******************************************** Download Form
    @And("^User enter \"([^\"]*)\" as FirstName in Download form$")
    public void i_enter_something_as_firstname_in_download_form(String fName) throws Throwable {
	formsActions.enterfNamedw(fName);
    }

    @And("^User enter \"([^\"]*)\" as LastName in Download form$")
    public void i_enter_something_as_lastname_in_download_form(String lName) throws Throwable {
	formsActions.enterlNamedw(lName);
    }

    @And("^User enter \"([^\"]*)\" as Email in Download form$")
    public void i_enter_something_as_email_in_download_form(String email) throws Throwable {
	formsActions.enterEmaildw(email);
    }

    @And("^User enter \"([^\"]*)\" as PhoneNumber in Download form$")
    public void i_enter_something_as_phonenumber_in_download_form(String phone) throws Throwable {
	formsActions.enterphoneNumberdw(phone);
    }

    @And("^User enter \"([^\"]*)\" as Zip in Download form$")
    public void i_enter_something_as_zip_in_download_form(String zip) throws Throwable {
	formsActions.enterZipdw(zip);
    }

    @When("^User click \"([^\"]*)\" button in Download form$")
    public void i_click_something_button_in_download_form(String strArg1) throws Throwable {
	formsActions.ClickAnGobtndw();
	Thread.sleep(3000);
    }

    @When("^User click \"([^\"]*)\" button in Cheddar Download form$")
    public void i_click_something_button_in_cheddar_download_form(String strArg1) throws Throwable {
	formsActions.ClickAnGobtncfdw();
	Thread.sleep(3000);
    }

    // ****************************** Micro Site form
    @When("^User move to MicroSite form$")
    public void i_move_to_microsite_form() throws Throwable {
	formsActions.moveToMForm();
    }

    @When("^User click \"([^\"]*)\" button in MicroSite form$")
    public void i_click_something_button_in_microsite_form(String strArg1) throws Throwable {
	formsActions.ClickAnGobtnmf();
	Thread.sleep(4000);
    }

    @And("^User enter \"([^\"]*)\" as FirstName in MicroSite form$")
    public void i_enter_something_as_firstname_in_MicroSite_form(String fName) throws Throwable {
	formsActions.enterfNamemf(fName);
    }

    @And("^User enter \"([^\"]*)\" as LastName in MicroSite form$")
    public void i_enter_something_as_lastname_in_MicroSite_form(String lName) throws Throwable {
	formsActions.enterlNamemf(lName);
    }

    @And("^User enter \"([^\"]*)\" as Email in MicroSite form$")
    public void i_enter_something_as_email_in_MicroSite_form(String email) throws Throwable {
	formsActions.enterEmailmf(email);
    }

    @And("^User enter \"([^\"]*)\" as PhoneNumber in MicroSite form$")
    public void i_enter_something_as_phonenumber_in_MicroSite_form(String phone) throws Throwable {
	formsActions.enterphoneNumbermf(phone);
    }

    @And("^User enter \"([^\"]*)\" as Zip in MicroSite form$")
    public void i_enter_something_as_zip_in_MicroSite_form(String zip) throws Throwable {
	formsActions.enterZipmf(zip);
    }

    @And("^User select \"([^\"]*)\" as education level in form$")
    public void as_education_of_level_in_cheddar_form(String elvVal) throws Throwable {
	formsActions.selectel(elvVal);
    }

    @Given("^User Navigate to Cheddar Application Page$")
    public void user_navigate_to_cheddar_page() throws Throwable {
	formsActions.open_Cheddar_Application();
    }

    @And("^User select \"([^\"]*)\" as education level in download form$")
    public void as_education_of_level_in_cheddar_download_form_val(String elVal) throws Throwable {
	formsActions.selecteldf(elVal);
    }

    // **************************** Nominate Teachers Form
    @When("^User move to Nominate Teacher form$")
    public void i_move_to_nominate_teacher_form() throws Throwable {
	formsActions.moveToNomForm();
    }

    @When("^User click \"([^\"]*)\" button in Nominate form$")
    public void i_click_something_button_in_nominate_form(String submit) throws Throwable {
	formsActions.ClickAnGobtn();
    }

    @And("^User enter \"([^\"]*)\" as Faculty First Name in Nominate form$")
    public void i_enter_something_as_faculty_first_name_in_nominate_form(String fFname) throws Throwable {
	formsActions.enterfFName(fFname);
    }

    @And("^User enter \"([^\"]*)\" as Faculty Last Name in Nominate form$")
    public void i_enter_something_as_faculty_last_name_in_nominate_form(String fLname) throws Throwable {
	formsActions.enterfLname(fLname);
    }

    @And("^User enter \"([^\"]*)\" as Campus in Nominate form$")
    public void i_enter_something_as_campus_in_nominate_form(String campus) throws Throwable {
	formsActions.enterCampus(campus);
    }

    @And("^User enter \"([^\"]*)\" as Course in Nominate form$")
    public void i_enter_something_as_course_in_nominate_form(String program) throws Throwable {
	formsActions.enterProgram(program);
    }

    @And("^User enter \"([^\"]*)\" as Reason in Nominate form$")
    public void i_enter_something_as_reason_in_nominate_form(String reason) throws Throwable {
	formsActions.enterReason(reason);
    }

    @And("^User enter \"([^\"]*)\" as Student First Name in Nominate form$")
    public void i_enter_something_as_student_first_name_in_nominate_form(String sFname) throws Throwable {
	formsActions.entersFName(sFname);
    }

    @And("^User enter \"([^\"]*)\" as Student Last Name in Nominate form$")
    public void i_enter_something_as_student_last_name_in_nominate_form(String sLname) throws Throwable {
	formsActions.entersLname(sLname);
    }

    @And("^User enter \"([^\"]*)\" as Student Campus in Nominate form$")
    public void i_enter_something_as_student_campus_in_nominate_form(String shomecampus) throws Throwable {
	formsActions.entersCampus(shomecampus);
    }

    @And("^User enter \"([^\"]*)\" as Student Id in Nominate form$")
    public void i_enter_something_as_student_id_in_nominate_form(String sid) throws Throwable {
	formsActions.entersId(sid);
    }

    @Then("^User should see the \"([^\"]*)\" Error Meeage in Nominate form$")
    public void i_should_see_the_for_FirstName_field_mf(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getErrorMessage().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getErrorMessage());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // ********************** Linked-in form *****
    @When("^User enter \"([^\"]*)\" as FirstName in LinkedIn form$")
    public void i_enter_as_FirstName_in_LinkedIn_form(String fName) throws Throwable {
	formsActions.enterfNamelf(fName);
    }

    @When("^User enter \"([^\"]*)\" as LastName in LinkedIn form$")
    public void i_enter_as_LastName_in_LinkedIn_form(String lName) throws Throwable {
	formsActions.enterlNamelf(lName);
    }

    @When("^User enter \"([^\"]*)\" as Email in LinkedIn form$")
    public void i_enter_as_Email_in_LinkedIn_form(String email) throws Throwable {
	formsActions.enterEmaillf(email);
    }

    @When("^User enter \"([^\"]*)\" as PhoneNumber in LinkedIn form$")
    public void i_enter_as_PhoneNumber_in_LinkedIn_form(String phone) throws Throwable {
	formsActions.enterphoneNumberlf(phone);
    }

    @When("^User enter \"([^\"]*)\" as Zip in LinkedIn form$")
    public void i_enter_as_Zip_in_LinkedIn_form(String zip) throws Throwable {
	formsActions.enterZiplf(zip);
    }

    @And("^User Selects \"([^\"]*)\" as TransferCreditInterest Option in LinkedIn form$")
    public void i_enter_as_TC_in_LinkedIn_form(String Yes) throws Throwable {
	formsActions.selectTCOptioninLinkedInForm(Yes);
    }

    @When("^User click \"([^\"]*)\" button in LinkedIn form$")
    public void i_click_button_in_LinkedIn_form(String LinkedIn) throws Throwable {
	formsActions.ClickSubmitBtnlf();
	Thread.sleep(10000);
    }

    @When("^User Enter \"([^\"]*)\" ,  \"([^\"]*)\" and Clicked on \"([^\"]*)\" Button$")
    public void userEnter_UserNamePasswordAndClickedOnSomethingButton(String Email, String Password, String strArg1)
	    throws Throwable {
	Thread.sleep(10000);
	formsActions.ClickSignWIthButton(Email, Password);
    }

    @When("^User Click on \"([^\"]*)\" Button$")
    public void User_Click_On_Something_Button(String Button) throws Throwable {
	Thread.sleep(5000);
	formsActions.ClickAutoFillButton();
    }

    @And("^User see \"([^\"]*)\" as FirstName in LinedIn Form$")
    public void i_see_something_as_firstname_in_LinkedIn_form(String firstname) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtLInkedinFName().contains(firstname);
	System.out.println(firstname);
	System.out.println(formsActions.getTxtLInkedinFName());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as LastName in LinedIn Form$")
    public void i_see_something_as_lastname_in_LinedIn_form(String lastname) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtLInkedinLName().contains(lastname);
	System.out.println(lastname);
	System.out.println(formsActions.getTxtLInkedinLName());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Email in LinedIn Form$")
    public void i_see_something_as_email_in_LinedIn_form(String email) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtLInkedinEmail().contains(email);
	System.out.println(email);
	System.out.println(formsActions.getTxtLInkedinEmail());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as PhoneNumber in LinedIn Form$")
    public void i_see_something_as_phonenumber_in_LinedIn_form(String phoneno) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtLInkedinPhone().contains(phoneno);
	System.out.println(phoneno);
	System.out.println(formsActions.getTxtLInkedinPhone());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Zip in LinedIn Form$")
    public void i_see_something_as_zip_in_LinedIn_form(String zip) throws Throwable {
	Thread.sleep(3000);
	boolean result = formsActions.getTxtLInkedinZip().contains(zip);
	System.out.println(zip);
	System.out.println(formsActions.getTxtLInkedinZip());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // ****************** SHORT FORM ******************
    @Given("^User move to Short form Page$")
    public void i_move_to_Short_Form_Page() throws Throwable {
	formsActions.OpenShortFormPage();
	Thread.sleep(10000);
	
    }

    @When("^User move to Short form$")
    public void i_move_to_Short_Form() throws Throwable {
	formsActions.movetoShortRFI();
    }
    @When("^User Clicks on \"([^\"]*)\" Link in Footer Ribbon$")
    public void userClicksOnSomethingLinkInFooterRibbon(String strArg1) throws Throwable {
    	formsActions.clickRFIinFooter();
    }

    @When("^User enter \"([^\"]*)\" as FirstName in Short form$")
    public void i_enter_as_FirstName_in_Short_form(String fName) throws Throwable {
	formsActions.enterfNameSF(fName);
    }

    @When("^User enter \"([^\"]*)\" as LastName in Short form$")
    public void i_enter_as_LastName_in_LShort_form(String lName) throws Throwable {
	formsActions.enterlNameSF(lName);
    }

    @When("^User enter \"([^\"]*)\" as Email in Short form$")
    public void i_enter_as_Email_in_Short_form(String email) throws Throwable {
	formsActions.enterEmailSF(email);
    }

    @When("^User enter \"([^\"]*)\" as PhoneNumber in Short form$")
    public void i_enter_as_PhoneNumber_in_Short_form(String phone) throws Throwable {
	formsActions.enterphoneNumberSF(phone);
    }

    @When("^User enter \"([^\"]*)\" as Zip in Short form$")
    public void i_enter_as_Zip_in_Short_form(String zip) throws Throwable {
	formsActions.enterZipSF(zip);
    }

    @And("^User Selects \"([^\"]*)\" as TransferCreditInterest Option in Short form$")
    public void i_enter_as_TC_in_Short_form(String Yes) throws Throwable {
	formsActions.selectTCOptioninSForm(Yes);
    }

    @When("^User click \"([^\"]*)\" button in Short form$")
    public void i_click_button_in_Short_form(String arg1) throws Throwable {
	formsActions.clickAnGobtnSF();
	Thread.sleep(5000);
    }

    // ****** Short from with drop down ***********************************
    @Given("^User move to Short form with drop down Page$")
    public void i_move_to_Short_Form_with_dd_Page() throws Throwable {
	formsActions.OpenShortFormddPage();
    }

    @When("^User select \"([^\"]*)\" as program of interest in Short form$")
    public void as_program_of_interest_in_sf_ddform(String aosVal) throws Throwable {
	formsActions.selectAOSSR(aosVal);
	Thread.sleep(2000);
    }

    @When("^User select \"([^\"]*)\" as Degree in Short form$")
    public void i_select_as_Degree_insf_dd_SF_form(String degVal) throws Throwable {
	formsActions.selectDegreeInBR(degVal);
    }

    @And("^User Selects \"([^\"]*)\" as TransferCreditInterest Option in Short form with dropdown$")
    public void i_enter_as_TC_in_Short_form_dd(String Yes) throws Throwable {
	formsActions.selectTCOptioninSFormdd(Yes);
    }

    // ********************** Two STEP FORM *************************
    @Given("^User move to Two step  form Page$")
    public void i_move_to_Two_Step_Form() throws Throwable {
	formsActions.OpenTwoStepFormPage();
    }

    @When("^User select \"([^\"]*)\" as Degree in Two Step form$")
    public void i_select_as_Degree_in_two_step_form(String degVal) throws Throwable {
	formsActions.selectDegree2sf(degVal);
    }

    @When("^User select \"([^\"]*)\" as program of interest in Two Step form$")
    public void as_program_of_interest_in_two_step_form(String aosVal) throws Throwable {
	formsActions.selectAOS2sf(aosVal);
    }

    @When("^User enter \"([^\"]*)\" as FirstName in Two Step form$")
    public void i_enter_as_FirstName_in_two_step_form(String fName) throws Throwable {
	formsActions.enterfName2sf(fName);
    }

    @When("^User enter \"([^\"]*)\" as LastName in Two Step form$")
    public void i_enter_as_LastName_in_two_step_form(String lName) throws Throwable {
	formsActions.enterlName2sf(lName);
    }

    @When("^User enter \"([^\"]*)\" as Email in Two Step form$")
    public void i_enter_as_Email_in_two_step_form(String email) throws Throwable {
	formsActions.enterEmail2sf(email);
    }

    @When("^User enter \"([^\"]*)\" as PhoneNumber in Two Step form$")
    public void i_enter_as_PhoneNumber_in_two_step_form(String phone) throws Throwable {
	formsActions.enterphoneNumber2sf(phone);
    }

    @When("^User enter \"([^\"]*)\" as Zip in Two Step form$")
    public void i_enter_as_Zip_in_two_step_form(String zip) throws Throwable {
	formsActions.enterZip2sf(zip);
    }

    @When("^User enter \"([^\"]*)\" as Address in Two Step form$")
    public void i_enter_as_Address_in_two_step_form(String address) throws Throwable {
	formsActions.enterAddress2sf(address);
	Thread.sleep(3000);
    }

    @When("^User click \"([^\"]*)\" Button in Two Step form$")
    public void i_click_button_in_ts_form(String arg1) throws Throwable {
	formsActions.ClickNextbtn2sf();
    }

    @And("^User Selects \"([^\"]*)\" as TransferCreditInterest Option in Two Step form$")
    public void i_enter_as_TC_in_two_step_form(String Yes) throws Throwable {
	formsActions.selectTCOptionin2SForm(Yes);
    }

    @When("^User click \"([^\"]*)\" button in Two Step form$")
    public void i_click_button_in_two_step_form(String arg1) throws Throwable {
	formsActions.ClickAnGobtn2sf();
	Thread.sleep(3000);
    }

    // ********************** LONG FORM ***************************************
    @Given("^User move to Long  form Page$")
    public void i_move_to_Long_Form_Lp() throws Throwable {
	formsActions.OpenLongFormPage();
    }

    @And("^User Selects \"([^\"]*)\" as TransferCreditInterest Option in Long form$")
    public void i_enter_as_TC_in_Long_form(String Yes) throws Throwable {
	formsActions.selectTCOptioninLongForm(Yes);
    }

    @When("^User enter \"([^\"]*)\" as FirstName in Long form$")
    public void i_enter_as_FirstName_in_Long_form(String fName) throws Throwable {
	formsActions.enterfNamelform(fName);
    }

    @When("^User enter \"([^\"]*)\" as LastName in Long form$")
    public void i_enter_as_LastName_in_Long_form(String lName) throws Throwable {
	formsActions.enterlNamelform(lName);
    }

    @When("^User enter \"([^\"]*)\" as Email in Long form$")
    public void i_enter_as_Email_in_Long_form(String email) throws Throwable {
	formsActions.enterEmaillform(email);
    }

    @When("^User enter \"([^\"]*)\" as Address in Long form$")
    public void i_enter_as_Address_in_Long_form(String address) throws Throwable {
	formsActions.enterAddresslf(address);
    }

    @When("^User enter \"([^\"]*)\" as PhoneNumber in Long form$")
    public void i_enter_as_PhoneNumber_in_Long_form(String phone) throws Throwable {
	formsActions.enterphoneNumberlform(phone);
    }

    @When("^User enter \"([^\"]*)\" as Zip in Long form$")
    public void i_enter_as_Zip_in_Long_form(String zip) throws Throwable {
	formsActions.enterZiplform(zip);
    }

    @When("^User select \"([^\"]*)\" as Education Level in Long form$")
    public void i_select_as_Education_Level_valuue_in_Long_form_lpf(String pgVal) throws Throwable {
	formsActions.selectPGlf(pgVal);
    }

    @When("^User select \"([^\"]*)\" as Degree in Long form$")
    public void i_select_as_Degree_value__in_Long_form_Lpf(String degVal) throws Throwable {
	formsActions.selectDegreelf(degVal);
    }

    @When("^User select \"([^\"]*)\" as program of interest in Long form$")
    public void as_program_of_interest_valaue_in_Long_form_lpf(String aosVal) throws Throwable {
	formsActions.selectAOSlf(aosVal);
    }

    @When("^User click \"([^\"]*)\" button in Long form$")
    public void i_click_button_in_Long_form_lp_for(String arg1) throws Throwable {
	formsActions.clickAnGobtnlform();
	Thread.sleep(3000);
    }

    @Then("^User should see the \"([^\"]*)\" for PhoneNumber field in Form$")
    public void i_should_see_the_for_PhoneNumber_field_Form(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getPhone_Error().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getPhone_Error());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }
    // ** Bemore Form

    // **************************** CU APPLICATION **********
    // ********************** LOGIN
    @Given("^User is on Capella Home Page$")
    public void mcReg_i_am_on_Capella_Home_Page() throws Throwable {
	formsActions.OpenCUApplication();
    }

    @Given("^User click Login link to check MC Login$")
    public void i_click_Login_link_in_header_menu() throws Throwable {
	formsActions.clickLoginLink();
    }

    @Given("^User click Prospective Students link under Login$")
    public void i_click_Prospective_Students_link_under_Login() throws Throwable {
	formsActions.clickProspStudLink();
    }

    @Then("^User get MC Login modal form to enter credentials$")
    public void i_get_login_modal_form() throws Throwable {
	Thread.sleep(1000);
	boolean loginFormAvlb = formsActions.verifyLoginForm();
	Thread.sleep(1000);
	try {
	    Assert.assertTrue(loginFormAvlb);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User enter \"([^\"]*)\" username or email$")
    public void i_enter_username_or_email(String usrName) throws Throwable {
	formsActions.enterUserNameinLoginForm(usrName);
	Thread.sleep(1000);
    }

    @And("^User enter \"([^\"]*)\" password$")
    public void i_enter_password(String usrPwd) throws Throwable {
	formsActions.enterUserPwdinLoginForm(usrPwd);
	Thread.sleep(1000);
    }

    @Given("^User click LogIn button in form$")
    public void i_click_login_button_in_form() throws Throwable {
	formsActions.clickLoginBtninLoginForm();
	Thread.sleep(50000);
    }

    @And("^User Click on Close Button$")
    public void i_click_on_close_button() throws Throwable {
	formsActions.clickLoginCloseBtn();
	Thread.sleep(5000);
    }

    @Then("^User see user logged in to My Capella dashboard$")
    public void i_see_user_logged_in_to_MyCapella_dashboard() throws Throwable {
	Thread.sleep(1000);
	boolean myProfileAvlb = formsActions.verifyMyprofileLinkElement();
	System.out.println("Lkink" + myProfileAvlb);
	Thread.sleep(5000);
	try {
	    Assert.assertTrue(myProfileAvlb);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" text on My Capella Dashboard$")
    public void i_should_see_the_something_text_on_my_capella_dashboard(String expectedMenuText) throws Throwable {
	boolean result = formsActions.getTxtMyprofileLink().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(formsActions.getTxtMyprofileLink());
	Thread.sleep(13000);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // ***************************** REGISTRATION
    @Given("^User click Create a new Account link in Login modal$")
    public void i_click_create_account_link() throws Throwable {
	formsActions.clickCreateAccntLink();
    }

    @Then("^User get Create Account modal form$")
    public void i_get_create_account_modal_form() throws Throwable {
	Thread.sleep(1000);
	boolean signUpFormAvlb = formsActions.verifySignUpForm();
	Thread.sleep(1000);
	try {
	    Assert.assertTrue(signUpFormAvlb);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User enter \"([^\"]*)\" First Name Create Account form$")
    public void i_enter_First_Name_in_create_account_form(String FName) throws Throwable {
	formsActions.enterSignUpFirstName(FName);
	Thread.sleep(1000);
    }

    @And("^User enter \"([^\"]*)\" Last Name in Create Account form$")
    public void i_enter_Last_Name_in_create_account_form(String LName) throws Throwable {
	formsActions.enterSignUpLastName(LName);
	Thread.sleep(1000);
    }

    @Given("^User enter an Email Address in Create Account form$")
    public void i_enter_an_Email_Address_in_create_account_form() throws Throwable {
	String dynEmailAddr = formsActions.genUniqueEmailAddress();
	formsActions.enterEmailAddress(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User enter \"([^\"]*)\" Password in Create Account form$")
    public void i_enter_password_in_create_account_form(String pwd) throws Throwable {
	formsActions.enterSignUpPassword(pwd);
	Thread.sleep(1000);
    }

    @And("^User enter \"([^\"]*)\" Confirm Password in Create Account form$")
    public void i_enter_confirm_password_in_create_account_form(String CnfmPwd) throws Throwable {
	formsActions.enterSignUpCnfmPassword(CnfmPwd);
	Thread.sleep(1000);
    }

    @Given("^User click the Create Account button in form$")
    public void i_submit_the_create_account_form() throws Throwable {
	formsActions.clickSignUpSubmitBtn();
	Thread.sleep(10000);
    }

    @Then("^User see new user created and logged in to My Capella dashboard$")
    public void i_see_new_user_created_and_logged_in_to_MyCapella_dashboard() throws Throwable {
	Thread.sleep(5000);
	boolean myProfileAvlb = formsActions.verifyMyprofileLinkElement();
	Thread.sleep(1000);
	try {
	    Assert.assertTrue(myProfileAvlb);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
	System.out.println("New User Created");
    }

    // ********************* RESET PASSWORD FORM
    @Then("^User get Forgot Password form$")
    public void i_get_forgot_password_form() throws Throwable {
	Thread.sleep(1000);
	boolean signUpFormAvlb = formsActions.moveToFrgtForm();
	Thread.sleep(1000);
	try {
	    Assert.assertTrue(signUpFormAvlb);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User get Reset Password Sucess Window$")
    public void i_get_reset_password_sucess_window() throws Throwable {
	Thread.sleep(1000);
	boolean signUpFormAvlb = formsActions.verifySusWindow();
	Thread.sleep(1000);
	try {
	    Assert.assertTrue(signUpFormAvlb);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User Click on logout Link$")
    public void i_click_on_logout_link() throws Throwable {
	formsActions.clickLogOut();
    }

    @And("^User Clikc on Reset Password Link$")
    public void i_clikc_on_reset_password_link() throws Throwable {
	formsActions.clickRstPwd();
    }

    @And("^User enter as \"([^\"]*)\" Email Address in Form$")
    public void i_enter_as_something_email_address_in_form(String email) throws Throwable {
	formsActions.enteremailaddress(email);
    }

    @And("^User Clikc on Request Password Button$")
    public void i_clikc_on_request_password_button() throws Throwable {
	formsActions.clickReqPwdbtn();
    }

    @And("^User Click on Ok Button$")
    public void i_click_on_ok_button() throws Throwable {
	formsActions.clickOkBtn();
    }

    // **************** RESET USER NAME
    @And("^User Click on Reset User Name Link$")
    public void i_clikc_on_reset_user_name_link() throws Throwable {
	formsActions.clickRstUname();
    }

    @Then("^User get Reset User Name form$")
    public void i_get_reset_username_form() throws Throwable {
	Thread.sleep(1000);
	boolean signUpFormAvlb = formsActions.moveToRstUnameForm();
	Thread.sleep(1000);
	try {
	    Assert.assertTrue(signUpFormAvlb);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User Click on Continue Button$")
    public void i_click_on_Continue_button() throws Throwable {
	formsActions.clickContinueBtn();
    }

    @Then("^User get Reset User Name Sucess Window$")
    public void i_get_reset_user_name_sucess_window() throws Throwable {
	Thread.sleep(1000);
	boolean signUpFormAvlb = formsActions.verifyUnameWindow();
	Thread.sleep(1000);
	try {
	    Assert.assertTrue(signUpFormAvlb);
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // **************** EMAIL US FORM
    @Given("^User click Email Us link under the menu$")
    public void emailUsform_i_click_Schedule_Consultation_link_under_the_menu() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	formsActions.clickAskaQuestion();
	formsActions.clickEmailUsLink();
	;
    }

    @Then("^User move to Email Us Form$")
    public void i_move_to_email_us_form() throws Throwable {
	formsActions.moveToEmailUSFrom();
    }

    @Given("^User select \"([^\"]*)\" as Degree in Email form$")
    public void emailUsform_i_select_a_Degree_in_Email_form(String degree) throws Throwable {
	formsActions.selectDegreeEForm(degree);

    }

    @Given("^User select \"([^\"]*)\" as Area of Study in Email form$")
    public void emailUsform_i_select_an_Area_of_Study_in_Email_form(String aos) throws Throwable {
	formsActions.selectAOSEForm(aos);

    }

    @Given("^User select \"([^\"]*)\" as Specialization Study in Email form$")
    public void emailUsform_i_select_a_Specialization_Study_in_Email_form(String spec) throws Throwable {
	formsActions.selectSpec(spec);

    }

    @Given("^User enter \"([^\"]*)\" as First Name in Email form$")
    public void emailUsform_i_enter_First_Name_in_Email_form(String FName) throws Throwable {
	formsActions.enterFirstNameEForm(FName);
	Thread.sleep(1000);
    }

    @Given("^User enter \"([^\"]*)\" as Last Name in Email form$")
    public void emailUsform_i_enter_Last_Name_in_Email_form(String LName) throws Throwable {
	formsActions.enterLastNameEForm(LName);
    }

    @Given("^User enter email in Email Address in Email form$")
    public void emailUsform_i_enter_an_Email_Address_in_Email_form() throws Throwable {
	String dynEmailAddr = formsActions.genUniqueEmailAddress();
	System.out.println("EMail:" + dynEmailAddr);
	// formsActions.enterEmailAddress(dynEmailAddr);
	formsActions.enterEmailAddressEForm(dynEmailAddr);
	Thread.sleep(1000);
    }

    @Given("^User enter PhoneNo as Phone Number in Email form$")
    public void emailUsform_i_enter_Phone_Number_in_Email_form() throws Throwable {
	String PhNumbmer = formsActions.getPhoneNumber();
	System.out.println("Dynamic phone no:" + PhNumbmer);
	formsActions.enterPhNumEForm(PhNumbmer);
    }

    @Given("^User enter \"([^\"]*)\" user Comments in Email form$")
    public void emailUsform_i_enter_user_comments_in_Email_form(String UserNotes) throws Throwable {
	formsActions.enteruserNotesEForm(UserNotes);
	Thread.sleep(1000);
    }

    @Given("^User submit the Email form$")
    public void emailUsform_i_submit_the_email_form() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	formsActions.clickEmailUsAgreeGoBtn();
	Thread.sleep(5000);
    }

    @And("^User should get Thank you window for Email form$")
    public void i_should_get_thank_you_window_for_email_form() throws Throwable {
	formsActions.movetoThnWindow();
    }

    @And("^User should see \"([^\"]*)\" in the Thankyou Page for EmailUs Form$")
    public void i_should_see_something_in_the_thankyou_page_for_emailus_form(String expectedMenuText) throws Throwable {
	boolean result = formsActions.getThnTxtwinodw().contains(expectedMenuText);
	System.out.println(expectedMenuText);
	System.out.println(formsActions.getThnTxtwinodw());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User click \"([^\"]*)\" button in Thank you Sucess window in form$")
    public void i_click_something_button_in_thank_you_sucess_window_in_form(String strArg1) throws Throwable {
	formsActions.ClickCloseWinBtn();
    }

    // ****************RFI FORM
    @And("^User should get Thank you window for RFI form$")
    public void i_should_get_thank_you_window_for_RFI_form() throws Throwable {
	formsActions.movetoThnWindow();
    }

    @Given("^User click Request Information link under the menu$")
    public void RFI_i_click_Schedule_Consultation_link_under_the_menu() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	formsActions.clickAskaQuestion();
	formsActions.clickReqInfoLink();
	;
    }

    @Then("^User move to Request More Information form$")
    public void i_move_to_RFI_form() throws Throwable {
	formsActions.moveToRFIFrom();
    }

    @Given("^User select \"([^\"]*)\" as Degree in RFI form$")
    public void emailUsform_i_select_a_Degree_in_RFI_form(String degree) throws Throwable {
	formsActions.selectDegreeEFormRFI(degree);

    }

    @Given("^User select \"([^\"]*)\" as Area of Study in RFI form$")
    public void emailUsform_i_select_an_Area_of_Study_in_RFI_form(String aos) throws Throwable {
	formsActions.selectAOSEFormRFI(aos);

    }

    @Given("^User select \"([^\"]*)\" as Specialization Study in RFI form$")
    public void emailUsform_i_select_a_Specialization_Study_in_RFI_form(String spec) throws Throwable {
	formsActions.selectSpecRFI(spec);

    }

    @And("^User select \"([^\"]*)\" as Start Date in RFI form$")
    public void emailUsform_i_select_a_Start_Date_in_RFI_form(String spec) throws Throwable {
	formsActions.selectDate(spec);

    }

    @Given("^User enter \"([^\"]*)\" as First Name in RFI form$")
    public void emailUsform_i_enter_First_Name_in_RFI_form(String FName) throws Throwable {
	formsActions.enterFirstNameEForm(FName);
	Thread.sleep(1000);
    }

    @Given("^User enter \"([^\"]*)\" as Last Name in RFI form$")
    public void emailUsform_i_enter_Last_Name_in_RFI_form(String LName) throws Throwable {
	formsActions.enterLastNameEForm(LName);
    }

    @Given("^User enter email in Email Address in RFI form$")
    public void emailUsform_i_enter_an_Email_Address_in_RFI_form() throws Throwable {
	String dynEmailAddr = formsActions.genUniqueEmailAddress();
	// formsActions.enterEmailAddress(dynEmailAddr);
	formsActions.enterEmailAddressEForm(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User enter PhoneNumber as Phone Number in RFI form$")
    public void emailUsform_i_enter_Phone_Number_in_RFI_form() throws Throwable {
	String PhNumbmer = formsActions.getPhoneNumber();
	System.out.println("Dynamic phone no:" + PhNumbmer);
	formsActions.enterPhNumEForm(PhNumbmer);
    }

    @And("^User enter \"([^\"]*)\" as ZipCode in RFI form$")
    public void emailUsform_i_enter_user_zipcode_in_RFI_form(String zipcode) throws Throwable {
	formsActions.enterZipCode(zipcode);
	Thread.sleep(1000);
    }

    @Given("^User submit the RFI form$")
    public void emailUsform_i_submit_the_RFI_form() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	formsActions.clickEmailUsAgreeGoBtn();
	Thread.sleep(5000);
    }

    @Then("^User move to Consultation form$")
    public void i_move_to_Consultation_form() throws Throwable {
	formsActions.moveToConsultationFrom();
    }

    @Given("^User select \"([^\"]*)\" as Degree in Consultation form$")
    public void emailUsform_i_select_a_Degree_in_Consultation_form(String degree) throws Throwable {
	formsActions.selectDegreeEFormCF(degree);

    }

    @Given("^User select \"([^\"]*)\" as Area of Study in Consultation form$")
    public void emailUsform_i_select_an_Area_of_Study_in_Consultation_form(String aos) throws Throwable {
	formsActions.selectAOSEFormCF(aos);

    }

    @Given("^User select \"([^\"]*)\" as Specialization Study in Consultation form$")
    public void emailUsform_i_select_a_Specialization_Study_in_Consultation_form(String spec) throws Throwable {
	formsActions.selectSpecCF(spec);

    }

    @And("^User select \"([^\"]*)\" as Start Date in Consultation form$")
    public void emailUsform_i_select_a_Start_Date_in_Consultation_form(String spec) throws Throwable {
	formsActions.selectDateCF(spec);

    }

    @Given("^User enter \"([^\"]*)\" as First Name in Consultation form$")
    public void emailUsform_i_enter_First_Name_in_Consultation_form(String FName) throws Throwable {
	formsActions.enterFirstNameEForm(FName);
	Thread.sleep(1000);
    }

    @Given("^User enter \"([^\"]*)\" as Last Name in Consultation form$")
    public void emailUsform_i_enter_Last_Name_in_Consultation_form(String LName) throws Throwable {
	formsActions.enterLastNameEForm(LName);
    }

    @Given("^User enter email in Email Address in Consultation form$")
    public void emailUsform_i_enter_an_Email_Address_in_Consultation_form() throws Throwable {
	String dynEmailAddr = formsActions.genUniqueEmailAddress();
	// formsActions.enterEmailAddress(dynEmailAddr);
	formsActions.enterEmailAddressEForm(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User enter PhoneNumber as Phone Number in Consultation form$")
    public void emailUsform_i_enter_Phone_Number_in_Consultation_form() throws Throwable {
	String PhNumbmer = formsActions.getPhoneNumber();
	System.out.println("Dynamic phone no:" + PhNumbmer);
	formsActions.enterPhNumEForm(PhNumbmer);
    }

    @And("^User enter \"([^\"]*)\" as ZipCode in Consultation form$")
    public void emailUsform_i_enter_user_zipcode_in_Consultation_form(String zipcode) throws Throwable {
	formsActions.enterZipCode(zipcode);
	Thread.sleep(1000);
    }

    @Given("^User submit the Consultation form$")
    public void emailUsform_i_submit_the_Consultation_form() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	formsActions.clickEmailUsAgreeGoBtn();
	Thread.sleep(5000);
    }

    @And("^User should get Thank you window for Consultation form$")
    public void i_should_get_thank_you_window_for_CF_form() throws Throwable {
	formsActions.movetoThnWindow();
    }

    @Given("^User click Schedule Consultation link under the menu$")
    public void RFI_i_click_Schedule_Consultation_link_CF_under_the_menu() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	formsActions.clickAskaQuestion();
	formsActions.clickSchldConsLink();
    }

    // *************************** REFER A FREIND FORM
    @Given("^User is on Refer Friend Form Page$")
    public void i_have_refer_friend_form_page() throws Throwable {
	formsActions.OpenRefFndAppURL();
    }

    @Then("^User move to Refer Friend form$")
    public void i_move_to_refer_friend_form() throws Throwable {
	formsActions.movetoRefFrndForm();
    }

    @And("^User enter \"([^\"]*)\" as First Name in Refer Friend form$")
    public void i_enter_something_as_first_name_in_refer_friend_form(String FName) throws Throwable {
	formsActions.enterMyFName(FName);
    }

    @And("^User enter \"([^\"]*)\" as Last Name in Refer Friend form$")
    public void i_enter_something_as_last_name_in_refer_friend_form(String LName) throws Throwable {
	formsActions.enterMyLName(LName);
    }

    @And("^User enter email in Email Address in Refer Friend form$")
    public void i_enter_email_in_email_address_in_refer_friend_form() throws Throwable {
	String dynEmailAddr = formsActions.genUniqueEmailAddress();
	// formsActions.enterEmailAddress(dynEmailAddr);
	formsActions.enterMyEmailAddress(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User select \"([^\"]*)\" as Option  in Consultation form$")
    public void i_select_something_as_option_in_consultation_form(String val) throws Throwable {
	formsActions.selectIam(val);
    }

    @Given("^User enter \"([^\"]*)\" as Friend First Name in Refer Friend form$")
    public void i_enter_First_Name_in_REF_form(String FName) throws Throwable {
	formsActions.enterFirstNameEForm(FName);
	Thread.sleep(1000);
    }

    @Given("^User enter \"([^\"]*)\" as Friend Last Name in Refer Friend form$")
    public void i_enter_Last_Name_in_REF_form(String LName) throws Throwable {
	formsActions.enterLastNameEForm(LName);
    }

    @Given("^User enter email in Friend Email Address in Refer Friend form$")
    public void i_enter_an_Email_Address_in_REF_form() throws Throwable {
	String dynEmailAddr = formsActions.genUniqueEmailAddress();
	// formsActions.enterEmailAddress(dynEmailAddr);
	formsActions.enterEmailAddressEForm(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User enter PhoneNumber as Phone Number in Refer Friend form$")
    public void i_enter_Phone_Number_in_REF_form() throws Throwable {
	String PhNumbmer = formsActions.getPhoneNumber();
	System.out.println("Dynamic phone no:" + PhNumbmer);
	formsActions.enterPhNumEForm(PhNumbmer);
    }

    @And("^User submit the Refer Friend form$")
    public void i_submit_the_REF_form() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	formsActions.clickEmailUsAgreeGoBtn();
	Thread.sleep(5000);
    }

    @And("^User should get Thank you window for Refer Friend form$")
    public void i_should_get_thank_you_window_for_refer_friend_form() throws Throwable {
	formsActions.MovetoREfThnWnd();
    }

    // ********************** ANALYTICS
    @Then("^User capture the Adobe Analytics logs$")
    public void create_account_form_load_Analytics_should_be_Triggered() throws Throwable {
	adobeLogs = formsActions.getAdobeAnalyticsList();
	for (LogEntry entry : adobeLogs) {
	    String logMsgs = entry.getMessage();
	    System.out.println(logMsgs);
	    boolean result = logMsgs.contains("SR-200");
	    if (result) {
		System.out.println("log msg result passed>> " + result);
		break;
	    } else {
		System.out.println("log msg result>> " + result);
		// System.out.println(" result comes as >>" + resultmap);
	    }
	    // Assert.assertEquals(true, result, "Availability of events Not
	    // Match");
	}
    }

    @Then("^User Should see the availability of Open events Adobe Analytics as \"([^\"]*)\"$")
    public void i_Should_see_the_availability_of_events_Adobe_Analytics_as(String expectedMenuText) throws Throwable {
	System.out.println("Checking Events in Log File ");
	Map<String, Boolean> resultmap = new ConcurrentHashMap<>();
	String textarr[] = expectedMenuText.split(",");

	for (LogEntry entry : adobeLogs) {
	    String logMsgs = entry.getMessage();
	    boolean result = false;
	    for (String val : textarr) {
		result = logMsgs.contains(val);
		if (result) {
		    resultmap.put(val, result);
		} else {
		    System.out.println("log msg result>> " + result);

		    if (!(resultmap.containsKey(val))) {
			resultmap.put(val, result);
			// System.out.println(" result comes as >>" +
			// resultmap);
		    }
		    // Assert.assertEquals(true, result, "Availability of events
		    // Not Match");
		}
	    }

	}
	System.out.println("final result comes as >>" + resultmap);
	if (resultmap.values().contains(false)) {
	    Assert.assertEquals(false, true, "Availability of events Not Match");

	} else {
	    Assert.assertEquals(true, true, "Availability of events Not Match");
	}
    }

    @Then("^User Should see availability of Submit Events Adobe Analytics as \"([^\"]*)\"$")
    public void i_Should_see_availability_of_Submit_Events_Adobe_Analytics_as(String expectedMenuText)
	    throws Throwable {
	System.out.println("Checking Events in Log File ");
	Map<String, Boolean> resultmap = new ConcurrentHashMap<>();
	String textarr[] = expectedMenuText.split(",");

	for (LogEntry entry : adobeLogs) {
	    String logMsgs = entry.getMessage();
	    boolean result = false;
	    for (String val : textarr) {
		result = logMsgs.contains(val);
		if (result) {
		    resultmap.put(val, result);
		} else {
		    System.out.println("log msg result>> " + result);

		    if (!(resultmap.containsKey(val))) {
			resultmap.put(val, result);
			System.out.println(" result comes as >>" + resultmap);
		    }

		}
	    }

	}
	System.out.println("final result comes as >>" + resultmap);
	if (resultmap.values().contains(false)) {
	    Assert.assertEquals(false, true, "Availability of Triggers Not Match");

	} else {
	    Assert.assertEquals(true, true, "Availability of Triggers Not Match");
	}
    }

    @Then("^User Should see availability of Open Trigger Adobe Analytics as \"([^\"]*)\"$")
    public void i_Should_see_availability_of_Open_Trigger_Adobe_Analytics_as(String expectedMenuText) throws Throwable {
	System.out.println("Checking Events in Log File ");
	Map<String, Boolean> resultmap = new ConcurrentHashMap<>();
	String textarr[] = expectedMenuText.split(",");

	for (LogEntry entry : adobeLogs) {
	    String logMsgs = entry.getMessage();
	    boolean result = false;
	    for (String val : textarr) {
		result = logMsgs.contains(val);
		if (result) {
		    resultmap.put(val, result);
		} else {
		    System.out.println("log msg result>> " + result);

		    if (!(resultmap.containsKey(val))) {
			resultmap.put(val, result);
			System.out.println(" result comes as >>" + resultmap);
		    }
		    // Assert.assertEquals(true, result, "Availability of events
		    // Not Match");
		}
	    }

	}
	System.out.println("final result comes as >>" + resultmap);
	if (resultmap.values().contains(false)) {
	    Assert.assertEquals(false, true, "Availability of Submit events Not Match");

	} else {
	    Assert.assertEquals(true, true, "Availability of Submit events Not Match");
	}
    }

    @Then("^User Should see availability of Submit Trigger Adobe Analytics as \"([^\"]*)\"$")
    public void i_Should_see_availability_of_Submit_Trigger_Adobe_Analytics_as(String expectedMenuText)
	    throws Throwable {
	System.out.println("Checking Events in Log File ");
	Map<String, Boolean> resultmap = new ConcurrentHashMap<>();
	String textarr[] = expectedMenuText.split(",");

	for (LogEntry entry : adobeLogs) {
	    String logMsgs = entry.getMessage();
	    boolean result = false;
	    for (String val : textarr) {
		result = logMsgs.contains(val);
		if (result) {
		    resultmap.put(val, result);
		} else {
		    System.out.println("log msg result>> " + result);

		    if (!(resultmap.containsKey(val))) {
			resultmap.put(val, result);
			System.out.println(" result comes as >>" + resultmap);
		    }
		    // Assert.assertEquals(true, result, "Availability of events
		    // Not Match");
		}
	    }

	}
	System.out.println("final result comes as >>" + resultmap);
	if (resultmap.values().contains(false)) {
	    Assert.assertEquals(false, true, "Availability of Submit Trigger Not Match");

	} else {
	    Assert.assertEquals(true, true, "Availability of Submit Trigger Not Match");
	}
    }

    // *************************** ENEWS FORM

    @Given("^User have ENews Letter Form Page$")
    public void i_have_enews_letter_form_page() throws Throwable {
	formsActions.OpenEnApplication();
    }

    @And("^User enter First Name as \"([^\"]*)\" in ENews Letter form$")
    public void i_enter_first_name_as_something_in_enews_letter_form(String FName) throws Throwable {
	formsActions.enterFirstNameEForm(FName);
	Thread.sleep(1000);
    }

    @And("^User enter Last Name as \"([^\"]*)\" in ENews Letter form$")
    public void i_enter_last_name_as_something_in_enews_letter_form(String LName) throws Throwable {
	formsActions.enterLastNameEForm(LName);
    }

    @And("^User enter email in Email Address in ENews Letter form$")
    public void i_enter_an_email_address_as_something_in_enews_letter_form() throws Throwable {
	String dynEmailAddr = formsActions.genUniqueEmailAddress();

	formsActions.enterEmailAddENewForm(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User submit the ENews Letter form$")
    public void i_submit_the_enews_letter_form() throws Throwable {
	formsActions.ClicknAgnGoBtn();
	Thread.sleep(10000);
    }

    //// ********************* LP Forms

    @Given("^User select \"([^\"]*)\" as Degree in LP form$")
    public void emailUsform_i_select_a_Degree_in_LP_form(String degree) throws Throwable {
	formsActions.selectDegreeEFormLP(degree);

    }

    @Given("^User select \"([^\"]*)\" as Area of Study in LP form$")
    public void emailUsform_i_select_an_Area_of_Study_in_LP_form(String aos) throws Throwable {
	formsActions.selectAOSEFormLP(aos);
	Thread.sleep(3000);

    }

    @Given("^User select \"([^\"]*)\" as Specialization Study in LP form$")
    public void emailUsform_i_select_a_Specialization_Study_in_LP_form(String spec) throws Throwable {
	formsActions.selectSpecLP(spec);

    }

    @Given("^User select \"([^\"]*)\" as Bachelors Specialization Study in LP form$")
    public void emailUsform_i_select_a_Specialization_Study_in_LP_form_for_bachlpers(String spec) throws Throwable {
	formsActions.selectSpecLPBatchlores(spec);
    }

    @Given("^User select \"([^\"]*)\" as Education Level in LP form$")
    public void emailUsform_i_select_a_education_level_in_LP_form_for_bachlpers(String edval) throws Throwable {
	formsActions.selectEduVal(edval);
    }

    @Given("^User select \"([^\"]*)\" as Age in LP form$")
    public void emailUsform_i_select_aagel_in_LP_form_for_bachlpers(String age) throws Throwable {
	formsActions.selectAge(age);
    }

    @Given("^User select \"([^\"]*)\" as Military option in LP form$")
    public void emailUsform_i_select_ml_optio_in_LP_form_for_bachlpers(String military) throws Throwable {
	formsActions.selectMilitary(military);
    }

    @And("^User select \"([^\"]*)\" Start date in Lp Form$")
    public void i_select_something_start_date_in_lp_form(String Date) throws Throwable {
	formsActions.selectDateLPBatchlores(Date);
    }

    @Given("^User enter \"([^\"]*)\" as First Name in LP form$")
    public void emailUsform_i_enter_First_Name_in_LP_form(String FName) throws Throwable {
	formsActions.enteLPrstNameLPForm(FName);
	Thread.sleep(1000);
    }

    @Given("^User enter \"([^\"]*)\" as Last Name in LP form$")
    public void emailUsform_i_enter_Last_Name_in_LP_form(String LName) throws Throwable {
	formsActions.enterLastNameLPForm(LName);
    }

    // @Given("^User enter email in Email Address in LP form$")
    @And("^User enter \"([^\"]*)\" in Email Address in LP form$")
    public void emailUsform_i_enter_an_Email_Address_in_LP_form(String dynEmailAddres) throws Throwable {
	String dynEmailAddress = formsActions.getUniqueEmail();
	System.out.println("Email: " + dynEmailAddress);
	formsActions.enterEmailAddress(dynEmailAddress);
	// formsActions.enterEmailAddressLPForm(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User enter \"([^\"]*)\" in Test Email Address in LP form$")
    public void emailUsform_i_enter_test_Email_Address_in_LP_form(String dynEmailAddres) throws Throwable {
	/*
	 * String dynEmailAddress = formsActions.getUniqueEmail();
	 * System.out.println("Email: " + dynEmailAddress);
	 *///
	formsActions.enterEmailAddress(dynEmailAddres);
	// formsActions.enterEmailAddressLPForm(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User enter PhoneNumber as Phone Number in LP form$")
    public void emailUsform_i_enter_Phone_Number_in_LP_form() throws Throwable {
	String PhNumbmer = formsActions.getPhoneNumber();
	// System.out.println("Dynamic phone no:" + PhNumbmer);
	formsActions.enterPhNumLPForm(PhNumbmer);
    }

    @And("^User enter \"([^\"]*)\" as ZipCode in LP form$")
    public void emailUsform_i_enter_user_zipcode_in_LP_form(String zipcode) throws Throwable {
	formsActions.enterZipCodeinLpForm(zipcode);
	Thread.sleep(1000);
    }

    @Given("^User submit the LP form$")
    public void emailUsform_i_submit_the_LP_form() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	formsActions.clickEmailUsAgreeGoBtn();
//	Thread.sleep(1000);
    }

    @And("^User should see Thank you for your interest window$")
    public void i_should_get_thank_you_interest_window_for_LP_form() throws Throwable {
	formsActions.movetoThnInterestWindow();
    }

    @And("^User should see \"([^\"]*)\" in the Thankyou Page for LP Form$")
    public void i_should_see_something_in_the_thankyou_page_for_LP_form(String expectedMenuText) throws Throwable {
	boolean result = formsActions.getThnTxPage().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User should see \"([^\"]*)\" in Thankyou Page URL$")
    public void i_should_see_something_in_thankyou_page_url(String expectedMenuText) throws Throwable {
	boolean result = formsActions.getThnPageURL().contains(expectedMenuText);
//	System.out.println(expectedMenuText);
//	System.out.println(formsActions.getThnPageURL());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @When("^User Clicks on View Programs Button in Thank you Hero$")
    public void userClicksOnViewProgramsButtonInThankYouHero() throws Throwable {
	formsActions.clickViewProgBtn();
    }

    // LP Form Error Messages

    @Then("^User should see the \"([^\"]*)\" for Degree field in LP Form$")
    public void i_should_see_the_for_Degree_field_Lp(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getLPDegreeError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getLPDegreeError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for AOS field in LP Form$")
    public void i_should_see_the_for_AOS_field_LP(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getLPAosError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getLPAosError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for Program field in LP Form$")
    public void i_should_see_the_for_Program_field_Lp(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getLPProgramError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getLPProgramError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for FirstName field in LP Form$")
    public void i_should_see_the_for_FirstName_field_LP(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getLPFnameError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getLPFnameError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for LastName field in LP Form$")
    public void i_should_see_the_for_LastName_field_LP(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getLPLnameError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getLPLnameError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for Email field in LP Form$")
    public void i_should_see_the_for_Email_field_LP(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getLPEmailError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getLPEmailError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for Email field validations in LP Form$")
    public void i_should_see_the_for_Email_field_validations_LP(String emailerrormsg) throws Throwable {
	boolean result = formsActions.getLPEmailValidError().contains(emailerrormsg);
	System.out.println(emailerrormsg);
	System.out.println(formsActions.getLPEmailValidError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for PhoneNumber field in LP Form$")
    public void i_should_see_the_for_PhoneNumber_field_LP(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getLPPhoneError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getLPPhoneError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @Then("^User should see the \"([^\"]*)\" for ZipCode field in LP Form$")
    public void i_should_see_the_for_ZipCode_field_LP(String expectedErrorMsg) throws Throwable {
	boolean result = formsActions.getLPZipError().contains(expectedErrorMsg);
	System.out.println(expectedErrorMsg);
	System.out.println(formsActions.getLPZipError());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // *************************** PFQ Form
    @Given("^User is on PFQ Page$")
    public void user_is_on_pfq_page() throws Throwable {
	formsActions.navigateToURL(ProjectVariables.PFQ_URL);
    }

    @When("^User Fill Quiz$")
    public void user_fill_quiz() throws Throwable {
	formsActions.fillPFQData();
    }

    @Then("^User Navigate to PFQ Form$")
    public void user_navigate_to_pfq_form() throws Throwable {
	formsActions.moveToPFQForm();
    }

    @And("^User select \"([^\"]*)\" as Degree$")
    public void user_select_something_as_degree(String degval) throws Throwable {
	formsActions.PFQSelectDegree(degval);
    }

    @And("^User select \"([^\"]*)\" as Area of Study$")
    public void user_select_something_as_area_of_study(String aosval) throws Throwable {
	formsActions.PFQSelectAos(aosval);
    }

    @And("^User select \"([^\"]*)\" as Specialization$")
    public void user_select_somethingas_specialization(String splval) throws Throwable {
	formsActions.PFQSelectSpecialization(splval);
    }

    @And("^User enter \"([^\"]*)\" as FirstName in PFQ Form$")
    public void i_enter_something_as_firstname_in_pfqform(String FName) throws Throwable {
	formsActions.enterPFQFName(FName);
    }

    @And("^User enter \"([^\"]*)\" as LastName in PFQ Form$")
    public void i_enter_something_as_lastname_in_pfqform(String LName) throws Throwable {
	formsActions.enterPFQLName(LName);
    }

    @Given("^User enter email in Email Address in PFQ Form$")
    public void emailUsform_i_enter_an_Email_Address_in_PFQ_form() throws Throwable {
	String dynEmailAddr = formsActions.genUniqueEmailAddress();
	System.out.println("EMail:" + dynEmailAddr);
	formsActions.enterPFQEmail(dynEmailAddr);
	Thread.sleep(1000);
    }

    @And("^User enter PhoneNo as Phone Number in PFQ Form$")
    public void i_enter_something_as_phonenumber_in_pfqform() throws Throwable {
	String PhNumbmer = formsActions.getPhoneNumber();
	System.out.println("Dynamic phone no:" + PhNumbmer);
	formsActions.enterPhNumPFQ(PhNumbmer);
    }

    @And("^User enter \"([^\"]*)\" as Zip in PFQ Form$")
    public void i_enter_something_as_zip_in_pfqform(String ZipCode) throws Throwable {
	formsActions.enterPFQZip(ZipCode);
    }

    @When("^User click \"([^\"]*)\" button in PFQ Form$")
    public void i_click_something_button_in_cheddar_pfqform(String strArg1) throws Throwable {
	formsActions.clickPFQAgreenGo();
    }

    @Then("^User should see the \"([^\"]*)\" text on PFQ Page$")
    public void i_should_see_the_something_text_on_pfq_page(String expectedMenuText) throws Throwable {
	boolean result = formsActions.getPFQSuccessMsg().contains(expectedMenuText);
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    // *********************************** PEP FORM

    @Given("^User Navigate to PEP Form Page$")
    public void user_navigate_to_pep_form_page() throws Throwable {
	formsActions.navigateToURL(ProjectVariables.PEP_URL);
	Thread.sleep(5000);
	footerActions.MoveToFooter();
    }

    @And("^User select \"([^\"]*)\" as AOS in PEP form$")
    public void iSelectSomethingAsAOSInPEPForm(String aosVal) throws Throwable {
	formsActions.selectAosinPEP(aosVal);
    }

    @And("^User select \"([^\"]*)\" as Degree in PEP form$")
    public void iSelectSomethingAsDegreeInPEPForm(String degVal) throws Throwable {
	formsActions.selectDegreePEP(degVal);
    }

    @And("^User select \"([^\"]*)\" as Program in PEP form$")
    public void iSelectSomethingAsProgramInPEPForm(String pgVal) throws Throwable {
	formsActions.selectProgramPEP(pgVal);
    }

    @When("^User Fill PEP Form Data$")
    public void user_fill_PEP_Form() throws Throwable {
	formsActions.fillPEPData();
    }

    @When("^User move to PEP RFI$")
    public void i_move_to_pep_rfi() throws Throwable {
	formsActions.moveToPEPForm();
    }

    @And("^User enter \"([^\"]*)\" as FirstName in PEP  Form$")
    public void i_enter_something_as_firstname_in_pep_form(String fName) throws Throwable {
	formsActions.enterPEPFName(fName);
    }

    @And("^User enter \"([^\"]*)\" as LastName in PEP Form$")
    public void i_enter_something_as_lastname_in_pep_form(String lName) throws Throwable {
	formsActions.enterPEPLName(lName);
    }

    @And("^User enter \"([^\"]*)\" as Email in PEP Form$")
    public void i_enter_something_as_email_in_pep_form(String dynEmailAddr) throws Throwable {
	formsActions.enterPEPEmail(dynEmailAddr);
    }

    @And("^User enter \"([^\"]*)\" as PhoneNumber in PEP Form$")
    public void i_enter_something_as_phonenumber_in_pep_form(String phNum) throws Throwable {
	formsActions.enterPhNumPEP(phNum);
    }

    @And("^User enter \"([^\"]*)\" as Zip in PEP Form$")
    public void i_enter_something_as_zip_in_pep_form(String zipCode) throws Throwable {
	formsActions.enterPEPZip(zipCode);
    }

    @When("^User click \"([^\"]*)\" button in PEP Form$")
    public void i_click_something_button_inpep_form(String strArg1) throws Throwable {
	formsActions.clickPEPAgreenGo();
    }

    // ************************ BEMore FORM ******************************88
    @Given("^User Navigate to Bemore Forms Page$")
    public void userNavigateToBemoreFormsPage() throws Throwable {
	formsActions.NavigateToBemoreFormPage();
    }

    @Given("^User Navigate to Bemore Forms Error Page$")
    public void userNavigateToBemoreForms_Error_Page() throws Throwable {
	formsActions.NavigateToBemoreFormErrorPage();
	Thread.sleep(9000);
    }

    @Then("^User see \"([^\"]*)\" as FirstName in Bemore Form$")
    public void iSeeSomethingAsFirstNameInBemoreForm(String firstname) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtBemoreFName().contains(firstname);
	System.out.println(firstname);
	System.out.println(formsActions.getTxtBemoreFName());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as LastName in Bemore Form$")
    public void iSeeSomethingAsLastNameInBemoreForm(String lastname) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtBemoreLName().contains(lastname);
	System.out.println(lastname);
	System.out.println(formsActions.getTxtBemoreLName());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Email in Bemore Form$")
    public void iSeeSomethingAsEmailInBemoreForm(String email) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtBeoreEmail().contains(email);
	System.out.println(email);
	System.out.println(formsActions.getTxtBeoreEmail());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as PhoneNumber in Bemore Form$")
    public void iSeeSomethingAsPhoneNumberInBemoreForm(String phoneno) throws Throwable {
	Thread.sleep(5000);
	boolean result = formsActions.getTxtBemorePhone().contains(phoneno);
	System.out.println(phoneno);
	System.out.println(formsActions.getTxtBemorePhone());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

    @And("^User see \"([^\"]*)\" as Zip in Bemore Form$")
    public void iSeeSomethingAsZipInBemoreForm(String zip) throws Throwable {
	Thread.sleep(3000);
	boolean result = formsActions.getTxtBemoreZip().contains(zip);
	System.out.println(zip);
	System.out.println(formsActions.getTxtBemoreZip());
	try {
	    Assert.assertEquals(result, true, "Title didn't match");
	} catch (Throwable t) {
	    ErrorUtil.addVerificationFailure(t);
	    throw t;
	}
    }

}
