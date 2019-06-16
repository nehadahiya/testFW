package com.zoho.testcases;
import java.util.HashMap;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zoho.Pages.HomePage;
import com.zoho.Pages.LoginPage;
import com.zoho.Pages.WelcomePage;
import com.zoho.utilities.Datapr;

import listners.TestNGListeners;
//@Listeners(TestNGListeners.class)
public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass=Datapr.class,dataProvider="dp")
	public void HomeLoginTest(HashMap<String,String> hm){
		HomePage hp = new HomePage();
		LoginPage lp = hp.goToLogin();
		WelcomePage wp = lp.doLogin(hm);
		//Assert.fail();
		wp.isLoginSuccessfull();
		wp.logout();
		}
	

	
}
