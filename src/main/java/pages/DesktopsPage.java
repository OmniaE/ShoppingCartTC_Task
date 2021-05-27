package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage  extends PageBase{

	public DesktopsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText="Sony VAIO")
	WebElement ChoosenItem ; 
	
	public void ScrolldownToItem() 
	{
		scrollToBottom();
		
	}
	
	public void OpenItemPage() 
	{
		clickButton(ChoosenItem);
		
	}

	
	

}
