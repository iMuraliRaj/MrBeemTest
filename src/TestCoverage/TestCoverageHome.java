package TestCoverage;

import java.io.IOException;

import Utilities.Utility;

public class TestCoverageHome extends Utility
{
	public static void main(String[] args) throws IOException
	{
		preCondition();
		
		testTitle();
	}
	
	
	
	public static void preCondition() throws IOException
	{
		launchApplication();
	}
	
	
	public static void testTitle() throws IOException
	{
		String testCaseID="MRB001";
		
		String expectedTitle="Mr. Beem";
		
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println(testCaseID+" - PASSED ");
			
			Utility.screenshot("title-pass.png");
		}
		else
		{
			System.out.println(testCaseID+" - FAILED ");
			
			System.out.println(actualTitle);
			
			Utility.screenshot("title-fail.png");
		}
		
	}
	
	
	
	
	public static void testURL()
	{
		String expectedURL="https://imuraliraj.github.io/MrBeem/";
		
		String actualURL=driver.getCurrentUrl();
		
	}
	
	
	
	public static void tetsName()
	{
		String expectedName="Mr. Beem";
	}
	
	
	
	public static void testIntroduction()
	{
		String expectedIntroduction="A Online Pet shop";
		
	}
	
	
	
	public static void testSlogan()
	{
		String expectedSlogon="Buy the Good Hearts here";
	}
	
	

}
