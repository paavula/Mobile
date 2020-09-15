package pages.actions;

import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import pages.locators.FooterLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class FooterActions extends BasePage<Object> {

    FooterLocators footerLocators = null;
    Select sel;

    public FooterActions() {
	this.footerLocators = new FooterLocators();
	PageFactory.initElements(DriverManager.getDriver(), footerLocators);
    }

    public void moveToMenu(WebElement ele) {
	Actions action = new Actions(DriverManager.getDriver());
	action.moveToElement(ele).perform();
    }

    public void clickFooter() {
	waitForElementToVisible(footerLocators.footer, 2);
	highlightElement(footerLocators.footer);
	moveToMenu(footerLocators.footer);

    }

    public void MoveToFooter() {
	waitForElementToVisible(footerLocators.footer, 2);
	moveToMenu(footerLocators.footer);
    }

    public void clickSiteMap() {

	waitForElementToVisible(footerLocators.siteMapLink, 2);

	highlightElement(footerLocators.siteMapLink);
	moveToMenu(footerLocators.siteMapLink);
	footerLocators.siteMapLink.click();

    }

    public void clickFooterribbon() {

	waitForElementToVisible(footerLocators.footerRibbon, 5);
	moveToMenu(footerLocators.footerRibbon);
	highlightElement(footerLocators.footerRibbon);
	highlightElement(footerLocators.ribbonMobileNo);
	highlightElement(footerLocators.ribbonchatnow);
	highlightElement(footerLocators.ribbonReqInfo);

    }

    public void clickSocialLinks() {

	waitForElementToVisible(footerLocators.socialfooter, 5);
	moveToMenu(footerLocators.socialfooter);
	highlightElement(footerLocators.socialfooter);

    }

    public void clickfooterLogo() {
	waitForElementToVisible(footerLocators.fLogo, 5);
	highlightElement(footerLocators.fLogo);
	footerLocators.fLogo.click();

    }

    public void ClickToStart() {
	// waitForElementToVisible(footerLocators.ribbonchatnow, 5);

	// highlightElement(footerLocators.ribbonchatnow);
	footerLocators.ribbonchatnow.click();

    }

    public String getTxtcopyright() {
	waitForElementToVisible(footerLocators.copyRight, 2);
	moveToMenu(footerLocators.copyRight);
	highlightElement(footerLocators.copyRight);
	return DriverManager.driver.get().getPageSource();

    }

    public String getTxtCpcopyright() {
	waitForElementToVisible(footerLocators.copyRight, 2);

	moveToMenu(footerLocators.copyRight);
	highlightElement(footerLocators.copyRight);
	return DriverManager.driver.get().getPageSource();

    }

    @SuppressWarnings("rawtypes")
	@Override
    public ExpectedCondition getPageLoadCondition() {
	return null;
    }

    public void clickContactUs() {
	waitForElementToVisible(footerLocators.contactUsLink, 5);

	highlightElement(footerLocators.contactUsLink);
	footerLocators.contactUsLink.click();

    }

    public String getTxtContactUsPage() {
	waitForElementToVisible(footerLocators.contactUsLink, 2);

	moveToMenu(footerLocators.contactUsLink);
	return footerLocators.contactUsLink.getText();

    }

    public String getTxtSocialLink() {
	waitForElementToVisible(footerLocators.socialfooter, 5);

	moveToMenu(footerLocators.socialfooter);
	return DriverManager.driver.get().getPageSource();
    }

    public String getTxtfooterRibbon() {
	waitForElementToVisible(footerLocators.footerRibbon, 5);

	moveToMenu(footerLocators.footerRibbon);
	return footerLocators.footerRibbon.getText();
    }

    public String getSocialLinkCS() {
	waitForElementToVisible(footerLocators.socialfootertxt, 5);

	moveToMenu(footerLocators.socialfootertxt);
	highlightElement(footerLocators.socialfootertxt);
	return footerLocators.socialfootertxt.getText();
    }

    public void clickFooterRFI() {
	waitForElementToVisible(footerLocators.footerRFI, 5);

	moveToMenu(footerLocators.footerRFI);
	highlightElement(footerLocators.footerRFI);

    }

    public String getTxtfooterRFI() {
	waitForElementToVisible(footerLocators.footerRFItxt, 5);

	moveToMenu(footerLocators.footerRFItxt);
	highlightElement(footerLocators.footerRFItxt);
	return footerLocators.footerRFItxt.getText();
    }

    public String getTxtChatWindow() {
	waitForElementToVisible(footerLocators.chatWindow, 5);

	moveToMenu(footerLocators.chatWindow);
	highlightElement(footerLocators.chatWindow);
	return footerLocators.chatWindow.getText();
    }

    public void clickBannerRFI() {
	waitForElementToVisible(footerLocators.bannerRFI, 5);

	moveToMenu(footerLocators.bannerRFI);
	highlightElement(footerLocators.bannerRFI);

    }

    public String getTxtBannerRFI() {
	waitForElementToVisible(footerLocators.bannerRFItxt, 5);

	moveToMenu(footerLocators.bannerRFItxt);
	highlightElement(footerLocators.bannerRFItxt);
	return footerLocators.bannerRFItxt.getText();
    }

    /*
     * public void selectDegree(String degVal) {
     * 
     * waitForElementToVisible(footerLocators.degreeLeveloptions, 5);
     * 
     * highlightElement(footerLocators.degreeLeveloptions);
     * footerLocators.degreeLeveloptions.click();
     * footerLocators.degreeLevel.click(); }
     * 
     * public void selectAOS(String aos) {
     * 
     * waitForElementToVisible(footerLocators.programoptions, 5);
     * 
     * highlightElement(footerLocators.programoptions);
     * footerLocators.programoptions.click();
     * footerLocators.programInterrest.click(); // Select sel1 = new
     * Select(footerLocators.programInterrest); // sel1.selectByVisibleText(aos);
     * 
     * }
     * 
     * public void enterfName(String fName) {
     * waitForElementToVisible(footerLocators.fName, 2);
     * 
     * highlightElement(footerLocators.fName); footerLocators.fName.sendKeys(fName);
     * }
     * 
     * public void enterlName(String lName) {
     * waitForElementToVisible(footerLocators.lName, 2);
     * 
     * highlightElement(footerLocators.lName); footerLocators.lName.sendKeys(lName);
     * }
     * 
     * public void enterEmail(String email) {
     * waitForElementToVisible(footerLocators.email, 2);
     * 
     * highlightElement(footerLocators.email); footerLocators.email.sendKeys(email);
     * }
     * 
     * public void enterphoneNumber(String phone) {
     * waitForElementToVisible(footerLocators.phone, 2);
     * 
     * highlightElement(footerLocators.phone); footerLocators.phone.sendKeys(phone);
     * }
     * 
     * public void enterZip(String zip) {
     * waitForElementToVisible(footerLocators.zipcode, 2);
     * 
     * highlightElement(footerLocators.zipcode);
     * footerLocators.zipcode.sendKeys(zip); }
     * 
     * public void ClickAnGobtnrfi() {
     * waitForElementToVisible(footerLocators.agreenGobtnrfi, 5);
     * 
     * highlightElement(footerLocators.agreenGobtnrfi);
     * footerLocators.agreenGobtnrfi.submit(); }
     * 
     * public void ClickAnGobtn() {
     * waitForElementToVisible(footerLocators.agreenGobtn, 5);
     * 
     * highlightElement(footerLocators.agreenGobtn);
     * footerLocators.agreenGobtn.submit(); } public void selectDegreeInBR(String
     * degVal) {
     * 
     * waitForElementToVisible(footerLocators.degreeLeveloptionsBR, 5);
     * 
     * highlightElement(footerLocators.degreeLeveloptionsBR);
     * footerLocators.degreeLeveloptionsBR.click();
     * footerLocators.degreeLevelBR.click();
     * 
     * // Select sel = new Select(footerLocators.degreeLevel);
     * 
     * // sel.selectByVisibleText(degVal);
     * 
     * }
     * 
     * public void selectAOSInBR(String aos) {
     * 
     * waitForElementToVisible(footerLocators.programoptionsBR, 5);
     * 
     * highlightElement(footerLocators.programoptionsBR);
     * footerLocators.programoptionsBR.click();
     * footerLocators.programInterrestBR.click(); // Select sel1 = new
     * Select(footerLocators.programInterrest); // sel1.selectByVisibleText(aos);
     * 
     * }
     * 
     * public void enterfNameInBR(String fName) {
     * waitForElementToVisible(footerLocators.fNameBR, 2);
     * 
     * highlightElement(footerLocators.fNameBR);
     * footerLocators.fNameBR.sendKeys(fName); }
     * 
     * public void enterlNameInBR(String lName) {
     * waitForElementToVisible(footerLocators.lNameBR, 2);
     * 
     * highlightElement(footerLocators.lNameBR);
     * footerLocators.lNameBR.sendKeys(lName); }
     * 
     * public void enterEmailKInBR(String email) {
     * waitForElementToVisible(footerLocators.emailBR, 5);
     * 
     * highlightElement(footerLocators.emailBR);
     * footerLocators.emailBR.sendKeys(email); }
     * 
     * public void enterphoneNumberInBR(String phone) {
     * waitForElementToVisible(footerLocators.phoneBR, 2);
     * 
     * highlightElement(footerLocators.phoneBR);
     * footerLocators.phoneBR.sendKeys(phone); }
     * 
     * public void enterZipinBR(String zip) {
     * waitForElementToVisible(footerLocators.zipcodeBR, 2);
     * 
     * highlightElement(footerLocators.zipcodeBR);
     * footerLocators.zipcodeBR.sendKeys(zip); }
     * 
     * public void ClickAnGobtninBR() {
     * waitForElementToVisible(footerLocators.agreenGobtnBR, 5);
     * 
     * highlightElement(footerLocators.agreenGobtnBR);
     * footerLocators.agreenGobtnBR.submit(); }
     * 
     * public void checkmilitary() { waitForElementToVisible(footerLocators.no, 3);
     * 
     * highlightElement(footerLocators.no); }
     * 
     * public void enterfNameInVBR(String fName) {
     * waitForElementToVisible(footerLocators.fNameVBR, 2);
     * 
     * highlightElement(footerLocators.fNameVBR);
     * footerLocators.fNameVBR.sendKeys(fName); }
     * 
     * public void enterlNameInVBR(String lName) {
     * waitForElementToVisible(footerLocators.lNameVBR, 2);
     * 
     * highlightElement(footerLocators.lNameVBR);
     * footerLocators.lNameVBR.sendKeys(lName); }
     * 
     * public void enterEmailKInVBR(String email) {
     * waitForElementToVisible(footerLocators.emailVBR, 5);
     * 
     * highlightElement(footerLocators.emailVBR);
     * footerLocators.emailVBR.sendKeys(email); }
     * 
     * public void enterphoneNumberInVBR(String phone) {
     * waitForElementToVisible(footerLocators.phoneVBR, 2);
     * 
     * highlightElement(footerLocators.phoneVBR);
     * footerLocators.phoneVBR.sendKeys(phone); }
     * 
     * public void enterZipinVBR(String zip) {
     * waitForElementToVisible(footerLocators.zipcodeVBR, 2);
     * 
     * highlightElement(footerLocators.zipcodeVBR);
     * footerLocators.zipcodeVBR.sendKeys(zip); }
     * 
     * public void ClickAnGobtninVBR() {
     * waitForElementToVisible(footerLocators.agreenGobtnVBR, 5);
     * 
     * highlightElement(footerLocators.agreenGobtnVBR);
     * footerLocators.agreenGobtnVBR.submit(); }
     */
    public String getTxtpage() {
    	String Url = DriverManager.getDriver().getCurrentUrl();
    	System.out.println("Current URL :" + Url);
	return DriverManager.driver.get().getTitle();
    }

    public String getTxtQuickLinksModule() {
	waitForElementToVisible(footerLocators.quickLink, 3);
	highlightElement(footerLocators.quickLink);
	return footerLocators.quickLink.getText();
    }

    public String getTxtAOSLinksModule() {
	waitForElementToVisible(footerLocators.aosLink, 3);
	highlightElement(footerLocators.aosLink);
	return footerLocators.aosLink.getText();
    }

    public void clickQuickLink() {

	waitForElementToVisible(footerLocators.quickLinkModule, 3);
	highlightElement(footerLocators.quickLinkModule);
    }

    public void clickAOSLink() {

	waitForElementToVisible(footerLocators.aosModule, 3);
	highlightElement(footerLocators.aosModule);
    }

    public String getTxtMoreLinksModule() {
	waitForElementToVisible(footerLocators.moreLink, 3);
	highlightElement(footerLocators.moreLink);
	return footerLocators.moreLink.getText();
    }

    public void clickMoreLink() {
	// waitForElementToVisible(footerLocators.footerLinksModule, 3);
	waitForElementToVisible(footerLocators.moreLinkModule, 3);

	highlightElement(footerLocators.moreLinkModule);
    }

    public String getTxtLegalLinksModule() {
	waitForElementToVisible(footerLocators.legalLink, 3);

	highlightElement(footerLocators.legalLink);
	return footerLocators.legalLink.getText();
    }

    public void clickLegalLink() {
	// (footerLocators.footerLinksModule, 3);
	waitForElementToVisible(footerLocators.legalLinkModule, 3);

	highlightElement(footerLocators.legalLinkModule);
    }

    public void open_BRFI_Application() {
	navigateToURL(ProjectVariables.BRFI_URL);

    }

    /*
     * public String getfNameError() {
     * waitForElementToVisible(footerLocators.fNameError);
     * 
     * highlightElement(footerLocators.fNameError); return
     * footerLocators.fNameError.getText(); }
     * 
     * public String getlNameError() {
     * waitForElementToVisible(footerLocators.lNameError);
     * 
     * highlightElement(footerLocators.lNameError); return
     * footerLocators.lNameError.getText(); }
     * 
     * public String getEmailError() {
     * waitForElementToVisible(footerLocators.eMailError);
     * 
     * highlightElement(footerLocators.eMailError); return
     * footerLocators.eMailError.getText(); }
     * 
     * public String getPhoneError() {
     * waitForElementToVisible(footerLocators.phoneError);
     * 
     * highlightElement(footerLocators.phoneError); return
     * footerLocators.phoneError.getText(); }
     * 
     * public String getZipeError() {
     * waitForElementToVisible(footerLocators.zipeError);
     * 
     * highlightElement(footerLocators.zipeError); return
     * footerLocators.zipeError.getText(); }
     */
    public int getPageCode() {
	// TODO Auto-generated method stub
	String Url = DriverManager.getDriver().getCurrentUrl();
	System.out.println("Current URL :" + Url);

	return getResponseCode(Url);
    }

    public void getErrors() throws InterruptedException {
	System.out.println("PROGRAM FOR CONSOLE ERRORS");

	int rowcount = testDataXls.getRowCount("Errors");
	System.out.println("total no of rows are " + rowcount);
	int row = rowcount + 1;
	System.out.println("the current row is " + row);
	String url = DriverManager.getDriver().getCurrentUrl();
	testDataXls.setCellData("Errors", "URL", row, url);
	Thread.sleep(1000);
	// Declare the LogEntires class and set LogType as Browser
	LogEntries entry = DriverManager.getDriver().manage().logs().get(LogType.BROWSER);
	// Get the size of the Error (Premittve_Name is SEVERE for Error)
	String error_count = Integer.toString(entry.filter(Level.SEVERE).size());
	testDataXls.setCellData("Errors", "Error Counts", row, error_count);
	String warning_count = Integer.toString(entry.filter(Level.WARNING).size());
	testDataXls.setCellData("Errors", "Warning Counts", row, warning_count);
	List<LogEntry> warningentry = entry.filter(Level.WARNING);
	String warnlogs = "";
	String warnmsg = "";
	for (LogEntry warningmsg : warningentry) {
	    if (warningmsg.getLevel().getName().equalsIgnoreCase("warning")) {
		warnlogs = warningmsg.getMessage();
		warnmsg += warnlogs + " ; ";
		testDataXls.setCellData("Errors", "Warning Messages", row, warnmsg);
	    }
	}
	// Iterate the error Message's
	List<LogEntry> errorentry = entry.filter(Level.SEVERE);
	String logs = "";
	String finalmsg = "";
	for (LogEntry msg : errorentry) {
	    logs = msg.getMessage();
	    finalmsg += logs + " ; ";
	    testDataXls.setCellData("Errors", "Error Messages", row, finalmsg);
	}

    }

}
