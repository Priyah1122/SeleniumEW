package com.seleniumEW.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.seleniumEW.utility.BrowserFactory;
import com.seleniumEW.utility.ConfigDataProviders;
import com.seleniumEW.utility.ExcelDataProvider;
import com.seleniumEW.utility.ConfigDataProviders;
//import com.seleniumFramework.utility.ExcelDataProvider;

public class BaseClass {
	
public WebDriver driver;
public ConfigDataProviders config;
public ExcelDataProvider excel;

@BeforeSuite
public void setUpSuite()
{
	excel =new ExcelDataProvider();
	config=new ConfigDataProviders();
	
		
}
@BeforeClass
public void setUp()
	{ 
		driver = BrowserFactory.startApplication(driver,config.getBrowser(), config.getUrl());
	}
@AfterSuite	
	public void tierDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
}
