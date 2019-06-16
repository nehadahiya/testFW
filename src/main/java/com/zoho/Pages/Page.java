package com.zoho.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.RootLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Page {
	
	public static WebDriver driver = null;
	public static FileInputStream fis;
	public static Properties config =new Properties();
	public static Properties OR =new Properties();
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	public Page(){
		if(driver==null) {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
			config.getProperty("Browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(driver == null) {
				
		if(config.getProperty("Browser").equals("Edge")) {
			
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		}else if(config.getProperty("Browser").equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
			}
		
		}
		f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\OR.properties");
		try {
			fis=new FileInputStream(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fis=new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("Adding logs");
		log.debug("going to site");
		log.info("Hi");
	driver.get(config.getProperty("testurl"));
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("Done with Page constructor");
	}
	}
	
	public static void quit() {
		driver.quit();
	}
	
	// Basic functionalities
	
	public static void type(String Selector, String value) {
		
		if (Selector.endsWith("CSS")){
		driver.findElement(By.cssSelector(OR.getProperty(Selector))).sendKeys(value);
		}else if (Selector.endsWith("XPath")){
			driver.findElement(By.xpath(OR.getProperty(Selector))).sendKeys(value);
			}
	}
	
	public static void click(String Selector) {
		
		if (Selector.endsWith("CSS")){
		driver.findElement(By.cssSelector(OR.getProperty(Selector))).click();
		}else if (Selector.endsWith("XPath")){
			driver.findElement(By.xpath(OR.getProperty(Selector))).click();
			}
	}
	
	public static HomePage refresh() {
			HomePage p = new HomePage();
			return p;
		}
		
	
}
