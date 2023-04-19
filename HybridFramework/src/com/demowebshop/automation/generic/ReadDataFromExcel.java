package com.demowebshop.automation.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel implements Framework_Constants
{
	public static Object[][] getMultipleData(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(EXCEL);
		Sheet shet = WorkbookFactory.create(fis).getSheet(sheet);
		int actual_row = shet.getPhysicalNumberOfRows();
		int actual_cell = shet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(actual_row);
		System.out.println(actual_cell);
		Object[][] arr=new Object[actual_row-1][actual_cell];
		
		for(int i=0;i<actual_row-1;i++)
		{
			for(int j=0;j<actual_cell;j++)
			{
				arr[i][j]=shet.getRow(i+1).getCell(j).toString();
			}
		}
		return arr;
	}
	public String getSingleData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(EXCEL);
		Cell cel=WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell);
		String value = cel.toString();
		return value;
	}
}
