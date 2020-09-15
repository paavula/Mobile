package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CheddarPageLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class CheddarPageActions extends BasePage<Object> {

	CheddarPageLocators cheddarPageLocators = null;
	Select sel;

	public CheddarPageActions() {
		this.cheddarPageLocators = new CheddarPageLocators();
		PageFactory
				.initElements(DriverManager.getDriver(), cheddarPageLocators);
	}

	public void moveToMenu(WebElement ele) {
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();
	}

	public void open_CTP_Application() {
		navigateToURL(ProjectVariables.CTP_URL);

	}

	public void open_mobilemba_Application() {
		navigateToURL(ProjectVariables.MMBA_URL);

	}

	public void clickLogo() {
		waitForElementToVisible(cheddarPageLocators.headerLogo, 2);

		highlightElement(cheddarPageLocators.headerLogo);
		moveToMenu(cheddarPageLocators.headerLogo);
		cheddarPageLocators.headerLogo.click();

	}

	public void clickFooterLogo() {
		waitForElementToVisible(cheddarPageLocators.footerLogo, 2);

		highlightElement(cheddarPageLocators.footerLogo);
		// cheddarPageLocators.footerLogo.click();
		cheddarPageLocators.footerLogo1.click();

	}

	public void clickUtilityHeader() {
		waitForElementToVisible(cheddarPageLocators.utilityHeaderbtn, 5);
		highlightElement(cheddarPageLocators.utilityHeaderbtn);
		moveToMenu(cheddarPageLocators.utilityHeaderbtn);
		cheddarPageLocators.utilityHeaderbtn.click();
		waitForElementToVisible(cheddarPageLocators.utilityHeader, 5);
		highlightElement(cheddarPageLocators.utilityHeader);
		moveToMenu(cheddarPageLocators.utilityHeader);

	}

	public void clickDragonFooter() {
		waitForElementToVisible(cheddarPageLocators.footerNavigation, 5);

		moveToMenu(cheddarPageLocators.footerNavigation);
		highlightElement(cheddarPageLocators.footerNavigation);
	}

	public void moveQuoteComp() {
		// waitForElementToVisible(cheddarPageLocators.footerNavigation, 5);

		// moveToMenu(cheddarPageLocators.footerNavigation);
		waitForElementToVisible(cheddarPageLocators.quoteComp, 5);

		moveToMenu(cheddarPageLocators.quoteComp);
		highlightElement(cheddarPageLocators.quoteComp);
	}

	public String getTxtQuoteComp() {
		waitForElementToVisible(cheddarPageLocators.quoteTxt, 5);

		highlightElement(cheddarPageLocators.quoteTxt);
		return cheddarPageLocators.quoteTxt.getText();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ExpectedCondition getPageLoadCondition() {
		return null;
	}

	public String getTxtLinkUNav() {

		return cheddarPageLocators.utilityNavBar.getText();
	}

	public void clickUtilityNav() {
		waitForElementToVisible(cheddarPageLocators.utilityNavBar, 5);

		highlightElement(cheddarPageLocators.utilityNavBar);
		moveToMenu(cheddarPageLocators.utilityNavBar);

	}

	public String getTxtLinkUHeader() {

		return cheddarPageLocators.utilityHelpText.getText();
	}

	public String getTxtLinkUpno() {

		return cheddarPageLocators.utilityMblNo.getText();
	}

	public void clickUtilityHeaderLmodule() {
		waitForElementToVisible(cheddarPageLocators.utilityNavBar, 2);

		highlightElement(cheddarPageLocators.utilityNavBar);
		moveToMenu(cheddarPageLocators.utilityNavBar);
	}

	public String getTxtcopyright() {
		waitForElementToVisible(cheddarPageLocators.copyRight, 2);

		moveToMenu(cheddarPageLocators.copyRight);
		highlightElement(cheddarPageLocators.copyRight);
		return cheddarPageLocators.copyRight.getText();

	}

	public void selectDegree(String degVal) {

		waitForElementToVisible(cheddarPageLocators.degreeLevel, 5);
		highlightElement(cheddarPageLocators.degreeLevelOptions);

		Select sel = new Select(cheddarPageLocators.degreeLevelOptions);
		sel.selectByVisibleText(degVal);

	}

	public void selectAOS(String aos) {
		waitForElementToVisible(cheddarPageLocators.program, 5);

		highlightElement(cheddarPageLocators.program);
		Select sel1 = new Select(cheddarPageLocators.programOptions);
		sel1.selectByVisibleText(aos);
	}

	public void enterfName(String fName) {
		waitForElementToVisible(cheddarPageLocators.fName, 2);

		highlightElement(cheddarPageLocators.fName);
		cheddarPageLocators.fName.sendKeys(fName);
	}

	public void enterlName(String lName) {
		waitForElementToVisible(cheddarPageLocators.lName, 2);

		highlightElement(cheddarPageLocators.lName);
		cheddarPageLocators.lName.sendKeys(lName);
	}

	public void enterEmail(String email) {
		waitForElementToVisible(cheddarPageLocators.Email, 2);

		highlightElement(cheddarPageLocators.Email);
		cheddarPageLocators.Email.sendKeys(email);
	}

	public void selectel(String elvVal) {

		waitForElementToVisible(cheddarPageLocators.educationoptions, 5);

		highlightElement(cheddarPageLocators.educationoptions);
		cheddarPageLocators.educationoptions.click();
		cheddarPageLocators.educationoptionsval.click();
		// Select sel1 = new Select(footerLocators.programInterrest);
		// sel1.selectByVisibleText(aos);

	}

	public void selecteldf(String elvVal) {

		waitForElementToVisible(cheddarPageLocators.educationoptionsdf, 5);

		highlightElement(cheddarPageLocators.educationoptionsdf);
		cheddarPageLocators.educationoptionsdf.click();
		cheddarPageLocators.educationoptionsvaldf.click();
		// Select sel1 = new Select(footerLocators.programInterrest);
		// sel1.selectByVisibleText(aos);

	}

	public void enterphoneNumber(String phone) {
		waitForElementToVisible(cheddarPageLocators.Phone, 2);

		highlightElement(cheddarPageLocators.Phone);
		cheddarPageLocators.Phone.sendKeys(phone);
	}

	public void enterZip(String zip) {
		waitForElementToVisible(cheddarPageLocators.ZipCode, 2);

		highlightElement(cheddarPageLocators.ZipCode);
		cheddarPageLocators.ZipCode.sendKeys(zip);
	}

	public void enterAddress(String addres) {
		waitForElementToVisible(cheddarPageLocators.address, 5);

		highlightElement(cheddarPageLocators.address);
		cheddarPageLocators.address.sendKeys(addres);
	}

	public void ClickAnGobtn() {
		waitForElementToVisible(cheddarPageLocators.submitBtn, 5);

		highlightElement(cheddarPageLocators.submitBtn);
		cheddarPageLocators.submitBtn.submit();
	}

	// Download forms

	/*
	 * 
	 * public void ClickAnGobtndw() {
	 * waitForElementToVisible(cheddarPageLocators.dwAgreenGo, 5);
	 * 
	 * 
	 * highlightElement(cheddarPageLocators.dwAgreenGo);
	 * cheddarPageLocators.dwAgreenGo.click(); }
	 * 
	 * //Cheddar download from public void ClickAnGobtncfdw() {
	 * waitForElementToVisible(cheddarPageLocators.cfdwAgreenGo, 5);
	 * 
	 * 
	 * highlightElement(cheddarPageLocators.cfdwAgreenGo);
	 * cheddarPageLocators.cfdwAgreenGo.click(); }
	 * 
	 * 
	 * 
	 * public void enterfNamedw(String fName) {
	 * waitForElementToVisible(cheddarPageLocators.dwfName, 2);
	 * 
	 * 
	 * highlightElement(cheddarPageLocators.dwfName);
	 * cheddarPageLocators.dwfName.sendKeys(fName); }
	 * 
	 * public void enterlNamedw(String lName) {
	 * waitForElementToVisible(cheddarPageLocators.dwlName, 2);
	 * 
	 * 
	 * highlightElement(cheddarPageLocators.dwlName);
	 * cheddarPageLocators.dwlName.sendKeys(lName); }
	 * 
	 * public void enterEmaildw(String email) {
	 * waitForElementToVisible(cheddarPageLocators.dwEmail, 2);
	 * 
	 * 
	 * highlightElement(cheddarPageLocators.dwEmail);
	 * cheddarPageLocators.dwEmail.sendKeys(email); }
	 * 
	 * public void enterphoneNumberdw(String phone) {
	 * waitForElementToVisible(cheddarPageLocators.dwPhone, 2);
	 * 
	 * 
	 * highlightElement(cheddarPageLocators.dwPhone);
	 * cheddarPageLocators.dwPhone.sendKeys(phone); }
	 * 
	 * public void enterZipdw(String zip) {
	 * waitForElementToVisible(cheddarPageLocators.dwZipCode, 2);
	 * 
	 * 
	 * highlightElement(cheddarPageLocators.dwZipCode);
	 * cheddarPageLocators.dwZipCode.sendKeys(zip); }
	 */

	public void ClickNextbtn() {
		waitForElementToVisible(cheddarPageLocators.nextBtn, 5);

		highlightElement(cheddarPageLocators.nextBtn);
		cheddarPageLocators.nextBtn.click();
	}

	public void moveTotwoStepForm() {
		waitForElementToVisible(cheddarPageLocators.twoStepForm, 5);

		highlightElement(cheddarPageLocators.twoStepForm);
	}

	public void movetoCheddarFooter() {
		waitForElementToVisible(cheddarPageLocators.footer, 5);
		highlightElement(cheddarPageLocators.footer);

	}

	public void closeMenu() {
		waitForElementToVisible(cheddarPageLocators.closeBtn, 5);
		highlightElement(cheddarPageLocators.closeBtn);
		cheddarPageLocators.closeBtn.click();
	}

	public String getTxtFooter() {
		// TODO Auto-generated method stub
		return cheddarPageLocators.copyRight.getText();
	}

	public void movetoBanner() {
		waitForElementToVisible(cheddarPageLocators.BannerImg, 5);
		highlightElement(cheddarPageLocators.BannerImg);

	}

	public void clickonBannerLink() {
		waitForElementToVisible(cheddarPageLocators.BannerLink, 5);
		highlightElement(cheddarPageLocators.BannerLink);
		cheddarPageLocators.BannerLink.click();
	}

	public void clickDwnFromBtn() {
		Actions actions = new Actions(DriverManager.getDriver());
		waitForElementToVisible(cheddarPageLocators.DwnFrmBtn, 2);
		highlightElement(cheddarPageLocators.DwnFrmBtn);
		actions.doubleClick(cheddarPageLocators.DwnFrmBtn).perform();
		// cheddarPageLocators.DwnFrmBtn.click();
		// cheddarPageLocators.DwnFrmBtn.click();
		// Thread.sleep(1000);

	}

	public void moveToMForm() {
		waitForElementToVisible(cheddarPageLocators.mForm, 5);
		highlightElement(cheddarPageLocators.mForm);

	}

	public void movetoCheddarFooterLM() {
		waitForElementToVisible(cheddarPageLocators.footerLinkMdoule, 5);
		highlightElement(cheddarPageLocators.footerLinkMdoule);
		moveToMenu(cheddarPageLocators.footerLinkMdoule);
	}

	public String getfNameError() {
		waitForElementToVisible(cheddarPageLocators.fNameError);

		highlightElement(cheddarPageLocators.fNameError);
		return cheddarPageLocators.fNameError.getText();
	}

	public String getlNameError() {
		waitForElementToVisible(cheddarPageLocators.lNameError);

		highlightElement(cheddarPageLocators.lNameError);
		return cheddarPageLocators.lNameError.getText();
	}

	public String getEmailError() {
		waitForElementToVisible(cheddarPageLocators.eMailError);

		highlightElement(cheddarPageLocators.eMailError);
		return cheddarPageLocators.eMailError.getText();
	}

	public String getPhoneError() {
		waitForElementToVisible(cheddarPageLocators.phoneError);

		highlightElement(cheddarPageLocators.phoneError);
		return cheddarPageLocators.phoneError.getText();
	}

	public String getZipeError() {
		waitForElementToVisible(cheddarPageLocators.zipeError);

		highlightElement(cheddarPageLocators.zipeError);
		return cheddarPageLocators.zipeError.getText();
	}
}
