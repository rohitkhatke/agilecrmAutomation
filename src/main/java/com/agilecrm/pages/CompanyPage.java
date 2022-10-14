package com.agilecrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AgileCrmAutomation.BaseClass;

public class CompanyPage extends BaseClass{
	
	  By addCompanyButton=By.xpath("//button[contains(text(),'Add Company')]");
      @FindBy(id="company_name")
      public WebElement companyName;
      
      @FindBy(xpath = "//button[text()='Delete']")
      public WebElement deleteButton;
      
      @FindBy(xpath = "//span[@id='companies-list-view-checkbox']//input")
      public WebElement selectAllCheckbox;
      
      @FindBy(xpath = "//span[@id='companies-list-view-checkbox']//input")
      public List<WebElement> AllCheckbox;
      
      @FindBy(id = "company_url")
		public WebElement company_URL; 
      
      @FindBy(xpath="//div[@class='controls col-sm-9 second']//input[@id='email']")
		public WebElement companyEmail;
      
      @FindBy(xpath="//div[@class='controls col-sm-9 second']//select[@name='email-select']")
		 public WebElement selectEmail;
      
       public CompanyPage() {
    	   PageFactory.initElements(driver, this);
       } 
       
       public void deleteCompany() {
    	   selectAllCheckbox.click();
    	   deleteButton.click();
    	   
       }
       public void addCompany() {
    	   WebElement addCompanyButton=driver.findElement(this.addCompanyButton);
    	   Actions action =new Actions(driver);
    	   action.click(addCompanyButton).build().perform();
       }
	    public void com_Name(String name){
	    	companyName.sendKeys(name);
	    }
		
		
		public void url(String Com_URL) {
			company_URL.sendKeys(Com_URL);
		}
		
		public void companyEmail(String email) {
			 selectEmail.sendKeys(email);
			 selectDropDownValByText(selectEmail,"Primary");
			
		}
	
	
		
		
		
		
		
	
	public void addPhone(String phone) {
		WebElement phoneno=driver.findElement(By.xpath("//div[@class='controls col-sm-9 second']//input[@id='phone']"));
		phoneno.sendKeys(phone);
		WebElement selectphone=driver.findElement(By.xpath("//div[@class='controls col-sm-9 second']//select[@name='phone-select']"));
		selectDropDownValByText(selectphone,"Primary");
	}
	
	public void addAddress(String address) {
		WebElement adress=driver.findElement(By.xpath("//div[@class='controls col-sm-9 ']//input[@id='address']"));
		adress.sendKeys(address);
		WebElement selectaddaddress=driver.findElement(By.xpath("//div[@class='controls col-sm-9 ']//select[@name='address-type']"));
		selectDropDownValByText(selectaddaddress,"Work");
	}

	
	
	
		
	
	
	}


	
	
	
	


