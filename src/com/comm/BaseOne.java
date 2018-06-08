package com.comm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseOne {
	// This class will check for type of OS and type of browser
	
	WebDriver d1;
	
	public void getBrowser(String br){
		if(System.getProperty("os.name").contains("Windows")){
			if(br.equalsIgnoreCase("firefox")){
				// set property for firefox by setting path to gecko driver
				System.setProperty("webdriver.gecko.driver", "D:\\Programming\\workspaceSel2\\FrameworkOne\\drivers\\geckodriver.exe");
				d1=new FirefoxDriver();
			}
			else if(br.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "../FrameworkOne/drivers/chromedriver.exe");
				d1=new ChromeDriver();
	// D:\\Programming\\workspaceSel2\\FrameworkOne\\drivers\\chromedriver.exe
			}
		}
		else if(System.getProperty("os.name").contains("Mac")){
			
			// for Mac driver jar files to be used.
			if(br.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.marionette", "/FrameworkOne/drivers/geckodriver");
				d1=new FirefoxDriver();
			}
			else if(br.equalsIgnoreCase("chrome")){
				System.getProperty("webdriver.chrome.driver", "/FrameworkOne/drivers/chromedriver");
				d1=new ChromeDriver();
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println("Demo display for Base class");
		BaseOne b1=new BaseOne();
		b1.getBrowser("chrome");
	}

}
