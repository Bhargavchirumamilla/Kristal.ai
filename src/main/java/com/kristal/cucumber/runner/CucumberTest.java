package com.kristal.cucumber.runner;


import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.kristal.launcher.TestHarness;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = { "src/test/java/com/kristal/features" },

		glue = {"com.kristal.stepdefination"},

		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:TestResults/cucumber-reports/TestAutomation.html",
				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" }, monochrome = true, dryRun = false, tags = { "@LoginTest"})

public class CucumberTest extends TestHarness {

	private static TestNGCucumberRunner testRunner;

	@Before
	public void beforeScenario(Scenario scenario) {
		Reporter.assignAuthor("Bhargav Chirumamilla");
	}

	@BeforeClass
	private void launchTest() {

		testRunner = new TestNGCucumberRunner(CucumberTest.class);

	}

	@Test(description = "Apps", dataProvider = "Feature")
	public void login(CucumberFeatureWrapper cFeature) {
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	@DataProvider(name = "Feature")
	public Object[][] getFeatures() {
		return testRunner.provideFeatures();
	}

	@AfterClass
	public static void report() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/Report.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("OS", System.getProperty("os.name"));
		Reporter.setSystemInfo("Country", "INDIA");
		Reporter.setSystemInfo("Platform", "WEB Automation");
        Reporter.getExtentHtmlReport();
        testRunner.finish();
	}

}
