package steps;

import java.io.IOException;

import cucumber.api.java.Before;
import setup.TestSetUp;
import utils.DriverFactory;

public class BeforeActions extends TestSetUp {

    @Before
    public void setUp() throws IOException {
	// setUpBrowser();
	// DriverFactory.createDriverInstance(configProperty.getProperty("browser"));
	try {
	    Thread.sleep(30000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	initialize();
	DriverFactory.createDriverInstance(configProperty.getProperty("browser"));
	// SeleniumDriver.setUpDriver();
    }
}