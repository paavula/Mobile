package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommencementPageLocators {

	@FindBy(xpath = "//img[@title='Home']")
	public WebElement headerLogo;

	@FindBy(xpath = "//div[@class='utility-block clearfix']")
	public WebElement utilityMenu;

	@FindBy(xpath = "//a[contains(text(),'registration')]")
	public WebElement utilityMenuTxtt;

	@FindBy(xpath = "//div[@class='banner-cta-timer__content w-100 border-blue']")
	public WebElement BannerModule;
	
	@FindBy(xpath = "//h1[@class='banner-overlay__heading text-uppercase']")
	public WebElement BannerTitle;
	
	
	@FindBy(xpath = "//ul[@class='navbar-nav']")
	public WebElement utilityNavBar;

	
	@FindBy(xpath = "//a[@class='footer-logo']")
	public WebElement footerLogo;

	
	
	@FindBy(xpath = "//div[@class='quicklink-col footer-grid']//ul[@class='menu']")
	public WebElement FooterLinkModuler;

	
	@FindBy(xpath = "//div[@class='sociallink-col footer-grid']//ul[@class='menu']")
	public WebElement socialMedia;
	
	@FindBy(xpath = "//span[@class='cta-button-table']")
	public WebElement tblCTA;
	
	@FindBy(xpath = "//h2[@class='text-center deadline-heading']")
	public WebElement txtTbl;
	
	@FindBy(xpath ="//table[@class='alternate-strip-table-wrap table-button']")
	public WebElement table;
	
	
	
	
	
	@FindBy(xpath = "//div[@class='mailing-col footer-grid']")
	public WebElement footerTxt;

	@FindBy(xpath = "//div[@class='container footer-section pt-3 pb-3']")
	public WebElement footerNavigation;

	@FindBy(xpath = "//*[@class='quote-component__bg m-auto m-md-0']")
	public WebElement quoteComp;

	@FindBy(css="body > div.container-fluid > div > div > div > div.responsivegrid.aem-GridColumn.aem-GridColumn--default--12 > div > div.quote.aem-GridColumn.aem-GridColumn--default--12 > section > div")
	public WebElement quoteComp1;
	
	@FindBy(css="body.dragon-page.global-page.base-page.page.basicpage.dragon-template.mx-auto div.container-fluid:nth-child(1) div.row div.root.responsivegrid.col-md-12 div.aem-Grid.aem-Grid--12.aem-Grid--default--12 div.responsivegrid.aem-GridColumn.aem-GridColumn--default--12 div.aem-Grid.aem-Grid--12.aem-Grid--default--12 div.quote.aem-GridColumn.aem-GridColumn--default--12:nth-child(4) section.quote-component.pt-3.pb-3 div.quote-component__bg.m-auto.m-md-0 div.quote > h4.quote-heading.text-uppercase:nth-child(1)")
	public WebElement quoteTxt;
	
	@FindBy(xpath = "//*[@class='quote']")
	public WebElement quoteTxt1;

	public String CommencementPageLink = "//a[contains(text(),'value')]";

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
	
	
	
	@FindBy(xpath = "//*[@name='faculty_first_name']")
	public WebElement fFname;
	
	@FindBy(xpath = "//*[@name='faculty_last_name']")
	public WebElement fLname;
	
	@FindBy(xpath = "//*[@name='field_campus']")
	public WebElement campus;
	
	@FindBy(xpath = "//*[@name='teach_program']")
	public WebElement teachprogram;
	
	@FindBy(xpath = "//*[@name='please_describe_the_reason']")
	public WebElement reason;
	
	@FindBy(xpath = "//*[@name='student_s_first_name']")
	public WebElement sFname;
	
	@FindBy(xpath = "//*[@name='student_s_last_name']")
	public WebElement sLname;
	
	@FindBy(xpath = "//*[@name='student_s_home_campus']")
	public WebElement shomecampus;
	
	@FindBy(xpath = "//*[@name='student_id']")
	public WebElement sId;

	@FindBy(xpath = "//*[@class='error']")
	public WebElement ErrorMessage;
	
	
	@FindBy(xpath = "//*[@id='nominate-a-teacher']")
	public WebElement nominateateacherform;
	
	@FindBy(xpath = "//*[@id='valedictorian-application']")
	public WebElement valedictorianapplicationform;
	
	
	
	
}
