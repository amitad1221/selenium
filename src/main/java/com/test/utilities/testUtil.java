package com.test.utilities;

import java.util.ArrayList;



public class testUtil {
	 static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try
		{
			Xls_Reader reader = new Xls_Reader("");
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		for(int RowNum=2 ; RowNum <= reader.getRowCount("Sheet1") ; RowNum++)
		{
			String username=reader.getCellData("Sheet1" , "username" , RowNum);
			String password=reader.getCellData("Sheet1" , "password" , RowNum);
			
			Object ob[] = { username , password };
			myData.add(ob);
		}
		return myData;
	}

}
