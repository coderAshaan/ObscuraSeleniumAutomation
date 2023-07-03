package com.obscuramavenautomation.ObscuraAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initializeBrowser() {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\USER\\Documents\\JavaEclipseProgs\\ObscuraAutomation\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		 // Launching website
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");		
	}
	
    public void browserCloseOrQuit() { 
		
		//driver.close();
    	driver.quit();
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Base base = new Base();            
        base.initializeBrowser();  
        base.browserCloseOrQuit();
        
	}
	
}
