package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllCompsPageLocators {

	@FindBy(xpath = "//div[@class='blogSubscription aem-GridColumn aem-GridColumn--default--12']")
	public WebElement blogComp;

	@FindBy(xpath = "//*[@id='edit-submitted-email-address']")
	public WebElement emailAddress;

	@FindBy(xpath = "//span[@class='blog-error-msg']")
	public WebElement errorMsgTxt;

	@FindBy(xpath="//*[class='button-primary form-submit text-uppercase font-weight-normal']")
	public WebElement submitBtn1;
	@FindBy(xpath = "//*[@name='op']")
	public WebElement submitBtn;


}
