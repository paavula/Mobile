package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UtilityNavLocators {

    @FindBy(xpath = "//span[@class='d-none d-xl-inline location-text']")
    public WebElement campusLocationLink;

    @FindBy(xpath = "//a[contains(text(),'iCampus')]")
    public WebElement uICampusLoginLink;

    @FindBy(xpath = "//*[@class='btn mb-2 btn-secondary btn-small apply-btn']")
    public WebElement uApplyNowLink;

    @FindBy(xpath = "//input[@placeholder='Enter a search term...']")
    public WebElement searchLblTxt;

    @FindBy(xpath = "//button[@class='cmp-search__form_button search-wrapper__submit-button']")
    public WebElement searchBtn;

    @FindBy(xpath = "//*[@class='col-12 pt-4 pl-0 search-wrapper__key-wrap float-left']")
    public WebElement uSearchresults;

    @FindBy(xpath = "//*[@id='banner-rfi']/div/div/div[1]/div/div/h2/span")
    public WebElement uSearchresultspage;

    @FindBy(xpath = "//ul[@class='nav side-links']")
    public WebElement utilityHeader;

    public String uLink = "";

}
