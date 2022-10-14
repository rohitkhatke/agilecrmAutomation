package com.agilecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.AgileCrmAutomation.BaseClass;

public class DealsPage extends BaseClass{
	public void changeDealStatus(String srcStatus,String dstStatus) throws Exception {
		waitForElementToBeClickable(By.xpath("//ul[@milestone='"+srcStatus+"']/li[1]"));
		WebElement srcElement=driver.findElement(By.xpath("//ul[@milestone='"+srcStatus+"']/li[1]"));
		String dealName=driver.findElement(By.xpath("//ul[@milestone='"+srcStatus+"']/li[1]/descendant::a[1]")).getText();
		WebElement dstElement=driver.findElement(By.xpath("//ul[@milestone='"+dstStatus+"']/li[1]"));
		Actions action =new Actions(driver);
		action.dragAndDrop(srcElement, dstElement).build().perform();
		System.out.println("changing the status of "+dealName+ " from " +srcStatus+ " to " +dstStatus);
		WebElement dstDealName=driver.findElement(By.xpath("//ul[@milestone='"+dstStatus+"']/li[1]/descendant::a[1]"));
		verifyDealStatus(dstStatus,dstDealName);
	}
	public void verifyDealStatus(String expectedStatus,WebElement element) throws Exception  {
		waitForElementToBeClickable(element);
		element.click();
		waitForElementToBeClickable(By.xpath("//div[@class='panel-body']/descendant::span[2]"));
		String actualStatus=driver.findElement(By.xpath("//div[@class='panel-body']/descendant::span[2]")).getText();
		if(actualStatus.equals(actualStatus)) {
			System.out.println("Successfully performed drag and drop operation");
		}
		else {
			throw new Exception("Drag and drop did worked from source element");
		}
	}
	public void addDealName(String name) {
		WebElement addName=driver.findElement(By.xpath("//div[@id='newDealModal']//input[@id='name']"));
		addName.sendKeys(name);
	}
	public void addDealValue(String addVal) {
		WebElement addValueElement=driver.findElement(By.xpath("//div[@id='newDealModal']//input[@placeholder='Deal Value']"));
		addValueElement.sendKeys(addVal);
	}

}