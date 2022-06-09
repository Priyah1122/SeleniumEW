package com.seleniumEW.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.seleniumEW.pages.AllCoursesPage;
import com.seleniumEW.pages.BaseClass;
import com.seleniumEW.pages.LoginPage;
import com.seleniumEW.pages.SearchClass;
import com.seleniumEW.utility.BrowserFactory;

public class LoginTestCrm extends BaseClass{



	@Test
	
	public void loginApp() throws InterruptedException
	{
		//pagefactory class is a class provided by selenium webdriver used to support page object model pattern
		//initelements method is used to initailaise webelements
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.logintoPortal(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
		SearchClass sc=PageFactory.initElements(driver, SearchClass.class);
		sc.searchMethod(excel.getStringData("SearchPage", 0, 0));
		
		AllCoursesPage cp=PageFactory.initElements(driver, AllCoursesPage.class);
		cp.clickAllCoursesTab();
		Thread.sleep(3000);
		
		
	}

}
