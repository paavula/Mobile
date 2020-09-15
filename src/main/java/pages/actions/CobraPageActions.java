package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CobraPageLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class CobraPageActions extends BasePage<Object> {

    CobraPageLocators CobraPageLocators = null;
    Select sel;

    public CobraPageActions() {
	this.CobraPageLocators = new CobraPageLocators();
	PageFactory.initElements(DriverManager.getDriver(), CobraPageLocators);
    }

    public void moveToMenu(WebElement ele) {
	Actions action = new Actions(DriverManager.getDriver());
	action.moveToElement(ele).perform();
    }

    public void clickLogo() {
	waitForElementToVisible(CobraPageLocators.headerLogo, 2);
	highlightElement(CobraPageLocators.headerLogo);
	moveToMenu(CobraPageLocators.headerLogo);
	CobraPageLocators.headerLogo.click();
    }

    public void selectDegreeInBR(String degVal) {

	waitForElementToVisible(CobraPageLocators.degreeLeveloptionsBR, 5);

	highlightElement(CobraPageLocators.degreeLeveloptionsBR);
	// CobraPageLocators.selectdegreeLevelBR.click();
	// CobraPageLocators.degreeLeveloptionsBR.click();
	CobraPageLocators.degreeLevelBR.click();

	// Select sel = new Select(footerLocators.degreeLevel);

	// sel.selectByVisibleText(degVal);

    }

    public void selectAOSSR(String aos) {

	waitForElementToVisible(CobraPageLocators.programInterrestBR, 5);

	highlightElement(CobraPageLocators.programInterrestBR);
	// CobraPageLocators.programoptionsBR.click();
	CobraPageLocators.programInterrestBR.click();
	// Select sel1 = new Select(footerLocators.programInterrest);
	// sel1.selectByVisibleText(aos);

    }

    public void clickFooterLogo() {
	waitForElementToVisible(CobraPageLocators.footerLogo, 2);

	highlightElement(CobraPageLocators.footerLogo);
	CobraPageLocators.footerLogo.click();

    }

    public void clickUtilityHeader() {
	waitForElementToVisible(CobraPageLocators.utilityHeader, 5);

	moveToMenu(CobraPageLocators.utilityHeader);
	highlightElement(CobraPageLocators.utilityHeader);
    }

    public void clickCobraFooter() {
	waitForElementToVisible(CobraPageLocators.footerNavigation, 5);
	moveToMenu(CobraPageLocators.footerNavigation);
	highlightElement(CobraPageLocators.footerNavigation);
    }

    public void moveCobraAccredation() {
	waitForElementToVisible(CobraPageLocators.accredationImgmodule, 5);
	moveToMenu(CobraPageLocators.accredationImgmodule);
	highlightElement(CobraPageLocators.accredationImgmodule);
    }

    public void clickCobraAccredationClick() {
	waitForElementToVisible(CobraPageLocators.accredationlink, 5);
	moveToMenu(CobraPageLocators.accredationlink);
	highlightElement(CobraPageLocators.accredationlink);
	CobraPageLocators.accredationlink.click();
    }

    public String getTextAccredation() {
	waitForElementToVisible(CobraPageLocators.accredationtxt, 5);
	moveToMenu(CobraPageLocators.accredationtxt);
	highlightElement(CobraPageLocators.accredationtxt);
	return CobraPageLocators.accredationtxt.getText();
    }

    public void clickCobraFAccredationImg() {
	waitForElementToVisible(CobraPageLocators.accredationImg, 5);
	moveToMenu(CobraPageLocators.accredationImg);
	highlightElement(CobraPageLocators.accredationImg);
    }

    @SuppressWarnings("rawtypes")
	@Override
    public ExpectedCondition getPageLoadCondition() {
	return null;
    }

    public String getTxtLinkUNav() {

	return CobraPageLocators.utilityNavBar.getText();
    }

    public void clickUtilityNav() {
	waitForElementToVisible(CobraPageLocators.utilityNavBar, 5);

	highlightElement(CobraPageLocators.utilityNavBar);
	moveToMenu(CobraPageLocators.utilityNavBar);

    }

    public String getTxtLinkUHeader() {

	return CobraPageLocators.utilityHelpText.getText();
    }

    public String getTxtLinkUpno() {

	return CobraPageLocators.utilityMblNo.getText();
    }

    public void clickUtilityHeaderLmodule() {
	waitForElementToVisible(CobraPageLocators.utilityNavBar, 5);

	highlightElement(CobraPageLocators.utilityNavBar);
	moveToMenu(CobraPageLocators.utilityNavBar);
    }

    public String getTxtCpcopyright() {
	waitForElementToVisible(CobraPageLocators.copyRight, 2);

	moveToMenu(CobraPageLocators.copyRight);
	highlightElement(CobraPageLocators.copyRight);
	return CobraPageLocators.copyRight.getText();

    }

    public void open_CP_Application() {
	navigateToURL(ProjectVariables.CP_URL);

    }

    public void verifyImage() {
	waitForElementToVisible(CobraPageLocators.accredationImg, 5);
	moveToMenu(CobraPageLocators.accredationImg);
	highlightElement(CobraPageLocators.accredationImg);
    }

    public void ClickAccImage() {
	waitForElementToVisible(CobraPageLocators.accredationImg, 2);
	CobraPageLocators.accredationImg.click();
    }

    public void clickTabComponent() {
	waitForElementToVisible(CobraPageLocators.tabComponentModule, 5);
	moveToMenu(CobraPageLocators.tabComponentModule);
	highlightElement(CobraPageLocators.tabComponentModule);

    }

    public void clickMastersTab() {
	waitForElementToVisible(CobraPageLocators.mastersTab, 5);

	moveToMenu(CobraPageLocators.mastersTab);
	highlightElement(CobraPageLocators.mastersTab);
	CobraPageLocators.mastersTab.click();
    }

    public String getTxtMastersTab() {
	waitForElementToVisible(CobraPageLocators.mastersTab, 5);

	moveToMenu(CobraPageLocators.mastersTab);
	highlightElement(CobraPageLocators.mastersTab);
	return CobraPageLocators.mastersTab.getText();
    }

    public void clickBacheloresTab() {
	waitForElementToVisible(CobraPageLocators.bacheloresTab, 5);

	moveToMenu(CobraPageLocators.bacheloresTab);
	highlightElement(CobraPageLocators.bacheloresTab);
	CobraPageLocators.bacheloresTab.click();

    }

    public String getTxtBacheloresTab() {
	waitForElementToVisible(CobraPageLocators.bacheloresTab, 5);

	moveToMenu(CobraPageLocators.bacheloresTab);
	highlightElement(CobraPageLocators.bacheloresTab);
	return CobraPageLocators.bacheloresTab.getText();
    }

    public void clickAssociatesTab() {
	waitForElementToVisible(CobraPageLocators.associatesTab, 5);

	moveToMenu(CobraPageLocators.associatesTab);
	highlightElement(CobraPageLocators.associatesTab);
	CobraPageLocators.associatesTab.click();
    }

    public String getTxtAssociatesTab() {
	waitForElementToVisible(CobraPageLocators.associatesTab, 5);

	moveToMenu(CobraPageLocators.associatesTab);
	highlightElement(CobraPageLocators.associatesTab);
	return CobraPageLocators.associatesTab.getText();
    }

    public String getTxtMbaTab() {
	waitForElementToVisible(CobraPageLocators.mbaTab, 5);

	moveToMenu(CobraPageLocators.mbaTab);
	highlightElement(CobraPageLocators.mbaTab);
	return CobraPageLocators.mbaTab.getText();
    }

    public void clickMbaTab() {
	waitForElementToVisible(CobraPageLocators.mbaTab, 5);

	moveToMenu(CobraPageLocators.mbaTab);
	highlightElement(CobraPageLocators.mbaTab);
	CobraPageLocators.mbaTab.click();
    }

    // ***************************** two step form with out phone
    public void enterfNamesf(String fName) {
	waitForElementToVisible(CobraPageLocators.fNamesf, 4);

	highlightElement(CobraPageLocators.fNamesf);
	CobraPageLocators.fNamesf.sendKeys(fName);
    }

    public void enterlNamesf(String lName) {
	waitForElementToVisible(CobraPageLocators.lNamesf, 2);

	highlightElement(CobraPageLocators.lNamesf);
	CobraPageLocators.lNamesf.sendKeys(lName);
    }

    public void enterEmaisfl(String email) {
	waitForElementToVisible(CobraPageLocators.emailsf, 2);

	highlightElement(CobraPageLocators.emailsf);
	CobraPageLocators.emailsf.sendKeys(email);
    }

    public void enterAddresssf(String address) {
	waitForElementToVisible(CobraPageLocators.addresssf, 2);

	highlightElement(CobraPageLocators.addresssf);
	CobraPageLocators.addresssf.sendKeys(address);
    }

    public void enterZipsf(String zip) {
	waitForElementToVisible(CobraPageLocators.zipCodesf, 2);

	highlightElement(CobraPageLocators.zipCodesf);
	CobraPageLocators.zipCodesf.sendKeys(zip);
    }

    public void clickAnGobtnsf() {
	waitForElementToVisible(CobraPageLocators.submitBtnsf, 5);

	highlightElement(CobraPageLocators.submitBtnsf);
	CobraPageLocators.submitBtnsf.click();
    }

    public void selectDegreesf(String degVal) {

	/*
	 * waitForElementToVisible(CobraPageLocators.degreeLevel, 5);
	 * 
	 * highlightElement(CobraPageLocators.degreeLevelOptions);
	 * 
	 * Select sel = new Select(CobraPageLocators.degreeLevelOptions);
	 * sel.selectByVisibleText(degVal);
	 */

	waitForElementToVisible(CobraPageLocators.degreeLevelsf, 5);
	highlightElement(CobraPageLocators.degreeLevelsf);
	CobraPageLocators.degreeLevelsf.click();
	CobraPageLocators.degreeLevelOptionssf.click();
    }

    public void selectAOSsf(String aos) {
	/*
	 * waitForElementToVisible(CobraPageLocators.program, 5);
	 * highlightElement(CobraPageLocators.program); Select sel1 = new
	 * Select(CobraPageLocators.programOptions); sel1.selectByVisibleText(aos);
	 */
	waitForElementToVisible(CobraPageLocators.programsf, 5);
	highlightElement(CobraPageLocators.programsf);
	CobraPageLocators.programsf.click();
	CobraPageLocators.programOptionssf.click();
    }

    // ********************************************

    public void enterAddress(String address) {
	waitForElementToVisible(CobraPageLocators.address, 2);

	highlightElement(CobraPageLocators.address);
	CobraPageLocators.address.sendKeys(address);
    }

    public void clickAnGobtnLF() {
	waitForElementToVisible(CobraPageLocators.submitBtn, 5);

	highlightElement(CobraPageLocators.submitBtn);
	CobraPageLocators.submitBtn.click();
    }

    public void moveToLongForm() {
	waitForElementToVisible(CobraPageLocators.lognForm, 5);

	highlightElement(CobraPageLocators.lognForm);
    }

    public void selectPG(String pgVal) {

	waitForElementToVisible(CobraPageLocators.educationLevel, 5);
	highlightElement(CobraPageLocators.educationLevel);
	CobraPageLocators.educationLevel.click();
	CobraPageLocators.educationLevelOptions.click();

	// Select sel = new Select(CobraPageLocators.educationLevelOptions);
	// sel.selectByVisibleText(pgVal);

    }

    public void selectDegree(String degVal) {

	/*
	 * waitForElementToVisible(CobraPageLocators.degreeLevel, 5);
	 * 
	 * highlightElement(CobraPageLocators.degreeLevelOptions);
	 * 
	 * Select sel = new Select(CobraPageLocators.degreeLevelOptions);
	 * sel.selectByVisibleText(degVal);
	 */

	waitForElementToVisible(CobraPageLocators.degreeLevel, 5);
	highlightElement(CobraPageLocators.degreeLevel);
	CobraPageLocators.degreeLevel.click();
	CobraPageLocators.degreeLevelOptions.click();
    }

    public void selectAOS(String aos) {
	/*
	 * waitForElementToVisible(CobraPageLocators.program, 5);
	 * highlightElement(CobraPageLocators.program); Select sel1 = new
	 * Select(CobraPageLocators.programOptions); sel1.selectByVisibleText(aos);
	 */
	waitForElementToVisible(CobraPageLocators.program, 5);
	highlightElement(CobraPageLocators.program);
	CobraPageLocators.program.click();
	CobraPageLocators.programOptions.click();
    }

    public void open_MBA_Application() {
	navigateToURL(ProjectVariables.MBAP_URL);

    }

    public void open_Achieve_Application() {
	navigateToURL(ProjectVariables.Achieve_URL);
    }

    public String getTxtAccwindow() {
	waitForElementToVisible(CobraPageLocators.accwndtxt, 5);
	highlightElement(CobraPageLocators.accwndtxt);
	return CobraPageLocators.accwndtxt.getText();
    }

    public void closeAccwindow() {
	waitForElementToVisible(CobraPageLocators.accwndcloselnk, 3);
	CobraPageLocators.accwndcloselnk.click();
    }

    public void open_CobraACP_Application() {
	navigateToURL(ProjectVariables.CobraAllComps_URL);
    }

    public void open_Explore_Application() {
	navigateToURL(ProjectVariables.Explore_URL);
    }

    public void open_Disclamier_Application() {
	navigateToURL(ProjectVariables.DegreePage_URL);
    }

    public void moveToAccordion() {
	waitForElementToVisible(CobraPageLocators.accordionModule, 2);
	highlightElement(CobraPageLocators.accordionModule);
	moveToMenu(CobraPageLocators.accordionModule);
	// CobraPageLocators.headerLogo.click();
    }

    public void moveToActiveTab() {
	waitForElementToVisible(CobraPageLocators.accordionActiveTab, 2);
	highlightElement(CobraPageLocators.accordionActiveTab);
	moveToMenu(CobraPageLocators.accordionActiveTab);

    }
}
