package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.agilecrm.pages.ContactPage;
import com.agilecrm.pages.LoginPage;

public class ContactTest extends BaseClass{
	@Test
	public void main(){
		 launchBrowser("chrome");
		 driver.navigate().to("https://learntestng.agilecrm.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 LoginPage loginPage=new LoginPage();
	    loginPage.login("cst0@yopmail.com","Test1234");
	    click(By.id("contactsmenu"),"Click on contact menu");
	    click(By.xpath("//button[text()=' Add Contact']"), "Click on Add Contact Button");
	    ContactPage contact=new ContactPage(); 
	    contact.firstName("finch");
	    contact.lastName("allen");
	    contact.Title("Tester");
	    contact.emailContact("allen@gmail.com");
	    contact.phoneContact("8959999760");
	    click(By.id("person_validate"),"Click on Save Button");
	     WebElement element= driver.findElement(By.xpath("//div[@class='panel-body']//div[@id='contactName']/span"));
	     waitVisibleOfElement(element);
	    String confirm=element.getText();
	    System.out.println(confirm);

	}

}
