package com.store.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.store.utilities.ReadConfig;

public class BaseClass {
	public static WebDriver driver; 
	public static Logger logger;
	
	ReadConfig readConfig = new ReadConfig();
	
	protected String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	@BeforeClass
	public void setUp() {
        try {
            if (browser.equalsIgnoreCase("chrome")) {
                
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--start-maximized");
                driver = new ChromeDriver();
            } 
            else if (browser.equalsIgnoreCase("firefox")) {
                
//                FirefoxOptions options = new FirefoxOptions();
                driver = new FirefoxDriver();
            }
            else if (browser.equalsIgnoreCase("edge")) {
               
                //EdgeOptions options = new EdgeOptions();
                driver = new EdgeDriver();
            } 
            else {
                System.out.println("Unsupported browser: " + browser);
            }
          
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            
        } catch (WebDriverException e) {
            System.out.println("Error launching the browser: " + e.getMessage());
        }
        
        //logging
        logger = LogManager.getLogger("selenium");
    }
	
	public void takeScreenshot(WebDriver driver, String testName) throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/Users/abhishek/Documents/selenium/SeleniumDDTFramework/SeleniumDDTFrameork/Screenshot/"+ testName +".png");
		
		FileUtils.copyFile(srcFile, destFile);
	}
	
	
	@AfterClass
	public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully.");
        } else {
            System.out.println("No browser is open.");
        }
    }


}
