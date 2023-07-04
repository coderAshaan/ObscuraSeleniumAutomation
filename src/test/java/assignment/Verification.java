package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {
	
	public WebDriver driver;
	
	public void initialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\OneDrive\\Documents\\Eclipse_Workspace\\obsquraautomation\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	
	public void verifyTitle()
	{
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Obsqura Testing"))
		{
			System.out.println("Title is match");
		}else
		{
			System.out.println("Title not mached");
		}
	}
	
	public void verifyUrl()
	{
		String url = driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://selenium.obsqurazone.com/simple-form-demo.php"))
		{
			System.out.println("URL is match");
		}else
		{
			System.out.println("URL not mached");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verification verification = new Verification();
		verification.initialiseBrowser();
		verification.verifyTitle();
		verification.verifyUrl();
		verification.driver.quit();

	}

}
