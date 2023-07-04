package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public WebDriver driver;
	
	public void initialiseBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\OneDrive\\Documents\\Eclipse_Workspace\\obsquraautomation\\src\\main\\java\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	
	public void findId()
	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.id("button-one"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.id("inlineRadio1"));
		driver.findElement(By.id("inlineRadio2"));
		driver.findElement(By.id("inlineRadio11"));
	}
	
	public void findClassName()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.className("form-check-input"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.className("form-check-input"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/file-download.php");
		driver.findElement(By.className("form-control"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.className("navbar-nav"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		driver.findElement(By.className("clearfix"));
		
	}

	public static void main(String[] args) 
	{
		FindElement findelement = new FindElement();
		findelement.initialiseBrowser();
		findelement.findId();
		findelement.findClassName();
		findelement.driver.quit();

	}

}
