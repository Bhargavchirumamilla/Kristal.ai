
package com.kristal.launcher;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * TestHarness
 * 
 * @author Bhargav Chirumamilla Kristal, Created by Bhargav Chirumamilla on
 *         02/10/2020 Copyright (c) 2020 Kristal . All rights reserved.
 * 
 */
public class TestHarness {
	public static WebDriver driver = null;
	DesiredCapabilities capabilities;

	@BeforeSuite
	public void suiteSetUp() throws Exception {
		ChromeOptions chromeOptions = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("AUTOMATION NAME", "Kristal Web Automation");
		capabilities.setJavascriptEnabled(true);
		capabilities.setPlatform(Platform.MAC);
		driver = new ChromeDriver(chromeOptions);
		//driver.get("https://www.google.com/");
		driver.get("https://staging-web.kristal.ai/");
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(1410, 1100));
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}

	@AfterSuite
    public void stopTest() {
		driver.quit();
	}

}