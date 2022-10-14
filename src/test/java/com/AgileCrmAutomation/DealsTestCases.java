package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.agilecrm.pages.DealsPage;
import com.agilecrm.pages.LoginPage;

public class DealsTestCases extends BaseClass{
      @Test
	public void main() throws Exception {
		launchBrowser("chrome");
		driver.navigate().to("https://learntestng.agilecrm.com");
		LoginPage loginPage=new LoginPage();
		loginPage.login("cst0@yopmail.com","Test1234");
		click(By.id("dealsmenu"),"click on deals menu");
		click(By.xpath("//button[text()='Add Deal']"),"click on add deal button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		DealsPage dealsPage=new DealsPage();
		dealsPage.addDealName("Rahul");
		dealsPage.addDealValue("500");
		//dealsPage.changeDealStatus("New","Won");
		

	}

}
