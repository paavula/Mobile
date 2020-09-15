package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChildPageLocators {

	@FindBy(xpath = "//*[text()='MEET STUDENT SERVICE COACH TANIKA FEASTER']")
	public WebElement tilteTxtHeader;

	@FindBy(xpath = "//html/body/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/p[1]")
	public WebElement tilteTxt;

	@FindBy(xpath = "//img[@alt='MEET STUDENT SERVICE COACH TANIKA FEASTER']")
	public WebElement tilteImage;

	@FindBy(xpath = "//*[@id='modalContainer']/div/div")
	public WebElement modelConrainer;

	@FindBy(xpath = "//*[@id='modalContainer']/div/div/div[2]/div/div[2]/div/div")
	public WebElement modelConrainerTxt;

	@FindBy(xpath = "//*[@id='modalContainer']/div/div/div[1]/button/i")
	public WebElement modelCloseIcon;

	public String cobraPageLinks = "//a[contains(text(),'value')]";

}
