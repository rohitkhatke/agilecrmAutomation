package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.agilecrm.pages.LoginPage;

public class DeleteCompany extends BaseClass {
     @Test
	public void main() {
		launchBrowser("chrome");
		driver.navigate().to("https://learnautomation.agilecrm.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		LoginPage loginPage=new LoginPage();
		loginPage.login("cst20@yopmail.com","Test1234");
		click(By.id("companiesmenu"),"Click on Company menu");
		click(By.xpath("//input[@class='thead_check']"),"Click on checkbox");
		waitForElementToBeClickable(By.xpath("//input[@class='thead_check']"));
		//click(By.xpath("//input[@class='thead_check']"),"Click on checkbox");
		

	}

}
