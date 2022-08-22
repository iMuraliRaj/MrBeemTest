package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException 
	{
		launchApplication();
	}
	
	public static void launchApplication() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://imuraliraj.github.io/MrBeem/");
		
		
	}
	
	public static void screenshot(String location)  throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		
		File src = sc.getScreenshotAs(OutputType.FILE);
		
		File des = new File(location);
		
		FileHandler.copy(src, des);
	}

}
