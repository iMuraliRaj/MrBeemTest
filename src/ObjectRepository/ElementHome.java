package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementHome {

	
	@FindBy(xpath="//*[@id='//*[@id=\"title\"]']")
	public static WebElement websiteName;
	
	@FindBy(xpath="//*[@id='//*[@id=\"shop\"]']")
	public static WebElement websiteInformation;
	
	@FindBy(xpath="//*[@id='//*[@id=\"slogan\"]']")
	public static WebElement websiteSlogan;
	
	@FindBy(xpath="//*[@id='//*[@id=\"dogslink\"]']")
	public static WebElement dogs;
		
	@FindBy(xpath="//*[@id='//*[@id=\"foodslink\"]']")
	public static WebElement foods;
	
	@FindBy(xpath="//*[@id='']")
	public static WebElement medicines;

	@FindBy(xpath="//*[@id='']")
	public static WebElement clothes;
	
	@FindBy(xpath="//*[@id='']")
	public static WebElement signup;

	@FindBy(xpath="//*[@id='']")
	public static WebElement login;
	
	@FindBy(xpath="//*[@id='']")
	public static WebElement logout;
	
	@FindBy(xpath="//*[@id='']")
	public static WebElement howMrBeemHelpQuestion;
	
	@FindBy(xpath="//*[@id='']")
	public static WebElement howMrBeemHelpAnswer;	
	
	@FindBy(xpath="//*[@id='']")
	public static WebElement howToBuyQuestion;	
	
	@FindBy(xpath="//*[@id='']")
	public static WebElement howToBuyAnswer;	

}
