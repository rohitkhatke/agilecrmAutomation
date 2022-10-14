package com.AgileCrmAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling {
	private Properties properties;
	public PropertyHandling() {
		String configFilePath=System.getProperty("user.dir")+"//config.properties";
		try {
			FileInputStream input=new FileInputStream(configFilePath);
			properties=new Properties();
					properties.load(input);
		}
				catch (IOException e) {
					
					e.printStackTrace();
				}
	}
		public String getValue(String key)
		{
			return properties.getProperty(key);
			
		}
	
     public static void main(String args[]) {
    	 PropertyHandling propHandling=new PropertyHandling();
    	 String url=propHandling.getValue("agileCrmUrl");
    	 System.out.println(url);
     }
}
