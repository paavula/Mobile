package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedInPageLocators {

	@FindBy(xpath = "//section[@class='about-us text-center pt-3 pb-3']")
	public WebElement aboutUsComp;

	@FindBy(xpath = "//div[@class='about-us__logo']//img")
	public WebElement aboutUsLogo;

	@FindBy(xpath = "//h3[@class='font-italic font-weight-normal']")
	public WebElement aboutUsHeader;

	@FindBy(xpath = "//h4[@class='m-0 font-weight-bold']")
	public WebElement aboutUsTitle;

	@FindBy(xpath = "//*[@id='landing-header']/div/div[1]/div[1]/a")
	public WebElement headerLogo;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']")
	public WebElement utilityNavBar;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[2]/a")
	public WebElement tutionCosts;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/a")
	public WebElement flexibility;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/a")
	public WebElement programs;

	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[5]/a")
	public WebElement Aaccreditation;

	@FindBy(xpath = "//*[@id='startHere']")
	public WebElement startHere;

	@FindBy(xpath = "//*[@id='footerLogo']/div[1]")
	public WebElement footerLogo;

	@FindBy(xpath = "//span[contains(text(),'©2020 Strayer University.')]")
	public WebElement copyRight;

	@FindBy(xpath = "//*[@class='footer col-12']")
	public WebElement footerNavigation;

	public String LinkedInPageLink = "//a[contains(text(),'value')]";

	@FindBy(xpath = "//*[@name='FirstName']")
	public WebElement firstName;

	@FindBy(xpath = "//*[@name='LastName']")
	public WebElement lastName;

	@FindBy(xpath = "//*[@name='Email']")
	public WebElement email;

	@FindBy(xpath = "//*[@name='Phone']")
	public WebElement phoneNumber;

	@FindBy(xpath = "//input[@placeholder='ZIP Code* (5 digits)']")
	public WebElement zipCode;

	@FindBy(xpath = "//*[@title='Submit']")
	public WebElement submitBtn;
	@FindBy(xpath = "//ul[@class='text-uppercase footer__list']")
	public WebElement footerLinkModule;

}
