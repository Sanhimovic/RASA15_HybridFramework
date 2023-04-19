package com.demowebshop.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class implements Framework_Constants
{
	public WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openapp(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(URL);
		}
		else
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(URL);
		}
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
