package com.qa.shoppingwebsite.webpages.demosite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingHomePage {
	
	public static final String URL = "http://automationpractice.co.uk";
	
	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	private WebElement searchBar;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	private WebElement searchButton;
	
	
	public ShoppingDressPage dressPage;
	
	public ShoppingHomePage(WebDriver driver) {
		this.dressPage = PageFactory.initElements(driver, ShoppingDressPage.class);
	}
	
	public void searchDress() {
		searchBar.sendKeys("dress");
		searchButton.click();
	}
}