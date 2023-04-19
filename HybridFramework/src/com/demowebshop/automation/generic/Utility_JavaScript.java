package com.demowebshop.automation.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utility_JavaScript 
{
	public static JavascriptExecutor java_scroll(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		return js;
	}
}
