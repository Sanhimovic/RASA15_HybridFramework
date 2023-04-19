package com.demowebshop.automation.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderClass implements Framework_Constants
{
	@DataProvider(name="logincred")
	public Object[][] testData() throws EncryptedDocumentException, IOException
	{
		Object[][] value = ReadDataFromExcel.getMultipleData(SheetName);
		return value;
	}
}