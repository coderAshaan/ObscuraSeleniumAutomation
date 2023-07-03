package com.obscuramavenautomation.ObscuraAutomation;

import java.sql.Driver;

public class BrowserCommands extends Base {
	String title;
	String currenturl;
	public void browserCommands () {
		title = driver.getTitle();
		String pagesource = driver.getPageSource();
		currenturl = driver.getCurrentUrl();
	}
	
	public void compareTitle() {
		if (title == "Obscura") {
			System.out.println("Title matches");			
		} else {
			System.out.println("Title mismatches");
		}
		
	}
	
	public void compareCurrentURL() {
		if (currenturl == "https://selenium.obsqurazone.com") {
			System.out.println("URL matches");			
		} else {
			System.out.println("URL mismatches");
		}
		
	}

	public static void main(String[] args) {
		BrowserCommands browsercommand = new BrowserCommands();
		browsercommand.initializeBrowser();
		browsercommand.browserCommands();
		browsercommand.compareTitle();
		browsercommand.compareCurrentURL();
		browsercommand.browserCloseOrQuit();
		

	}

}
