package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.agilecrm.pages.LoginPage;

public class LoginAgileCrmTestCase extends BaseClass {
     @Test
	public  void main() 
	{
		launchBrowser("chrome");
		driver.navigate().to("https://learntestng.agilecrm.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoginPage loginPage=new LoginPage();
		loginPage.login("cst0@yopmail.com","Test1234");
		driver.findElement(By.id("contactsmenu")).click();
		
		//WebElement deleteButton=driver.findElement(By.xpath("//button[text()='Delete']"));
		
		WebElement selectAllCheckbox=driver.findElement(By.id("contacts-list-view-checkbox"));
		selectAllCheckbox.click();
		
		if(selectAllCheckbox.isSelected())
		{
			WebElement deleteButton=driver.findElement(By.xpath("//button[text()='Delete']"));
			deleteButton.click();
		System.out.println("Contact Deleted Successfully...");
	}
		else
			{
				selectAllCheckbox.click();
				//deleteButton.click();
			}			}
			}
		
		
		
		
	

