package com.AgileCrmAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AlertExample extends BaseClass{
     @Test
	public void main() {
		launchBrowser("mozila");
		driver.navigate().to("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("alert('This is sample alert');");
	//	Alert alert=driver.switchTo().alert();
//		alert.accept();
//		//alert.dismiss();
		js.executeScript("prompt('This is sample alert');");
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("This is sample text");
		alert.accept();
		
		

	}

}
