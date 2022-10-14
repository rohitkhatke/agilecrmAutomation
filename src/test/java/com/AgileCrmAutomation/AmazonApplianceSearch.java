package com.AgileCrmAutomation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AmazonApplianceSearch extends BaseClass {
     @Test
	public  void main() 
	{ 
		launchBrowser("chrome");
		driver.navigate().to("https://www.amazon.in");
		selectDropDownValByText(driver.findElement(By.id("searchDropdownBox")),"Appliances");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Washing machine");
		click(By.id("nav-search-submit-button"),"click on search button");
		List<WebElement> applianceName=driver.findElements(By.xpath("//div[@class='sg-row']/descendant::h2/a/span"));
		List<WebElement> appliancePrice=driver.findElements(By.xpath("//div[@class='sg-row']/descendant::span[@class='a-price-whole']"));
		for(int i=0;i<applianceName.size();i++) {
			String names=applianceName.get(i).getText();
			String prices=appliancePrice.get(i).getText();
			
			System.out.println(names+" : "+prices);
			
		}
	}

}
