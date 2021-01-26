package com.qa.mercurytours;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MercuryToursTest {
	
	private static WebDriver driver;
	private static ExtentReports extent;
	private static ExtentTest test;
	
	@BeforeClass
	public static void beforeClass() {
		
		extent = new ExtentReports("target/reports/report.html");
		
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
		extent.endTest(test);
		extent.flush();
		extent.close();
 		System.out.println("Selenium driver cleaned up.");
	}
	
	@After
	public void afterTest() {
		extent.endTest(test);
	}
	
	@Test
	public void registerTest() {
		test = extent.startTest("Register");
		test.log(LogStatus.INFO, "Started the registration test");
		// do registration test here
		boolean passed = true;
		if (passed) {
			test.log(LogStatus.PASS, "Passed the registration test");
		} else {
			test.log(LogStatus.FAIL, "Failed the registration test");
		}
	}
}
