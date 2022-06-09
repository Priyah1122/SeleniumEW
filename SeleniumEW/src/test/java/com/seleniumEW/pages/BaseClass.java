package com.seleniumEW.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.seleniumEW.utility.BrowserFactory;
import com.seleniumEW.utility.ConfigDataProviders;
import com.seleniumEW.utility.ExcelDataProvider;
import com.seleniumEW.utility.ConfigDataProviders;
//import com.seleniumFramework.utility.ExcelDataProvider;

public class BaseClass {
	
public WebDriver driver;
public ConfigDataProviders config;
public ExcelDataProvider excel;
public ExtentReports report;
public ExtentTest logger;


@BeforeSuite
public void setUpSuite()
{
	excel =new ExcelDataProvider();
	config=new ConfigDataProviders();
	ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/report.html"));
	report=new ExtentReports();
	report.attachReporter(extent);

	
		
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
@AfterMethod
public void tearDownMethod()
{
	report.flush();   
}

}
