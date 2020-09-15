package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheddarPageLocators {

	@FindBy(xpath = "//div[@class='cheddarStudiosHeader aem-GridColumn aem-GridColumn--default--12']//img[1]")
	public WebElement headerLogo;

	@FindBy(xpath = "//div[@class='top-bar-right']//button[@type='button']")
	public WebElement utilityHeaderbtn;
	
	@FindBy(xpath = "//div[@class='row navigation-area']")
	public WebElement utilityHeader;

	@FindBy(xpath = "//div[@class='field-item']//h3[contains(text(),'Request Info')]")
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

	@FindBy(xpath = "//a[@class='footer-logo']//img")
	public WebElement footerLogo;

	@FindBy(xpath = "	//a[@class='footer-logo']")
	public WebElement footerLogo1;

	
	@FindBy(xpath = "//section[@id='block-footerlink']//ul[@class='menu']")
	public WebElement footerLinkMdoule;
	
	
	@FindBy(xpath = "//div[contains(@class,'copyright-col footer-grid')]")
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

	public String CheddarPageLink = "//a[contains(text(),'value')]";
	@FindBy(xpath = "//div[@class='banner-rfi-microsites pr-0']")
	public WebElement BannerImg;
	@FindBy(xpath = "//span[contains(text(),'Learn More >')]")
	public WebElement BannerLink;
	
	
	
	
	// Form
	
	
	

	@FindBy(xpath = "//form[@id='banner-rfi-microsite']//select[@name='EducationLevel']")
	public WebElement educationoptions;
	
	@FindBy(xpath = "//*[@id='banner-rfi-microsite']/div[8]/div/select/option[2]")
	public WebElement educationoptionsval;
	
	
	@FindBy(xpath = "//form[@id='download-rfi']//select[@name='EducationLevel']")
	public WebElement educationoptionsdf;
	
	@FindBy(xpath = "//*[@id='download-rfi']/div[7]/div/select/option[2]")
	public WebElement educationoptionsvaldf;
	
	
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
	@FindBy(xpath = "//*[@name='Zipcode']")
	public WebElement ZipCode;
	
	
	@FindBy(xpath = "//*[@id='FirstName-error']")
	public WebElement fNameError;
	@FindBy(xpath = "//*[@id='LastName-error']")
	public WebElement lNameError;
	@FindBy(xpath = "//*[@id='Email-error']")
	public WebElement eMailError;
	@FindBy(xpath = "//*[@id='Phone-error']")
	public WebElement phoneError;
	@FindBy(xpath = "//*[@id='Zipcode-error']")
	public WebElement zipeError;
	
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
	@FindBy(xpath = "//button[@type='button']//span[contains(text(),'×')]")
		public WebElement closeBtn;

	@FindBy(xpath = "//div[contains(@class,'footer aem-GridColumn aem-GridColumn--default--12')]")
	public WebElement footer;
	@FindBy(xpath = "//a[@class='download-rfi__rfi-button']")
		public WebElement DwnFrmBtn;
//Download Form

	@FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'First Name')]")
	
	public WebElement dwfName;
	@FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'Last Name')]")
	public WebElement dwlName;

	@FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'Email')]")
	public WebElement dwEmail;
	@FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'Phone')]")
	public WebElement dwPhone;
	@FindBy(xpath = "//form[@id='download-rfi']//input[contains(@placeholder,'ZIP Code')]")
	public WebElement dwZipCode;
	
	@FindBy(xpath = "//button[contains(text(),'Agree & Go')]")
	public WebElement dwAgreenGo;
	
	@FindBy(xpath = "//form[@id='download-rfi']//button[@class='btn btn-primary'][contains(text(),'Agree & Go')]")
	public WebElement cfdwAgreenGo;
	
	
	@FindBy(xpath = "//div[@class='banner-rfi-microsites pr-0']")
	public WebElement mForm;
	
}

