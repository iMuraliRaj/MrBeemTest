package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementHome {

	
	@FindBy(xpath="//*[@id=\"title\"]']")
	public static WebElement websiteName;
	
	@FindBy(xpath="//*[@id=\"shop\"]']")
	public static WebElement websiteInformation;
	
	@FindBy(xpath="//*[@id=\"slogan\"]']")
	public static WebElement websiteSlogan;
	
	@FindBy(xpath="//*[@id=\"dogslink\"]']")
	public static WebElement dogs;
		
	@FindBy(xpath="//*[@id='//*[@id=\"foodslink\"]']")
	public static WebElement foods;
	
	@FindBy(xpath="//*[@id='//*[@id=\"medicinelink\"]']")
	public static WebElement medicines;

	@FindBy(xpath="//*[@id='//*[@id=\"clotheslink\"]']")
	public static WebElement clothes;
	
	@FindBy(xpath="//*[@id='//*[@id=\"signuplink\"]']")
	public static WebElement signup;

	@FindBy(xpath="//*[@id='//*[@id=\"loginlink\"]']")
	public static WebElement login;
	
	@FindBy(xpath="//*[@id='//*[@id=\"logoutlink\"]']")
	public static WebElement logout;
	
	@FindBy(xpath="//*[@id='//*[@id=\"helpQuestion\"]']")
	public static WebElement howMrBeemHelpQuestion;
	
	@FindBy(xpath="//*[@id='//*[@id=\"helpAnswer\"]']")
	public static WebElement howMrBeemHelpAnswer;	
	
	@FindBy(xpath="//*[@id='//*[@id=\"buyQuestion\"]']")
	public static WebElement howToBuyQuestion;	
	
	@FindBy(xpath="//*[@id='//*[@id=\"buyAnswer\"]']")
	public static WebElement howToBuyAnswer;	

	
	@FindBy(xpath="//*[@id=\"helpAnswer\"]")
	public static WebElement importanceOfPetHeading;	
	
	@FindBy(xpath="//*[@id=\"importantceAnswer\"]")
	public static WebElement importanceOfPetAnswer;	
	
	@FindBy(xpath="//*[@id=\"buyAnswer\"]']")
	public static WebElement developedByName;	
}
