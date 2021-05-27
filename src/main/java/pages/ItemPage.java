package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends PageBase {
	
	public ItemPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name="quantity")
	WebElement Qty ;
	
	@FindBy(id="button-cart")
	WebElement AddToCartBtn ;
	
	@FindBy(linkText="shopping cart")
	WebElement ShoppingCart ; 
	
	
	public void UpdateProductQuantityInCart(String quantity) {
		//clear quantity textbox
		clearText(Qty);
		setTextElementText(Qty, quantity);
	}
	
	public void AddToCart() 
	{
		clickButton(AddToCartBtn);
	}
	
	public void OpenShoppingCart() 
	{
		clickButton(ShoppingCart);
		
	}


}
