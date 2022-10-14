package com.AgileCrmAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonElectronices extends BaseClass{

	@Test
	public void test() { 
		launchBrowser("chrome");
		driver.navigate().to("https://www.amazon.in");
		selectDropDownValByText(driver.findElement(By.id("searchDropdownBox")),"Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		click(By.id("nav-search-submit-button"),"click on search button");
		List<WebElement> laptopName=driver.findElements(By.xpath("//div[@class='sg-row']/descendant::h2/a/span"));
		List<WebElement> laptopPrice=driver.findElements(By.xpath("//div[@class='sg-row']/descendant::span[@class='a-price-whole']"));
		int count = 1;
		for(int i=0;i<laptopName.size();i++) {
			String names=laptopName.get(i).getText();
			String prices=laptopPrice.get(i).getText();
			Integer price=Integer.parseInt(prices.replace(",","")); 
			if(price>=30000) {	
				System.out.println(count+"|"+names+"|"+price+"|");
				count++;
			}
			}			
		}

		

	}



