package com.agilecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AgileCrmAutomation.BaseClass;

public class LoginPage extends BaseClass  
{
	public void login(String username,String password) 
	{
		WebElement uname=driver.findElement(By.name("email"));
		
		uname.sendKeys(username);
		
		WebElement pwd=driver.findElement(By.name("password"));
		
		pwd.sendKeys(password);
		
	
		WebElement signIn=driver.findElement(By.xpath("//input[@type='submit']"));
		signIn.click();
		WebElement massage=driver.findElement(By.xpath("//a[@class='close']/parent::div"));
		massage.isDisplayed();
		//massage.getText();
		//System.out.println(massage.getText()+"    password"+password);
		String s="Incorrect password. Please try again.";
				String s2=massage.getText();
				System.out.println(s2);
				System.out.println(s.equals(s2));
	
				
//	WebElement msg=driver.findElement(By.xpath("//a[@class='close']/parent::div")).isDisplayed();
//		//System.out.println(password.getClass());
//	{
//		System.out.println(driver.getPageSource());
		//System.out.println("Invalid username: "+ username +" or password: "+ password);
//	}
//	else
//	{
//			}
//	}

	}}
		
	


