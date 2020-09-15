package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CobraPageLocators {

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

    @FindBy(xpath = "//*[@id='startHere']")
    public WebElement startHere;

    @FindBy(xpath = "//*[@id='footerLogo']/div[1]")
    public WebElement footerLogo;

    @FindBy(xpath = "//span[contains(text(),'©2020 Strayer University.')]")
    public WebElement copyRight;

    @FindBy(xpath = "//*[@class='footer col-12']")
    public WebElement footerNavigation;

    @FindBy(xpath = "//img[@class='video-trigger no-zoom']")
    public WebElement accredation;

    @FindBy(xpath = "//strong[contains(text(),'125+ years of quality higher education')]")
    public WebElement accredationtxt;

    @FindBy(xpath = "//div[@class='accreditation-section parbase aem-GridColumn aem-GridColumn--default--12']")
    public WebElement accredationImgmodule;

    @FindBy(xpath = "//div[contains(@class,'containerComponent aem-GridColumn aem-GridColumn--default--8')]//div[contains(@class,'justify-content-md-start')]//div[1]")
    public WebElement accredationImg;

    @FindBy(xpath = "//strong[contains(text(),'Strayer University Accreditation')]")
    public WebElement accwndtxt;

    @FindBy(xpath = "//div[@id='carouselModal']//span[contains(@class,'icon-close')]")
    public WebElement accwndcloselnk;

    public String cobraPageLink = "//a[contains(text(),'value')]";

    @FindBy(xpath = "//*[@class='row clearfix']")
    public WebElement tabComponentModule;

    @FindBy(xpath = "//*[contains(text(),'MASTER')]")
    public WebElement mastersTab;

    @FindBy(xpath = "//*[contains(text(),'BACHELOR')]")
    public WebElement bacheloresTab;

    @FindBy(xpath = "//*[contains(text(),'MBA')]")
    public WebElement mbaTab;

    @FindBy(xpath = "//*[contains(text(),'ASSOCIATE')]")
    public WebElement associatesTab;

    @FindBy(xpath = "//*[@id='pills-tab-content-0']")
    public WebElement mastersqucikView;

    @FindBy(xpath = "//*[@id='pills-tab-content-1']")
    public WebElement bacheloresqucikView;

    @FindBy(xpath = "//*[@id='pills-tab-content-2']")
    public WebElement associatesqucikView;

    @FindBy(xpath = "//*[@id='pills-tab-content-3']")
    public WebElement certificatesqucikView;

    // ******************* SHORT FORM

    @FindBy(xpath = "//*[@id='shortform-rfi']/div[1]/div/div[1]")
    public WebElement selectdegreeLevelBR;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Degree')]")
    public WebElement degreeLeveloptionsBR;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Program')]")
    public WebElement programoptionsBR;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Degree')]//option[contains(text(),'MBA')]")
    public WebElement degreeLevelBR;

    // @FindBy(xpath =
    // "//*[@id='shortform-rfi']/div[1]/div/div[2]/select/option[3]")
    @FindBy(css = " #shortform-rfi > div:nth-child(1) > div > div:nth-child(2) > select > option:nth-child(3)")
    public WebElement programInterrestBR;

    // ***********************************************
    @FindBy(xpath = "//input[@placeholder='First Name*']")
    public WebElement fNamesf;
    @FindBy(xpath = "//input[@placeholder='Last Name*']")
    public WebElement lNamesf;
    @FindBy(xpath = "//input[@placeholder='Street Address*']")
    public WebElement addresssf;
    @FindBy(xpath = "//input[@placeholder='Email Address*']")
    public WebElement emailsf;
    @FindBy(xpath = "//input[@placeholder='ZIP Code* (5 digits)']")
    public WebElement zipCodesf;

    @FindBy(xpath = "//select[@name='Degree']")
    public WebElement degreeLevelsf;
    @FindBy(xpath = "//select[@name='Degree']//option[contains(text(),'MBA')]")
    public WebElement degreeLevelOptionssf;

    @FindBy(xpath = "//select[@name='Program']")
    public WebElement programsf;
    @FindBy(xpath = "//option[contains(text(),'Business Administration')]")
    public WebElement programOptionssf;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement submitBtnsf;

    // ****************************************************

    @FindBy(xpath = "//*[@id='rfi']/div[2]/select")
    public WebElement programInterrest1BR;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//form[@id='longform-rfi']")
    public WebElement lognForm;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[@placeholder='First Name*']")
    public WebElement fName;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@placeholder,'Last Name*')]")
    public WebElement lName;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@placeholder,'Street Address*')]")
    public WebElement address;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@placeholder,'Email Address*')]")
    public WebElement email;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@placeholder,'Daytime Phone* (10 digits)')]")
    public WebElement phoneNumber;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@placeholder,'ZIP Code* (5 digits)')]")
    public WebElement zipCode;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//input[contains(@placeholder,'ZIP Code* (5 digits)')]")
    public WebElement zipCode1;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'EducationLevel')]")
    public WebElement educationLevel;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//option[contains(text(),'Some post graduate')]")
    public WebElement educationLevelOptions;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Degree')]")
    public WebElement degreeLevel;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//div[contains(@class,'dropdown-wrapper-strayer dynamic-dependent-dropdowns')]//option[contains(text(),'Certificates')]")
    public WebElement degreeLevelOptions;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//select[contains(@name,'Program')]")
    public WebElement program;
    @FindBy(xpath = "//option[contains(text(),'Digital Entrepreneurship')]")
    public WebElement programOptions;
    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//button[contains(@class,'btn btn-primary')][contains(text(),'Agree & Go')]")
    public WebElement submitBtn;

    @FindBy(xpath = "//section[contains(@class,'visible-desktop')]//div//button[@class='btn btn-primary'][contains(text(),'AGREE & GO')]")
    public WebElement AgreeBtn;

    @FindBy(xpath = "//a[contains(text(),'Accreditation Details')]")
    public WebElement accredationlink;

    @FindBy(xpath = "//div[contains(@class,'shortform aem-GridColumn aem-GridColumn--default--12')]//section[contains(@class,'visible-desktop')]")
    public WebElement shortform;

    public String disclamierLink = "//*[contains(text(),'value')]";

    public String disclamierWindow = "//div[@id='value']//div[@class='modal-body embed-container-wrapper']";

    public String disclamierCloseLink = "//div[@id='value']//span[@class='icon-close']";

    public String videorLink = "//*[contains(@class,'modal-plugin')][contains(text(),'value')]";

    public String videoWindow = "//div[@id='value']//div[@class='modal-body embed-container-wrapper']";

    public String videoCloseLink = "//div[@id='value']//span[@class='icon-close']";

    @FindBy(xpath = "//div[@id='laptop-disclaimer']//div[@class='modal-body embed-container-wrapper']")
    public WebElement laptopdisclamier;

    @FindBy(xpath = "//div[@id='laptop-disclaimer']//span[@class='icon-close']")
    public WebElement laptopdisclamierCloseBtn;

    @FindBy(xpath = "//div[@id='gradfund']//div[@class='modal-body embed-container-wrapper']")
    public WebElement gradfunddisclamier;

    @FindBy(xpath = "//div[@id='gradfund']//span[@class='icon-close']")
    public WebElement gradfunddisclamierCloseBtn;

    @FindBy(xpath = "//div[@id='transfer-credit-rtb']//div[@class='modal-body embed-container-wrapper']")
    public WebElement transfercreditisdisclamier;

    @FindBy(xpath = "//div[@id='transfer-credit-rtb']//span[@class='icon-close']]")
    public WebElement transfercreditisclamierCloseBtn;

    @FindBy(xpath = "//*[contains(@class,'nav nav-tabs justify-content-center')]")
    public WebElement accordionModule;

    @FindBy(xpath = "//div[@class='tab-pane parsys-wrapper active show']")
    public WebElement accordionActiveTab;
    public String accordionModuleLink = "//div[contains(@class,'list-group-item-center')]//h3[contains(text(),'value')]";
    public String tabModuleLink = "//h2[contains(text(),'value')]";
    public String accordionModuleText = "//*[contains(text(), 'value')]";

}
