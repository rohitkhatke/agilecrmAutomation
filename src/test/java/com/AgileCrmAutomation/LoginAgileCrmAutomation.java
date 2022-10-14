package com.AgileCrmAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class LoginAgileCrmAutomation extends BaseClass implements ISuiteListener,ITestListener{
@Test
	public void main() {
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
	    launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.navigate().to("https://realestateautomation.agilecrm.com/");
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("cst2@yopmail.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Test1234");
		WebElement Signin=driver.findElement(By.xpath("//input[@type='submit']"));
		Signin.click();
}
		
		public void onTestFailure(ITestResult result) {
		 TakesScreenshot takescr=(TakesScreenshot)driver;
		 File screenshotfile=takescr.getScreenshotAs(OutputType.FILE);
		 String fileName=result.getName();
		 String outputPath=System.getProperty("user.dir")+"//ExecutionResult//Screenshots//"+fileName+".png";
		 File outputFile=new File(outputPath);
		 try
		 {
			 FileUtils.copyFile(screenshotfile, outputFile);
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		}

	}


