package com.AgileCrmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.agilecrm.pages.LoginPage;

public class DragAndDrop extends BaseClass{

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://learnautomation.agilecrm.com");
		LoginPage loginpage=new LoginPage();
		loginpage.login("cst20@yopmail.com","Test1234");
		click(By.id("dealsmenu"),"Click on deal menu");
		Actions action=new Actions(driver);
		waitForElementToBeClickable(By.xpath("//ul[@milestone='New']/li[1]"));
		WebElement sourceElement=driver.findElement(By.xpath("//ul[@milestone='New']/li[1]"));
		WebElement dstElement=driver.findElement(By.xpath("//ul[@milestone='Won']/li[1]"));
		
		//action.dragAndDrop(sourceElement,dstElement).build().perform();
		action.clickAndHold(sourceElement).release(dstElement).build().perform();

	}

}
