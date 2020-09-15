package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import pages.locators.VCMegaMenuLocators;
import utils.BasePage;
import utils.DriverManager;
import utils.ProjectVariables;

public class VCMegaMenuActions extends BasePage<Object> {

    VCMegaMenuLocators menuLocators = null;

    public VCMegaMenuActions() {
	this.menuLocators = new VCMegaMenuLocators();
	PageFactory.initElements(DriverManager.getDriver(), menuLocators);
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

    public void moveToDegrees() {
	waitForElementToVisible(menuLocators.navigationBar, 2);
	highlightElement(menuLocators.navigationBar);
	waitForElementToVisible(menuLocators.degreeAndProgramLink, 2);
	highlightElement(menuLocators.degreeAndProgramLink);
	moveToMenu(menuLocators.degreeAndProgramLink);

    }

    public String getTxtDegreesandProgram() {
	waitForElementToVisible(menuLocators.degreeAndProgramLink, 2);
	moveToMenu(menuLocators.degreeAndProgramLink);
	return menuLocators.degreeAndProgramLink.getText();
    }

    public void moveToCapExp() {
	waitForElementToVisible(menuLocators.navigationBar, 2);
	highlightElement(menuLocators.navigationBar);
	waitForElementToVisible(menuLocators.capellaExpLink, 2);
	moveToMenu(menuLocators.capellaExpLink);
	highlightElement(menuLocators.capellaExpLink);

    }

    public String getTxtCapExp() {
	waitForElementToVisible(menuLocators.capellaExpLink, 2);
	moveToMenu(menuLocators.capellaExpLink);
	return menuLocators.capellaExpLink.getText();
    }

    public void moveToFinance() {
	waitForElementToVisible(menuLocators.navigationBar, 2);
	highlightElement(menuLocators.navigationBar);
	waitForElementToVisible(menuLocators.financingLink, 2);
	moveToMenu(menuLocators.financingLink);
	highlightElement(menuLocators.financingLink);

    }

    public String getTxtFinancelLink() {
	waitForElementToVisible(menuLocators.financingLink, 2);
	moveToMenu(menuLocators.financingLink);
	return menuLocators.financingLink.getText();
    }

    public void MoveToApply() {
	waitForElementToVisible(menuLocators.navigationBar, 2);
	highlightElement(menuLocators.navigationBar);
	waitForElementToVisible(menuLocators.applyLink, 2);
	moveToMenu(menuLocators.applyLink);
	highlightElement(menuLocators.applyLink);

    }

    public String getTxtApplyLink() {
	waitForElementToVisible(menuLocators.applyLink, 2);
	moveToMenu(menuLocators.applyLink);
	return menuLocators.applyLink.getText();
    }

    public void moveToApplyChildLinks() {
	waitForElementToVisible(menuLocators.applyLinkModule, 2);
	moveToMenu(menuLocators.applyLinkModule);
	highlightElement(menuLocators.applyLinkModule);

    }

    public void moveToFinancingChildLinks() {
	waitForElementToVisible(menuLocators.financingLinkModule, 2);
	moveToMenu(menuLocators.financingLinkModule);
	highlightElement(menuLocators.financingLinkModule);

    }

    public void moveToCapellaExpChildLinks() {
	waitForElementToVisible(menuLocators.capellaExpLinkModule, 2);
	moveToMenu(menuLocators.capellaExpLinkModule);
	highlightElement(menuLocators.capellaExpLinkModule);

    }

    public void moveToLeftTrail() {
	waitForElementToVisible(menuLocators.leftLinkTrail, 2);
	moveToMenu(menuLocators.leftLinkTrail);
	highlightElement(menuLocators.leftLinkTrail);

    }

    public void moveToVcFooter() {
	waitForElementToVisible(menuLocators.VcFooterModule, 2);
	moveToMenu(menuLocators.VcFooterModule);
	highlightElement(menuLocators.VcFooterModule);

    }

    public String getTxtaosLink() {
	waitForElementToVisible(menuLocators.aosLink, 2);
	moveToMenu(menuLocators.aosLink);
	highlightElement(menuLocators.aosLink);
	return menuLocators.aosLink.getText();
    }

    public String getTxtabtUsLink() {
	waitForElementToVisible(menuLocators.aboutsLink, 2);
	moveToMenu(menuLocators.aboutsLink);
	highlightElement(menuLocators.aboutsLink);
	return menuLocators.aboutsLink.getText();
    }

    public String getTxtCapResLink() {
	waitForElementToVisible(menuLocators.capellResultLink, 2);
	moveToMenu(menuLocators.capellResultLink);
	highlightElement(menuLocators.capellResultLink);
	return menuLocators.capellResultLink.getText();
    }

    public String getTxtInfoForLink() {
	waitForElementToVisible(menuLocators.informationLink, 2);
	moveToMenu(menuLocators.informationLink);
	highlightElement(menuLocators.informationLink);
	return menuLocators.informationLink.getText();
    }

    public void moveToFooterModule() {
	waitForElementToVisible(menuLocators.FooterLinksModule, 2);
	moveToMenu(menuLocators.FooterLinksModule);
	highlightElement(menuLocators.FooterLinksModule);

    }

    public void moveToGetInfoModule() {
	waitForElementToVisible(menuLocators.getInfoModule, 2);
	moveToMenu(menuLocators.getInfoModule);
	highlightElement(menuLocators.getInfoModule);

    }

    public void moveToGetInfomoreModule() {
	waitForElementToVisible(menuLocators.getInfoModule1, 2);
	moveToMenu(menuLocators.getInfoModule1);
	highlightElement(menuLocators.getInfoModule1);

    }

    public void moveTogGtDetailModuleModule() {
	waitForElementToVisible(menuLocators.getDetailModule, 2);
	moveToMenu(menuLocators.getDetailModule);
	highlightElement(menuLocators.getDetailModule);

    }

    public void moveToreadyForNextModule() {
	waitForElementToVisible(menuLocators.readyForNextModule, 2);
	moveToMenu(menuLocators.readyForNextModule);
	highlightElement(menuLocators.readyForNextModule);

    }

    public void movetoRfi() {
	waitForElementToVisible(menuLocators.RfiForm, 2);
	moveToMenu(menuLocators.RfiForm);
	highlightElement(menuLocators.RfiForm);
    }

    public boolean verifyRfiForm() {
	waitForElementToVisible(menuLocators.RfiForm, 2);
	moveToMenu(menuLocators.RfiForm);
	highlightElement(menuLocators.RfiForm);
	return menuLocators.RfiForm.isDisplayed();
    }

    public boolean verifySCForm() {
	waitForElementToVisible(menuLocators.RfiForm, 2);
	moveToMenu(menuLocators.RfiForm);
	highlightElement(menuLocators.RfiForm);
	return menuLocators.RfiForm.isDisplayed();
    }

    public boolean movetoRfiForm() {
	waitForElementToVisible(menuLocators.PMLPForm, 2);
	moveToMenu(menuLocators.PMLPForm);
	highlightElement(menuLocators.PMLPForm);
	return menuLocators.PMLPForm.isDisplayed();

    }

    public void clickLink() {
	waitForElementToVisible(menuLocators.RFILink, 2);
	moveToMenu(menuLocators.RFILink);
	// highlightElement(menuLocators.RFILink);
	menuLocators.RFILink.click();
    }

    public void clickRfpLink() {
	waitForElementToVisible(menuLocators.RFILink, 2);
	moveToMenu(menuLocators.RFILink);
	highlightElement(menuLocators.RFILink);
	menuLocators.RFILink.click();
    }

    public void OpenLpHomePage() {
	navigateToURL(ProjectVariables.CULPHomePage_URL);
    }

    public void OpenLpAccessibilityPage() {
	navigateToURL(ProjectVariables.CULPAccessibilityPage_URL);
    }

    public void OpenLpPhdPage() {
	navigateToURL(ProjectVariables.CULPPHDPage_URL);
    }

    public void OpenLPPage() {
	navigateToURL(ProjectVariables.CUAppPage_URL);
    }

    public void moveToLpAccordion() {
	waitForElementToVisible(menuLocators.culpTabsModule, 2);
	moveToMenu(menuLocators.culpTabsModule);
	highlightElement(menuLocators.culpTabsModule);
    }

    public void movetoJumpLinkMenu() {
	waitForElementToVisible(menuLocators.culpjumplinknav, 2);
	moveToMenu(menuLocators.culpjumplinknav);
	highlightElement(menuLocators.culpjumplinknav);
    }

    public void movetoLPUtilityNav() {
	waitForElementToVisible(menuLocators.culpjumpUtilitynav, 2);
	moveToMenu(menuLocators.culpjumpUtilitynav);
	highlightElement(menuLocators.culpjumpUtilitynav);
    }

    public void moveToFooter() {
	waitForElementToVisible(menuLocators.culpFooter, 2);
	moveToMenu(menuLocators.culpFooter);
	highlightElement(menuLocators.culpFooter);
    }

    public void moveToAccessabilityFooter() {
	waitForElementToVisible(menuLocators.culpAccessFooter, 2);
	moveToMenu(menuLocators.culpAccessFooter);
	highlightElement(menuLocators.culpAccessFooter);
    }

    public void moveToFooterLinkModule() {
	waitForElementToVisible(menuLocators.culpFooterModule, 2);
	moveToMenu(menuLocators.culpFooterModule);
	highlightElement(menuLocators.culpFooterModule);
    }

}
