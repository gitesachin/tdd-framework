package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library {     //use for stroting commaon data files like sendkeys,click,dropdown,etc

	public static void Custom_sendkeys(WebElement element, String value)
	{
	   try {	element.sendKeys(value);
	   System.out.println("value successfully send");
	   
	   }catch (Exception e) {
		   System.out.println("unable to send value"+e);
	   }
	}
	public static void Custom_click(WebElement element) {
		try{element.click();
		}catch(Exception e) {
			System.out.println("unable to click:" +e);
		}
	}
	public static void Custom_handleDropdown(WebElement element,String text)
	{
		try {
		Select select= new Select(element);
		select.selectByVisibleText(text);
		}catch (Exception e) {
			System.out.println("exception"+e);
		}
	}
}
