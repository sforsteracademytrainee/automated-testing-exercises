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
		WebElement targ = driver.findElement(By.name("search_query"));
		targ.sendKeys("Dress");
		targ = driver.findElement(By.name("submit_search")); // press  search button
		targ.click();
		targ = driver.findElement(By.className("product_img_link")); // press  search button
		targ.click();
		targ = driver.findElement(By.xpath("//h1[@itemprop='name']"));
		assertEquals("Printed Summer Dress", targ.getText()); // first search result as of when this was made
	}
	
	
	@AfterAll
	public static void cleanUp() {
		driver.quit();	
		System.out.println("The Selenium driver has been cleaned up.");
	}
	
}
