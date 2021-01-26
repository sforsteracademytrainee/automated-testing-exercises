package com.qa.shoppingwebsite;

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

import com.qa.shoppingwebsite.webpages.demosite.pages.ShoppingHomePage;

public class ShoppingSeleniumTest {
	
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
		driver.get("http://www.automationpractice.com/index.php");
		ShoppingHomePage website = PageFactory.initElements(driver, ShoppingHomePage.class);
		website.searchDress();
		
		Thread.sleep(2000);
		
		website.dressPage.selectDress();
		// need to use waits maybe?
//		targ = driver.findElement(By.name("Submit"));
//		targ.click();
//		Thread.sleep(1000);
//		targ = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//		targ.click();
//		Thread.sleep(1000);
//		targ = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//		targ.click();
		
		
		
		Thread.sleep(5000);
		WebElement targ = driver.findElement(By.xpath("//h1[@itemprop='name']"));
		assertEquals("Printed Summer Dress", targ.getText()); // first search result as of when this was made
	}
	
	
	@AfterAll
	public static void cleanUp() {
		driver.quit();	
		System.out.println("The Selenium driver has been cleaned up.");
	}
}
