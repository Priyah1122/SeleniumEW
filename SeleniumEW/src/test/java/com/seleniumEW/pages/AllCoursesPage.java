package com.seleniumEW.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AllCoursesPage {
	WebDriver driver;
	public AllCoursesPage(WebDriver lDriver)
	{
		this.driver= lDriver;
	}

	@FindBy(xpath="//*[@id=\"primary_menu\"]/a") WebElement allCoursesLink;
	@FindBy(xpath="//*[@id=\"nav-menu-item-7742\"]/a/div/span") WebElement cloudAcademy;
	//@FindBy(xpath="//*[@id=\"nav-menu-item-34651\"]/a/div/span") WebElement popularCourses;
	@FindBy(xpath="//*[@id=\"nav-menu-item-27292\"]/a/div/span") WebElement accp;
	@FindBy(xpath="//*[@id=\"left-menu\"]/div[1]/li/a") WebElement overview;
	
	public void clickAllCoursesTab()
	{
		allCoursesLink.click();
		Actions action=new Actions(driver);
		System.out.println("Mouse is over AllCourses tab");
		action.moveToElement(allCoursesLink).build().perform();
		cloudAcademy.click();
		System.out.println("Cloud Academy is clicked");
		//action.moveToElement(popularCourses).build().perform();
		//popularCourses.click();
		//System.out.println("Popular courses is clicked");
		
		accp.click();
		Assert.assertEquals("Overview", overview.getText());
		System.out.println("Overview text is right");
		
		
	}

}
