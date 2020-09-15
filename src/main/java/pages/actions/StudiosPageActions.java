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

public class StudiosPageActions extends BasePage<Object> {

	StudiosPageLocators studiosPageLocators = null;
	Select sel;

	public StudiosPageActions() {
		this.studiosPageLocators = new StudiosPageLocators();
		PageFactory.initElements(DriverManager.getDriver(), studiosPageLocators);
	}

	public void moveToMenu(WebElement ele) {
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();
	}

	public void open_STP_Application() {
		navigateToURL(ProjectVariables.STP_URL);

	}

	public void clickLogo() {
		 waitForElementToVisible(studiosPageLocators.headerLogo, 2);

		highlightElement(studiosPageLocators.headerLogo);
		moveToMenu(studiosPageLocators.headerLogo);
		studiosPageLocators.headerLogo.click();

	}

	public void clickFooterLogo() {
		 waitForElementToVisible(studiosPageLocators.footerLogo, 2);
		
		
		highlightElement(studiosPageLocators.footerLogo);
		moveToMenu(studiosPageLocators.footerLogo);
		studiosPageLocators.footerLogo.click();

	}

	public void clickUtilityHeader() {
		waitForElementToVisible(studiosPageLocators.menuBtn,5);
		moveToMenu(studiosPageLocators.menuBtn);
		studiosPageLocators.menuBtn.click();
		 waitForElementToVisible(studiosPageLocators.utilityHeader, 5);
			
		
		moveToMenu(studiosPageLocators.utilityHeader);
		highlightElement(studiosPageLocators.utilityHeader);
	}

	public void clickDragonFooter() {
		 waitForElementToVisible(studiosPageLocators.footerNavigation, 5);
		
		
		moveToMenu(studiosPageLocators.footerNavigation);
		highlightElement(studiosPageLocators.footerNavigation);
	}

	public void moveQuoteComp() {
		// waitForElementToVisible(stuidosPageLocators.footerNavigation, 5);

		//moveToMenu(stuidosPageLocators.footerNavigation);
		 waitForElementToVisible(studiosPageLocators.quoteComp,5);
		
		
		moveToMenu(studiosPageLocators.quoteComp);
		highlightElement(studiosPageLocators.quoteComp);
	}

