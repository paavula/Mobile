package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import pages.locators.LinkedInPageLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class LinkedInPageActions extends BasePage<Object> {

	LinkedInPageLocators linkedInLocators = null;

	public LinkedInPageActions() {
		this.linkedInLocators = new LinkedInPageLocators();
		PageFactory.initElements(DriverManager.getDriver(), linkedInLocators);
	}

	public void moveToMenu(WebElement ele) {
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();
	}

	public void open_LP_Application() {
		navigateToURL(ProjectVariables.LP_URL);

	}

	public void open_LP_BBA_Application() {
		navigateToURL(ProjectVariables.LP_BBA_URL);

	}

	public void clickLogo() {
		waitForElementToVisible(linkedInLocators.headerLogo, 2);

		highlightElement(linkedInLocators.headerLogo);
		moveToMenu(linkedInLocators.headerLogo);
		linkedInLocators.headerLogo.click();

	}

	public void clickFooterLogo() {
		waitForElementToVisible(linkedInLocators.footerLogo, 2);

		highlightElement(linkedInLocators.footerLogo);
		linkedInLocators.footerLogo.click();

	}

	@SuppressWarnings("rawtypes")
	@Override
	public ExpectedCondition getPageLoadCondition() {
		return null;
	}

	public String getTxtLinkUNav() {

		return linkedInLocators.utilityNavBar.getText();
	}

	public void clickUtilityNav() {
		waitForElementToVisible(linkedInLocators.utilityNavBar, 5);

		highlightElement(linkedInLocators.utilityNavBar);
		moveToMenu(linkedInLocators.utilityNavBar);

	}

	public void clickUtilityHeaderLmodule() {
		waitForElementToVisible(linkedInLocators.utilityNavBar, 2);

		highlightElement(linkedInLocators.utilityNavBar);
		moveToMenu(linkedInLocators.utilityNavBar);
	}

	public String getTxtcopyright() {
		waitForElementToVisible(linkedInLocators.copyRight, 2);

		moveToMenu(linkedInLocators.copyRight);
		highlightElement(linkedInLocators.copyRight);
		return linkedInLocators.copyRight.getText();

	}

	public void clicklinkedInFooter() {
		waitForElementToVisible(linkedInLocators.footerNavigation, 5);

		moveToMenu(linkedInLocators.footerNavigation);
		highlightElement(linkedInLocators.footerNavigation);
	}

	public void clickAboutUs() {
		waitForElementToVisible(linkedInLocators.aboutUsComp, 5);

		moveToMenu(linkedInLocators.aboutUsComp);
		highlightElement(linkedInLocators.aboutUsComp);
	}

	public void verifyImage() {
		waitForElementToVisible(linkedInLocators.aboutUsLogo, 5);

		moveToMenu(linkedInLocators.aboutUsLogo);
		highlightElement(linkedInLocators.aboutUsLogo);

	}

	public String getTextAbtUs() {
		waitForElementToVisible(linkedInLocators.aboutUsHeader, 5);

		moveToMenu(linkedInLocators.aboutUsHeader);
		highlightElement(linkedInLocators.aboutUsHeader);
		return linkedInLocators.aboutUsHeader.getText();
	}

	public String getTextAbtUsTitle() {
		waitForElementToVisible(linkedInLocators.aboutUsTitle, 5);

		moveToMenu(linkedInLocators.aboutUsTitle);
		highlightElement(linkedInLocators.aboutUsTitle);
		return linkedInLocators.aboutUsTitle.getText();
	}

	public void clicklinkedInFootermodule() {
		waitForElementToVisible(linkedInLocators.footerLinkModule, 5);

		highlightElement(linkedInLocators.footerLinkModule);
		moveToMenu(linkedInLocators.footerLinkModule);

	}
}
