package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(linkText="Checkout")
	WebElement CheckoutBtn ; 
	
	public void clickCheckOut() 
	{
		clickButton(CheckoutBtn);
		
	}
}
