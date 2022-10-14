package com.AgileCrmAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Scroolling_Screen extends BaseClass {
   @Test
	public void main() {
		launchBrowser("chrome");
		driver.get("https://www.amazon.in");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7000)" );
		js.executeScript("window.scrollBy(0,-700)" );
		
	

	}

}
