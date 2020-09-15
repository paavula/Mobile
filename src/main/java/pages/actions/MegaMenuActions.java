package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import pages.locators.MegaMenuLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class MegaMenuActions extends BasePage<Object> {

    MegaMenuLocators megamenuLocators = null;

    public MegaMenuActions() {
	this.megamenuLocators = new MegaMenuLocators();
	PageFactory.initElements(DriverManager.getDriver(), megamenuLocators);
    }

    public void moveToMenu(WebElement ele) {
	Actions action = new Actions(DriverManager.getDriver());
	action.moveToElement(ele).perform();
    }

    @SuppressWarnings("rawtypes")
	@Override
    public ExpectedCondition getPageLoadCondition() {

	return null;
    }

    public void open_SA_Application() {
	navigateToURL(ProjectVariables.SU_URL);

    }

    public void open_SA_Error_Application() {
	navigateToURL(ProjectVariables.Error_URL);

    }

    public void open_Degree_Application() {
	navigateToURL(ProjectVariables.Degrees_URL);

    }

    public void open_SA_Application_CP() {
	navigateToURL(ProjectVariables.CPage_URL);

    }

    public void movetoNavBar() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);

	highlightElement(megamenuLocators.navigationBar);
	moveToMenu(megamenuLocators.navigationBar);

    }

    /*** This method is for clickDegrees */
    public void clickAcdPrograms() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);

	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.acdProgrmaLinkElement, 2);

	highlightElement(megamenuLocators.acdProgrmaLinkElement);
	moveToMenu(megamenuLocators.acdProgrmaLinkElement);

    }

    public void clickstudentExp() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);

	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.studentExpLinkElement, 2);

	highlightElement(megamenuLocators.studentExpLinkElement);
	moveToMenu(megamenuLocators.studentExpLinkElement);

    }

    public void clickAcdProgChildLinks() {
	megamenuLocators.acdProgrmaLinkElement.click();
	waitForElementToVisible(megamenuLocators.acdProgChildLinksModule, 5);
	moveToMenu(megamenuLocators.acdProgChildLinksModule);

    }

    public void movetoSubmenu() {

	waitForElementToVisible(megamenuLocators.subChildLinksModule, 5);
	moveToMenu(megamenuLocators.subChildLinksModule);
	highlightElement(megamenuLocators.subChildLinksModule);
    }

    /*** This method is for ClickMBALink */
    public void clickMbaLink() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);

	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.mBA, 5);

	moveToMenu(megamenuLocators.mBA);
	megamenuLocators.mBA.click();
    }

    /*** This method is for getTxtMbaPage. */
    public String getTxtMbaPage() {

	waitForElementToVisible(megamenuLocators.mBA, 2);

	moveToMenu(megamenuLocators.mBA);
	return DriverManager.driver.get().getTitle();
    }

    /*** This method is for ClickMBALink */
    public void clickMDegreeLink() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);

	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.mdegreeLinkElement, 5);

	moveToMenu(megamenuLocators.mdegreeLinkElement);
	megamenuLocators.mdegreeLinkElement.click();
    }

    /*** This method is for getTxtDegrees Menu text. */
    public String getTxtMDegreePage() {
	waitForElementToVisible(megamenuLocators.mdegreeLinkElement, 2);

	moveToMenu(megamenuLocators.mdegreeLinkElement);
	return DriverManager.driver.get().getTitle();
    }

    /*** This method is for getTxtDegrees Menu text. */
    public String getTxtAccdProgLInk() {
	waitForElementToVisible(megamenuLocators.acdProgrmaLinkElement, 2);

	moveToMenu(megamenuLocators.acdProgrmaLinkElement);
	return megamenuLocators.acdProgrmaLinkElement.getText();
    }

    /*** This method is for clickAdmissionsLink. */
    public void clickStrayerAdm() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);
	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.admissionsLinkElement, 5);
	moveToMenu(megamenuLocators.admissionsLinkElement);
	highlightElement(megamenuLocators.admissionsLinkElement);
    }

    /*** This method is for getTxtAdmissions Menu text. */
    public String getTxtStrayerAdm() {

	waitForElementToVisible(megamenuLocators.navigationBar, 2);
	highlightElement(megamenuLocators.navigationBar);

	waitForElementToVisible(megamenuLocators.admissionsLinkElement, 5);

	moveToMenu(megamenuLocators.admissionsLinkElement);
	return megamenuLocators.admissionsLinkElement.getText();
    }

    /*** This method is for clickTutionFinancialLink. */
    public void clickFinancialLinkElement() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);
	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.tutionfinancialLinkElement, 2);
	highlightElement(megamenuLocators.tutionfinancialLinkElement);
	moveToMenu(megamenuLocators.tutionfinancialLinkElement);

    }

    /*** This method is for getTxtTutionFinancialLink Menu text. */
    public String getTxtFinancialLink() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);

	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.tutionfinancialLinkElement, 2);

	moveToMenu(megamenuLocators.tutionfinancialLinkElement);
	return megamenuLocators.tutionfinancialLinkElement.getText();
    }

    /*** This method is for clickWhySTrayer. */
    public void clickWhyStrayer() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);

	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.whyStrayerLinkElement, 2);

	highlightElement(megamenuLocators.whyStrayerLinkElement);
	moveToMenu(megamenuLocators.whyStrayerLinkElement);
    }

    /*** This method is for getTxtWhyStrayerLink Menu text. */
    public String getTxtWhyStrayerLink() {
	waitForElementToVisible(megamenuLocators.navigationBar, 2);
	highlightElement(megamenuLocators.navigationBar);
	waitForElementToVisible(megamenuLocators.studentExpLinkElement, 2);
	moveToMenu(megamenuLocators.studentExpLinkElement);
	return megamenuLocators.studentExpLinkElement.getText();
    }

    /*** This method is for ClickMBALink */
    public void clickBDegreeLink() {
	waitForElementToVisible(megamenuLocators.bdegreeLinkElement, 5);

	moveToMenu(megamenuLocators.bdegreeLinkElement);
	megamenuLocators.bdegreeLinkElement.click();
    }

    /*** This method is for getTxtDegrees Menu text. */
    public String getTxtBDegreePage() {
	waitForElementToVisible(megamenuLocators.bdegreeLinkElement, 2);

	moveToMenu(megamenuLocators.bdegreeLinkElement);
	return DriverManager.driver.get().getTitle();
    }

    public void clickCertificatesLink() {
	waitForElementToVisible(megamenuLocators.cetificateLinkElement, 5);

	moveToMenu(megamenuLocators.cetificateLinkElement);
	megamenuLocators.cetificateLinkElement.click();

    }

    /*** This method is for getTxtDegrees Menu text. */
    public String getTxtCertificatePage() {
	waitForElementToVisible(megamenuLocators.cetificateLinkElement, 2);

	moveToMenu(megamenuLocators.cetificateLinkElement);
	return DriverManager.driver.get().getTitle();

    }

    public void clickCcatlogLink() {
	waitForElementToVisible(megamenuLocators.cctalogLinkElement, 5);

	moveToMenu(megamenuLocators.cctalogLinkElement);
	megamenuLocators.cctalogLinkElement.click();

    }

    /*** This method is for getTxtDegrees Menu text. */
    public String getTxtCcatlogPage() {
	waitForElementToVisible(megamenuLocators.cctalogLinkElement, 2);

	moveToMenu(megamenuLocators.cctalogLinkElement);
	return DriverManager.driver.get().getTitle();
    }

    public void clickAccountingLink() {
	waitForElementToVisible(megamenuLocators.accountingLink, 5);

	moveToMenu(megamenuLocators.accountingLink);
	megamenuLocators.accountingLink.click();

    }

    /*** This method is for getTxtDegrees Menu text. */
    public String getTxtAccountingPage() {
	waitForElementToVisible(megamenuLocators.accountingLink, 2);

	moveToMenu(megamenuLocators.accountingLink);
	return DriverManager.driver.get().getTitle();
    }

    public void clickBusinessFinanceLink() {
	waitForElementToVisible(megamenuLocators.businessFinanceLink, 5);

	moveToMenu(megamenuLocators.businessFinanceLink);
	megamenuLocators.businessFinanceLink.click();

    }

    /*** This method is for getTxtDegrees Menu text. */
    public String getTxtBusinessFinancePage() {
	waitForElementToVisible(megamenuLocators.businessFinanceLink, 2);

	moveToMenu(megamenuLocators.businessFinanceLink);
	return DriverManager.driver.get().getTitle();
    }

    public void clickLogo() {
	waitForElementToVisible(megamenuLocators.logo, 2);
	highlightElement(megamenuLocators.logo);
	megamenuLocators.logo.click();
    }

    public void clickHeaderLogo() {
	waitForElementToVisible(megamenuLocators.Hlogo, 2);
	highlightElement(megamenuLocators.Hlogo);
	megamenuLocators.Hlogo.click();
    }

    public String getTxtPerformanceManagementPage() {
	waitForElementToVisible(megamenuLocators.performanceManagementLink, 2);

	moveToMenu(megamenuLocators.performanceManagementLink);
	return DriverManager.driver.get().getTitle();
    }

    public void clickPerformanceManagementLink() {
	waitForElementToVisible(megamenuLocators.performanceManagementLink, 5);

	moveToMenu(megamenuLocators.performanceManagementLink);
	megamenuLocators.performanceManagementLink.click();

    }

    public String getTxtLeadershipManagementMBAPage() {
	waitForElementToVisible(megamenuLocators.leadershipMBALink, 5);

	moveToMenu(megamenuLocators.leadershipMBALink);
	return SwitchTab();
    }

    public void clickLeadershipManagementMBALink() {
	waitForElementToVisible(megamenuLocators.leadershipMBALink, 2);

	moveToMenu(megamenuLocators.leadershipMBALink);
	megamenuLocators.leadershipMBALink.click();

    }

    public String getTxtInformationTechnologyPage() {
	waitForElementToVisible(megamenuLocators.informationTechnologyLink, 2);

	moveToMenu(megamenuLocators.informationTechnologyLink);
	return DriverManager.driver.get().getTitle();
    }

    public void clickInformationTechnologyLink() {
	waitForElementToVisible(megamenuLocators.informationTechnologyLink, 5);

	moveToMenu(megamenuLocators.informationTechnologyLink);
	megamenuLocators.informationTechnologyLink.click();

    }

    public String getTxtHealthServicesAdministrationPage() {
	waitForElementToVisible(megamenuLocators.healthServiceAdministrationLink, 2);

	moveToMenu(megamenuLocators.healthServiceAdministrationLink);
	return DriverManager.driver.get().getTitle();
    }

    public void clickHealthServicesAdministrationLink() {
	waitForElementToVisible(megamenuLocators.healthServiceAdministrationLink, 5);

	moveToMenu(megamenuLocators.healthServiceAdministrationLink);
	megamenuLocators.healthServiceAdministrationLink.click();

    }

    public String getTxtEntrepreneurshipMBAPage() {
	waitForElementToVisible(megamenuLocators.enraMBALink, 5);

	moveToMenu(megamenuLocators.enraMBALink);
	return SwitchTab();
    }

    public void clickEntrepreneurshipMBALink() {
	waitForElementToVisible(megamenuLocators.enraMBALink, 5);

	moveToMenu(megamenuLocators.enraMBALink);
	megamenuLocators.enraMBALink.click();

    }

    public String getTxtEducationTrainingPage() {
	waitForElementToVisible(megamenuLocators.educationTrainingLink, 2);

	moveToMenu(megamenuLocators.educationTrainingLink);
	return DriverManager.driver.get().getTitle();
    }

    public void clickEducationTrainingLink() {
	waitForElementToVisible(megamenuLocators.educationTrainingLink, 5);

	moveToMenu(megamenuLocators.educationTrainingLink);
	megamenuLocators.educationTrainingLink.click();

    }

    public String getTxtCriminalJusticePage() {
	waitForElementToVisible(megamenuLocators.criminalJusticeLink, 2);

	moveToMenu(megamenuLocators.criminalJusticeLink);
	return DriverManager.driver.get().getTitle();
    }

    public void clickCriminalJusticeLink() {
	waitForElementToVisible(megamenuLocators.criminalJusticeLink, 5);

	moveToMenu(megamenuLocators.criminalJusticeLink);
	megamenuLocators.criminalJusticeLink.click();

    }

    public void movetoHomeBanner() {
	waitForElementToVisible(megamenuLocators.homeBanner, 2);
	highlightElement(megamenuLocators.homeBanner);
	moveToMenu(megamenuLocators.homeBanner);

    }

    public void clickBannerCampusLink() {
	waitForElementToVisible(megamenuLocators.bannerCampus, 5);

	moveToMenu(megamenuLocators.bannerCampus);
	highlightElement(megamenuLocators.bannerCampus);
	megamenuLocators.bannerCampus.click();

    }

    public void clickBannerProgramLink() {
	waitForElementToVisible(megamenuLocators.bannerProgram, 5);

	moveToMenu(megamenuLocators.bannerProgram);
	highlightElement(megamenuLocators.bannerProgram);
	megamenuLocators.bannerProgram.click();

    }

    public void clickBannerFundLink() {
	waitForElementToVisible(megamenuLocators.bannerFund, 5);

	moveToMenu(megamenuLocators.bannerFund);
	highlightElement(megamenuLocators.bannerFund);
	megamenuLocators.bannerFund.click();

    }

    public String getTxtHomeBanner() {
	waitForElementToVisible(megamenuLocators.homeBannertxt, 2);
	highlightElement(megamenuLocators.homeBannertxt);
	return megamenuLocators.homeBannertxt.getText();
    }

    public String getTxtpage() {
	DriverManager.driver.get().manage().window().maximize();
	return DriverManager.driver.get().getTitle();
    }

    public String getTxtDegreesChildLinks() {
	waitForElementToVisible(megamenuLocators.acdProgChildLinksModule, 5);

	moveToMenu(megamenuLocators.acdProgChildLinksModule);
	highlightElement(megamenuLocators.acdProgChildLinksModule);
	return megamenuLocators.acdProgChildLinksModule.getText();
    }

    public void clickAdmisionsChildLinks() {

	megamenuLocators.admissionsLinkElement.click();
	waitForElementToVisible(megamenuLocators.admissionChildLinksModule, 2);
	moveToMenu(megamenuLocators.admissionChildLinksModule);
    }

    public String getTxtAdmisionsChildLinks() {

	waitForElementToVisible(megamenuLocators.admissionChildLinksModule, 5);
	moveToMenu(megamenuLocators.admissionChildLinksModule);
	return megamenuLocators.admissionChildLinksModule.getText();
    }

    public void clickTutionsChildLinks() {
	megamenuLocators.tutionfinancialLinkElement.click();
	waitForElementToVisible(megamenuLocators.tutionChildLinksModule, 2);
	moveToMenu(megamenuLocators.tutionChildLinksModule);
	// highlightElement(megamenuLocators.tutionChildLinksModule);

    }

    public String getTxtTutionsChildLinks() {

	waitForElementToVisible(megamenuLocators.tutionChildLinksModule, 5);
	moveToMenu(megamenuLocators.tutionChildLinksModule);
	return megamenuLocators.tutionChildLinksModule.getText();
    }

    public void clickStudentExpChildLinks() {
	megamenuLocators.studentExpLinkElement.click();
	waitForElementToVisible(megamenuLocators.studentExpChildLinksModule, 2);
//highlightElement(megamenuLocators.studentExpChildLinksModule);
	moveToMenu(megamenuLocators.studentExpChildLinksModule);
	// highlightElement(megamenuLocators.whyStrayerChildLinksModule);

    }

    public String getTxtWhyStaryeChildLinks() {
	waitForElementToVisible(megamenuLocators.studentExpChildLinksModule, 5);

	moveToMenu(megamenuLocators.studentExpChildLinksModule);
	return megamenuLocators.studentExpChildLinksModule.getText();
    }

    public void clickTitle() {
	waitForElementToVisible(megamenuLocators.tilteTxtHeader, 5);

	moveToMenu(megamenuLocators.tilteTxtHeader);
	highlightElement(megamenuLocators.tilteTxtHeader);

    }

    public String getTextTile() {
	waitForElementToVisible(megamenuLocators.tilteTxtHeader, 5);

	moveToMenu(megamenuLocators.tilteTxtHeader);
	highlightElement(megamenuLocators.tilteTxtHeader);
	return megamenuLocators.tilteTxtHeader.getText();
    }

    public void verifyImage() {
	waitForElementToVisible(megamenuLocators.tilteImage, 5);

	moveToMenu(megamenuLocators.tilteImage);
	highlightElement(megamenuLocators.tilteImage);

    }

    public String verifyText() {
	waitForElementToVisible(megamenuLocators.tilteTxt, 5);

	moveToMenu(megamenuLocators.tilteTxt);
	highlightElement(megamenuLocators.tilteTxt);
	return megamenuLocators.tilteTxt.getText();
    }

}
