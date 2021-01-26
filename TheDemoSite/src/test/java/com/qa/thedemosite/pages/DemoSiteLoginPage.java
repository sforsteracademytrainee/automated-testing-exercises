package com.qa.thedemosite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteLoginPage {
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement submit;
	
	@FindBy(xpath = "//big/blockquote/blockquote/font/center/b")
	private WebElement loginMessage;
	
	public DemoSiteLoginPage() {
		
	}
	
	public boolean loginGuest() throws InterruptedException {
		username.sendKeys("guest");
		password.sendKeys("guest");
		submit.click();
		if (loginMessage.getText().equals("**Successful Login**")) {
			return true;
		} else {
			return false;
		}
	}
}