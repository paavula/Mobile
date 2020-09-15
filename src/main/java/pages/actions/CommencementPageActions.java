package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CommencementPageLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class CommencementPageActions extends BasePage<Object> {

	CommencementPageLocators commencementPageLocators = null;
	Select sel;

	public CommencementPageActions() {
		this.commencementPageLocators = new CommencementPageLocators();
		PageFactory.initElements(DriverManager.getDriver(),
				commencementPageLocators);
	}

	public void moveToMenu(WebElement ele) {
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();
	}

	public void open_CP_Application() {
		navigateToURL(ProjectVariables.CMP_URL);

	}

	public void clickLogo() {
		waitForElementToVisible(commencementPageLocators.headerLogo, 2);

		highlightElement(commencementPageLocators.headerLogo);
		moveToMenu(commencementPageLocators.headerLogo);
		commencementPageLocators.headerLogo.click();

	}

	public void clickFooterLogo() {
		waitForElementToVisible(commencementPageLocators.footerLogo, 2);

		highlightElement(commencementPageLocators.footerLogo);
		commencementPageLocators.footerLogo.click();

	}

	public void moveToUtlMenu() {
		waitForElementToVisible(commencementPageLocators.utilityMenu, 5);

		highlightElement(commencementPageLocators.utilityMenu);
		moveToMenu(commencementPageLocators.utilityMenu);

	}

	public void moveToUtlHeader() {
		waitForElementToVisible(commencementPageLocators.utilityMenu, 5);

		highlightElement(commencementPageLocators.utilityMenu);
		moveToMenu(commencementPageLocators.utilityMenu);

	}

	public void moveToFooter() {
		waitForElementToVisible(commencementPageLocators.footerNavigation, 5);

		moveToMenu(commencementPageLocators.footerNavigation);
		highlightElement(commencementPageLocators.footerNavigation);
	}

	public void moveQuoteComp() {
		// waitForElementToVisible(commencementPageLocators.footerNavigation,
		// 5);

		// moveToMenu(commencementPageLocators.footerNavigation);
		waitForElementToVisible(commencementPageLocators.quoteComp, 5);

		moveToMenu(commencementPageLocators.quoteComp);
		highlightElement(commencementPageLocators.quoteComp);
	}

	public String getTxtQuoteComp() {
		waitForElementToVisible(commencementPageLocators.quoteTxt, 5);

		highlightElement(commencementPageLocators.quoteTxt);
		return commencementPageLocators.quoteTxt.getText();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ExpectedCondition getPageLoadCondition() {
		return null;
	}

	public String getTxtLinkUNav() {

		return commencementPageLocators.utilityMenuTxtt.getText();
	}

	public void clickUtilityNav() {
		waitForElementToVisible(commencementPageLocators.utilityNavBar, 5);

		highlightElement(commencementPageLocators.utilityNavBar);
		moveToMenu(commencementPageLocators.utilityNavBar);

	}

	public void clickUtilityHeaderLmodule() {
		waitForElementToVisible(commencementPageLocators.utilityNavBar, 2);

		highlightElement(commencementPageLocators.utilityNavBar);
		moveToMenu(commencementPageLocators.utilityNavBar);
	}

	public String getfooterTxt() {
		waitForElementToVisible(commencementPageLocators.footerTxt, 2);
		moveToMenu(commencementPageLocators.footerTxt);
		highlightElement(commencementPageLocators.footerTxt);
		return commencementPageLocators.footerTxt.getText();

	}

	public void selectDegree(String degVal) {

		waitForElementToVisible(commencementPageLocators.degreeLevel, 5);
		highlightElement(commencementPageLocators.degreeLevelOptions);

		Select sel = new Select(commencementPageLocators.degreeLevelOptions);
		sel.selectByVisibleText(degVal);

	}

	public void selectAOS(String aos) {
		waitForElementToVisible(commencementPageLocators.program, 5);

		highlightElement(commencementPageLocators.program);
		Select sel1 = new Select(commencementPageLocators.programOptions);
		sel1.selectByVisibleText(aos);
	}

	public void enterfName(String fName) {
		waitForElementToVisible(commencementPageLocators.fName, 2);

		highlightElement(commencementPageLocators.fName);
		commencementPageLocators.fName.sendKeys(fName);
	}

	public void enterlName(String lName) {
		waitForElementToVisible(commencementPageLocators.lName, 2);

		highlightElement(commencementPageLocators.lName);
		commencementPageLocators.lName.sendKeys(lName);
	}

	public void enterEmail(String email) {
		waitForElementToVisible(commencementPageLocators.Email, 2);

		highlightElement(commencementPageLocators.Email);
		commencementPageLocators.Email.sendKeys(email);
	}

	public void enterphoneNumber(String phone) {
		waitForElementToVisible(commencementPageLocators.Phone, 2);

		highlightElement(commencementPageLocators.Phone);
		commencementPageLocators.Phone.sendKeys(phone);
	}

	public void enterZip(String zip) {
		waitForElementToVisible(commencementPageLocators.ZipCode, 2);

		highlightElement(commencementPageLocators.ZipCode);
		commencementPageLocators.ZipCode.sendKeys(zip);
	}

	public void enterAddress(String addres) {
		waitForElementToVisible(commencementPageLocators.address, 5);

		highlightElement(commencementPageLocators.address);
		commencementPageLocators.address.sendKeys(addres);
	}

	public void ClickAnGobtn() {
		waitForElementToVisible(commencementPageLocators.submitBtn, 5);

		highlightElement(commencementPageLocators.submitBtn);
		commencementPageLocators.submitBtn.click();
	}

	public void ClickNextbtn() {
		waitForElementToVisible(commencementPageLocators.nextBtn, 5);

		highlightElement(commencementPageLocators.nextBtn);
		commencementPageLocators.nextBtn.click();
	}

	public void moveTotwoStepForm() {
		waitForElementToVisible(commencementPageLocators.twoStepForm, 5);

		highlightElement(commencementPageLocators.twoStepForm);
	}

	public void moveToValedictorianForm() {
		waitForElementToVisible(commencementPageLocators.nominateateacherform,
				5);

		highlightElement(commencementPageLocators.nominateateacherform);
	}

	public void openCommencementPage() {

		navigateToURL(ProjectVariables.CMTP_URL);
	}

	public String getMenuTxt() {
		waitForElementToVisible(commencementPageLocators.utilityNavBar, 2);

		highlightElement(commencementPageLocators.utilityNavBar);
		return commencementPageLocators.utilityNavBar.getText();
	}

	public String getTxtFooter() {
		waitForElementToVisible(commencementPageLocators.footerNavigation, 2);

		highlightElement(commencementPageLocators.footerTxt);
		moveToMenu(commencementPageLocators.footerTxt);
		return commencementPageLocators.footerTxt.getText();
	}

	public void movetocommencementFooter() {
		waitForElementToVisible(commencementPageLocators.footerNavigation, 2);

		highlightElement(commencementPageLocators.footerNavigation);
		moveToMenu(commencementPageLocators.footerNavigation);

	}

	public void moveToMenuNav() {
		waitForElementToVisible(commencementPageLocators.utilityNavBar, 2);

		highlightElement(commencementPageLocators.utilityNavBar);
		moveToMenu(commencementPageLocators.utilityNavBar);

	}

	public void movetocommFooterlm() {
		waitForElementToVisible(commencementPageLocators.FooterLinkModuler, 2);

		highlightElement(commencementPageLocators.FooterLinkModuler);
		moveToMenu(commencementPageLocators.FooterLinkModuler);

	}

	public void movetoSocialMed() {

		waitForElementToVisible(commencementPageLocators.socialMedia, 2);

		highlightElement(commencementPageLocators.socialMedia);
		moveToMenu(commencementPageLocators.socialMedia);
	}

	public String getTxtTable() {
		waitForElementToVisible(commencementPageLocators.txtTbl, 2);

		highlightElement(commencementPageLocators.txtTbl);
		moveToMenu(commencementPageLocators.txtTbl);
		return commencementPageLocators.txtTbl.getText();
	}

	public void clickCtaTbl() {
		waitForElementToVisible(commencementPageLocators.tblCTA, 2);

		highlightElement(commencementPageLocators.tblCTA);
		moveToMenu(commencementPageLocators.tblCTA);
		commencementPageLocators.tblCTA.click();
	}

	public void movetoTable() {
		waitForElementToVisible(commencementPageLocators.table, 2);
		highlightElement(commencementPageLocators.table);
		moveToMenu(commencementPageLocators.table);

	}

	public void moveToBnnerModule() {
		waitForElementToVisible(commencementPageLocators.BannerModule, 2);
		highlightElement(commencementPageLocators.BannerModule);
		moveToMenu(commencementPageLocators.BannerModule);

	}

	public String getTxtBnner() {
		waitForElementToVisible(commencementPageLocators.BannerTitle, 2);
		highlightElement(commencementPageLocators.BannerTitle);
		moveToMenu(commencementPageLocators.BannerTitle);
		return commencementPageLocators.BannerTitle.getText();
	}

	public void openNomTeacherPage() {
		navigateToURL(ProjectVariables.CMNTP_URL);

	}

	public void openValedictorianPage() {
		navigateToURL(ProjectVariables.CMVP_URL);

	}

}
