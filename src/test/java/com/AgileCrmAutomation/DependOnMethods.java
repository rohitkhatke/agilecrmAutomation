package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.agilecrm.pages.CompanyPage;
import com.agilecrm.pages.ContactPage;
import com.agilecrm.pages.LoginPage;

public class DependOnMethods extends BaseClass {
 @Test(priority=1)
 public void login() {
	 launchBrowser("chrome");
     driver.get("https://learntestng.agilecrm.com");
	 LoginPage loginpage=new LoginPage();
	 loginpage.login("cst0@yopmail.com","Test1234");
 }
 @Test(priority=2,dependsOnMethods ={"login"})
 public void addCompany() {
	 
		click(By.id("companiesmenu"),"Click on Company menu");
		CompanyPage companyPage=new CompanyPage();
		companyPage.addCompany();
		companyPage.com_Name("cyber");
		click(By.id("continue-company"),"click on continue edit button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		companyPage.url("https:www.cst1.com");
		companyPage.companyEmail("cst1@gamil.com");
		companyPage.addPhone("9554722426");
		companyPage.addAddress("Pune");
		click(By.xpath("//div[@class='controls col-sm-9 pull-right']/a[@id='company-update']"),"Click on Save Button");
 }
 @Test(priority=3,dependsOnMethods = {"login","addCompany"})
 public void addContact() {
	 click(By.id("contactsmenu"),"Click on contact menu");
	    click(By.xpath("//button[text()=' Add Contact']"), "Click on Add Contact Button");
	    ContactPage contact=new ContactPage(); 
	    contact.firstName("kane");
	    contact.lastName("s");
	    contact.Title("Test");
	    contact.emailContact("kane@gmail.com");
	    contact.phoneContact("7959999765");
	    click(By.id("person_validate"),"Click on Save Button");
 }
 
}
