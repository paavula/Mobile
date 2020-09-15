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

public class DragonPageActions extends BasePage<Object> {

	DragonPageLocators dragonPageLocators = null;
	Select sel;

	public DragonPageActions() {
		this.dragonPageLocators = new DragonPageLocators();
		PageFactory.initElements(DriverManager.getDriver(), dragonPageLocators);
	}

	public void moveToMenu(WebElement ele) {
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();
	}

	public void open_DP_Application() {
		navigateToURL(ProjectVariables.DP_URL);

	}

	public void clickLogo() {
		 waitForElementToVisible(dragonPageLocators.headerLogo, 2);

		highlightElement(dragonPageLocators.headerLogo);
		moveToMenu(dragonPageLocators.headerLogo);
		dragonPageLocators.headerLogo.click();

	}

	public void clickFooterLogo() {
		 waitForElementToVisible(dragonPageLocators.footerLogo, 2);
		
		
		highlightElement(dragonPageLocators.footerLogo);
		dragonPageLocators.footerLogo.click();

	}

	public void clickUtilityHeader() {
		 waitForElementToVisible(dragonPageLocators.utilityHeader, 5);
		
		
		highlightElement(dragonPageLocators.utilityHeader);
		moveToMenu(dragonPageLocators.utilityHeader);

	}

	public void clickDragonFooter() {
		 waitForElementToVisible(dragonPageLocators.footerNavigation, 5);
		
		
		moveToMenu(dragonPageLocators.footerNavigation);
		highlightElement(dragonPageLocators.footerNavigation);
	}

	public void moveQuoteComp() {
		// waitForElementToVisible(dragonPageLocators.footerNavigation, 5);

		//moveToMenu(dragonPageLocators.footerNavigation);
		 waitForElementToVisible(dragonPageLocators.quoteComp,5);
		
		
		moveToMenu(dragonPageLocators.quoteComp);
		highlightElement(dragonPageLocators.quoteComp);
	}

	public String getTxtQuoteComp() {
		 waitForElementToVisible(dragonPageLocators.quoteTxt, 5);
		
		
		highlightElement(dragonPageLocators.quoteTxt);
		return dragonPageLocators.quoteTxt.getText();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ExpectedCondition getPageLoadCondition() {
		return null;
	}

	public String getTxtLinkUNav() {

		return dragonPageLocators.utilityNavBar.getText();
	}

	public void clickUtilityNav() {
		 waitForElementToVisible(dragonPageLocators.utilityNavBar, 5);
		
		
		highlightElement(dragonPageLocators.utilityNavBar);
		moveToMenu(dragonPageLocators.utilityNavBar);

	}

	public String getTxtLinkUHeader() {

		return dragonPageLocators.utilityHelpText.getText();
	}

	public String getTxtLinkUpno() {

		return dragonPageLocators.utilityMblNo.getText();
	}

	public void clickUtilityHeaderLmodule() {
		 waitForElementToVisible(dragonPageLocators.utilityNavBar, 2);
		
		
		highlightElement(dragonPageLocators.utilityNavBar);
		moveToMenu(dragonPageLocators.utilityNavBar);
	}

	public String getTxtcopyright() {
		 waitForElementToVisible(dragonPageLocators.copyRight, 2);
		
		
		moveToMenu(dragonPageLocators.copyRight);
		highlightElement(dragonPageLocators.copyRight);
		return dragonPageLocators.copyRight.getText();

	}

	public void selectDegree(String degVal) {

		 waitForElementToVisible(dragonPageLocators.degreeLevel, 5);
		highlightElement(dragonPageLocators.degreeLevelOptions);
		
		
		Select sel = new Select(dragonPageLocators.degreeLevelOptions);
		sel.selectByVisibleText(degVal);

	}

	public void selectAOS(String aos) {
		 waitForElementToVisible(dragonPageLocators.program, 5);
		
		
		highlightElement(dragonPageLocators.program);
		Select sel1 = new Select(dragonPageLocators.programOptions);
		sel1.selectByVisibleText(aos);
	}

	public void enterfName(String fName) {
		 waitForElementToVisible(dragonPageLocators.fName, 2);
		
		
		highlightElement(dragonPageLocators.fName);
		dragonPageLocators.fName.sendKeys(fName);
	}

	public void enterlName(String lName) {
		 waitForElementToVisible(dragonPageLocators.lName, 2);
		
		
		highlightElement(dragonPageLocators.lName);
		dragonPageLocators.lName.sendKeys(lName);
	}

	public void enterEmail(String email) {
		 waitForElementToVisible(dragonPageLocators.Email, 2);
		
	
		highlightElement(dragonPageLocators.Email);
		dragonPageLocators.Email.sendKeys(email);
	}

	public void enterphoneNumber(String phone) {
		 waitForElementToVisible(dragonPageLocators.Phone, 2);
		
		
		highlightElement(dragonPageLocators.Phone);
		dragonPageLocators.Phone.sendKeys(phone);
	}

	public void enterZip(String zip) {
		 waitForElementToVisible(dragonPageLocators.ZipCode, 2);
		
		
		highlightElement(dragonPageLocators.ZipCode);
		dragonPageLocators.ZipCode.sendKeys(zip);
	}
	
	public void enterAddress(String addres) {
		 waitForElementToVisible(dragonPageLocators.address, 5);
		
		
		highlightElement(dragonPageLocators.address);
		dragonPageLocators.address.sendKeys(addres);
	}

	public void ClickAnGobtn() {
		 waitForElementToVisible(dragonPageLocators.submitBtn, 5);
		
		
		highlightElement(dragonPageLocators.submitBtn);
		dragonPageLocators.submitBtn.click();
	}

	public void ClickNextbtn() {
		 waitForElementToVisible(dragonPageLocators.nextBtn, 5);
		
		
		highlightElement(dragonPageLocators.nextBtn);
		dragonPageLocators.nextBtn.click();
	}

	public void moveTotwoStepForm() {
		 waitForElementToVisible(dragonPageLocators.twoStepForm, 5);
		
		
		highlightElement(dragonPageLocators.twoStepForm);
	}

	public void open_DragonAllComps_Application() {
		navigateToURL(ProjectVariables.DragonAllComs_URL);
		
	}
}
