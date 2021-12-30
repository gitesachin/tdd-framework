package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePome {
	
	WebDriver driver;
	@FindBy(how=How.XPATH,using="//input[@id='query']")
	private WebElement Text_Searchbar;
	@FindBy(how=How.XPATH,using="//input[@class='button']")
	private WebElement Button_Search;
	
	public HomePagePome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getTextSearchbar()
	{
	return Text_Searchbar;	
	}
	
	public WebElement getButtonsearch()
	{
		return Button_Search;
	}
	

}
