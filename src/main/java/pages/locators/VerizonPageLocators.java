package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerizonPageLocators {

	@FindBy(xpath = "//a[@class='navbar-brand']")
	public WebElement headerLogo;

	@FindBy(xpath = "//div[@class='utility-block clearfix']")
	public WebElement utilityHeader;

	@FindBy(xpath = "//a[contains(text(),'Campus Location')]")
	public WebElement campusTxt;

	@FindBy(xpath = "//a[contains(text(),'1.866.514.3924')]")
	public WebElement utilityMblNo;

	@FindBy(xpath = "//div[@id='navbarNavDropdown']")
	public WebElement utilityNavBar;
	
	@FindBy(xpath = "//span[contains(text(),'PROGRAMS')]")
	public WebElement utilityNavBarTxt;

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

	@FindBy(xpath = "//div[@class='footer col-12 p-0']")
	public WebElement footer;

	//div[@class='footer col-12 p-0']
	@FindBy(xpath = "//span[@class='footer-copyright']")
	public WebElement copyRight;

	@FindBy(xpath = "//*[@class='footer col-12']")
	public WebElement footerNavigation;

	@FindBy(xpath = "//*[@class='quote-component__bg m-auto m-md-0']")
	public WebElement quoteComp;

	@FindBy(css="body > div.container-fluid > div > div > div > div.responsivegrid.aem-GridColumn.aem-GridColumn--default--12 > div > div.quote.aem-GridColumn.aem-GridColumn--default--12 > section > div")
	public WebElement quoteComp1;
	
	@FindBy(css="body.dragon-page.global-page.base-page.page.basicpage.dragon-template.mx-auto div.container-fluid:nth-child(1) div.row div.root.responsivegrid.col-md-12 div.aem-Grid.aem-Grid--12.aem-Grid--default--12 div.responsivegrid.aem-GridColumn.aem-GridColumn--default--12 div.aem-Grid.aem-Grid--12.aem-Grid--default--12 div.quote.aem-GridColumn.aem-GridColumn--default--12:nth-child(4) section.quote-component.pt-3.pb-3 div.quote-component__bg.m-auto.m-md-0 div.quote > h4.quote-heading.text-uppercase:nth-child(1)")
	public WebElement quoteTxt;
	
	@FindBy(xpath = "//*[@class='quote']")
	public WebElement quoteTxt1;

	public String VerizonPageLink = "//span[contains(text(),'value')]";

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

	@FindBy(xpath = "//ul[@class='navbar-nav']")
	public WebElement utilityNavBarLinks;

}
