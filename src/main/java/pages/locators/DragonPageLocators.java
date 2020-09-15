package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragonPageLocators {

	@FindBy(xpath = "//*[@id='landing-header']/div/div[1]/div[1]/a")
	public WebElement headerLogo;

	@FindBy(xpath = "//*[@id='landing-header']/div/div[1]")
	public WebElement utilityHeader;

	@FindBy(xpath = "//*[@id='landing-header']/div/div[1]/div[2]/span")
	public WebElement utilityHelpText;

	@FindBy(xpath = "//*[@id='landing-header']/div/div[1]/div[2]/a")
	public WebElement utilityMblNo;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']")
	public WebElement utilityNavBar;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[2]/a")
	public WebElement tutionCosts;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/a")
	public WebElement flexibility;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/a")
	public WebElement programs;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[5]/a")
	public WebElement accreditation;

	@FindBy(xpath = "//*[@id='startHere']")
	public WebElement startHere;

	@FindBy(xpath = "//*[@id='footerLogo']/div[1]")
	public WebElement footerLogo;

	@FindBy(xpath = "//*[@id='footerLogo']/div[2]/span")
	public WebElement copyRight;

	@FindBy(xpath = "//*[@class='footer col-12']")
	public WebElement footerNavigation;

	@FindBy(xpath = "//div[@class='item-content-wrapper rte-text-wrapper text']//div//div[@class='custom-limited-vc-rte']")
	public WebElement quoteComp;

	@FindBy(css = "body > div.container-fluid > div > div > div > div.responsivegrid.aem-GridColumn.aem-GridColumn--default--12 > div > div.quote.aem-GridColumn.aem-GridColumn--default--12 > section > div")
	public WebElement quoteComp1;

	@FindBy(xpath = "//h1[@class='quote-heading text-uppercase']")
	public WebElement quoteTxt;

	@FindBy(xpath = "//*[@class='quote']")
	public WebElement quoteTxt1;

	public String dragonPageLink = "//a[contains(text(),'value')]";

	// Form

	@FindBy(xpath = "//*[@class='capella-form ']")
	public WebElement twoStepForm;
	@FindBy(xpath = "//*[@name='FirstName']")
	public WebElement fName;
	@FindBy(xpath = "//*[@name='LastName']")
	public WebElement lName;

	@FindBy(xpath = "//*[@name='Email']")
	public WebElement Email;
	@FindBy(xpath = "//*[@name='Phone']")
	public WebElement Phone;
	@FindBy(xpath = "//*[@name='ZipCode']")
	public WebElement ZipCode;

	@FindBy(xpath = "//*[@id='twostep-rfi-banner']/div[4]/div/input")
	public WebElement address;

	@FindBy(xpath = "//*[@name='Degree']")
	public WebElement degreeLevel;
	@FindBy(xpath = "//*[@id='twostep-rfi-banner']/div[1]/div/div[1]/select")
	public WebElement degreeLevelOptions;
	@FindBy(xpath = "//*[@name='Program']")
	public WebElement program;
	@FindBy(xpath = "//*[@id='twostep-rfi-banner']/div[1]/div/div[2]/select")
	public WebElement programOptions;

	@FindBy(xpath = "//*[@class='btn btn-secondary']")
	public WebElement nextBtn;
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	public WebElement submitBtn;

}
