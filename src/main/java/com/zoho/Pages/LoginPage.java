package com.zoho.Pages;

import java.util.HashMap;

public class LoginPage extends Page {
	
	public WelcomePage doLogin(HashMap<String,String> hm) {
	
	System.out.println(hm.get("Username"));
	System.out.println(hm.get("Password"));
		type("Home_username_CSS",hm.get("Username"));
	type("Home_Password_CSS",hm.get("Password"));
	click("Home_Login_Submit_CSS");
	return new WelcomePage();
	
	}

}
