package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
		
	}
	
	@FindBy(linkText="Desktops")
	WebElement Desktops ; 
	
	@FindBy(linkText="Show All Desktops")
	WebElement ShowAllDesktop ; 
	
	@FindBy(name="search")
	WebElement SearchBox ;
	
	public void openDesktopsPage() 
	{
		clickButton(Desktops);
		clickButton(ShowAllDesktop);
		
	}
	
	public void enterSearchWord (String Keyword ) 
	{
		setTextElementText(SearchBox, Keyword);
		pressEnter();
	}
	

	

}
