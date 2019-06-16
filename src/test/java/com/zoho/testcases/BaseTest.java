package com.zoho.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;

import com.zoho.Pages.Page;

import listners.TestNGListeners;

@Listeners(TestNGListeners.class)
public class BaseTest{
	
	@AfterSuite
	void teardown() {
	//	Page.quit();
	}

}