	public String getTxtQuoteComp() {
		 waitForElementToVisible(studiosPageLocators.quoteTxt, 5);
		
		
		highlightElement(studiosPageLocators.quoteTxt);
		return studiosPageLocators.quoteTxt.getText();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ExpectedCondition getPageLoadCondition() {
		return null;
	}

	public String getTxtLinkUNav() {

		return studiosPageLocators.utilityNavBar.getText();
	}

	public void clickUtilityNav() {
		waitForElementToVisible(studiosPageLocators.menuBtn,5);
		studiosPageLocators.menuBtn.click();
		 waitForElementToVisible(studiosPageLocators.utilityNavBar, 5);
			
		highlightElement(studiosPageLocators.utilityNavBar);
		moveToMenu(studiosPageLocators.utilityNavBar);

	}

	public String getTxtLinkUHeader() {

		return studiosPageLocators.utilityHelpText.getText();
	}

	public String getTxtLinkUpno() {

		return studiosPageLocators.utilityMblNo.getText();
	}

	public void clickUtilityHeaderLmodule() {
		 waitForElementToVisible(studiosPageLocators.utilityNavBar, 2);
		
		 
		highlightElement(studiosPageLocators.utilityNavBar);
		moveToMenu(studiosPageLocators.utilityNavBar);
	}

	public String getTxtcopyright() {
		 waitForElementToVisible(studiosPageLocators.copyRight, 2);
		
		
		moveToMenu(studiosPageLocators.copyRight);
		highlightElement(studiosPageLocators.copyRight);
		return studiosPageLocators.copyRight.getText();

	}

	public void selectDegree(String degVal) {

		 waitForElementToVisible(studiosPageLocators.degreeLevel, 5);
		highlightElement(studiosPageLocators.degreeLevelOptions);
		
		
		Select sel = new Select(studiosPageLocators.degreeLevelOptions);
		sel.selectByVisibleText(degVal);

	}

	public void selectAOS(String aos) {
		 waitForElementToVisible(studiosPageLocators.program, 5);
		
		
		highlightElement(studiosPageLocators.program);
		Select sel1 = new Select(studiosPageLocators.programOptions);
		sel1.selectByVisibleText(aos);
	}

	public void enterfName(String fName) {
		 waitForElementToVisible(studiosPageLocators.fName, 2);
		
		
		highlightElement(studiosPageLocators.fName);
		studiosPageLocators.fName.sendKeys(fName);
	}

	public void enterlName(String lName) {
		 waitForElementToVisible(studiosPageLocators.lName, 2);
		
		
		highlightElement(studiosPageLocators.lName);
		studiosPageLocators.lName.sendKeys(lName);
	}

	public void enterEmail(String email) {
		 waitForElementToVisible(studiosPageLocators.Email, 2);
		 moveToMenu(studiosPageLocators.Email);
	
		highlightElement(studiosPageLocators.Email);
		studiosPageLocators.Email.sendKeys(email);
	}

	public void enterphoneNumber(String phone) {
		 waitForElementToVisible(studiosPageLocators.Phone, 2);
		
		
		highlightElement(studiosPageLocators.Phone);
		studiosPageLocators.Phone.sendKeys(phone);
	}

	public void enterZip(String zip) {
		 waitForElementToVisible(studiosPageLocators.ZipCode, 2);
		
		
		highlightElement(studiosPageLocators.ZipCode);
		studiosPageLocators.ZipCode.sendKeys(zip);
	}
	
	public void enterAddress(String addres) {
		 waitForElementToVisible(studiosPageLocators.address, 5);
		
		
		highlightElement(studiosPageLocators.address);
		studiosPageLocators.address.sendKeys(addres);
	}

	public void ClickAnGobtn() {
		 waitForElementToVisible(studiosPageLocators.submitBtn, 5);
		
		
		highlightElement(studiosPageLocators.submitBtn);
		studiosPageLocators.submitBtn.click();
	}

	public void ClickNextbtn() {
		 waitForElementToVisible(studiosPageLocators.nextBtn, 5);
		
		
		highlightElement(studiosPageLocators.nextBtn);
		studiosPageLocators.nextBtn.click();
	}

	public void moveTotwoStepForm() {
		 waitForElementToVisible(studiosPageLocators.twoStepForm, 5);
		
		
		highlightElement(studiosPageLocators.twoStepForm);
	}

	public void moveFooter() {
waitForElementToVisible(studiosPageLocators.footer, 5);
		
				highlightElement(studiosPageLocators.footer);
		
	}

	public void movetoBanner() {
		// TODO Auto-generated method stub
		waitForElementToVisible(studiosPageLocators.Banner, 5);
		
		highlightElement(studiosPageLocators.Banner);
	}

	public String getquoteTxt() {
		// TODO Auto-generated method stub
		return studiosPageLocators.Bannertxt.getText();
	}

	public void movetoBannerCTA() {
waitForElementToVisible(studiosPageLocators.BannerLinkModule, 5);
		
		highlightElement(studiosPageLocators.BannerLinkModule);
		moveToMenu(studiosPageLocators.BannerLinkModule);
	}

	public void clickOnBannerCTA() {
waitForElementToVisible(studiosPageLocators.BannerLink, 5);
		
		highlightElement(studiosPageLocators.BannerLink);
		moveToMenu(studiosPageLocators.BannerLink);
		studiosPageLocators.BannerLink.click();
	}

	public String getBannerquoteTxt() {
		// TODO Auto-generated method stub
		return studiosPageLocators.quoteTxt.getText();
	}
}
