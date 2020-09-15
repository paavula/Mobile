package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLocators {
    // @FindBy(css = ".footer-navigation")
    // @FindBy(xpath="//*[@id='footer-interior']/footer/div[2]")
    @FindBy(xpath = "//*[@class='su-footer text-center text-md-left pt-6 bg-base-black']")
    public WebElement footer;

    public String FooterQuickLink = "//div[@class='row su-footer__intro']//a[contains(text(),'value')]";

    @FindBy(xpath = "//*[text()='Click to Start']")
    public WebElement clicktoStart;

    @FindBy(xpath = "//*[@id='lp_line_0']/div[2]/div")
    public WebElement chatWindow;

    @FindBy(xpath = "//*[@id='req-info']")
    public WebElement footerRibbon;

    @FindBy(css = "#footerForm > div > div > div > div > div.req-info-section__form.col-12.offset-lg-1.col-lg-5 > div")
    public WebElement footerRFI1;

    @FindBy(xpath = "//a[contains(text(),'Site Map')]")
    public WebElement siteMapLink;

    @FindBy(xpath = "//div[contains(@class,'req-info-section__form col-12 offset-lg-1 col-lg-5 prefill-dropdowns')]//div[contains(@class,'inline-form seahawk_inline_relative')]")
    public WebElement footerRFI;

    @FindBy(xpath = "//h4[@class='rfi-heading']")
    public WebElement footerRFItxt;

    @FindBy(css = "#footerForm > div > div > div > div > div.req-info-section__form.col-12.offset-lg-1.col-lg-5 > div > div > div > div > div > form > div:nth-child(1) > h3")
    public String footerRibbonTxt;

    @FindBy(xpath = "//*[@class='list-unstyled social-links pt-3 pt-lg-4 mr-0 mr-lg-3']")
    public WebElement socialfooter;

    @FindBy(xpath = "//*[@id='footer-interior']/footer/div[1]/div/div/span[1]")
    public WebElement socialfootertxt;

    @FindBy(css = "#footer-interior > footer > div.footer-social > div > div > span.footer-social__icons")
    public WebElement socialfootericonstxt;

    @FindBy(css = "#footer-interior > footer > div.footer-social > div > div > span.footer-social__icons")
    public String socialfootericonstxt1;

    public String iconLink = "//a[contains(@href,'value')]";

    @FindBy(xpath = "//*[@id='footer-interior']/footer/div[2]/div/div/div[3]")
    public String copyRightTxt;

    @FindBy(xpath = "//p[@class='su-footer__copyright font-nimbus-sans-light']")
    public WebElement copyRight;

    @FindBy(css = "-facebook")
    public WebElement facebook;

    @FindBy(css = "-twitter")
    public WebElement twitter;

    @FindBy(css = "-youtube")
    public WebElement youtube;

    @FindBy(css = "-pinterest")
    public WebElement pinterest;

    @FindBy(css = "-B")
    public WebElement buzz;

    public String fLink = "value";

    // @FindBy(linkText = "Contact Us")
    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUsLink;

    @FindBy(xpath = "//*[@class='su-footer__logo']")
    public WebElement fLogo;

    @FindBy(css = "#footer-interior > footer > div.footer-social > div > div > span.footer-social__icons")
    public String socialLinksTitle;

    @FindBy(xpath = "//*[@id='footer-interior']/footer/div[1]/div/div/span[1]")
    public WebElement socialLink;

    @FindBy(xpath = "//h6[contains(text(),'Areas of Study')]")
    public WebElement aosLink;

    @FindBy(xpath = "//h6[contains(text(),'Quick Links')]")
    public WebElement quickLink;

    @FindBy(xpath = "//h6[contains(text(),'More')]")
    public WebElement moreLink;
    @FindBy(xpath = "//h6[contains(text(),'Legal')]")
    public WebElement legalLink;

    @FindBy(xpath = "//*[@class='no-bullet list-unstyled nav-node']")
    public WebElement footerLinksModule;

    // div[contains(@class,'row su-footer__intro')]//div[2]

    @FindBy(xpath = "//div[@class='row su-footer__intro']//div[2]")
    public WebElement aosModule;

    @FindBy(xpath = "//div[@class='row su-footer__intro']//div[3]")
    public WebElement quickLinkModule;

    @FindBy(xpath = "//div[@class='row su-footer__intro']//div[4]")
    public WebElement moreLinkModule;

    @FindBy(xpath = "//div[@class='row su-footer__intro']//div[5]")
    public WebElement legalLinkModule;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(1) > .no-bullet.nav-node-i > li:nth-of-type(1) > a[href=\"/campus-locations\"].node-link")
    public WebElement fCampusLocationLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(1) > .no-bullet.nav-node-i > li:nth-of-type(3) > a[href=\"/why-online-learning/honors-program\"].node-link")
    public WebElement fHonorsProgramLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(1) > .no-bullet.nav-node-i > li:nth-of-type(4) > a[href=\"http://commencement.strayer.edu\"].node-link")
    public WebElement fGraduationInformationLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(1) > .no-bullet.nav-node-i > li:nth-of-type(5) > a[href=\"http://alumni.strayer.edu\"].node-link")
    public WebElement fStrayerAlumniLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(1) > .no-bullet.nav-node-i > li:nth-of-type(6) > a[href=\"https://buzz.strayer.edu\"].node-link")
    public WebElement fBuzzBlogLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(1) > .no-bullet.nav-node-i > li:nth-of-type(7) > a[href=\"/scholar\"].node-link")
    public WebElement fScholarMagazineLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(1) > .no-bullet.nav-node-i > li:nth-of-type(8) > a[href=\"/careers\"].node-link")
    public WebElement fCareersatStrayerLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(2) > .no-bullet.nav-node-i > li:nth-of-type(1) > a[href=\"/student-consumer-information\"].node-link")
    public WebElement fStudentConsumerInformationLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(2) > .no-bullet.nav-node-i > li:nth-of-type(2) > a[href=\"/student-consumer-information/campus-safety\"].node-link")
    public WebElement fCampusSafetyLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(1) > .no-bullet.nav-node-i > li:nth-of-type(9) > a[href=\"https://www.capella.edu/\"].node-link")
    public WebElement fCapellaUniversitryLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(2) > .no-bullet.nav-node-i > li:nth-of-type(3) > a[href=\"http://strayer.smartcatalogiq.com/en/2016-2017/Student-Handbook/Non-Discrimination-Statement/Civil-Rights-Compliance\"].node-link")
    public WebElement fTitleIXLink;

    // ---
    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(3) > .no-bullet.nav-node-i > li:nth-of-type(1) > a[href=\"/terms-of-use\"].node-link")
    public WebElement fTermsofUseLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(3) > .no-bullet.nav-node-i > li:nth-of-type(2) > a[href=\"/privacy-policy\"].node-link")
    public WebElement fPrivacyPolicyLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(3) > .no-bullet.nav-node-i > li:nth-of-type(3) > a[href=\"/state-licensure-and-authorization\"].node-link")
    public WebElement fStateLicensureAuthorizationLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(3) > .no-bullet.nav-node-i > li:nth-of-type(4) > a[href=\"/sitemap\"].node-link")
    public WebElement fSiteMapLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(3) > .no-bullet.nav-node-i > li:nth-of-type(5) > a[href=\"/opting-out\"].node-link")
    public WebElement fOptOutLink;

    @FindBy(css = ".navigation > .no-bullet.nav-node > .has-children:nth-of-type(3) > .no-bullet.nav-node-i > li:nth-of-type(6) > a[href=\"/contact-us\"].node-link")
    public WebElement fContactUsLink;

    // ************** FOOTER RFI ******************** //

    @FindBy(xpath = "//*[@id='rfi']/div[1]/select")
    public WebElement selectdegreeLevel;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/div/div[2]/div")
    public WebElement programoptions;

    @FindBy(name = "Degree")
    public WebElement degreeLevel1;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/div/div[1]/div")
    public WebElement degreeLeveloptions;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/div/div[1]/div/ul/li[2]")
    public WebElement degreeLevel;

    // //*[@id='dynamic-dependent-dropdowns']/div[1]/select

    @FindBy(xpath = "//*[@id='rfi']/div[2]/div/div[2]/div/ul/li[2]")
    public WebElement programInterrest;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/select")
    public WebElement programInterrest1;

    @FindBy(xpath = "//*[@id='rfi']/div[3]/div/input")
    public WebElement fName;

    @FindBy(xpath = "//*[@id='rfi']/div[4]/div/input")
    public WebElement lName;

    @FindBy(xpath = "//*[@id='rfi']/div[5]/div/input")
    public WebElement email;

    @FindBy(xpath = "//*[@id='rfi']/div[6]/div/input")
    public WebElement phone;

    @FindBy(xpath = "//form[@id='rfi']//input[@placeholder='ZIP Code']")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@id='rfi']/div[8]/div/input")
    public WebElement no;

    @FindBy(xpath = "//*[@id='rfi']/div[8]/div/input[2]")
    public WebElement yes;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement agreenGobtn;

    @FindBy(xpath = "//form[@id='rfi']//button[@class='btn btn-primary'][contains(text(),'AGREE & GO')]")
    public WebElement agreenGobtnrfi;
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

    @FindBy(xpath = "//form[@id='banner-rfi']")
    public WebElement bannerRFI;

    @FindBy(xpath = "//form[@id='banner-rfi']//h4[@class='heading m-0 pt- pb-'][contains(text(),'REQUEST INFORMATION')]")
    public WebElement bannerRFItxt;

    @FindBy(xpath = "//*[@class='rfi__secondary-heading text-uppercase secondary-heading']")
    public WebElement thnq;

    @FindBy(xpath = "//span[contains(text(),'Chat')]")
    public WebElement ribbonchatnow;

    @FindBy(xpath = "//a[@class='req-info__label-desktop']")
    public WebElement ribbonMobileNo;

    @FindBy(xpath = "//a[@id='scrollToFooterForm']")
    public WebElement ribbonReqInfo;
    // / Banner RFI

    @FindBy(xpath = "//*[@id='rfi']/div[1]/select")
    public WebElement selectdegreeLevelBR;

    @FindBy(xpath = "//*[@id='banner-rfi']/div[2]/div/div[1]/div")
    public WebElement degreeLeveloptionsBR;
    @FindBy(xpath = "//*[@id='banner-rfi']/div[2]/div/div[2]/div")
    public WebElement programoptionsBR;

    @FindBy(xpath = "//*[@id='banner-rfi']/div[2]/div/div[1]/div/ul/li[2]")
    public WebElement degreeLevelBR;

    @FindBy(xpath = "//*[@id='banner-rfi']/div[2]/div/div[2]/div/ul/li[2]")
    public WebElement programInterrestBR;

    @FindBy(xpath = "//*[@id='rfi']/div[2]/select")
    public WebElement programInterrest1BR;

    @FindBy(xpath = "//div[contains(@class,'col-12 col-md-6 form-group')]//input[contains(@placeholder,'First Name')]")
    public WebElement fNameBR;

    @FindBy(xpath = "//div[contains(@class,'col-12 col-md-6 form-group')]//input[contains(@placeholder,'Last Name')]")
    public WebElement lNameBR;

    @FindBy(xpath = "//form[@id='banner-rfi']//input[contains(@placeholder,'Email')]")
    public WebElement emailBR;

    @FindBy(xpath = "//form[@id='banner-rfi']//input[contains(@placeholder,'Phone')]")
    public WebElement phoneBR;

    @FindBy(xpath = "//form[@id='banner-rfi']//input[contains(@placeholder,'ZIP Code')]")
    public WebElement zipcodeBR;

    @FindBy(xpath = "//form[@id='banner-rfi']//button[contains(@class,'btn btn-primary')][contains(text(),'AGREE & GO')]")
    public WebElement agreenGobtnBR;

    @FindBy(xpath = "//h3[@class='heading m-0 pt- pb-']")
    public WebElement bannerRFItxtvbr;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement fNameVBR;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lNameVBR;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailVBR;

    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement phoneVBR;

    @FindBy(xpath = "//*[@name='Zipcode']")
    public WebElement zipcodeVBR;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement agreenGobtnVBR;
}
