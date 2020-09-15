package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VCMegaMenuLocators {

    public String MenuLinks = "//a[contains(text(),'value')]";
    public String Button = "//button[contains(text(),'value')]";
    public String FooterLinks = "//a[@class='nav-link font-small pl-0'][contains(text(),'value')]";

    @FindBy(xpath = "//ul[@class='navbar-nav navbar-responsive ml-auto']")
    public WebElement navigationBar;

    @FindBy(xpath = "//div[contains(text(),'Degrees + Programs')]")
    public WebElement degreeAndProgramLink;

    @FindBy(xpath = "//*[@id='VcHeader']/div/ul[1]/li[1]/div")
    public WebElement degreeAndProgramLinkModule;

    public String dnpLeftLinks = "//a[contains(@href,'#value')]";

    public String dnpLeftLinkChildModule = "//*[@id='value']";

    @FindBy(xpath = "//ul[@class='nav nav-pills flex-column hidden-md-down']")
    public WebElement leftLinkTrail;

    @FindBy(xpath = "//*[@id='doctoraldegrees']")
    public WebElement doctoraldegreesLinkModule;

    @FindBy(xpath = "//*[@id='mastersdegrees']")
    public WebElement mastersdegreesLinkModule;

    @FindBy(xpath = "//*[@id='bachelorsdegrees']")
    public WebElement bachelorsdegreesLinkModule;

    @FindBy(xpath = "//*[@id='certificates']")
    public WebElement certificatesLinkModule;

    @FindBy(xpath = "//*[@id='individualcourses']")
    public WebElement dindividualcoursesLinkModule;

    @FindBy(xpath = "//div[contains(text(),'Capella Experience')]")
    public WebElement capellaExpLink;

    @FindBy(xpath = "//*[@id='VcHeader']/div/ul[1]/li[2]/div")
    public WebElement capellaExpLinkModule;

    @FindBy(xpath = "//div[contains(text(),'Financing')]")
    public WebElement financingLink;

    @FindBy(xpath = "//*[@id='VcHeader']/div/ul[1]/li[3]/div")
    public WebElement financingLinkModule;

    @FindBy(xpath = "//div[contains(text(),'Apply')]")
    public WebElement applyLink;

    @FindBy(xpath = "//*[@id='VcHeader']/div/ul[1]/li[4]/div")
    public WebElement applyLinkModule;

    public String FooterQuickLink = "//div[@class='col-sm-4']//a[contains(text(),'value')]";

    @FindBy(xpath = "//*[@id='VcFooter']")
    public WebElement VcFooterModule;

    @FindBy(xpath = "//*[@id='collapsedegrees']")
    public WebElement FooterAosModule;

    @FindBy(xpath = "//*[@id='collapsecurrentLearners']")
    public WebElement FooterAboutUsModule;

    @FindBy(xpath = "//*[@id='collapsepartnerTeams']")
    public WebElement FooterCResultModule;

    @FindBy(xpath = "//*[@id='collapsecapellaCommunity']")
    public WebElement FooterInfoModule;

    @FindBy(xpath = "//ul[@class='list-inline font-small clearfix d-flex justify-content-lg-end flex-wrap']")
    public WebElement FooterLinksModule;

    @FindBy(xpath = "//a[contains(text(),'AREAS OF STUDY')]")
    public WebElement aosLink;

    @FindBy(xpath = "//a[contains(text(),'ABOUT US')]")
    public WebElement aboutsLink;

    @FindBy(xpath = "//a[contains(text(),'CAPELLA RESULTS')]")
    public WebElement capellResultLink;

    @FindBy(xpath = "//a[contains(text(),'INFORMATION FOR')]")
    public WebElement informationLink;

    @FindBy(xpath = "//span[contains(text(),'Get More Information')]")
    public WebElement getInfoModule;

    @FindBy(xpath = "//span[contains(text(),'Get more information')]")
    public WebElement getInfoModule1;

    @FindBy(xpath = "//span[contains(text(),'Get the details')]")
    public WebElement getDetailModule;

    @FindBy(xpath = "//div[@class='col-12 col-lg-5 text-center text-md-left']")
    public WebElement readyForNextModule;

    @FindBy(xpath = "//form[@id='ConsultationForm']")
    public WebElement RfiForm;

    @FindBy(xpath = "//a[contains(text(),'Request Program Details')]")
    public WebElement RFILink;

    @FindBy(xpath = "//form[@id='BachelorRequestForm']")
    public WebElement PMLPForm;

    public String culpjumplink = "//a[contains(@href,'value')]";
    public String culpjumplinkmodule = "//div[contains(@class,'value')]";
    public String culputilityNavLink = "//li[contains(@class,'d-inline-block')]//a[contains(@class,'pmlp-redesign-analytics')][contains(text(),'value')]";

    @FindBy(xpath = "//div[contains(@class,'jumplinks-label-group col-12 px-0')]")
    public WebElement culpjumplinknav;

    @FindBy(xpath = "//div[contains(@class,'d-none d-md-block navigation-section text-md-right text-lg-right')]")
    public WebElement culpjumpUtilitynav;

    @FindBy(xpath = "//*[@id='footerInfo']")
    public WebElement culpFooter;

    @FindBy(xpath = "//*[@class='row text-delta-medium text-capitalize font-lato-regular px-0 px-lg-2 flex-row-reverse']")
    public WebElement culpAccessFooter;

    @FindBy(xpath = "//*[@class='footer-links pl-0 mb-0']")
    public WebElement culpFooterModule;

    public String culpfooterlink = "//*[@class='footer-links pl-0 mb-0']//a[contains(text(),'value')]";

    @FindBy(xpath = " //*[@class='d-none d-md-block col-md-4 col-lg-3']")
    public WebElement culpTabsModule;

    public String culpTabsrlink = "//*[@class='nav-link pmlp-redesign-analytics ' and contains(text(), 'value')] ";
    public String culpAccrodionBtn = "//button[contains(text(),'value')] ";
    public String culpaccordionModuleText = "//li[contains(text(),'value')]";
}
