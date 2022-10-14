package com.AgileCrmAutomation;

import org.openqa.selenium.By;

public class ForgotPassword extends BaseClass{

	public static void main(String[] args) {
	    launchBrowser("chrome");
		driver.get("https://realestateautomation.agilecrm.com/login");
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		driver.findElement(By.name("email")).sendKeys("cst2@yopmail.com");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}
