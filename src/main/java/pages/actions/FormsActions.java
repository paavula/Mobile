package pages.actions;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import pages.locators.FormsLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class FormsActions extends BasePage<Object> {
    FormsLocators formsLocators = null;
    Select sel;

    public FormsActions() {
	this.formsLocators = new FormsLocators();
	PageFactory.initElements(DriverManager.getDriver(), formsLocators);
    }

    public void moveToMenu(WebElement ele) {
	Actions action = new Actions(DriverManager.getDriver());
	action.moveToElement(ele).perform();
    }

    public void open_letsgo_Page() {
	navigateToURL(ProjectVariables.LetsGO_URL);
    }

    public void open_EDU_Forms_Page() {
	navigateToURL(ProjectVariables.BRFI_URL);
    }

    public void open_EDU_Banner_Forms_Page() {
	navigateToURL(ProjectVariables.BRFIEDU_URL);
    }

    public String getTxtpage() {
	return DriverManager.driver.get().getTitle();
    }

    public int getPageCode() {
	String Url = DriverManager.getDriver().getCurrentUrl();
	System.out.println("Current URL :" + Url);
	return getResponseCode(Url);
    }

    // *******************************************Footer
    // Form********************************
    public void movetoFooterRFI() {
	waitForElementToVisible(formsLocators.footerRFI, 5);
	moveToMenu(formsLocators.footerRFI);
	highlightElement(formsLocators.footerRFI);
    }

    public String getTxtfooterRFI() {
	waitForElementToVisible(formsLocators.footerRFItxt, 5);
	moveToMenu(formsLocators.footerRFItxt);
	highlightElement(formsLocators.footerRFItxt);
	return formsLocators.footerRFItxt.getText();
    }

    public void selectDegree(String degVal) {
	waitForElementToVisible(formsLocators.degreeLeveloptions, 5);
	highlightElement(formsLocators.degreeLeveloptions);
	formsLocators.degreeLeveloptions.click();
	formsLocators.degreeLevel.click();
    }

    public void selectAOS(String aos) {
	waitForElementToVisible(formsLocators.programoptions, 5);
	highlightElement(formsLocators.programoptions);
	formsLocators.programoptions.click();
	formsLocators.programInterrest.click();
	// Select sel1 = new Select(formsLocators.programInterrest);
	// sel1.selectByVisibleText(aos);
    }

    public void enterfName(String fName) {
	waitForElementToVisible(formsLocators.fName, 2);
	highlightElement(formsLocators.fName);
	formsLocators.fName.sendKeys(fName);
    }

    public void enterlName(String lName) {
	waitForElementToVisible(formsLocators.lName, 2);
	highlightElement(formsLocators.lName);
	formsLocators.lName.sendKeys(lName);
    }

    public void enterEmail(String email) {
	waitForElementToVisible(formsLocators.email, 2);
	highlightElement(formsLocators.email);
	formsLocators.email.sendKeys(email);
    }

    public void enterphoneNumber(String phone) {
	waitForElementToVisible(formsLocators.phone, 2);
	highlightElement(formsLocators.phone);
	// formsLocators.phone.click();
	formsLocators.phone.sendKeys(phone);
    }

    public void enterphoneNumberinFF(String phone) {
	waitForElementToVisible(formsLocators.phone, 2);
	highlightElement(formsLocators.phone);
	formsLocators.phone.click();
	formsLocators.phone.sendKeys(phone);
    }

    public void enterZip(String zip) {
	waitForElementToVisible(formsLocators.zipcode, 2);
	highlightElement(formsLocators.zipcode);
	formsLocators.zipcode.sendKeys(zip);
    }

    public void ClickAnGobtnrfi() {
	waitForElementToVisible(formsLocators.agreenGobtnrfi, 5);
	highlightElement(formsLocators.agreenGobtnrfi);
	formsLocators.agreenGobtnrfi.submit();
    }

    public void ClickAnGobtn() {
	waitForElementToVisible(formsLocators.agreenGobtn, 5);
	highlightElement(formsLocators.agreenGobtn);
	formsLocators.agreenGobtn.submit();
    }

    // ******************************************* End of Footer
    // Form********************************
    // ******************************************* Banner Form
    // *************************************
    public void movetoBannerRFI() {
	waitForElementToVisible(formsLocators.bannerRFI, 5);
	moveToMenu(formsLocators.bannerRFI);
	highlightElement(formsLocators.bannerRFI);
    }

    public String getTxtBannerRFI() {
	waitForElementToVisible(formsLocators.bannerRFItxt, 5);
	moveToMenu(formsLocators.bannerRFItxt);
	highlightElement(formsLocators.bannerRFItxt);
	return formsLocators.bannerRFItxt.getText();
    }

    public void selectDegreeInBannerform(String degVal) {
	waitForElementToVisible(formsLocators.degreeLeveloptionsBR, 5);
	highlightElement(formsLocators.degreeLeveloptionsBR);
	formsLocators.degreeLeveloptionsBR.click();
	formsLocators.degreeLevelBR.click();
	// Select sel = new Select(formsLocators.degreeLevel);
	// sel.selectByVisibleText(degVal);
    }

    public void selectAOSInBannerform(String aos) {
	waitForElementToVisible(formsLocators.programoptionsBR, 5);
	highlightElement(formsLocators.programoptionsBR);
	formsLocators.programoptionsBR.click();
	formsLocators.programInterrestBR.click();
	// Select sel1 = new Select(formsLocators.programInterrest);
	// sel1.selectByVisibleText(aos);
    }

    public void selectDegreeInBR(String degVal) {
	waitForElementToVisible(formsLocators.degreeLeveloptionssf, 5);
	highlightElement(formsLocators.degreeLeveloptionssf);
	formsLocators.degreeLeveloptionssf.click();
	formsLocators.degreeLevelsf.click();
	// Select sel = new Select(formsLocators.degreeLevel);
	// sel.selectByVisibleText(degVal);
    }

    public void selectAOSInBR(String aos) {
	waitForElementToVisible(formsLocators.programoptionssf, 5);
	highlightElement(formsLocators.programoptionssf);
	formsLocators.programoptionssf.click();
	formsLocators.programInterrestsf.click();
	// Select sel1 = new Select(formsLocators.programInterrest);
	// sel1.selectByVisibleText(aos);
    }

    public void enterfNameInBR(String fName) {
	waitForElementToVisible(formsLocators.fNameBR, 2);
	highlightElement(formsLocators.fNameBR);
	formsLocators.fNameBR.sendKeys(fName);
    }

    public void enterlNameInBR(String lName) {
	waitForElementToVisible(formsLocators.lNameBR, 2);
	highlightElement(formsLocators.lNameBR);
	formsLocators.lNameBR.sendKeys(lName);
    }

    public void enterEmailKInBR(String email) {
	waitForElementToVisible(formsLocators.emailBR, 5);
	highlightElement(formsLocators.emailBR);
	formsLocators.emailBR.sendKeys(email);
    }

    public void enterphoneNumberInBR(String phone) {
	waitForElementToVisible(formsLocators.phoneBR, 2);
	highlightElement(formsLocators.phoneBR);
	// formsLocators.phoneBR.click();
	formsLocators.phoneBR.sendKeys(phone);
    }

    public void enterphoneNumberInBR1(String phone) {
	waitForElementToVisible(formsLocators.phoneBR, 2);
	highlightElement(formsLocators.phoneBR);
	formsLocators.phoneBR.click();
	formsLocators.phoneBR.sendKeys(phone);
    }

    public void enterZipinBR(String zip) {
	waitForElementToVisible(formsLocators.zipcodeBR, 2);
	highlightElement(formsLocators.zipcodeBR);
	formsLocators.zipcodeBR.sendKeys(zip);
    }

    public void ClickAnGobtninBR() {
	waitForElementToVisible(formsLocators.agreenGobtnBR, 5);
	highlightElement(formsLocators.agreenGobtnBR);
	formsLocators.agreenGobtnBR.submit();
    }

    public void checkmilitary() {
	waitForElementToVisible(formsLocators.no, 3);
	highlightElement(formsLocators.no);
    }

    // ******************************************* End of Banner
    // Form*********************************
    // ******************************************** Error Messages for EDU Forms
    // **********************
    public String getError() {
	waitForElementToVisible(formsLocators.errorMessgae);
	highlightElement(formsLocators.errorMessgae);
	return formsLocators.errorMessgae.getText();
    }

    public String getfNameError() {
	waitForElementToVisible(formsLocators.fNameError);
	highlightElement(formsLocators.fNameError);
	return formsLocators.fNameError.getText();
    }

    public String getlNameError() {
	waitForElementToVisible(formsLocators.lNameError);
	highlightElement(formsLocators.lNameError);
	return formsLocators.lNameError.getText();
    }

    public String getEmailError() {
	waitForElementToVisible(formsLocators.eMailError);
	highlightElement(formsLocators.eMailError);
	return formsLocators.eMailError.getText();
    }

    public String getPhoneError() {
	waitForElementToVisible(formsLocators.phoneError);
	highlightElement(formsLocators.phoneError);
	return formsLocators.phoneError.getText();
    }

    public String getZipeError() {
	waitForElementToVisible(formsLocators.zipeError);
	highlightElement(formsLocators.zipeError);
	return formsLocators.zipeError.getText();
    }

    // ************************************************** End Error messages
    // *************************
    // ************************************************** Degree Form
    // ************************
    public void movetoDegreeForm() {
	waitForElementToVisible(formsLocators.degreeForm, 5);
	highlightElement(formsLocators.degreeForm);
	moveToMenu(formsLocators.degreeForm);
    }

    public void enterFNameDF(String fName) {
	waitForElementToVisible(formsLocators.fNameDF, 2);
	highlightElement(formsLocators.fNameDF);
	formsLocators.fNameDF.sendKeys(fName);
    }

    public void enterlNameDF(String lName) {
	waitForElementToVisible(formsLocators.lNameDF, 2);
	highlightElement(formsLocators.lNameDF);
	formsLocators.lNameDF.sendKeys(lName);
    }

    public void enterEmailinDF(String email) {
	waitForElementToVisible(formsLocators.EmailDF, 5);
	highlightElement(formsLocators.EmailDF);
	formsLocators.EmailDF.sendKeys(email);
    }

    public void enterCompany(String company) {
	waitForElementToVisible(formsLocators.Company, 2);
	highlightElement(formsLocators.Company);
	formsLocators.Company.sendKeys(company);
    }

    public void enterCeomments(String comments) {
	waitForElementToVisible(formsLocators.Comments, 2);
	highlightElement(formsLocators.Comments);
	formsLocators.Comments.sendKeys(comments);
    }

    public void enterTitle(String title) {
	waitForElementToVisible(formsLocators.Title, 2);
	highlightElement(formsLocators.Title);
	formsLocators.Title.sendKeys(title);
    }

    public void ClickSUbmitBtn() {
	waitForElementToVisible(formsLocators.SubmitBtnDF, 5);
	highlightElement(formsLocators.SubmitBtnDF);
	formsLocators.SubmitBtnDF.submit();
    }

    public String getTxtwinodw() {
	waitForElementToVisible(formsLocators.successwind, 5);
	highlightElement(formsLocators.successwind);
	return formsLocators.successwind.getText();
    }

    public void clickCloseBtn() {
	waitForElementToVisible(formsLocators.closeBtn, 5);
	highlightElement(formsLocators.closeBtn);
	formsLocators.closeBtn.click();
    }

    // **************************************************End Degree Form
    // ************************ Download Form
    public void ClickAnGobtndw() {
	waitForElementToVisible(formsLocators.cfdwAgreenGo, 5);
	highlightElement(formsLocators.cfdwAgreenGo);
	formsLocators.cfdwAgreenGo.click();
    }

    public void ClickAnGobtncfdw() {
	waitForElementToVisible(formsLocators.cfdwAgreenGo, 5);
	highlightElement(formsLocators.cfdwAgreenGo);
	formsLocators.cfdwAgreenGo.click();
    }

    public void enterfNamedw(String fName) {
	waitForElementToVisible(formsLocators.dwfName, 2);
	highlightElement(formsLocators.dwfName);
	formsLocators.dwfName.sendKeys(fName);
    }

    public void enterlNamedw(String lName) {
	waitForElementToVisible(formsLocators.dwlName, 2);
	highlightElement(formsLocators.dwlName);
	formsLocators.dwlName.sendKeys(lName);
    }

    public void enterEmaildw(String email) {
	waitForElementToVisible(formsLocators.dwEmail, 2);
	highlightElement(formsLocators.dwEmail);
	formsLocators.dwEmail.sendKeys(email);
    }

    public void enterphoneNumberdw(String phone) {
	waitForElementToVisible(formsLocators.dwPhone, 2);
	highlightElement(formsLocators.dwPhone);
	formsLocators.dwPhone.click();
	formsLocators.dwPhone.sendKeys(phone);
    }

    public void enterZipdw(String zip) {
	waitForElementToVisible(formsLocators.dwZipCode, 2);
	highlightElement(formsLocators.dwZipCode);
	formsLocators.dwZipCode.sendKeys(zip);
    }

    // *************************************** Microsite Form
    public void open_Cheddar_Application() {
	navigateToURL(ProjectVariables.CheddarApplication_URL);
    }

    public void moveToMForm() {
	waitForElementToVisible(formsLocators.mForm, 5);
	highlightElement(formsLocators.mForm);
    }

    public void enterfNamemf(String fName) {
	waitForElementToVisible(formsLocators.fNamemf, 2);
	highlightElement(formsLocators.fNamemf);
	formsLocators.fNamemf.sendKeys(fName);
    }

    public void enterlNamemf(String lName) {
	waitForElementToVisible(formsLocators.lNamemf, 2);
	highlightElement(formsLocators.lNamemf);
	formsLocators.lNamemf.sendKeys(lName);
    }

    public void enterEmailmf(String email) {
	waitForElementToVisible(formsLocators.Emailmf, 2);
	highlightElement(formsLocators.Emailmf);
	formsLocators.Emailmf.sendKeys(email);
    }

    public void enterphoneNumbermf(String phone) {
	waitForElementToVisible(formsLocators.Phonemf, 2);
	highlightElement(formsLocators.Phonemf);
	formsLocators.Phonemf.click();
	formsLocators.Phonemf.sendKeys(phone);
    }

    public void enterZipmf(String zip) {
	waitForElementToVisible(formsLocators.ZipCodemf, 2);
	highlightElement(formsLocators.ZipCodemf);
	formsLocators.ZipCodemf.sendKeys(zip);
    }

    public void ClickAnGobtnmf() {
	waitForElementToVisible(formsLocators.submitBtnmf, 5);
	highlightElement(formsLocators.submitBtnmf);
	formsLocators.submitBtnmf.submit();
    }

    public void selectel(String elvVal) {
	waitForElementToVisible(formsLocators.educationoptionsmf, 5);
	highlightElement(formsLocators.educationoptionsmf);
	formsLocators.educationoptionsmf.click();
	formsLocators.educationoptionsvalmf.click();
	// Select sel1 = new Select(footerLocators.programInterrest);
	// sel1.selectByVisibleText(aos);
    }

    public void selecteldf(String elvVal) {
	waitForElementToVisible(formsLocators.educationoptionsdf, 5);
	highlightElement(formsLocators.educationoptionsdf);
	formsLocators.educationoptionsdf.click();
	formsLocators.educationoptionsvaldf.click();
	// Select sel1 = new Select(footerLocators.programInterrest);
	// sel1.selectByVisibleText(aos);
    }

    // ******************** Nominate Teachers Form
    public void moveToNomForm() {
	waitForElementToVisible(formsLocators.nominateateacherform, 5);
	highlightElement(formsLocators.nominateateacherform);
    }

    public void enterfFName(String fFname) {
	waitForElementToVisible(formsLocators.fFname, 2);
	highlightElement(formsLocators.fFname);
	formsLocators.fFname.sendKeys(fFname);
    }

    public void enterfLname(String fLname) {
	waitForElementToVisible(formsLocators.fLname, 2);
	highlightElement(formsLocators.fLname);
	formsLocators.fLname.sendKeys(fLname);
    }

    public void enterCampus(String campus) {
	waitForElementToVisible(formsLocators.campus, 2);
	highlightElement(formsLocators.campus);
	formsLocators.campus.sendKeys(campus);
    }

    public void enterProgram(String teachprogram) {
	waitForElementToVisible(formsLocators.teachprogram, 2);
	highlightElement(formsLocators.teachprogram);
	formsLocators.teachprogram.click();
	formsLocators.teachprogram.sendKeys(teachprogram);
    }

    public void enterReason(String reason) {
	waitForElementToVisible(formsLocators.reason, 2);
	highlightElement(formsLocators.reason);
	formsLocators.reason.click();
	formsLocators.reason.sendKeys(reason);
    }

    public void entersFName(String sFname) {
	waitForElementToVisible(formsLocators.sFname, 2);
	highlightElement(formsLocators.sFname);
	formsLocators.sFname.sendKeys(sFname);
    }

    public void entersLname(String sLname) {
	waitForElementToVisible(formsLocators.sLname, 2);
	highlightElement(formsLocators.sLname);
	formsLocators.sLname.sendKeys(sLname);
    }

    public void entersCampus(String shomecampus) {
	waitForElementToVisible(formsLocators.shomecampus, 2);
	highlightElement(formsLocators.shomecampus);
	formsLocators.shomecampus.sendKeys(shomecampus);
    }

    public void entersId(String sid) {
	waitForElementToVisible(formsLocators.sId, 2);
	highlightElement(formsLocators.sId);
	formsLocators.sId.sendKeys(sid);
    }

    public String getErrorMessage() {
	waitForElementToVisible(formsLocators.ErrorMessage, 3);
	highlightElement(formsLocators.ErrorMessage);
	return formsLocators.ErrorMessage.getText();
    }

    // ************************** Linked-In form
    public void enterfNamelf(String fName) {
	waitForElementToVisible(formsLocators.firstName, 2);
	highlightElement(formsLocators.firstName);
	formsLocators.firstName.sendKeys(fName);
    }

    public void enterlNamelf(String lName) {
	waitForElementToVisible(formsLocators.lastName, 2);
	highlightElement(formsLocators.lastName);
	formsLocators.lastName.sendKeys(lName);
    }

    public void enterEmaillf(String email) {
	waitForElementToVisible(formsLocators.emaillf, 2);
	highlightElement(formsLocators.emaillf);
	formsLocators.emaillf.sendKeys(email);
    }

    public void enterphoneNumberlf(String phone) {
	waitForElementToVisible(formsLocators.phoneNumber, 2);
	highlightElement(formsLocators.phoneNumber);
	formsLocators.phoneNumber.click();
	formsLocators.phoneNumber.sendKeys(phone);
    }

    public void enterZiplf(String zip) {
	waitForElementToVisible(formsLocators.zipCode, 2);
	highlightElement(formsLocators.zipCode);
	formsLocators.zipCode.sendKeys(zip);
    }

    public void selectTCOptioninLinkedInForm(String Yes) {
	waitForElementToVisible(formsLocators.tCYesInLinkedinForm, 2);
	highlightElement(formsLocators.tCYesInLinkedinForm);
	formsLocators.tCYesInLinkedinForm.click();
    }

    public void ClickSubmitBtnlf() {
	waitForElementToVisible(formsLocators.submitBtnlf, 3);
	highlightElement(formsLocators.submitBtnlf);
	formsLocators.submitBtnlf.click();
    }

    public void ClickSignWIthButton(String Email, String Password) {
	DriverManager.driver.get().switchTo().frame(0);
	waitForElementToVisible(formsLocators.AutoFillBtn, 3);
	highlightElement(formsLocators.AutoFillBtn);
	formsLocators.AutoFillBtn.click();
	Set<String> new1 = DriverManager.driver.get().getWindowHandles();
	System.out.println("No of widnows:" + new1.size());
	DriverManager.driver.get().switchTo().window((String) new1.toArray()[1]);
	formsLocators.UNameLForm.sendKeys(Email);
	formsLocators.PwdLForm.sendKeys(Password);
	formsLocators.SigninLForm.click();
	DriverManager.driver.get().switchTo().window((String) new1.toArray()[0]);
    }

    public void ClickAutoFillButton() {
	DriverManager.driver.get().switchTo().frame(0);
	waitForElementToVisible(formsLocators.SignInFillBtn, 3);
	highlightElement(formsLocators.SignInFillBtn);
	formsLocators.SignInFillBtn.click();
	DriverManager.driver.get().switchTo().alert().accept();
	Set<String> new1 = DriverManager.driver.get().getWindowHandles();
	System.out.println("No of widnows:" + new1.size());
	DriverManager.driver.get().switchTo().window((String) new1.toArray()[0]);

    }

    public String getTxtLInkedinFName() {
	waitForElementToVisible(formsLocators.firstName, 2);
	highlightElement(formsLocators.firstName);
	return formsLocators.firstName.getAttribute("value");
    }

    public String getTxtLInkedinLName() {
	waitForElementToVisible(formsLocators.lastName, 2);
	highlightElement(formsLocators.lastName);
	return formsLocators.lastName.getAttribute("value");
    }

    public String getTxtLInkedinEmail() {
	waitForElementToVisible(formsLocators.emaillf, 2);
	highlightElement(formsLocators.emaillf);
	return formsLocators.emaillf.getAttribute("value");
    }

    public String getTxtLInkedinPhone() {
	waitForElementToVisible(formsLocators.phoneNumber, 2);
	highlightElement(formsLocators.phoneNumber);
	System.out.println("Actual Phone No" + formsLocators.phoneNumber.getAttribute("value"));
	return formsLocators.phoneNumber.getAttribute("value");
    }

    public String getTxtLInkedinZip() {
	waitForElementToVisible(formsLocators.zipCode, 2);
	highlightElement(formsLocators.zipCode);
	return formsLocators.zipCode.getAttribute("value");
    }

    // ************************* SHort Form
    public void OpenShortFormPage() {
	navigateToURL(ProjectVariables.ShortFormPage_URL);
	
    }

    public void selectTCOptioninSForm(String Yes) {
	waitForElementToVisible(formsLocators.tCYesInShortForm, 2);
	highlightElement(formsLocators.tCYesInShortForm);
	formsLocators.tCYesInShortForm.click();
    }

    public void selectTCOptioninSFormdd(String Yes) {
	waitForElementToVisible(formsLocators.tCYesInShortFormdd, 2);
	highlightElement(formsLocators.tCYesInShortFormdd);
	formsLocators.tCYesInShortFormdd.click();
    }

    public void movetoShortRFI() {
	waitForElementToVisible(formsLocators.shortform, 3);
	moveToMenu(formsLocators.shortform);
	highlightElement(formsLocators.shortform);
    }

    
    public void clickRFIinFooter() {
    	waitForElementToVisible(formsLocators.shortformnavigation, 3);
    	moveToMenu(formsLocators.shortformnavigation);
    	highlightElement(formsLocators.shortformnavigation);
    	formsLocators.shortformnavigation.click();
        }
    
    
    public void enterfNameSF(String fName) {
	waitForElementToVisible(formsLocators.fNamesf, 2);
	highlightElement(formsLocators.fNamesf);
	formsLocators.fNamesf.sendKeys(fName);
    }

    public void enterlNameSF(String lName) {
	waitForElementToVisible(formsLocators.lNamesf, 2);
	highlightElement(formsLocators.lNamesf);
	formsLocators.lNamesf.sendKeys(lName);
    }

    public void enterEmailSF(String email) {
	waitForElementToVisible(formsLocators.emailsf, 2);
	highlightElement(formsLocators.emailsf);
	formsLocators.emailsf.sendKeys(email);
    }

    public void enterphoneNumberSF(String phone) {
	waitForElementToVisible(formsLocators.phoneNumbersf, 2);
	highlightElement(formsLocators.phoneNumbersf);
	formsLocators.phoneNumbersf.click();
	formsLocators.phoneNumbersf.sendKeys(phone);
    }

    public void enterZipSF(String zip) {
	waitForElementToVisible(formsLocators.zipCodesf, 2);
	highlightElement(formsLocators.zipCodesf);
	formsLocators.zipCodesf.sendKeys(zip);
    }

    public void clickAnGobtnSF() {
	waitForElementToVisible(formsLocators.AgreeBtnsf, 5);
	highlightElement(formsLocators.AgreeBtnsf);
	formsLocators.AgreeBtnsf.click();
    }

    // *************** short form with drop down
    public void OpenShortFormddPage() {
	navigateToURL(ProjectVariables.ShortFormddPage_URL);
    }

    public void selectDegreeInSF(String degVal) {
	waitForElementToVisible(formsLocators.degreeLeveloptionssf, 5);
	highlightElement(formsLocators.degreeLeveloptionssf);
	// formsLocators.selectdegreeLevelBR.click();
	// formsLocators.degreeLeveloptionsBR.click();
	// formsLocators.degreeLeveloptionssf.click();
	formsLocators.degreeLevelsf.click();
	// Select sel = new Select(footerLocators.degreeLevel);
	// sel.selectByVisibleText(degVal);
    }

    public void selectAOSSR(String aos) {
	waitForElementToVisible(formsLocators.programInterrestsf, 5);
	highlightElement(formsLocators.programInterrestsf);
	// formsLocators.programoptionssf.click();
	formsLocators.programInterrestsf.click();
    }

    // ******************** TWO STEP FORM
    public void OpenTwoStepFormPage() {
	navigateToURL(ProjectVariables.TwoStepFormPage_URL);
    }

    public void moveTotwoStepForm() {
	waitForElementToVisible(formsLocators.twoStepForm, 5);
	highlightElement(formsLocators.twoStepForm);
    }

    public void selectDegree2sf(String degVal) {
	waitForElementToVisible(formsLocators.degreeLevel2sf, 5);
	highlightElement(formsLocators.degreeLevel2sf);
	formsLocators.degreeLevel2sf.click();
	formsLocators.degreeLevelOptions2sf.click();
	// Select sel = new Select(formsLocators.degreeLevelOptions2sf);
	// sel.selectByVisibleText(degVal);
    }

    public void selectAOS2sf(String aos) {
	waitForElementToVisible(formsLocators.program2sf, 5);
	highlightElement(formsLocators.program2sf);
	formsLocators.program2sf.click();
	formsLocators.programOptions2sf.click();
	// Select sel1 = new Select(formsLocators.programOptions2sf);
	// sel1.selectByVisibleText(aos);
    }

    public void enterfName2sf(String fName) {
	waitForElementToVisible(formsLocators.fName2sf, 2);
	highlightElement(formsLocators.fName2sf);
	formsLocators.fName2sf.sendKeys(fName);
    }

    public void enterlName2sf(String lName) {
	waitForElementToVisible(formsLocators.lName2sf, 2);
	highlightElement(formsLocators.lName2sf);
	formsLocators.lName2sf.sendKeys(lName);
    }

    public void enterEmail2sf(String email) {
	waitForElementToVisible(formsLocators.Email2sf, 2);
	highlightElement(formsLocators.Email2sf);
	formsLocators.Email2sf.sendKeys(email);
    }

    public void enterphoneNumber2sf(String phone) {
	waitForElementToVisible(formsLocators.Phone2sf, 2);
	highlightElement(formsLocators.Phone2sf);
	formsLocators.Phone2sf.click();
	formsLocators.Phone2sf.sendKeys(phone);
    }

    public void enterZip2sf(String zip) {
	waitForElementToVisible(formsLocators.ZipCode2sf, 3);
	highlightElement(formsLocators.ZipCode2sf);
	// formsLocators.ZipCode2sf.click();
	formsLocators.ZipCode2sf.sendKeys(zip);
    }

    public void enterAddress2sf(String addres) {
	waitForElementToVisible(formsLocators.address2sf, 5);
	highlightElement(formsLocators.address2sf);
	formsLocators.address2sf.sendKeys(addres);
    }

    public void ClickAnGobtn2sf() {
	waitForElementToVisible(formsLocators.submitBtn2sf, 5);
	highlightElement(formsLocators.submitBtn2sf);
	formsLocators.submitBtn2sf.click();
    }

    public void ClickNextbtn2sf() {
	waitForElementToVisible(formsLocators.nextBtn2sf, 5);
	highlightElement(formsLocators.nextBtn2sf);
	formsLocators.nextBtn2sf.click();
    }

    public void selectTCOptionin2SForm(String Yes) {
	waitForElementToVisible(formsLocators.tCYesInTwoStepForm, 2);
	highlightElement(formsLocators.tCYesInTwoStepForm);
	formsLocators.tCYesInTwoStepForm.click();
    }

    // ******************** LONG FORM
    public void OpenLongFormPage() {
	navigateToURL(ProjectVariables.LongFormPage_URL);
    }

    public void selectTCOptioninLongForm(String Yes) {
	waitForElementToVisible(formsLocators.tCYesInLongtForm, 2);
	highlightElement(formsLocators.tCYesInLongtForm);
	formsLocators.tCYesInLongtForm.click();
    }

    public void enterfNamelform(String fName) {
	waitForElementToVisible(formsLocators.fNamelf, 4);
	highlightElement(formsLocators.fNamelf);
	formsLocators.fNamelf.sendKeys(fName);
    }

    public void enterlNamelform(String lName) {
	waitForElementToVisible(formsLocators.lNamelf, 2);
	highlightElement(formsLocators.lNamelf);
	formsLocators.lNamelf.sendKeys(lName);
    }

    public void enterEmaillform(String email) {
	waitForElementToVisible(formsLocators.emaillform, 2);
	highlightElement(formsLocators.emaillform);
	formsLocators.emaillform.sendKeys(email);
    }

    public void enterAddresslf(String address) {
	waitForElementToVisible(formsLocators.addresslf, 2);
	highlightElement(formsLocators.addresslf);
	formsLocators.addresslf.sendKeys(address);
    }

    public void enterphoneNumberlform(String phone) {
	waitForElementToVisible(formsLocators.phoneNumberlf, 2);
	highlightElement(formsLocators.phoneNumberlf);
	formsLocators.phoneNumberlf.click();
	formsLocators.phoneNumberlf.sendKeys(phone);
    }

    public void enterZiplform(String zip) {
	waitForElementToVisible(formsLocators.zipCodelf, 2);
	highlightElement(formsLocators.zipCodelf);
	formsLocators.zipCodelf.sendKeys(zip);
    }

    public void clickAnGobtnlform() {
	waitForElementToVisible(formsLocators.AgreeBtnlf, 5);
	highlightElement(formsLocators.AgreeBtnlf);
	formsLocators.AgreeBtnlf.click();
    }

    public String getPhone_Error() {
	waitForElementToVisible(formsLocators.phoneerrorMessgae);
	highlightElement(formsLocators.phoneerrorMessgae);
	return formsLocators.phoneerrorMessgae.getText();
    }

    public void clickAnGobtnlf() {
	waitForElementToVisible(formsLocators.submitBtnlf, 5);
	highlightElement(formsLocators.submitBtnlf);
	formsLocators.submitBtnlf.click();
    }

    public void moveToLongForm() {
	waitForElementToVisible(formsLocators.lognForm, 5);
	highlightElement(formsLocators.lognForm);
    }

    public void selectPGlf(String pgVal) {
	waitForElementToVisible(formsLocators.educationLevellf, 5);
	highlightElement(formsLocators.educationLevellf);
	formsLocators.educationLevellf.click();
	// formsLocators.educationLevelOptionslf.click();
	formsLocators.educationLevelOptionslf.click();
	// Select sel = new Select(formsLocators.educationLevelOptions);
	// sel.selectByVisibleText(pgVal);
    }

    public void selectDegreelf(String degVal) {
	waitForElementToVisible(formsLocators.degreeLevellf, 5);
	highlightElement(formsLocators.degreeLevellf);
	formsLocators.degreeLevellf.click();
	formsLocators.degreeLevelOptionslf.click();
    }

    public void selectAOSlf(String aos) {
	/*
	 * waitForElementToVisible(formsLocators.program, 5);
	 * highlightElement(formsLocators.program); Select sel1 = new
	 * Select(formsLocators.programOptions); sel1.selectByVisibleText(aos);
	 */
	waitForElementToVisible(formsLocators.programlf, 5);
	highlightElement(formsLocators.programlf);
	formsLocators.programlf.click();
	formsLocators.programOptionslf.click();
    }
//************************** BeMore Form

    public void NavigateToBemoreFormPage() {
	navigateToURL(ProjectVariables.BemoreFormPage_URL);
    }

    public void NavigateToBemoreFormErrorPage() {
	navigateToURL(ProjectVariables.BemoreFormPageError_URL);
    }

    public String getTxtBemoreFName() {
	waitForElementToVisible(formsLocators.fNamelf, 2);
	moveToMenu(formsLocators.fNamelf);
	highlightElement(formsLocators.fNamelf);
	return formsLocators.fNamelf.getAttribute("value");
    }

    public String getTxtBemoreLName() {
	waitForElementToVisible(formsLocators.lNamelf, 2);
	moveToMenu(formsLocators.lNamelf);
	highlightElement(formsLocators.lNamelf);
	return formsLocators.lNamelf.getAttribute("value");
    }

    public String getTxtBeoreEmail() {
	waitForElementToVisible(formsLocators.emaillform, 2);
	moveToMenu(formsLocators.emaillform);
	highlightElement(formsLocators.emaillform);
	return formsLocators.emaillform.getAttribute("value");
    }

    public String getTxtBemorePhone() {
	waitForElementToVisible(formsLocators.phoneNumberlf, 2);
	moveToMenu(formsLocators.phoneNumberlf);
	highlightElement(formsLocators.phoneNumberlf);
	System.out.println("Actual Phone No" + formsLocators.phoneNumberlf.getAttribute("value"));
	return formsLocators.phoneNumberlf.getAttribute("value");
    }

    public String getTxtBemoreZip() {
	waitForElementToVisible(formsLocators.zipCode1lf, 2);
	moveToMenu(formsLocators.zipCode1lf);
	highlightElement(formsLocators.zipCode1lf);
	System.out.println("Actual ZIP Code" + formsLocators.zipCode1lf.getAttribute("value"));
	return formsLocators.zipCode1lf.getAttribute("value");
    }

    @SuppressWarnings("rawtypes")
	@Override
    public ExpectedCondition getPageLoadCondition() {
	return null;
    }

    public void OpenCUApplication() {
	// navigateToBaseURL();
	navigateToURL(ProjectVariables.CUAppPage_URL);
    }

    public void clickLoginLink() {
	highlightElement(formsLocators.loginLink);
	formsLocators.loginLink.click();
    }

    public void clickProspStudLink() {
	highlightElement(formsLocators.prosStudLink);
	formsLocators.prosStudLink.click();
    }

    public boolean verifyLoginForm() {
	highlightElement(formsLocators.mcLoginForm);
	return formsLocators.mcLoginForm.isDisplayed();
    }

    public void enterUserNameinLoginForm(String usrName) {
	highlightElement(formsLocators.loginUsername);
	formsLocators.loginUsername.sendKeys(usrName);
    }

    public void enterUserPwdinLoginForm(String usrPwd) {
	highlightElement(formsLocators.loginPwd);
	formsLocators.loginPwd.sendKeys(usrPwd);
    }

    public void clickLoginBtninLoginForm() {
	highlightElement(formsLocators.loginBtn);
	formsLocators.loginBtn.click();
    }

    public void clickLoginCloseBtn() {
	highlightElement(formsLocators.CloseBtn);
	formsLocators.CloseBtn.click();
    }

    public String getTxtMyprofileLink() {
	waitForElementToVisible(formsLocators.myProfileLink, 5);
	moveToMenu(formsLocators.myProfileLink);
	highlightElement(formsLocators.myProfileLink);
	// highlightElement(vcLocators.myProfileLink);
	return formsLocators.myProfileLink.getText();
    }

    public boolean verifyMyprofileLinkElement() {
	if (waitForElementToVisible(formsLocators.myProfileLink, 5)) {
	    fluentWait(4);
	    return true;
	} else {
	    return false;
	}
    }

    // ************************** REGISTRATION
    public void clickCreateAccntLink() {
	formsLocators.mcCreateAccntLnk.click();
    }

    public boolean verifySignUpForm() {
	highlightElement(formsLocators.mcSignUpForm);
	return formsLocators.mcSignUpForm.isDisplayed();
    }

    public void enterSignUpFirstName(String fName) {
	highlightElement(formsLocators.mcFNameFormElement);
	formsLocators.mcFNameFormElement.sendKeys(fName);
    }

    public void enterSignUpLastName(String lName) {
	highlightElement(formsLocators.mcLNameFormElement);
	formsLocators.mcLNameFormElement.sendKeys(lName);
    }

    public String genUniqueEmailAddress() {
	String emailAddr = "capella" + getUniqueNumber() + "@gmail1.com";
	return emailAddr;
    }

    public String getPhoneNumber() {

	long num, aNumber;
	num = 646;
	aNumber = (long) ((Math.random() * 9000000) + 1000000);
	num = (num * 10000000) + aNumber;
	String PhNumbmer = "" + num;
	return PhNumbmer;
    }

	/*
	 * private static int getPhoneNumber2() { Random random = new Random(); int
	 * randomNumber = 0; boolean loop = true; while (loop) { randomNumber =
	 * random.nextInt(); if (Integer.toString(randomNumber).length() == 10 &&
	 * Integer.toString(randomNumber).startsWith("646")) { loop = false; } } return
	 * randomNumber; }
	 */

    public long getUniqueNumber() {
	long timeNum = System.currentTimeMillis();
	return timeNum;
    }

    public String getUniqueEmail() {
	String emailAddr = "capella" + getUniqueFiveNumber() + "@gmail1.com";
	return emailAddr;
    }

    public String getUniqueFiveNumber() {
	Random r = new Random();
	String randomNumber = String.format("%05d", Integer.valueOf(r.nextInt(10001)));
	return randomNumber;
    }

    public void enterEmailAddress(String dynEmailAddr) {
	// highlightElement(formsLocators.emailAddrFormElement);
	formsLocators.emailAddrFormElement.sendKeys(dynEmailAddr);
    }

    public void enterSignUpPassword(String pwd) {
	highlightElement(formsLocators.mcPwdFormElement);
	formsLocators.mcPwdFormElement.sendKeys(pwd);
    }

    public void enterSignUpCnfmPassword(String cnfmPwd) {
	highlightElement(formsLocators.mcCnfmPwdFormElement);
	formsLocators.mcCnfmPwdFormElement.sendKeys(cnfmPwd);
    }

    public void clickSignUpSubmitBtn() {
	highlightElement(formsLocators.mcRegSubmitButton);
	formsLocators.mcRegSubmitButton.click();
    }

    // ********************* RESET PWD FORM
    public boolean moveToFrgtForm() {
	highlightElement(formsLocators.frgtpwdForm);
	return formsLocators.frgtpwdForm.isDisplayed();
    }

    public boolean verifySusWindow() {
	highlightElement(formsLocators.frgtpwdFormWnd);
	return formsLocators.frgtpwdFormWnd.isDisplayed();
    }

    public void clickLogOut() {
	highlightElement(formsLocators.logOutLink);
	formsLocators.logOutLink.click();
    }

    public void clickRstPwd() {
	highlightElement(formsLocators.restPwdlink);
	formsLocators.restPwdlink.click();
    }

    public void enteremailaddress(String email) {
	highlightElement(formsLocators.loginUser);
	formsLocators.loginUser.sendKeys(email);
    }

    public void clickReqPwdbtn() {
	highlightElement(formsLocators.reqPwdbtn);
	formsLocators.reqPwdbtn.click();
    }

    public void clickOkBtn() {
	highlightElement(formsLocators.frgtpwdsucBtn);
	formsLocators.frgtpwdsucBtn.click();
    }

    // *********************************RESET USER NAME
    public void clickRstUname() {
	highlightElement(formsLocators.frgtUnameLink);
	formsLocators.frgtUnameLink.click();
    }

    public boolean moveToRstUnameForm() {
	highlightElement(formsLocators.frgtUnameWnd);
	return formsLocators.frgtUnameWnd.isDisplayed();
    }

    public void clickContinueBtn() {
	highlightElement(formsLocators.ContinueBtn);
	formsLocators.ContinueBtn.click();
    }

    public boolean verifyUnameWindow() {
	highlightElement(formsLocators.frgtUnameWnd);
	return formsLocators.frgtUnameWnd.isDisplayed();
    }

    // ********************* EMAIL US FORM
    public void clickAskaQuestion() {
	highlightElement(formsLocators.askaQuestionElement);
	formsLocators.askaQuestionElement.click();
    }

    public void clickEmailUsLink() {
	highlightElement(formsLocators.emailUsLinkElement);
	formsLocators.emailUsLinkElement.click();
    }

    public boolean verifyEmailUsForm() {
	highlightElement(formsLocators.emailUsForm);
	return formsLocators.emailUsForm.isDisplayed();
    }

    public void selectDegreeEForm(String degree) throws InterruptedException {
	// highlightElement(formsLocators.degreeFormElement);
	// sel = new Select(formsLocators.degreeFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(degree);
	waitForElementToVisible(formsLocators.degreeFormElement, 5);
	highlightElement(formsLocators.degreeFormElement);
	formsLocators.degreeFormElement.click();
	formsLocators.degreeFormElementOptions.click();
    }

    public void selectAOSEForm(String aos) throws InterruptedException {
	// highlightElement(formsLocators.aosFormElement);
	// sel = new Select(formsLocators.aosFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(aos);
	waitForElementToVisible(formsLocators.aosFormElement, 5);
	highlightElement(formsLocators.aosFormElement);
	formsLocators.aosFormElement.click();
	formsLocators.aosFormElementOptions.click();
    }

    public void selectSpec(String spec) throws InterruptedException {
	// highlightElement(formsLocators.specFormElement);
	// sel = new Select(formsLocators.specFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(spec);
	waitForElementToVisible(formsLocators.specFormElement, 5);
	highlightElement(formsLocators.specFormElement);
	formsLocators.specFormElement.click();
	formsLocators.specFormElementOptions.click();
    }

    public void selectDegreeEFormRFI(String degree) throws InterruptedException {
	// highlightElement(formsLocators.degreeFormElement);
	// sel = new Select(formsLocators.degreeFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(degree);
	waitForElementToVisible(formsLocators.degreeFormElement, 5);
	highlightElement(formsLocators.degreeFormElement);
	formsLocators.degreeFormElement.click();
	formsLocators.RFIdegreeElementOptions.click();
    }

    public void selectAOSEFormRFI(String aos) throws InterruptedException {
	// highlightElement(formsLocators.aosFormElement);
	// sel = new Select(formsLocators.aosFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(aos);
	waitForElementToVisible(formsLocators.aosFormElement, 5);
	highlightElement(formsLocators.aosFormElement);
	formsLocators.aosFormElement.click();
	formsLocators.RFIaosElementOptions.click();
    }

    public void selectSpecRFI(String spec) throws InterruptedException {
	// highlightElement(formsLocators.specFormElement);
	// sel = new Select(formsLocators.specFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(spec);
	waitForElementToVisible(formsLocators.specFormElement, 5);
	highlightElement(formsLocators.specFormElement);
	formsLocators.specFormElement.click();
	formsLocators.RFIspecElementOptions.click();
    }

    public void selectDate(String date) throws InterruptedException {
	// highlightElement(formsLocators.specFormElement);
	// sel = new Select(formsLocators.specFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(spec);
	waitForElementToVisible(formsLocators.startDate, 5);
	highlightElement(formsLocators.startDate);
	formsLocators.startDate.click();
	formsLocators.startDateOptions.click();
    }

    public void selectDegreeEFormCF(String degree) throws InterruptedException {
	// highlightElement(formsLocators.degreeFormElement);
	// sel = new Select(formsLocators.degreeFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(degree);
	waitForElementToVisible(formsLocators.degreeFormElement, 5);
	highlightElement(formsLocators.degreeFormElement);
	formsLocators.degreeFormElement.click();
	formsLocators.CFdegreeElementOptions.click();
    }

    public void selectAOSEFormCF(String aos) throws InterruptedException {
	// highlightElement(formsLocators.aosFormElement);
	// sel = new Select(formsLocators.aosFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(aos);
	waitForElementToVisible(formsLocators.aosFormElement, 5);
	highlightElement(formsLocators.aosFormElement);
	formsLocators.aosFormElement.click();
	formsLocators.CFaosElementOptions.click();
    }

    public void selectSpecCF(String spec) throws InterruptedException {
	// highlightElement(formsLocators.specFormElement);
	// sel = new Select(formsLocators.specFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(spec);
	waitForElementToVisible(formsLocators.specFormElement, 5);
	highlightElement(formsLocators.specFormElement);
	formsLocators.specFormElement.click();
	formsLocators.CFFormElementOptions.click();
    }

    public void selectDateCF(String date) throws InterruptedException {
	// highlightElement(formsLocators.specFormElement);
	// sel = new Select(formsLocators.specFormElement);
	// Thread.sleep(2000);
	// sel.selectByVisibleText(spec);
	waitForElementToVisible(formsLocators.startDate, 5);
	highlightElement(formsLocators.startDate);
	formsLocators.startDate.click();
	formsLocators.CFstartDateOptions.click();
    }

    public void enterFirstNameEForm(String fName) {
	waitForElementToVisible(formsLocators.emailUsFName, 2);
	highlightElement(formsLocators.emailUsFName);
	formsLocators.emailUsFName.sendKeys(fName);
    }

    public void enterLastNameEForm(String lName) {
	waitForElementToVisible(formsLocators.emailUsLName, 2);
	highlightElement(formsLocators.emailUsLName);
	formsLocators.emailUsLName.sendKeys(lName);
    }

    public void enterEmailAddressEForm(String dynEmailAddr) {
	waitForElementToVisible(formsLocators.emailUsEmail, 2);
	highlightElement(formsLocators.emailUsEmail);
	formsLocators.emailUsEmail.sendKeys(dynEmailAddr);
    }

    public void enterPhNumEForm(String phNum) {
	waitForElementToVisible(formsLocators.emailUsPhone, 2);
	highlightElement(formsLocators.emailUsPhone);
	formsLocators.emailUsPhone.click();
	formsLocators.emailUsPhone.sendKeys(phNum);
    }

    public void enteruserNotesEForm(String userNotes) {
	waitForElementToVisible(formsLocators.emailUsComments, 2);
	highlightElement(formsLocators.emailUsComments);
	formsLocators.emailUsComments.sendKeys(userNotes);
    }

    public void clickEmailUsAgreeGoBtn() {
	waitForElementToVisible(formsLocators.emailUsAgreeBtn, 2);
	highlightElement(formsLocators.emailUsAgreeBtn);
	formsLocators.emailUsAgreeBtn.submit();
    }

    public void movetoThnInterestWindow() {
	waitForElementToVisible(formsLocators.errorModal, 2);
	highlightElement(formsLocators.errorModal);
    }

    public void movetoThnWindow() {
	waitForElementToVisible(formsLocators.emailUsThnqWnd, 2);
	highlightElement(formsLocators.emailUsThnqWnd);
    }

    public String getThnTxtwinodw() {
	waitForElementToVisible(formsLocators.emailUsThnqMsg, 2);
	moveToMenu(formsLocators.emailUsThnqMsg);
	highlightElement(formsLocators.emailUsThnqMsg);
	return formsLocators.emailUsThnqMsg.getText();
    }

    public void clickViewProgBtn() {
	waitForElementToVisible(formsLocators.viewProgBtn, 2);
	highlightElement(formsLocators.viewProgBtn);
	formsLocators.viewProgBtn.click();
    }

    public void ClickCloseWinBtn() {
	waitForElementToVisible(formsLocators.emailUsCloseBtn, 2);
	highlightElement(formsLocators.emailUsCloseBtn);
	formsLocators.emailUsCloseBtn.click();
    }

    public void moveToEmailUSFrom() {
	waitForElementToVisible(formsLocators.emailUsForm, 2);
	highlightElement(formsLocators.emailUsForm);
    }

    public void moveToConsultationFrom() {
	waitForElementToVisible(formsLocators.ConsultationForm, 2);
	highlightElement(formsLocators.ConsultationForm);
    }

    public void clickSchldConsLink() {
	highlightElement(formsLocators.scheduleConsultationLinkElement);
	formsLocators.scheduleConsultationLinkElement.click();
    }

    public void clickReqInfoLink() {
	waitForElementToVisible(formsLocators.reqInfoLinkElement, 2);
	highlightElement(formsLocators.reqInfoLinkElement);
	formsLocators.reqInfoLinkElement.click();
    }

    public void moveToRFIFrom() {
	waitForElementToVisible(formsLocators.RFIForm, 2);
	highlightElement(formsLocators.RFIForm);
    }

    public void enterZipCode(String zipcode) {
	waitForElementToVisible(formsLocators.Zip, 2);
	highlightElement(formsLocators.Zip);
	formsLocators.Zip.sendKeys(zipcode);
    }

    // ******************* REFER A FRIEND FORM
    public void movetoRefFrndForm() {
	waitForElementToVisible(formsLocators.RefFrndForm, 2);
	moveToMenu(formsLocators.RefFrndForm);
	highlightElement(formsLocators.RefFrndForm);
    }

    public void OpenRefFndAppURL() {
	navigateToURL(ProjectVariables.RefFrndURL);
    }

    public void enterMyFName(String fName) {
	waitForElementToVisible(formsLocators.refFName, 2);
	highlightElement(formsLocators.refFName);
	formsLocators.refFName.sendKeys(fName);
    }

    public void enterMyLName(String lName) {
	waitForElementToVisible(formsLocators.refLName, 2);
	highlightElement(formsLocators.refLName);
	formsLocators.refLName.sendKeys(lName);
    }

    public void enterMyEmailAddress(String dynEmailAddr) {
	waitForElementToVisible(formsLocators.refEmail, 2);
	highlightElement(formsLocators.refEmail);
	formsLocators.refEmail.sendKeys(dynEmailAddr);
    }

    public void selectIam(String val) {
	waitForElementToVisible(formsLocators.RefIamElement, 5);
	highlightElement(formsLocators.RefIamElement);
	formsLocators.RefIamElement.click();
	formsLocators.RefIamElementOptions.click();
    }

    public void MovetoREfThnWnd() {
	waitForElementToVisible(formsLocators.RefFrnThqWnd, 5);
	moveToMenu(formsLocators.RefFrnThqWnd);
	highlightElement(formsLocators.RefFrnThqWnd);
    }

    public void enterEmailAddENewForm(String dynEmailAddr) {
	waitForElementToVisible(formsLocators.eNewsEmail, 2);
	highlightElement(formsLocators.eNewsEmail);
	formsLocators.eNewsEmail.sendKeys(dynEmailAddr);
    }

    public void ClicknAgnGoBtn() {
	waitForElementToVisible(formsLocators.AgnGoBtn, 2);
	highlightElement(formsLocators.AgnGoBtn);
	formsLocators.AgnGoBtn.click();
    }

    public void OpenEnApplication() {
	navigateToURL(ProjectVariables.ENewsLtrURL);
    }

    public void movetoLetsGoForm() {
	waitForElementToVisible(formsLocators.LetsGoForm, 5);
	highlightElement(formsLocators.LetsGoForm);
    }

    public String getTxtPurlFName() {
	waitForElementToVisible(formsLocators.PurlFName, 2);
	highlightElement(formsLocators.PurlFName);
	return formsLocators.PurlFName.getAttribute("value");
    }

    public String getTxtPurlLName() {
	waitForElementToVisible(formsLocators.PurlLName, 2);
	highlightElement(formsLocators.PurlLName);
	return formsLocators.PurlLName.getAttribute("value");
    }

    public String getTxtPurlAddress() {
	waitForElementToVisible(formsLocators.PurlAddress, 2);
	highlightElement(formsLocators.PurlAddress);
	return formsLocators.PurlAddress.getAttribute("value");
    }

    public String getTxtPurlEmail() {
	waitForElementToVisible(formsLocators.PurlEmail, 2);
	highlightElement(formsLocators.PurlEmail);
	return formsLocators.PurlEmail.getAttribute("value");
    }

    public String getTxtPurlPhone() {
	waitForElementToVisible(formsLocators.PurlPhoneNo, 2);
	highlightElement(formsLocators.PurlPhoneNo);
	System.out.println("Actual Phone No" + formsLocators.PurlPhoneNo.getAttribute("value"));
	return formsLocators.PurlPhoneNo.getAttribute("value");
    }

    public String getTxtPurlZip() {
	waitForElementToVisible(formsLocators.PurlZip, 2);
	highlightElement(formsLocators.PurlZip);
	return formsLocators.PurlZip.getAttribute("value");
    }

    public String getTxtPurlDegree() {
	waitForElementToVisible(formsLocators.PurlDegree, 2);
	highlightElement(formsLocators.PurlDegree);
	Select comboBox = new Select(formsLocators.PurlDegree);
	String selectedComboValue = comboBox.getFirstSelectedOption().getText();
	return selectedComboValue;
    }

    public String getTxtPurlArea() {
	waitForElementToVisible(formsLocators.PurlArea, 2);
	highlightElement(formsLocators.PurlArea);
	Select comboBox = new Select(formsLocators.PurlArea);
	String selectedComboValue = comboBox.getFirstSelectedOption().getText();
	return selectedComboValue;
    }

    public void selectDegreeEFormLP(String degree) throws InterruptedException {
	Select sel1 = new Select(formsLocators.LPdegreeElementOptions);
	sel1.selectByVisibleText(degree);
	Thread.sleep(2000);
	/*
	 * waitForElementToVisible(formsLocators.degreeFormElement, 2); //
	 * highlightElement(formsLocators.degreeFormElement);
	 * formsLocators.degreeFormElement.click();
	 * formsLocators.LPdegreeElementOptions.click();
	 */
    }

    public void selectAOSEFormLP(String aos) {
	Select sel2 = new Select(formsLocators.LPaosElementOptions);
	sel2.selectByVisibleText(aos);
	/*
	 * waitForElementToVisible(formsLocators.aosLPFormElement, 2); //
	 * highlightElement(formsLocators.aosLPFormElement);
	 * formsLocators.aosLPFormElement.click();
	 * formsLocators.LPaosElementOptions.click();
	 */
    }

    public void selectSpecLP(String spec) {
	Select sel1 = new Select(formsLocators.LPspecElementOptions);
	sel1.selectByVisibleText(spec);
	/*
	 * waitForElementToVisible(formsLocators.specFormElement, 2); //
	 * highlightElement(formsLocators.specFormElement);
	 * formsLocators.specFormElement.click();
	 * formsLocators.LPspecElementOptions.click();
	 */
    }

    public void selectSpecLPBatchlores(String spec) {
	Select sel1 = new Select(formsLocators.LPspecElementOptions);
	sel1.selectByVisibleText(spec);
	/*
	 * waitForElementToVisible(formsLocators.specFormElement, 2); //
	 * highlightElement(formsLocators.specFormElement);
	 * formsLocators.specFormElement.click();
	 * formsLocators.LPspecElementOptionsBachelors.click()
	 */;
    }

    public void selectEduVal(String edval) {
	Select sel1 = new Select(formsLocators.EduLevelElementOptions);
	sel1.selectByVisibleText(edval);
    }

    public void selectAge(String age) {
	Select sel1 = new Select(formsLocators.AgeOptions);
	sel1.selectByVisibleText(age);
    }

    public void selectMilitary(String Military) {
	waitForElementToVisible(formsLocators.MilOptions, 2);
	formsLocators.MilOptions.click();
    }

    public void selectDateLPBatchlores(String Date) {
	waitForElementToVisible(formsLocators.DateLPFormElement, 2);
	// highlightElement(formsLocators.specFormElement);
	formsLocators.DateLPFormElement.click();
	formsLocators.LPDateElementOptions.click();
    }

    public void enteLPrstNameLPForm(String fName) {
	waitForElementToVisible(formsLocators.LPFName, 2);
	// highlightElement(formsLocators.LPFName);
	formsLocators.LPFName.sendKeys(fName);
    }

    public void enterLastNameLPForm(String lName) {
	waitForElementToVisible(formsLocators.LPLName, 2);
	// highlightElement(formsLocators.LPLName);
	formsLocators.LPLName.sendKeys(lName);
    }

    public void enterEmailAddressLPForm(String dynEmailAddr) {
	waitForElementToVisible(formsLocators.LPEmail, 2);
//	highlightElement(formsLocators.LPEmail);
	formsLocators.LPEmail.sendKeys(dynEmailAddr);
    }

    public void enterZipCodeinLpForm(String zipcode) {
	waitForElementToVisible(formsLocators.LPZip, 2);
	// highlightElement(formsLocators.LPZip);
	formsLocators.LPZip.sendKeys(zipcode);
    }

    public void enterPhNumLPForm(String phNumbmer) {
	waitForElementToVisible(formsLocators.LPPhone, 2);
	// highlightElement(formsLocators.LPPhone);
	formsLocators.LPPhone.click();
	formsLocators.LPPhone.sendKeys(phNumbmer);
    }

    public String getThnTxPage() {
	waitForElementToVisible(formsLocators.ThankYou, 2);
	moveToMenu(formsLocators.ThankYou);
	highlightElement(formsLocators.ThankYou);
	return formsLocators.ThankYou.getText();
    }

    public String getThnPageURL() {
	return DriverManager.driver.get().getCurrentUrl();
    }
// ************************* LP Form Error Meesages

    public String getLPDegreeError() {
	waitForElementToVisible(formsLocators.LPdegError, 2);
	moveToMenu(formsLocators.LPdegError);
	// highlightElement(formsLocators.LPdegError);
	return formsLocators.LPdegError.getText();
    }

    public String getLPAosError() {
	waitForElementToVisible(formsLocators.LPaosError, 2);
	moveToMenu(formsLocators.LPaosError);
	// highlightElement(formsLocators.LPaosError);
	return formsLocators.LPaosError.getText();
    }

    public String getLPProgramError() {
	waitForElementToVisible(formsLocators.LPprogError, 2);
	moveToMenu(formsLocators.LPprogError);
	// highlightElement(formsLocators.LPprogError);
	return formsLocators.LPprogError.getText();
    }

    public String getLPFnameError() {
	waitForElementToVisible(formsLocators.LPfnameError, 2);
	moveToMenu(formsLocators.LPfnameError);
	highlightElement(formsLocators.LPfnameError);
	return formsLocators.LPfnameError.getText();
    }

    public String getLPLnameError() {
	waitForElementToVisible(formsLocators.LPlnameError, 2);
	moveToMenu(formsLocators.LPlnameError);
	highlightElement(formsLocators.LPlnameError);
	return formsLocators.LPlnameError.getText();
    }

    public String getLPEmailError() {
	waitForElementToVisible(formsLocators.LPemailError, 2);
	moveToMenu(formsLocators.LPemailError);
	highlightElement(formsLocators.LPemailError);
	return formsLocators.LPemailError.getText();
    }

    public String getLPEmailValidError() {
	waitForElementToVisible(formsLocators.LPemailvalidError, 2);
	moveToMenu(formsLocators.LPemailvalidError);
	// highlightElement(formsLocators.LPemailvalidError);
	return formsLocators.LPemailvalidError.getText();
    }

    public String getLPPhoneError() {
	waitForElementToVisible(formsLocators.LpphoneError, 2);
	moveToMenu(formsLocators.LpphoneError);
	highlightElement(formsLocators.LpphoneError);
	return formsLocators.LpphoneError.getText();
    }

    public String getLPZipError() {
	waitForElementToVisible(formsLocators.LPzipError, 2);
	moveToMenu(formsLocators.LPzipError);
	highlightElement(formsLocators.LPzipError);
	return formsLocators.LPzipError.getText();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void moveToPFQForm() throws InterruptedException {
	waitForElementToVisible(formsLocators.PFQForm, 2);
	moveToMenu(formsLocators.PFQForm);
	highlightElement(formsLocators.PFQForm);
	Thread.sleep(3000);
    }

    public void enterPFQFName(String fName) {
	waitForElementToVisible(formsLocators.PFQFName, 2);
	moveToMenu(formsLocators.PFQFName);
	highlightElement(formsLocators.PFQFName);
	formsLocators.PFQFName.sendKeys(fName);
    }

    public void enterPFQLName(String lName) {
	waitForElementToVisible(formsLocators.PFQLName, 2);
	moveToMenu(formsLocators.PFQLName);
	highlightElement(formsLocators.PFQLName);
	formsLocators.PFQLName.sendKeys(lName);
    }

    public void enterPFQEmail(String dynEmailAddr) {
	waitForElementToVisible(formsLocators.PFQEmail, 2);
	highlightElement(formsLocators.PFQEmail);
	formsLocators.PFQEmail.sendKeys(dynEmailAddr);
    }

    public void enterPhNumPFQ(String phNum) {
	waitForElementToVisible(formsLocators.PFQPhone, 2);
	highlightElement(formsLocators.PFQPhone);
	formsLocators.PFQPhone.click();
	formsLocators.PFQPhone.sendKeys(phNum);
    }

    public void enterPFQZip(String zipCode) {
	waitForElementToVisible(formsLocators.PFQZip, 2);
	moveToMenu(formsLocators.PFQZip);
	highlightElement(formsLocators.PFQZip);
	formsLocators.PFQZip.sendKeys(zipCode);
    }

    public void clickPFQAgreenGo() {
	waitForElementToVisible(formsLocators.PFQAgreeNGo, 2);
	moveToMenu(formsLocators.PFQAgreeNGo);
	highlightElement(formsLocators.PFQAgreeNGo);
	formsLocators.PFQAgreeNGo.click();
    }

    public String getPFQSuccessMsg() {
	waitForElementToVisible(formsLocators.PFQSuccessMsg, 2);
	moveToMenu(formsLocators.PFQSuccessMsg);
	highlightElement(formsLocators.PFQSuccessMsg);
	System.out.println("Thqnk:" + formsLocators.PFQSuccessMsg.getText());
	return formsLocators.PFQSuccessMsg.getText();
    }

    public void PFQSelectDegree(String degval) {
	Select sel1 = new Select(formsLocators.PFQDegree);
	sel1.selectByVisibleText(degval);
    }

    public void PFQSelectAos(String aosval) {
	Select sel1 = new Select(formsLocators.PFQAos);
	sel1.selectByVisibleText(aosval);
    }

    public void PFQSelectSpecialization(String splval) {
	Select sel1 = new Select(formsLocators.PFQSpl);
	sel1.selectByVisibleText(splval);
    }

    public void fillPFQData() throws InterruptedException {
	waitForElementToVisible(formsLocators.TakeQuizButton, 2);
	moveToMenu(formsLocators.TakeQuizButton);
	highlightElement(formsLocators.TakeQuizButton);
	formsLocators.TakeQuizButton.click();
	Thread.sleep(5000);
	waitForElementToVisible(formsLocators.s1c1, 2);
	moveToMenu(formsLocators.s1c1);
	formsLocators.s1c1.click();
	formsLocators.NextBtn.click();
	waitForElementToVisible(formsLocators.s2c1, 2);
	moveToMenu(formsLocators.s2c1);
	formsLocators.s2c1.click();
	formsLocators.NextBtn.click();
	waitForElementToVisible(formsLocators.s3c1, 2);
	moveToMenu(formsLocators.s3c1);
	formsLocators.s3c1.click();
	formsLocators.NextBtn.click();
	waitForElementToVisible(formsLocators.s4c1, 2);
	moveToMenu(formsLocators.s4c1);
	formsLocators.s4c1.click();
	formsLocators.NextBtn.click();
	waitForElementToVisible(formsLocators.s5op1, 2);
	moveToMenu(formsLocators.s5op1);
	formsLocators.s5op1.click();
	waitForElementToVisible(formsLocators.s5op2, 2);
	moveToMenu(formsLocators.s5op2);
	formsLocators.s5op2.click();
	waitForElementToVisible(formsLocators.s5op3, 2);
	moveToMenu(formsLocators.s5op3);
	formsLocators.s5op3.click();
	waitForElementToVisible(formsLocators.s5op4, 2);
	moveToMenu(formsLocators.s5op4);
	formsLocators.s5op4.click();
	waitForElementToVisible(formsLocators.s5op5, 2);
	moveToMenu(formsLocators.s5op5);
	formsLocators.s5op5.click();
	formsLocators.NextBtn.click();
	waitForElementToVisible(formsLocators.s6op1, 2);
	moveToMenu(formsLocators.s6op1);
	formsLocators.s6op1.click();
	formsLocators.NextBtn.click();
	waitForElementToVisible(formsLocators.s7op1, 2);
	moveToMenu(formsLocators.s7op1);
	formsLocators.s7op1.click();
	formsLocators.NextBtn.click();
    }

//********************** PEP FORM ACTIONS
    public void selectAosinPEP(String pgVal) {
	waitForElementToVisible(formsLocators.TabContent, 2);
	moveToMenu(formsLocators.TabContent);
	// highlightElement(formsLocators.TabContent);
	waitForElementToVisible(formsLocators.aosLevelinPEP, 2);
	moveToMenu(formsLocators.aosLevelinPEP);
	formsLocators.aosLevelinPEP.click();
	waitForElementToVisible(formsLocators.aosLevelinPEPList, 2);

	formsLocators.aosOptionsinPEP.click();
    }

    public void selectDegreePEP(String degVal) {
	waitForElementToVisible(formsLocators.degreeLevelPEP, 2);
	moveToMenu(formsLocators.degreeLevelPEP);
	formsLocators.degreeLevelPEP.click();
	formsLocators.degreeLevelOptionsPEP.click();
    }

    public void selectProgramPEP(String pgval) {
	waitForElementToVisible(formsLocators.programPEP, 2);
	moveToMenu(formsLocators.programPEP);
	formsLocators.programPEP.click();
	formsLocators.programOptionsPEP.click();
    }

    public void moveToPEPForm() throws InterruptedException {
	waitForElementToVisible(formsLocators.PEPForm, 2);
	moveToMenu(formsLocators.PEPForm);
	highlightElement(formsLocators.PEPForm);
    }

    public void fillPEPData() throws InterruptedException {
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();",
		DriverManager.driver.get().findElement(By.xpath("//a[contains(text(),'Learning options')]")));
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", formsLocators.PepOp1);
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", formsLocators.PepOp2);
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", formsLocators.PepOp3);
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", formsLocators.PepOp4);
	formsLocators.PepOp4.sendKeys("2");
	formsLocators.PepOp5.sendKeys("3");
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();",
		formsLocators.PepOpSRsltBtn);
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();",
		formsLocators.PepOpWayToSaveBtn);
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", formsLocators.PepOp6);
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", formsLocators.PepOp7);
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();",
		formsLocators.ShowResultsBtn);
	waitForElementToVisible(formsLocators.CompleMyPlanBtn, 5);
	moveToMenu(formsLocators.CompleMyPlanBtn);
	((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();",
		formsLocators.CompleMyPlanBtn);
    }

    public void enterPEPFName(String fName) {
	waitForElementToVisible(formsLocators.PEPFName, 2);
	moveToMenu(formsLocators.PEPFName);
	highlightElement(formsLocators.PEPFName);
	formsLocators.PEPFName.sendKeys(fName);
    }

    public void enterPEPLName(String lName) {
	waitForElementToVisible(formsLocators.PEPLName, 2);
	moveToMenu(formsLocators.PEPLName);
	highlightElement(formsLocators.PEPLName);
	formsLocators.PEPLName.sendKeys(lName);
    }

    public void enterPEPEmail(String dynEmailAddr) {
	waitForElementToVisible(formsLocators.PEPEmail, 2);
	highlightElement(formsLocators.PEPEmail);
	formsLocators.PEPEmail.sendKeys(dynEmailAddr);
    }

    public void enterPhNumPEP(String phNum) {
	waitForElementToVisible(formsLocators.PEPPhone, 2);
	highlightElement(formsLocators.PEPPhone);
	formsLocators.PEPPhone.click();
	formsLocators.PEPPhone.sendKeys(phNum);
    }

    public void enterPEPZip(String zipCode) {
	waitForElementToVisible(formsLocators.PEPZip, 2);
	moveToMenu(formsLocators.PEPZip);
	highlightElement(formsLocators.PEPZip);
	formsLocators.PEPZip.sendKeys(zipCode);
    }

    public void clickPEPAgreenGo() {
	waitForElementToVisible(formsLocators.PEPAgreeNGo, 2);
	moveToMenu(formsLocators.PEPAgreeNGo);
	highlightElement(formsLocators.PEPAgreeNGo);
	formsLocators.PEPAgreeNGo.submit();
    }

}