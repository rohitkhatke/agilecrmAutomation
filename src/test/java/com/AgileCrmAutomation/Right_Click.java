package com.AgileCrmAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Right_Click extends BaseClass{
     @Test
	public void main() throws AWTException, InterruptedException {
		launchBrowser("chrome");
		driver.get("https://www.amazon.in");
		Actions action =new Actions(driver);
		WebElement element=driver.findElement(By.id("desktop-banner"));
		action.contextClick(element).build().perform();
		Robot rb=new Robot();
    	rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		String parentWindowId=driver.getWindowHandle();
		System.out.println("Parent Window Id"+parentWindowId);
		Set<String> allWindowIds=driver.getWindowHandles();
	     Thread.sleep(1000);
		for(String windowId : allWindowIds) {
			if(!windowId.equals(parentWindowId)) {
				System.out.println("Child window Id:"+windowId);
				driver.switchTo().window(windowId);
				System.out.println(driver.getTitle());
				List<WebElement> offerName=driver.findElements(By.xpath("//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']"));
	    		int count=1;
				for(int i=0;i<offerName.size();i++) {
					String name=offerName.get(i).getText();
					System.out.println(count+":"+name);
					count++;
				}
			}
			}
			
}

}
