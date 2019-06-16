package com.zoho.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import com.zoho.Pages.Page;
import com.zoho.testcases.BaseTest;

public class Snapshot extends Page{
	
	public static void capturescreen(){
		Date d=new Date();
		String Filename="Error_"+d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		System.out.println(Filename);
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f,new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+Filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	}
