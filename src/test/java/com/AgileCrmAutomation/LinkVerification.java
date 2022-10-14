package com.AgileCrmAutomation;


import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LinkVerification extends BaseClass{
 @Test
	public void mai() {
		launchBrowser("chrome");
		driver.navigate().to("https://www.amazon.in");
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		for(WebElement e:elements) {
		String link=e.getAttribute("href");
			if(link!=null && link.startsWith("http"))
			{
				URL url;
				try {
					url=new URL(link);
					URLConnection urlconnection=url.openConnection();
					HttpsURLConnection connection=(HttpsURLConnection) urlconnection;
					connection.connect();
					int statusCode=connection.getResponseCode();
					if(statusCode == 200)
					{
						System.out.println(statusCode+" Url "+link);
					}
					connection.disconnect();
				}
				catch(IOException e1) {
					e1.printStackTrace(); 
				}
				}
		}

	}

}
