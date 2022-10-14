package com.agilecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AgileCrmAutomation.BaseClass;

public class ContactPage extends BaseClass{
	 public void firstName(String name) {
		 WebElement fName=driver.findElement(By.id("fname"));
		 waitForElementToBeClickable(By.id("fname"));
		  fName.sendKeys(name);
	 }
	 public void lastName(String lastname) {
		 WebElement lName=driver.findElement(By.id("lname"));
		 waitForElementToBeClickable(By.id("lname"));
		  lName.sendKeys(lastname);
		 
	 }
	 public void Title(String title) {
		 WebElement jobTitle=driver.findElement(By.id("job_title"));
		 waitForElementToBeClickable(By.id("job_title"));
		 jobTitle.sendKeys(title);
		 
	 }
	 public void companyName(String companyName) {
		 WebElement company=driver.findElement(By.id("contact_company"));
		 waitForElementToBeClickable(By.id("contact_company"));
		 company.sendKeys(companyName);
		 WebElement selectCompany=driver.findElement(By.id("company-results"));
		 waitForElementToBeClickable(By.id("company-results"));
		 click(selectCompany,"");
		 
	 }
	public void emailContact(String email) {
		WebElement eMail=driver.findElement(By.id("email"));
		waitForElementToBeClickable(By.id("email"));
		eMail.sendKeys(email);
		
	}
	public void phoneContact(String phone) {
		WebElement phoneno=driver.findElement(By.id("phone"));
		waitForElementToBeClickable(By.id("phone"));
		phoneno.sendKeys(phone);
	}

}
