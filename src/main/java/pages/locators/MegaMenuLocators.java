package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MegaMenuLocators {

    @FindBy(xpath = "//*[text()='MEET STUDENT SERVICE COACH TANIKA FEASTER']")
    public WebElement tilteTxtHeader;

    @FindBy(xpath = "//html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/p[1]")
    public WebElement tilteTxt;

    @FindBy(xpath = "//img[@alt='MEET STUDENT SERVICE COACH TANIKA FEASTER']")
    public WebElement tilteImage;

    @FindBy(xpath = "*//*[@id='footer-interior']/footer/div[1]/div/div/span[1]")
    public WebElement socialLink;

    @FindBy(xpath = "//*[@class='row align-items-center']")
    public WebElement homeBanner;

    @FindBy(xpath = "//h1[contains(@class,'su-primary-hero__heading font-nimbus-sans-bold')]")
    public WebElement homeBannertxt;

    @FindBy(xpath = "//*[@id='component-1']/div/div/div/div/ul/li[1]/a")
    public WebElement bannerCampus;

    @FindBy(xpath = "//*[@id='component-1']/div/div/div/div/ul/li[1]/a")
    public WebElement bannerProgram;

    @FindBy(xpath = "//*[@id='component-1']/div/div/div/div/ul/li[1]/a")
    public WebElement bannerFund;

    @FindBy(xpath = "//*[@id=\"component-1\"]/div/div[1]/div/div/h1/span]")
    public WebElement mbaPageTitle;

    @FindBy(xpath = "//a[@class='navbar-brand']//img[@class='img-fluid']")
    public WebElement logo;

    @FindBy(xpath = "//*[@class='img-fluid']")
    public WebElement Hlogo;

    @FindBy(xpath = "//a[@href='/online-degrees/accounting']")
    public WebElement accountingLink;

    @FindBy(xpath = "//a[@href='/online-degrees/business']")
    public WebElement businessFinanceLink;

    @FindBy(xpath = "//a[@href='/online-degrees/criminal-justice']")
    public WebElement criminalJusticeLink;

    @FindBy(xpath = "//a[@href='/online-degrees/education']")
    public WebElement educationTrainingLink;

    @FindBy(xpath = "//a[contains(text(), 'Entrepreneurship MBA')]")
    public WebElement enraMBALink;

    @FindBy(xpath = "//a[@href='/online-degrees/health-services-administration']")
    public WebElement healthServiceAdministrationLink;

    @FindBy(xpath = "//a[@href='/online-degrees/information-technology']")
    public WebElement informationTechnologyLink;

    @FindBy(xpath = "//a[contains(text(), 'Leadership & Management MBA')]")
    public WebElement leadershipMBALink;

    @FindBy(xpath = "//a[@href='/online-degrees/performance-management']")
    public WebElement performanceManagementLink;

    @FindBy(xpath = "//ul[@class='navbar-nav nav mr-auto nav-responsive text-base-black']")
    public WebElement navigationBar;

    /** This variable is for degNProgLinkElement. */
    @FindBy(xpath = "//a[contains(text(), 'Degrees')]")
    public WebElement degreeLinkElement;

    /** This variable is for degNProgLinkElement. */
    @FindBy(xpath = "//a[contains(@class,'nav-link dropdown-toggle d-flex d-xl-block tag-navigation-link')]")
    public WebElement acdProgrmaLinkElement;

    /** This variable is for Student Exp Link. */
    @FindBy(xpath = "//a[contains(text(), 'Student Experience')]")
    public WebElement studentExpLinkElement;

    /** This variable is for capellaExpMenuElement. */
    @FindBy(xpath = "//a[contains(text(),'Admissions')]")
    public WebElement admissionsLinkElement;

    @FindBy(xpath = "//a[@href='/online-degrees/mba']")
    public WebElement mBA;

    /** This variable is for capellaExpMenuElement. */
    @FindBy(xpath = "//a[contains(@href, '/online-degrees/masters')]")
    public WebElement mdegreeLinkElement;

    @FindBy(xpath = "//a[contains(@href, '/online-degrees/bachelors')]")
    public WebElement bdegreeLinkElement;

    @FindBy(xpath = "//a[contains(@href, '/online-degrees/associate')]")
    public WebElement adegreeLinkElement;

    @FindBy(xpath = "//a[contains(@href, '/online-degrees/certificates')]")
    public WebElement cetificateLinkElement;

    @FindBy(xpath = "//a[contains(@href, '/online-college-courses')]")
    public WebElement cctalogLinkElement;

    /** This variable is for financingLinkElement. */
    @FindBy(xpath = "//a[contains(text(), 'Tuition & Aid')]")
    public WebElement tutionfinancialLinkElement;

    /** This variable is for flexPathLinkElement. */
    @FindBy(xpath = "//a[contains(text(), 'Why Strayer')]")
    public WebElement whyStrayerLinkElement;

    /** This variable is for Ask a Question Link. */
    @FindBy(linkText = "ASK A QUESTION")
    public WebElement askaQuestionElement;

    /** This variable is for Schedule Consultation Element. */
    @FindBy(linkText = "Schedule Consultation")
    public WebElement scheduleConsultationLinkElement;

    /** This variable is for Form Element. */
    // @FindBy(css=".form-wrapper")
    @FindBy(xpath = "/html/body/div[15]/div/div/div[2]/div")
    public WebElement scheduleConsultationFormElement;

    /** This variable is for Degree Element. */
    @FindBy(css = ".degreeDropdown")
    public WebElement degreeFormElement;

    // public String DegreesMenusLink = "//a[contains(@href,'/value')]";
    public String degreesMenusLink = "//a[contains(text(),'value')]";

    public String button = "//a/span[contains(text(),'value')]";

    @FindBy(xpath = "//*[@class='dropdown-menu shadow level-5']")
    public WebElement subChildLinksModule;

    @FindBy(xpath = "//*[@id='navbarContent']/ul[1]/li[3]/ul")
    public WebElement acdProgChildLinksModule;

    @FindBy(xpath = "//*[@id='navbarContent']/ul[1]/li[4]/ul")
    public WebElement admissionChildLinksModule;

    @FindBy(xpath = "//*[@id='navbarContent']/ul[1]/li[3]/ul")
    public WebElement tutionChildLinksModule;

    @FindBy(xpath = "//*[@id='navbarContent']/ul[1]/li[3]/ul")
    public WebElement studentExpChildLinksModule;

    public String degreesMenusLinkHeaderText = "//div[contains(@class,'primary')]/h1";

    public String tabLink = "//*[contains(@id,'value')]";

    @FindBy(xpath = "//*[@id='pills-tab']")
    public WebElement tabComponent;

    // public String FooterQuickLink =
    // "//a[contains(@class,'col-sm-4')][contains(text(),'value')]

    public String FooterQuickLink = "//div[@class='row su-footer__intro']//a[contains(text(),'value')]";

}
