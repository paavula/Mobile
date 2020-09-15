package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DegreePageLocators {

	@FindBy(xpath = "//img[@title='Home']")
	public WebElement headerLogo;

	@FindBy(xpath = "//div[@id='navbarNavDropdown']")
	public WebElement utilityHeader;

	@FindBy(xpath = "//a[contains(text(),'OVERVIEW')]")
	public WebElement utilityLinkText;

	@FindBy(xpath = "//*[@id='landing-header']/div/div[1]/div[2]/a")
	public WebElement utilityMblNo;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']")
	public WebElement utilityNavBar;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[2]/a")
	public WebElement tutionCosts;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/a")
	public WebElement flexibility;


	@FindBy(xpath = "//a[@class='footer-logo']")
	public WebElement footerLogo;

	@FindBy(xpath = "//*[@id='footerLogo']/div[2]/span")
	public WebElement copyRight;

	@FindBy(xpath = "//*[@class='footer col-12']")
	public WebElement footerNavigation;

	@FindBy(xpath = "//*[@class='quote-component__bg m-auto m-md-0']")
	public WebElement quoteComp;


	@FindBy(xpath = "//*[@class='quote']")
	public WebElement quoteTxt1;

	public String DegreePageLink = "//a[contains(text(),'value')]";

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
	
	@FindBy(xpath = "//div[@class='footer aem-GridColumn aem-GridColumn--default--12']")
	public WebElement footer;
//Degree Form
	
	@FindBy(xpath ="//form[@id='degree-header-rfi']")
	public WebElement degreeForm;

	@FindBy(xpath = "//*[@name='FirstName']")
	public WebElement fNameDF;
	@FindBy(xpath = "//*[@name='LastName']")
	public WebElement lNameDF;

	@FindBy(xpath = "//*[@name='Email']")
	public WebElement EmailDF;
	@FindBy(xpath = "//*[@name='Company']")
	public WebElement Company;
	
	@FindBy(xpath = "//*[@name='Title']")
	public WebElement Title;
	@FindBy(xpath = "//*[@name='Comments']")
	public WebElement Comments;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement SubmitBtnDF;
	@FindBy(xpath = "//div[@class='success-container']//p[1]")
	public WebElement successwind;
	@FindBy(xpath = "//span[@id='rfi-form-modal-close']")
	public WebElement closeBtn;
	
	
}
