package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import pages.locators.*;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class VerizonPageActions extends BasePage<Object> {

	VerizonPageLocators verizonPageLocators = null;
	Select sel;

	public VerizonPageActions() {
		this.verizonPageLocators = new VerizonPageLocators();
		PageFactory.initElements(DriverManager.getDriver(), verizonPageLocators);
	}

	public void moveToMenu(WebElement ele) {
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();
	}

		public void clickLogo() {
		 waitForElementToVisible(verizonPageLocators.headerLogo, 2);
		highlightElement(verizonPageLocators.headerLogo);
		moveToMenu(verizonPageLocators.headerLogo);
		verizonPageLocators.headerLogo.click();
	}

	public static void clickFooterLogo() {
	}

	public void openVerizionPage() {
		navigateToURL(ProjectVariables.VTP_URL);
		
	}
	public void movetoUtilityHeader() {
		 waitForElementToVisible(verizonPageLocators.utilityHeader, 5);
		highlightElement(verizonPageLocators.utilityHeader);
		moveToMenu(verizonPageLocators.utilityHeader);
	}

	public void clickDragonFooter() {
		 waitForElementToVisible(verizonPageLocators.footerNavigation, 5);
		moveToMenu(verizonPageLocators.footerNavigation);
		highlightElement(verizonPageLocators.footerNavigation);
	}

	public void moveQuoteComp() {
		 waitForElementToVisible(verizonPageLocators.quoteComp,5);
		moveToMenu(verizonPageLocators.quoteComp);
		highlightElement(verizonPageLocators.quoteComp);
	}

	public String getTxtQuoteComp() {
		 waitForElementToVisible(verizonPageLocators.quoteTxt, 5);
		highlightElement(verizonPageLocators.quoteTxt);
		return verizonPageLocators.quoteTxt.getText();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ExpectedCondition getPageLoadCondition() {
		return null;
	}

	public String getTxtLinkUNav() {
		return verizonPageLocators.utilityNavBarTxt.getText();
	}

	public void clickUtilityNav() {
		 waitForElementToVisible(verizonPageLocators.utilityNavBar, 5);
		highlightElement(verizonPageLocators.utilityNavBar);
		moveToMenu(verizonPageLocators.utilityNavBar);
	}

	
	public String getTxtLinkUpno() {
		return verizonPageLocators.utilityMblNo.getText();
	}

	public void clickUtilityHeaderLmodule() {
		 waitForElementToVisible(verizonPageLocators.utilityNavBar, 2);
		highlightElement(verizonPageLocators.utilityNavBar);
		moveToMenu(verizonPageLocators.utilityNavBar);
	}

	public String getTxtcopyright() {
		 waitForElementToVisible(verizonPageLocators.copyRight, 2);
		
		
		moveToMenu(verizonPageLocators.copyRight);
		highlightElement(verizonPageLocators.copyRight);
		return verizonPageLocators.copyRight.getText();

	}

	public void selectDegree(String degVal) {

		 waitForElementToVisible(verizonPageLocators.degreeLevel, 5);
		highlightElement(verizonPageLocators.degreeLevelOptions);
		
		
		Select sel = new Select(verizonPageLocators.degreeLevelOptions);
		sel.selectByVisibleText(degVal);

	}

	public void selectAOS(String aos) {
		 waitForElementToVisible(verizonPageLocators.program, 5);
		
		
		highlightElement(verizonPageLocators.program);
		Select sel1 = new Select(verizonPageLocators.programOptions);
		sel1.selectByVisibleText(aos);
	}

	public void enterfName(String fName) {
		 waitForElementToVisible(verizonPageLocators.fName, 2);
		highlightElement(verizonPageLocators.fName);
		verizonPageLocators.fName.sendKeys(fName);
	}

	public void enterlName(String lName) {
		 waitForElementToVisible(verizonPageLocators.lName, 2);
		highlightElement(verizonPageLocators.lName);
		verizonPageLocators.lName.sendKeys(lName);
	}

	public void enterEmail(String email) {
		 waitForElementToVisible(verizonPageLocators.Email, 2);
		highlightElement(verizonPageLocators.Email);
		verizonPageLocators.Email.sendKeys(email);
	}

	public void enterphoneNumber(String phone) {
		 waitForElementToVisible(verizonPageLocators.Phone, 2);
		highlightElement(verizonPageLocators.Phone);
		verizonPageLocators.Phone.sendKeys(phone);
	}

	public void enterZip(String zip) {
		 waitForElementToVisible(verizonPageLocators.ZipCode, 2);
		highlightElement(verizonPageLocators.ZipCode);
		verizonPageLocators.ZipCode.sendKeys(zip);
	}
	
	public void enterAddress(String addres) {
		 waitForElementToVisible(verizonPageLocators.address, 5);
		highlightElement(verizonPageLocators.address);
		verizonPageLocators.address.sendKeys(addres);
	}

	public void ClickAnGobtn() {
		 waitForElementToVisible(verizonPageLocators.submitBtn, 5);
		highlightElement(verizonPageLocators.submitBtn);
		verizonPageLocators.submitBtn.click();
	}

	public void ClickNextbtn() {
		 waitForElementToVisible(verizonPageLocators.nextBtn, 5);
		highlightElement(verizonPageLocators.nextBtn);
		verizonPageLocators.nextBtn.click();
	}

	public void moveTotwoStepForm() {
		 waitForElementToVisible(verizonPageLocators.twoStepForm, 5);
		highlightElement(verizonPageLocators.twoStepForm);
	}

	
	public void movetoVerizonFooter() {
		waitForElementToVisible(verizonPageLocators.footer, 5);
		moveToMenu(verizonPageLocators.footer);
		highlightElement(verizonPageLocators.footer);
	}

	public String getCampustxt() {
		 waitForElementToVisible(verizonPageLocators.campusTxt, 5);
			moveToMenu(verizonPageLocators.campusTxt);
			highlightElement(verizonPageLocators.campusTxt);
			return verizonPageLocators.campusTxt.getText();
	}

	public String getPhoneno() {
		 waitForElementToVisible(verizonPageLocators.utilityMblNo, 5);
			moveToMenu(verizonPageLocators.utilityMblNo);
			highlightElement(verizonPageLocators.utilityMblNo);
			return verizonPageLocators.utilityMblNo.getText();
		
	}

	public void moveToUtilityNav() {
		 waitForElementToVisible(verizonPageLocators.utilityNavBar, 5);
			moveToMenu(verizonPageLocators.utilityNavBar);
			highlightElement(verizonPageLocators.utilityNavBar);
		
		
	}

	public String getTxtFooter() {
		highlightElement(verizonPageLocators.copyRight);
		return verizonPageLocators.copyRight.getText();
	}

	public void moveToUtilityNavLkink() {
		 waitForElementToVisible(verizonPageLocators.utilityNavBarLinks, 5);
			moveToMenu(verizonPageLocators.utilityNavBarLinks);
			highlightElement(verizonPageLocators.utilityNavBarLinks);
		
	}


}
