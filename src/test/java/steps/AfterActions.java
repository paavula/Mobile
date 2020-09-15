package steps;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.DriverManager;


public class AfterActions {

	@After
	public static void tearDown(Scenario scenario) throws IOException{
	//	WebDriver driver = DriverManager.getDriver();
		System.out.println("Scenari Status >>>>>>>>" +scenario.getStatus());
		if (scenario.isFailed() || scenario.getStatus().equalsIgnoreCase("failed") || scenario.getStatus().equalsIgnoreCase("passed"))
		{
		    final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
		    scenario.embed(screenshot, "image/png");
		    File scrFile = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		    String screenshotName = "QA";
		    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		    FileUtils.copyFile(scrFile,
			    new File("D:\\AutomationProjects\\SEI-Mobile\\Screenshots\\" + screenshotName + scenario.getStatus()+ dateName + ".png"));
		    byte[] screenshotBytes = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
		    scenario.embed(screenshotBytes, "image/png");
		    Reporter.addScreenCaptureFromPath(
			    "D:\\AutomationProjects\\SEI-Mobile\\Screenshots\\" + screenshotName + scenario.getStatus()+ dateName + ".png");
		    
		 
		
		}else{
			System.out.println("Scenario: " + scenario.getName()+ ": PASS");
		}
		DriverManager.tearDown();
	}
	
}
