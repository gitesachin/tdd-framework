package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageObject.HomePagePome;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_001 extends BaseClass {

	
	
	@Test
	public void verifyT01() throws InterruptedException
	{
		HomePagePome homepome1=PageFactory.initElements(driver, HomePagePome.class);
		Library.Custom_sendkeys(homepome1.getTextSearchbar(),excel.getNumericdata("Sheet1", 3, 0));   // use of library class
		//homepome1.getTextSearchbar().sendKeys("Selenium");
		Library.Custom_click(homepome1.getButtonsearch());
	   // Thread.sleep(2000);
		//homepome1.getButtonsearch().click();
		System.out.println(excel.getStringdata("Sheet1", 1, 0));
		System.out.println(excel.getNumericdata("Sheet1", 3, 0));
	}	
}
