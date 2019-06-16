package com.zoho.Pages;

import org.openqa.selenium.By;

public class HomePage extends Page{
	
	public LoginPage goToLogin() {
		//refresh();
		System.out.println("clicking login");
		click("Home_Login_XPath");
		System.out.println("clicked login");
		return new LoginPage();
			}
	
	

}
