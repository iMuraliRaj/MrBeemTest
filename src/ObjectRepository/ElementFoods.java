package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementFoods {
	
	@FindBy(xpath="//*[@id=\"clotheslink\"]']")
	public static WebElement foods;

	@FindBy(xpath="")
	public static WebElement foodWelcome;
		
	@FindBy(xpath="")
	public static WebElement foodSlogan;
	
	@FindBy(xpath="")
	public static WebElement foodHome;
}
