package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import pages.locators.DegreePageLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class DegreePageActions extends BasePage<Object> {
	DegreePageLocators degreePageLocators = null;
	Select sel;

	public DegreePageActions() {
		this.degreePageLocators = new DegreePageLocators();
		PageFactory.initElements(DriverManager.getDriver(), degreePageLocators);
	}

	public void moveToMenu(WebElement ele) {
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();
	}

	public void open_DP_Application() {
		navigateToURL(ProjectVariables.DPP_URL);
	}

	public void clickLogo() {
		waitForElementToVisible(degreePageLocators.headerLogo, 2);
		highlightElement(degreePageLocators.headerLogo);
		moveToMenu(degreePageLocators.headerLogo);
		degreePageLocators.headerLogo.click();
	}

	public void clickFooterLogo() {
		waitForElementToVisible(degreePageLocators.footerLogo, 2);
		highlightElement(degreePageLocators.footerLogo);
		degreePageLocators.footerLogo.click();
	}

	public void clickUtilityHeader() {
		waitForElementToVisible(degreePageLocators.utilityHeader, 5);
		highlightElement(degreePageLocators.utilityHeader);
		moveToMenu(degreePageLocators.utilityHeader);
	}

	public void clickDragonFooter() {
		waitForElementToVisible(degreePageLocators.footerNavigation, 5);
		moveToMenu(degreePageLocators.footerNavigation);
		highlightElement(degreePageLocators.footerNavigation);
	}

	public void moveQuoteComp() {
		// waitForElementToVisible(degreePageLocators.footerNavigation, 5);
		// moveToMenu(degreePageLocators.footerNavigation);
		waitForElementToVisible(degreePageLocators.quoteComp, 5);
		moveToMenu(degreePageLocators.quoteComp);
		highlightElement(degreePageLocators.quoteComp);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ExpectedCondition getPageLoadCondition() {
		return null;
	}

	public String getTxtLinkUNav() {
		return degreePageLocators.utilityNavBar.getText();
	}

	public void clickUtilityNav() {
		waitForElementToVisible(degreePageLocators.utilityNavBar, 5);
		highlightElement(degreePageLocators.utilityNavBar);
		moveToMenu(degreePageLocators.utilityNavBar);
	}

	public String getTxtLinkUHeader() {
		return degreePageLocators.utilityLinkText.getText();
	}

	public String getTxtLinkUpno() {
		return degreePageLocators.utilityMblNo.getText();
	}

	public void clickUtilityHeaderLmodule() {
		waitForElementToVisible(degreePageLocators.utilityNavBar, 2);
		highlightElement(degreePageLocators.utilityNavBar);
		moveToMenu(degreePageLocators.utilityNavBar);
	}

	public String getTxtcopyright() {
		waitForElementToVisible(degreePageLocators.copyRight, 2);
		moveToMenu(degreePageLocators.copyRight);
		highlightElement(degreePageLocators.copyRight);
		return degreePageLocators.copyRight.getText();
	}

	public void selectDegree(String degVal) {
		waitForElementToVisible(degreePageLocators.degreeLevel, 5);
		highlightElement(degreePageLocators.degreeLevelOptions);
		Select sel = new Select(degreePageLocators.degreeLevelOptions);
		sel.selectByVisibleText(degVal);
	}

	public void selectAOS(String aos) {
		waitForElementToVisible(degreePageLocators.program, 5);
		highlightElement(degreePageLocators.program);
		Select sel1 = new Select(degreePageLocators.programOptions);
		sel1.selectByVisibleText(aos);
	}

	public void enterfName(String fName) {
		waitForElementToVisible(degreePageLocators.fName, 2);
		highlightElement(degreePageLocators.fName);
		degreePageLocators.fName.sendKeys(fName);
	}

	public void enterlName(String lName) {
		waitForElementToVisible(degreePageLocators.lName, 2);
		highlightElement(degreePageLocators.lName);
		degreePageLocators.lName.sendKeys(lName);
	}

	public void enterEmail(String email) {
		waitForElementToVisible(degreePageLocators.Email, 2);
		highlightElement(degreePageLocators.Email);
		degreePageLocators.Email.sendKeys(email);
	}

	public void enterphoneNumber(String phone) {
		waitForElementToVisible(degreePageLocators.Phone, 2);
		highlightElement(degreePageLocators.Phone);
		degreePageLocators.Phone.sendKeys(phone);
	}

	public void enterZip(String zip) {
		waitForElementToVisible(degreePageLocators.ZipCode, 2);
		highlightElement(degreePageLocators.ZipCode);
		degreePageLocators.ZipCode.sendKeys(zip);
	}

	public void enterAddress(String addres) {
		waitForElementToVisible(degreePageLocators.address, 5);
		highlightElement(degreePageLocators.address);
		degreePageLocators.address.sendKeys(addres);
	}

	public void ClickAnGobtn() {
		waitForElementToVisible(degreePageLocators.submitBtn, 5);
		highlightElement(degreePageLocators.submitBtn);
		degreePageLocators.submitBtn.click();
	}

	public void ClickNextbtn() {
		waitForElementToVisible(degreePageLocators.nextBtn, 5);
		highlightElement(degreePageLocators.nextBtn);
		degreePageLocators.nextBtn.click();
	}

	public void moveTotwoStepForm() {
		waitForElementToVisible(degreePageLocators.twoStepForm, 5);
		highlightElement(degreePageLocators.twoStepForm);
		moveToMenu(degreePageLocators.twoStepForm);
	}

	public void movetoDegreeFooter() {
		waitForElementToVisible(degreePageLocators.footer, 5);
		highlightElement(degreePageLocators.footer);
		moveToMenu(degreePageLocators.footer);
	}
	/*
	 * public void movetoDegreeForm() {
	 * waitForElementToVisible(degreePageLocators.degreeForm, 5);
	 * highlightElement(degreePageLocators.degreeForm);
	 * moveToMenu(degreePageLocators.degreeForm); }
	 * 
	 * public void enterFNameDF(String fName) {
	 * waitForElementToVisible(degreePageLocators.fNameDF, 2);
	 * highlightElement(degreePageLocators.fNameDF);
	 * degreePageLocators.fNameDF.sendKeys(fName); }
	 * 
	 * public void enterlNameDF(String lName) {
	 * waitForElementToVisible(degreePageLocators.lNameDF, 2);
	 * highlightElement(degreePageLocators.lNameDF);
	 * degreePageLocators.lNameDF.sendKeys(lName); }
	 * 
	 * public void enterEmailinDF(String email) {
	 * waitForElementToVisible(degreePageLocators.EmailDF, 5);
	 * highlightElement(degreePageLocators.EmailDF);
	 * degreePageLocators.EmailDF.sendKeys(email); }
	 * 
	 * public void enterCompany(String company) {
	 * waitForElementToVisible(degreePageLocators.Company, 2);
	 * highlightElement(degreePageLocators.Company);
	 * degreePageLocators.Company.sendKeys(company); }
	 * 
	 * public void enterCeomments(String comments) {
	 * waitForElementToVisible(degreePageLocators.Comments, 2);
	 * highlightElement(degreePageLocators.Comments);
	 * degreePageLocators.Comments.sendKeys(comments); }
	 * 
	 * public void enterTitle(String title) {
	 * waitForElementToVisible(degreePageLocators.Title, 2);
	 * highlightElement(degreePageLocators.Title);
	 * degreePageLocators.Title.sendKeys(title); }
	 * 
	 * public void ClickSUbmitBtn() {
	 * waitForElementToVisible(degreePageLocators.SubmitBtnDF, 5);
	 * highlightElement(degreePageLocators.SubmitBtnDF);
	 * degreePageLocators.SubmitBtnDF.submit(); }
	 * 
	 * public String getTxtwinodw() {
	 * waitForElementToVisible(degreePageLocators.successwind, 5);
	 * highlightElement(degreePageLocators.successwind); return
	 * degreePageLocators.successwind.getText(); }
	 * 
	 * public void clickCloseBtn() {
	 * waitForElementToVisible(degreePageLocators.closeBtn, 5);
	 * highlightElement(degreePageLocators.closeBtn);
	 * degreePageLocators.closeBtn.click(); }
	 */
}
