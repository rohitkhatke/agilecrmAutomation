package com.AgileCrmAutomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agilecrm.pages.LoginPage;

public class ContactList extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.navigate().to("https://learntestng.agilecrm.com");
		LoginPage loginPage=new LoginPage();
	    loginPage.login("cst0@yopmail.com","Test1234");
	    click(By.id("contactsmenu"),"Click on contact menu");
	
	    List<WebElement> element=driver.findElements(By.xpath("//div[@id='contacts-list-view']//a[@class='text-cap custom-link ']"));
	    for(int i=0;i<element.size();i++) {
	    	String contactNames=element.get(i).getText();
	    	System.out.println(contactNames);
	    }

	    
	   
	    
	

	}

}
