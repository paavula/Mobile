/**
 ******************************************************************************
 * 							  REUSABLE FRAMEWORK
 *  							CONFIDENTIAL
 *							COPYRIGHTS TO TECHASPECT
 *							
 * *****************************************************************************
 */

package utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import setup.TestSetUp;

public class DriverFactory {
	private static WebDriver driver;
//	private static String portNo = "5555";
//	private static String url = "http://localhost:4444/wd/hub";

	private DriverFactory() {
	}

	public static String chromeExeFilePath = System.getProperty(Constants.ROOT_DIR) + "\\drivers\\chromedriver.exe";
	public static String ieExeFilePath = System.getProperty(Constants.ROOT_DIR) + "\\drivers\\IEDriverServer.exe";
	public static String firefoxExeFilePath = System.getProperty(Constants.ROOT_DIR) + "\\drivers\\geckodriver.exe";

	public static WebDriverWait wait = null;

	/**
	 * This method is a getter for chromedriver.exe file path.
	 */
	public static String getChromeExeFilePath() {
		return chromeExeFilePath;
	}

	/**
	 * This method is a setter for chromedriver.exe file path.
	 * 
	 * @param chromeExeFilePath
	 */
	public static void setChromeExeFilePath(String chromeExeFilePath) {
		DriverFactory.chromeExeFilePath = chromeExeFilePath;
	}

	/**
	 * This method is a getter for IEDriverServer.exe file path.
	 */
	public static String getIeExeFilePath() {
		return ieExeFilePath;
	}

	/**
	 * This method is a setter for IEDriverServer.exe file path.
	 * 
	 * @param ieExeFilePath
	 */
	public static void setIeExeFilePath(String ieExeFilePath) {
		DriverFactory.ieExeFilePath = ieExeFilePath;
	}

	/**
	 * This method is a getter for gekeodriver.exe file path.
	 */
	public static String getFirefoxExeFilePath() {
		return firefoxExeFilePath;
	}

	/**
	 * This method is a setter for gekodriver.exe file path.
	 * 
	 * @param firefoxExeFilePath
	 */
	public static void setFirefoxExeFilePath(String firefoxExeFilePath) {
		DriverFactory.firefoxExeFilePath = firefoxExeFilePath;
	}

