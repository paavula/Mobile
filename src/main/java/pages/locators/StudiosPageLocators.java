package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudiosPageLocators {
	@FindBy(xpath = "//div[@class='banner-cta-timer__content w-100 banner-cta-notimer__content']")
	public  WebElement Banner ;
	
	@FindBy(xpath = "//h3[@class='text-center w-100 banner-cta-timer__content__studio-heading']")
	public  WebElement Bannertxt ;

	
	@FindBy(xpath = "//div[@class='banner--column text-center col-12 st-pt-4 pb-3']")
	public  WebElement BannerLinkModule ;
	
	@FindBy(xpath = "//div[@class='container banner--column__container']//div[1]//div[2]//a[1]//span[1]")
	public  WebElement BannerLink ;
	
	
	@FindBy(xpath = "//a[@title='Home']")
	public WebElement headerLogo;

	@FindBy(xpath = "//div[@class='menu-container open']")
	public WebElement utilityHeader;

	@FindBy(xpath = "//a[@class='is-active'][contains(text(),'About')]")
	public WebElement utilityHelpText;

	@FindBy(xpath = "//*[@id='landing-header']/div/div[1]/div[2]/a")
	public WebElement utilityMblNo;

	
	@FindBy(xpath = "//button[@class='menu-controller']")
	public WebElement menuBtn;
	
	@FindBy(xpath = "//div[@class='menu-container open']")
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

	@FindBy(xpath = "//a[@class='footer-logo']")
	public WebElement footerLogo;

	@FindBy(xpath = "//div[@class='copyright-col footer-grid']")
	public WebElement copyRight;

	@FindBy(xpath = "//*[@class='footer col-12']")
	public WebElement footerNavigation;

	@FindBy(xpath = "//div[@class='responsivegrid aem-GridColumn aem-GridColumn--default--12']//div[3]//section[1]")
	public WebElement quoteComp;
	
	@FindBy(xpath = "//div[3]//section[1]//div[1]")
	public WebElement quoteTxt;
	
	@FindBy(xpath = "//*[@class='quote']")
	public WebElement quoteTxt1;

	public String StudiosPageLink = "//a[contains(text(),'value')]";

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
	
	@FindBy(xpath = "//div[@class='row m-0 footer-main']")
	public WebElement footer;
	@FindBy(xpath = "//div[3]//section[1]//div[1]")
		public WebElement Bannerquote;

}
