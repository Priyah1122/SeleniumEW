package com.seleniumEW.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchClass {

	
	WebDriver driver;
	public SearchClass(WebDriver lDriver)
	{
		this.driver=lDriver;
		
	}
	@FindBy(id="search_course") WebElement searchTab;
	public void searchMethod(String searchData)
	{
		searchTab.sendKeys(searchData);
	}
}
