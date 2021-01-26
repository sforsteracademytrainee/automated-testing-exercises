package com.qa.shoppingwebsite.webpages.demosite.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ShoppingDressPage {
	
	@FindBys(value = { @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div") })
	private List<WebElement> items;
	
	public ShoppingDressPage() {
		
	}
	
	public void selectDress() {
		items.get(0).click();
	}
}
