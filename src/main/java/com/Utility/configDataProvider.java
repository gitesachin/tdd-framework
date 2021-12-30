package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configDataProvider {
	
	private Properties pro;
	public configDataProvider() throws IOException {
		String filepath="C:\\Users\\SACHIN\\eclipse-workspace\\TDDFramework\\config\\config.properties";
		File src = new File (filepath);
		FileInputStream file= new FileInputStream(src);
		 pro=new Properties();
		 pro.load(file);
	}
	 public String getBrowser()
	 {
		 return pro.getProperty("browser");
		 
	 }
	public String getUsername()
	{
		return pro.getProperty("username");
	}
	
	public String getPassword()
	{
		return pro.getProperty("password");
	}

	public String getUrl()
	{
		return pro.getProperty("url");
	}
}
