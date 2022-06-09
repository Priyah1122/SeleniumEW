package com.seleniumEW.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProviders {
	Properties pro;

	public ConfigDataProviders()
	{
		File src=new File("./Config/configEW.properties");

		try {
			
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			System.out.println("Not able to load Config file "+e.getMessage());
		}
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
		
	}
	public String getUrl()
	{
		return pro.getProperty("qaUrl");
		
	}
}
