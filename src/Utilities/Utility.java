package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility 
{
	
	public static void main(String[] args) 
	{
		launchApplication();
	}
	
	public static void launchApplication()
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://imuraliraj.github.io/MrBeem/");
	}

}
