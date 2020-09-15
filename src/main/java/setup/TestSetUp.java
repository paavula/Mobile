/**
 ******************************************************************************
 * 							  REUSABLE FRAMEWORK
 *  							CONFIDENTIAL
 *							COPYRIGHTS TO TECHASPECT
 *							
 * *****************************************************************************
 */

package setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import utils.Constants;
import utils.DriverFactory;
import utils.DriverManager;
import utils.ExcelReader;
import utils.ExtentManager;

public class TestSetUp {

	private static WebDriver driver;
	public static Properties configProperty;
	public static ExtentReports extent;
	public static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<>();
	public static ThreadLocal<ExtentTest> testCaseLogger = new ThreadLocal<>();
	// public static Logger appLogs = Logger.getLogger(TestSetUp.class.getName());
	public static boolean isInitialized = false;
	public static String deviceCheck = "false";

	@SuppressWarnings("unused")
	private Map<String, String> options;
	public static final ExcelReader excel = new ExcelReader(
			System.getProperty(Constants.ROOT_DIR) + "\\src\\test\\resources\\testData\\simple.xlsx");
	public static final ExcelReader AnalyticsExcel = new ExcelReader(
			System.getProperty(Constants.ROOT_DIR) + "\\src\\test\\resources\\testdata\\AnalyticsData.xlsx");
	public static String geoscript = "if(navigator.geolocation) {\n"
			+ "    status.textContent = 'Geolocation is not supported by your browser';\n" + "  } else {\n"
			+ "    status.textContent = 'Locating…';\n"
			+ "    navigator.geolocation.getCurrentPosition(success, error);\n" + "  }";

	@BeforeSuite
	public synchronized void beforeSuite() throws IOException {

		initialize();
	}

	@BeforeTest
	public void beforeTest() {
		/* Before Test code comes here. */

	}

	/**
	 * 
	 */

	@BeforeClass
	public void beforeClass() {
		/* Extent Reporting */
		ExtentTest parent = extent.createTest(getClass().getSimpleName());
		parentTest.set(parent);
	}

	@BeforeMethod
	public synchronized void beforeMethod(Method method) throws MalformedURLException {
		// appLogs.info("Starting exection of test case: " + method.getName());
		WebDriver driver = null;

		if (driver == null) {
			DriverFactory.createDriverInstance(configProperty.getProperty("browser"));
		}
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		extent.flush();
		DriverFactory.destroyDriver();
	}

	@AfterClass
	public void afterClass() {
		/* After Class code comes here. */
	}

	@AfterTest
	public void afterTest() {
		/* After Test code comes here. */
	}

	@AfterSuite
	public void afterSuite() {
		/* After Suite code comes here. */
	}

	public static void initialize() throws IOException {

		if (!isInitialized) {
			FileInputStream fi = null;
			try {
				fi = new FileInputStream(new File(System.getProperty(Constants.ROOT_DIR)
						+ "\\src\\test\\resources\\PropertyFiles\\config.properties"));

				configProperty = new Properties();
				configProperty.load(fi);

			} catch (FileNotFoundException e) {
				// appLogs.error("config.properties file is not found. " + e);

			} finally {
				if (fi != null) {
					fi.close();
					extent = ExtentManager.getExtent();

				}
			}
		}
	}

	public void highlightElement(WebElement element) {

		/*
		 * for (int i = 0; i < 6; i++) { JavascriptExecutor js = (JavascriptExecutor)
		 * DriverManager.driver.get(); js.
		 * executeScript("arguments[0].setAttribute('style', 'background: orange; border: 4px solid red;');"
		 * , element); }
		 */

	}

	public void highlightElement(String Xpath) {

		/*
		 * WebElement element =
		 * DriverManager.driver.get().findElement(org.openqa.selenium.By.xpath(Xpath));
		 * for (int i = 0; i < 6; i++) { JavascriptExecutor js = (JavascriptExecutor)
		 * DriverManager.driver.get(); js.
		 * executeScript("arguments[0].setAttribute('style', 'background: orange; border: 4px solid red;');"
		 * , element); }
		 */
	}

	public void highlightElements(String Css) {

		WebElement element = DriverManager.driver.get().findElement(org.openqa.selenium.By.cssSelector(Css));
		for (int i = 0; i < 6; i++) {

			JavascriptExecutor js = (JavascriptExecutor) DriverManager.driver.get();

			js.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 6px solid red;');",
					element);
		}

	}

	public void assignAuthor(String authorName) {
		testCaseLogger.get().assignAuthor(authorName);
	}

	public void assignCategory(String category) {
		testCaseLogger.get().assignCategory(category);
	}

	public void navigateToBaseURL() {
		DriverManager.getDriver().navigate().to(configProperty.getProperty("url"));
	}

	public void closeTabs() {
		String originalHandle = DriverManager.driver.get().getWindowHandle();
		for (String handle : DriverManager.driver.get().getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				DriverManager.driver.get().switchTo().window(handle);
				DriverManager.driver.get().close();
			}
		}

		DriverManager.driver.get().switchTo().window(originalHandle);
	}

	public String SwitchTab() {
		ArrayList<String> tabs2 = new ArrayList<String>(DriverManager.driver.get().getWindowHandles());
		DriverManager.driver.get().switchTo().window(tabs2.get(1));
		String cp = DriverManager.driver.get().getTitle();
		DriverManager.driver.get().switchTo().window(tabs2.get(0));
		return cp;
	}

	public void navigateToURL(String url) {
		DriverManager.getDriver().get(url);
		try {
			Thread.sleep(8000);

			System.out.println("Alert present");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript(geoscript);
			DriverManager.getDriver().switchTo().alert().accept();
			System.out.println("Alert Disabled");
		} catch (InterruptedException e) {
			System.out.println("Alert not present");
			e.printStackTrace();
		}
	}

	public void closeAlert() {
		try {
			Thread.sleep(5000);
			System.out.println("Alert present");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript(geoscript);
		DriverManager.getDriver().switchTo().alert().accept();
			System.out.println("Alert Disabled");
		} catch (InterruptedException e) {
			System.out.println("Alert not present");
			e.printStackTrace();
		}
	}

	public void setUpBrowser() throws MalformedURLException {
		// appLogs.info("Checking browser setup ");

		if (driver == null) {
			driver = DriverFactory.createDriverInstance(configProperty.getProperty("browser"));
		}
	}
}
