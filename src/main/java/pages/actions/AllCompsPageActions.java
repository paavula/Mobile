package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import pages.locators.*;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class AllCompsPageActions extends BasePage<Object> {

	AllCompsPageLocators allCompsPageLocators = null;

	public AllCompsPageActions() {
		this.allCompsPageLocators = new AllCompsPageLocators();
		PageFactory.initElements(DriverManager.getDriver(),
				allCompsPageLocators);
	}

	public void moveToMenu(WebElement ele) {
		Actions action = new Actions(DriverManager.getDriver());
		action.moveToElement(ele).perform();
	}

	public void open_ACP_Application() {
		navigateToURL(ProjectVariables.ACP_URL);

	}

	public void clickBuzzSubs() {
	 waitForElementToVisible(allCompsPageLocators.blogComp, 5);
		
		moveToMenu(allCompsPageLocators.blogComp);
		highlightElement(allCompsPageLocators.blogComp);
	}

	public void enterEmail(String email) {
		waitForElementToVisible(allCompsPageLocators.emailAddress, 2);
		
		highlightElement(allCompsPageLocators.emailAddress);
		allCompsPageLocators.emailAddress.sendKeys(email);
	}

	public void clickSubmitBtn() {
		 waitForElementToVisible(allCompsPageLocators.submitBtn, 3);
	
		moveToMenu(allCompsPageLocators.submitBtn);
		highlightElement(allCompsPageLocators.submitBtn);
		allCompsPageLocators.submitBtn.submit();
		//allCompsPageLocators.submitBtn.click();
	}

	
	@SuppressWarnings("rawtypes")
	@Override
	public ExpectedCondition getPageLoadCondition() {
		return null;
	}

	public String getEmailError() {
		return allCompsPageLocators.errorMsgTxt.getText();

	}

	public void open_Buzz_Application() {
		navigateToURL(ProjectVariables.Buzz_URL);
		
	}

}
