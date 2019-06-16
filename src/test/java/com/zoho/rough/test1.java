package com.zoho.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class test1 {

	public static void main(String[] args) throws IOException {
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/");
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\OR.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
	WebElement x=driver.findElement(By.xpath(p.getProperty("Home_Login_XPath")));
	x.click();
	driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#lid")).sendKeys("nehadahiya88@yahoo.in");
	driver.findElement(By.cssSelector("#pwd")).sendKeys("Neha88#");
	driver.findElement(By.cssSelector("#signin_submit")).click();
	String value=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")).getText();
	Assert.assertEquals(value, "Cliq", "Login failed");

	
		*/
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Date d = new Date();
		String Filename="Error_"+d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		System.out.println(System.getProperty("user.dir")+"\\test-output\\"+Filename);
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\"+Filename));
		

	//	String screenshotPath;
	//	String screenshotName;
	//	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	// screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
	//	System.out.println(screenshotName);

	//	FileUtils.copyFile(scrFile,
	//			new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));
	}
}
