package com.qa.thedemosite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteAddUserPage {
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	private WebElement submit;
	
	public DemoSiteAddUserPage() {
		
	}
	
	public void addGuest() throws InterruptedException {
		username.sendKeys("guest");
		password.sendKeys("guest");
		submit.click();
	}
}
