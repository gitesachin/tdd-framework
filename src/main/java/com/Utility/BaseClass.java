package com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static configDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	
	public void BS() throws IOException
	{
		config=new configDataProvider(); // use of cofig dataprovider class
	  excel = new ExcelDataProvider();
		
	}
	@Parameters("Browser")
	
	@BeforeMethod
	public void Setup(String Browser)
	{
		if (Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
		     driver=new ChromeDriver();
		    driver.get(config.getUrl());
		    driver.manage().window().maximize();
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
		     driver=new FirefoxDriver();
		    driver.get(config.getUrl());
		    driver.manage().window().maximize();
		}
	}
	
	public void browser()
	{
		
	 		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
