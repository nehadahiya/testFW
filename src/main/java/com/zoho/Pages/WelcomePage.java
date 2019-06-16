package com.zoho.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class WelcomePage extends Page{
	
	public void isLoginSuccessfull() {
		System.out.println("insid isLoginsucessful");
		try {			
		String value=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")).getText();
		Assert.assertEquals(value, "Calendar", "Assertion failed");
		}catch(Throwable t){
			Assert.fail("Login unsuccessful");
		}
		}
	
	public void isLoginSuccessfull1() {
		System.out.println("insid isLoginsucessful");
		try {			
		String value=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")).getText();
		Assert.assertEquals(value, "Calendar", "Assertion failed");
		}catch(Throwable t){
			Assert.fail("Login unsuccessful");
		}
		}
	
	
	public void logout() {
		driver.findElement(By.cssSelector("#ztb-profile-image-pre")).click();
		driver.findElement(By.cssSelector("#ztb-signout")).click();
		
	}
}
		
