package com.obscuramavenautomation.ObscuraAutomation;

public class NavigationCommands extends Base {
	
	public void navigtionMethods() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.navigtionMethods();
		navigationcommands.browserCloseOrQuit();
		
	}

}
