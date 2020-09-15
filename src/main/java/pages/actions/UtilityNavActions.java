package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import pages.locators.FooterLocators;
import pages.locators.MegaMenuLocators;
import pages.locators.UtilityNavLocators;
import utils.BasePage;
import utils.DriverManager;

public class UtilityNavActions extends BasePage<Object> {

    MegaMenuLocators megamenuLocators = null;
    FooterLocators footerLocators = null;
    UtilityNavLocators utilityNavLocators = null;

    public UtilityNavActions() {
	this.utilityNavLocators = new UtilityNavLocators();
	PageFactory.initElements(DriverManager.getDriver(), utilityNavLocators);
    }

    public void moveToMenu(WebElement ele) {
	Actions action = new Actions(DriverManager.getDriver());
	action.moveToElement(ele).perform();

    }

    public void movetoUtilityHeader() {
	waitForElementToVisible(utilityNavLocators.utilityHeader, 5);
	moveToMenu(utilityNavLocators.utilityHeader);
	highlightElement(utilityNavLocators.utilityHeader);

    }

    public void clickCampusLocationLink() {
	waitForElementToVisible(utilityNavLocators.campusLocationLink, 5);
	highlightElement(utilityNavLocators.campusLocationLink);
	utilityNavLocators.campusLocationLink.click();
    }

    public void clickfooterLogo() {
	waitForElementToVisible(footerLocators.fLogo, 2);

	highlightElement(footerLocators.fLogo);
	footerLocators.fLogo.click();

    }

    public String getTxtcopyright() {
	waitForElementToVisible(footerLocators.copyRight, 2);

	moveToMenu(footerLocators.copyRight);
	highlightElement(footerLocators.copyRight);
	return DriverManager.driver.get().getPageSource();
    }

    public void clickContactUs() {
	waitForElementToVisible(footerLocators.contactUsLink, 2);

	highlightElement(footerLocators.contactUsLink);
	footerLocators.contactUsLink.click();

    }

    public String getTxtContactUsPage() {
	waitForElementToVisible(footerLocators.contactUsLink, 2);

	moveToMenu(footerLocators.contactUsLink);
	return footerLocators.contactUsLink.getText();

    }

    public String getTxtSocialLink() {
	waitForElementToVisible(footerLocators.socialfooter, 5);

	moveToMenu(footerLocators.socialfooter);
	return footerLocators.socialfooter.getText();
    }

    public String getSocialLinkCS() {
	waitForElementToVisible(footerLocators.socialfootertxt, 5);

	moveToMenu(footerLocators.socialfootertxt);
	return footerLocators.socialfootertxt.getText();
    }

    public String getTxtCampusLocationPage() throws InterruptedException {
	Thread.sleep(3000);
	return DriverManager.driver.get().getTitle();
	// return SwitchTab();

    }

    public void clickCampusLoginLink() throws InterruptedException {
	waitForElementToVisible(utilityNavLocators.uICampusLoginLink, 5);
	highlightElement(utilityNavLocators.uICampusLoginLink);
	utilityNavLocators.uICampusLoginLink.click();
	// Thread.sleep(3000);

    }

    public String getTxtCampusLoginPage() throws InterruptedException {
	Thread.sleep(5000);
	return DriverManager.driver.get().getTitle();
	// return SwitchTab();
    }

    public void clickApplyNowLink() {
	waitForElementToVisible(utilityNavLocators.uApplyNowLink, 5);
	highlightElement(utilityNavLocators.uApplyNowLink);
	utilityNavLocators.uApplyNowLink.click();
    }

    public String getTxtApplyNowPage() throws InterruptedException {
	Thread.sleep(5000);
	return DriverManager.driver.get().getTitle();

	// return SwitchTab();
    }

    public void clickSearchButton() {
	highlightElement(utilityNavLocators.searchBtn);
	utilityNavLocators.searchBtn.click();
    }

    public void enterSearchBox() {
	waitForElementToVisible(utilityNavLocators.searchLblTxt, 5);
	highlightElement(utilityNavLocators.searchLblTxt);
	utilityNavLocators.searchLblTxt.sendKeys(Keys.RETURN);

    }

    public String getTxtSearchResultsPage() {
	moveToMenu(utilityNavLocators.uSearchresultspage);
	highlightElement(utilityNavLocators.uSearchresultspage);
	return DriverManager.driver.get().getTitle();
    }

    public String getTxtSearchResults() throws InterruptedException {
	Thread.sleep(3000);
	moveToMenu(utilityNavLocators.uSearchresults);
	highlightElement(utilityNavLocators.uSearchresults);

	return utilityNavLocators.uSearchresults.getText();

    }

    public String getTxtSearchbox() {
	waitForElementToVisible(utilityNavLocators.searchLblTxt, 2);
	moveToMenu(utilityNavLocators.searchLblTxt);
	highlightElement(utilityNavLocators.searchLblTxt);
	return utilityNavLocators.searchLblTxt.getText();
    }

    public String getTxtHomePage() {

	return DriverManager.driver.get().getTitle();
    }

    public void enterSearchkey(String searchKey) {
	waitForElementToVisible(utilityNavLocators.searchLblTxt, 5);
	moveToMenu(utilityNavLocators.searchLblTxt);
	highlightElement(utilityNavLocators.searchLblTxt);
	utilityNavLocators.searchLblTxt.sendKeys(searchKey);

    }

    @Override
    public ExpectedCondition<?> getPageLoadCondition() {
	return null;
    }
}
