package com.zoho.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Datapr {
	
	@DataProvider(name="dp")
	public static Object[][] Testdata(Method m) throws IOException{
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Excel_data\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(m.getName());
		int ri = sh.getLastRowNum();
		int cj = sh.getRow(0).getLastCellNum();
	//	HashMap<String,String> hm = new HashMap<String,String>();
		Object[][] obj = new Object[ri][1];
		for(int i=1;i<=ri;i++) {
			HashMap<String,String> hm = new HashMap<String,String>();
				for(int j=0;j<cj;j++) {
				hm.put(sh.getRow(0).getCell(j).getStringCellValue(),sh.getRow(i).getCell(j).getStringCellValue());
						}
			obj[i-1][0]=hm;
						}
		System.out.println(obj[0][0].toString());
		System.out.println(obj[1][0].toString());
		/*for(int i=0;i<=obj.length-1;i++) {
			HashMap h = (HashMap) obj[i][0];
		//	System.out.println(h.get("Username"));
		//	System.out.println(h.get("Password"));
		}*/	
		return obj;
	}
		
		
		
	}
	