	/**
	 * This method is to create a driver instance for what is configured in
	 * configuration file.
	 * 
	 * @param browserName
	 * @throws MalformedURLException
	 */
	public static WebDriver createDriverInstance(String browserName) throws MalformedURLException {
		// WebDriver driver =null;
		DesiredCapabilities capabilities = null;
		System.out.println("checking the device status..." + TestSetUp.deviceCheck);
		if (TestSetUp.configProperty.getProperty(Constants.EXECUTION_ENV).contains("Windows")) {
			if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				WebDriverManager.firefoxdriver().timeout(50);
				driver = new FirefoxDriver();
				DriverManager.setDriver(driver);
				DriverManager.maximizeBrowser(driver);
				DriverManager.setImplicitWait(driver);
			}

			else if (browserName.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().timeout(100);

				LoggingPreferences logPrefs = new LoggingPreferences();
				logPrefs.enable(LogType.BROWSER, Level.ALL);
				capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
				ChromeOptions options = new ChromeOptions();
				Map<String, Object> prefs = new HashMap<String, Object>();
				Map<String, Object> profile = new HashMap<String, Object>();
				Map<String, Object> contentSettings = new HashMap<String, Object>();

				contentSettings.put("geolocation", 1);
				profile.put("managed_default_content_settings", contentSettings);
				prefs.put("profile", profile);
				options.setExperimentalOption("prefs", prefs);
				options.addArguments("--incognito");
				options.addArguments("start-maximized");
				options.addArguments("--disable-popup-blocking");
				options.addArguments("disable-geolocation");
				options.addArguments("disable-notifications");
				options.addArguments("--enable-strict-powerful-feature-restrictions");

				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				driver = new ChromeDriver(capabilities);
			}

			else if (browserName.equalsIgnoreCase("chromeprofile")) {

				System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeExeFilePath());
				LoggingPreferences logPrefs = new LoggingPreferences();
				logPrefs.enable(LogType.BROWSER, Level.ALL);
				capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
				ChromeOptions options = new ChromeOptions();
				TestSetUp.configProperty.getProperty("analytics").equalsIgnoreCase("Adobe");
				// options.addExtensions(new File(System.getProperty("user.dir") +
				// "/drivers/extension_1_4_1_0.crx"));
				options.addExtensions(
						new File(System.getProperty(Constants.ROOT_DIR) + "\\drivers\\extension_1_4_1_0.crx"));

				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				driver = new ChromeDriver(capabilities);
			} else if (browserName.equalsIgnoreCase("ie")) {
				// System.setProperty("webdriver.ie.driver", DriverFactory.getIeExeFilePath());
				WebDriverManager.iedriver().setup();
				WebDriverManager.iedriver().timeout(100);
				driver = new InternetExplorerDriver();
				DriverManager.setDriver(driver);
				DriverManager.maximizeBrowser(driver);
				DriverManager.setImplicitWait(driver);
			}

		}

		else if (TestSetUp.configProperty.getProperty(Constants.EXECUTION_ENV).contains("Browserstack")) {
			DesiredCapabilities caps = null;

			String browserStackEnv = TestSetUp.configProperty.getProperty(Constants.BROWSER).toUpperCase();
			switch (browserStackEnv) {

			case Constants.CHROME:
				caps = DesiredCapabilities.chrome();
				caps.setCapability("browser", "Chrome");
				System.out.println("Chrome browser");
				getBrowserstackCapabilities(caps);
				break;
			case Constants.FIREFOX:
				caps = DesiredCapabilities.firefox();
				getBrowserstackCapabilities(caps);
				break;
			case Constants.IE:
				caps = DesiredCapabilities.internetExplorer();
				getBrowserstackCapabilities(caps);
				break;

			case Constants.EDGE:
				caps = DesiredCapabilities.edge();
				getBrowserstackCapabilities(caps);
				break;

			case Constants.SAFARI:
				caps = DesiredCapabilities.safari();
				caps.setCapability("browser", "Safari");
				System.out.println("Safari browser");
				getBrowserstackCapabilities(caps);
				break;
			default:
				break;

			}

			driver = new RemoteWebDriver(new URL(Constants.BROWSERSTACK_URL), caps);
			System.out.println("Browserstack driver >>> " + driver);
			DriverManager.setDriver(driver);
			if (TestSetUp.configProperty.getProperty(Constants.EXECUTION_ENV).contains("Windows")) {
				DriverManager.maximizeBrowser(driver);
			}
			DriverManager.setImplicitWait(driver);
		}

		DriverManager.setDriver(driver);
		return DriverManager.getDriver();
	}

	private static DesiredCapabilities getBrowserstackCapabilities(DesiredCapabilities caps) {

		caps.setCapability(Constants.OS, TestSetUp.configProperty.getProperty("os"));
		caps.setCapability(Constants.OS_VERSION, TestSetUp.configProperty.getProperty("os_version"));
		caps.setCapability(Constants.DEVICE, TestSetUp.configProperty.getProperty("device"));
		caps.setCapability(Constants.REAL_MOBILE, TestSetUp.configProperty.getProperty("real_mobile"));
		caps.setCapability(Constants.BROWSERSTACK_LOCAL, Constants.BROWSERSTACK_LOCAL_VALUE_TRUE);
		caps.setCapability(Constants.BROWSERSTACK_DEBUG, Constants.BROWSERSTACK_DEBUG_VALUE_TRUE);
		caps.setCapability(Constants.BROWSERSTACK_NETWORK_LOGS, Constants.BROWSERSTACK_LOCAL_VALUE_TRUE);
		caps.setCapability(Constants.BROWSERSTACK_BROWSER_VERSION,
				TestSetUp.configProperty.getProperty("browser_version"));
		System.out.println("Capability built up " + caps);
		if (TestSetUp.configProperty.getProperty("deviceOrientation").equalsIgnoreCase("landscape")) {
			caps.setCapability(Constants.DEVICE_ORIENTATION, "landscape");
		}

		return caps;
	}

	/**
	 * This method is to kill the driver.
	 */
	public static void destroyDriver() {
		if (DriverManager.getDriver() != null)
			DriverManager.getDriver().quit();
	}
}
