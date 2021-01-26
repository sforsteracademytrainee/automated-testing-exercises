package com.qa.ftsewebsite.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FTSEPage {
	public static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";
	
	@FindBy(xpath = "//*[@id=\"acceptCookie\"]")
	private WebElement cookieButton;
	
	@FindBy(xpath = "//a[@title='View risers']")
	private WebElement risersButton;

	
	@FindBy(xpath = "//a[@title='View fallers']")
	private WebElement fallersButton;
	
	@FindBy(xpath = "//tbody/tr[1]")
	private WebElement topElement;
	
	@FindBys(value = { @FindBy(xpath = "//tbody/ts")})
	private List<WebElement> listings;
	
	public FTSEPage(WebDriver driver) {
		
	}
	
	public void acceptCookies() {
		cookieButton.click();
	}
	
	public void printRiser() {
		risersButton.click();
		System.out.println(" --- LARGEST  RISER ---");
		System.out.println(topElement.getText());
		System.out.println(" ----------------------");
	}
	
	public void printFaller() {
		fallersButton.click();
		System.out.println(" --- LARGEST  RISER ---");
		System.out.println(topElement.getText());
		System.out.println(" ----------------------");
	}
}
