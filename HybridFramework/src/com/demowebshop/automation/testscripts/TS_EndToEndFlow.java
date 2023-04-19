package com.demowebshop.automation.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demowebshop.automation.generic.Base_Class;
import com.demowebshop.automation.generic.DataProviderClass;
import com.demowebshop.automation.generic.Generic_DataConverter;
import com.demowebshop.automation.generic.ReadDataFromProperty;
import com.demowebshop.automation.generic.Utility_JavaScript;
import com.demowebshop.automation.generic.Utility_Select;
import com.demowebshop.automation.pomscripts.PomClass_SmokeCompareData;

public class TS_EndToEndFlow extends Base_Class
{
	@Test(dataProvider = "logincred",dataProviderClass = DataProviderClass.class)
	public void testScript(String username,String password) throws InterruptedException, IOException
	{
		PomClass_SmokeCompareData pmc=new PomClass_SmokeCompareData(driver);
		pmc.login_Link().click();
		pmc.email_text().sendKeys(username);
		pmc.pass_text().sendKeys(password);
		pmc.login_button().click();
		pmc.books_Tab().click();
		WebElement sort_drop = pmc.sort_dropdown();
		Utility_Select.select_drop(sort_drop).
				selectByVisibleText(ReadDataFromProperty.getDataFromProp("drop1"));
		Thread.sleep(3000);
		WebElement display_drop = pmc.disp_dropdown();
		Utility_Select.select_drop(display_drop).
				selectByVisibleText(ReadDataFromProperty.getDataFromProp("drop2"));
		WebElement view_drop = pmc.view_dropdown();
		Utility_Select.select_drop(view_drop).
				selectByVisibleText(ReadDataFromProperty.getDataFromProp("drop3"));
		pmc.computing().click();
		WebElement fiction = pmc.fictionlink();
		Thread.sleep(1500);
		Utility_JavaScript.java_scroll(driver).executeScript("arguments[0].scrollIntoView();",fiction);
		Thread.sleep(1500);
		pmc.fiction().click();
		Thread.sleep(1500);
		pmc.health().click();
		Thread.sleep(1500);
		pmc.infopop().click();
		Thread.sleep(2000);
		WebElement cart=pmc.shoppingCart();
		Utility_JavaScript.java_scroll(driver).executeScript("arguments[0].scrollIntoView();",cart);
		cart.click();
		String cprice = pmc.computingPrice().getText();
		double actual_cprice = Generic_DataConverter.conversion(cprice);
		String Fprice = pmc.fictionPrice().getText();
		double actual_fprice = Generic_DataConverter.conversion(Fprice);
		String HPrice = pmc.healthPrice().getText();
		double actual_hprice = Generic_DataConverter.conversion(HPrice);
		
		if(actual_cprice > actual_fprice && actual_cprice>actual_hprice)
		{
			pmc.computingCbox().click();
			pmc.updateCart().click();
			Thread.sleep(3000);
		}
		
		else if(actual_fprice>actual_hprice && actual_fprice>actual_cprice)
		{
			pmc.fictionCbox().click();
			pmc.updateCart().click();
			Thread.sleep(3000);
		}
		
		else
		{
			pmc.healthCbox().click();
			pmc.updateCart().click();
			Thread.sleep(3000);
		}
	}
}
