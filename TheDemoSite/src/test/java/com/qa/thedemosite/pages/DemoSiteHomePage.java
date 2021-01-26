package com.qa.thedemosite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSiteHomePage {
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	private WebElement addUserLink;
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement loginUserLink;
	
	public DemoSiteAddUserPage addUserPage;
	public DemoSiteLoginPage loginPage;
	
	public DemoSiteHomePage (WebDriver driver) {
		addUserPage = PageFactory.initElements(driver, DemoSiteAddUserPage.class);
		loginPage = PageFactory.initElements(driver, DemoSiteLoginPage.class);
	}
	
	public void navAddUser() {
		addUserLink.click();
	}
	
	public void navLoginUser() {
		loginUserLink.click();
	}
	
}
