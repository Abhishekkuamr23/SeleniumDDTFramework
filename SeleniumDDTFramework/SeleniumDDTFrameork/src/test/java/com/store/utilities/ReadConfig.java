package com.store.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties properties;
	String path = "/Users/abhishek/Documents/selenium/SeleniumDDTFramework/SeleniumDDTFrameork/src/test/resource/config.properties";
			
	//constructor
	public ReadConfig() {
		try {
		    properties = new Properties();
			FileInputStream file = new FileInputStream(path);
			properties.load(file);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String getBaseUrl() {
		String value = properties.getProperty("baseUrl");
		if(value!=null) {
			return value;
		}
		else
		{
			throw new RuntimeException("url is not specified");
		}
	}
	
	public String getBrowser() {
		String value = properties.getProperty("browser");
		if(value!=null) {
			return value;
		}
		else
		{
			throw new RuntimeException("browser is not specified");
		}
	}
	
}
	
	

