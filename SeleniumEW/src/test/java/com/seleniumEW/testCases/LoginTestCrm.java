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



	@Test(priority=1)
	
	public void loginApp() 
	{
		//pagefactory class is a class provided by selenium webdriver used to support page object model pattern
		//initelements method is used to initailaise webelements
		
			
		logger=report.createTest("Login to ItLearn Portal");
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");
		lp.logintoPortal(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		logger.pass("Login was successfull");
	}	
	@Test(priority=2)
	public void sClass()
	{
		
		SearchClass sc=PageFactory.initElements(driver, SearchClass.class);
		sc.searchMethod(excel.getStringData("SearchPage", 0, 0));
	}	
	@Test(priority=3)
	public void allCourses()
	{
	
	AllCoursesPage cp=PageFactory.initElements(driver, AllCoursesPage.class);
   cp.clickAllCoursesTab();
		
		
		
		
		
	}

}
