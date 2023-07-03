package com.obscuramavenautomation.ObscuraAutomation;

import org.openqa.selenium.By;

public class Locators extends Base {
	
	public void locateByID() {
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("navbar-nav"));
		driver.findElement(By.linkText("Checkbox Demo"));
		driver.findElement(By.partialLinkText("Radio Buttons"));
		//driver.findElement(By.name("inlineRadioOptions")); //radio button link
		driver.findElement(By.cssSelector("button#button-one"));
		driver.findElement(By.cssSelector("button[id=button-one]"));
		driver.findElement(By.cssSelector("ul.navbar-nav"));
		
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locators locators = new Locators();
        locators.initializeBrowser();
        locators.locateByID();
        locators.browserCloseOrQuit();
	}

}
