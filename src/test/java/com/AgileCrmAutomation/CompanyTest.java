package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.agilecrm.pages.CompanyPage;
import com.agilecrm.pages.LoginPage;

import junit.framework.Assert;

public class CompanyTest extends BaseClass {
         @Test
	    public void addCompany() {
	  launchBrowser("chrome");
		driver.navigate().to("https://learntestng.agilecrm.com");
		LoginPage loginPage=new LoginPage();
		loginPage.login("cst0@yopmail.com","Test1234");
		click(By.id("companiesmenu"),"Click on Company menu");
		CompanyPage companyPage=new CompanyPage();
		companyPage.addCompany();
		companyPage.com_Name("Allied");
		click(By.id("continue-company"),"click on continue edit button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		companyPage.url("https:www.allied.com");
		//companyPage.companyEmail("allied@yopmail.com");
		companyPage.addPhone("9554020000");
		companyPage.addAddress("Pune");
		click(By.xpath("//div[@class='controls col-sm-9 pull-right']/a[@id='company-update']"),"Click on Save Button");

		WebElement element=driver.findElement(By.xpath("//div[@id='company-name-text']"));
		waitVisibleOfElement(element);
		String actual=element.getText();
		System.out.println(actual);
		String expected="Allied";
		Assert.assertEquals(actual,expected);

}
	}


