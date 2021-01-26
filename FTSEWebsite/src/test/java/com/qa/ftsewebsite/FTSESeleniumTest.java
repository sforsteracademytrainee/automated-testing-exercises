package com.qa.ftsewebsite;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.ftsewebsite.pages.FTSEPage;

public class FTSESeleniumTest {
	
	public static WebDriver driver;
	
	@BeforeAll
	public static void init() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@Test
	public void test_ShoppingWebsite() throws InterruptedException {
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		FTSEPage page = PageFactory.initElements(driver, FTSEPage.class);
		page.acceptCookies();
		page.printRiser();
		page.printFaller();
//		WebElement targ = driver.findElement(By.id("acceptCookie"));
//		targ.click();
//		targ = driver.findElement(By.xpath("//a[@title='View risers']"));
//		targ.click();
//		targ = driver.findElement(By.xpath("//tbody/tr[1]"));
//		System.out.println(" --- LARGEST  RISER ---");
//		System.out.println(targ.getText());
//		System.out.println(" ----------------------");
//		targ = driver.findElement(By.xpath("//a[@title='View fallers']"));
//		targ.click();
//		targ = driver.findElement(By.xpath("//tbody/tr[1]"));
//		System.out.println(" --- LARGEST FALLER ---");
//		System.out.println(targ.getText());
//		System.out.println(" ----------------------");
		
		Thread.sleep(5000);
	}
	
	
	@AfterAll
	public static void cleanUp() {
		driver.quit();	
		System.out.println("The Selenium driver has been cleaned up.");
	}
	
}
