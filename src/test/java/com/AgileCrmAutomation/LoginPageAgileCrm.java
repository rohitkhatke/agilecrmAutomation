package com.AgileCrmAutomation;

import org.testng.annotations.Test;

import com.agilecrm.pages.LoginPage;

public class LoginPageAgileCrm extends BaseClass {
      @Test
	public void main() {
		launchBrowser("chrome");
		driver.get("https://learntestng.agilecrm.com");
		LoginPage loginpage=new LoginPage();
		loginpage.login("cst0@yopmail.com","Test1234");
		
		

	}

}
