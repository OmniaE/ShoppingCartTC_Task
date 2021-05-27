package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DesktopsPage;
import pages.HomePage;
import pages.ItemPage;
import pages.RigistrationPage;
import pages.ShoppingCartPage;

public class ChooseItemTest extends TestBase {
	
	HomePage homeObject ; 
	DesktopsPage desktopObject ;
	ItemPage itemObject ; 
	ShoppingCartPage cartObject;
	RigistrationPage registerObject;
	
	
	@Test(priority=1)
	public void UserChooseItemSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openDesktopsPage();
		
		desktopObject = new DesktopsPage(driver);
	//	desktopObject.ScrolldownToItem();
		desktopObject.OpenItemPage();
	}
	
	@Test(priority=2)
	public void ChooseItemQuantity() 
	{
		itemObject = new ItemPage(driver); 
		itemObject.UpdateProductQuantityInCart("2");
	}
	
	@Test(priority=3)
	public void ItemAddedToCartSuccssfully() 
	{
		itemObject = new ItemPage(driver); 
		itemObject.AddToCart();
		
		itemObject.OpenShoppingCart();
	}
	
	@Test(priority=4)
	public void CheckCartData() 
	{
		cartObject = new ShoppingCartPage(driver);
		
		cartObject.clickCheckOut();
		
	}
	
	@Test(priority=5)
	public void RegisterAccount() 
	{
		registerObject = new RigistrationPage(driver);
		registerObject.clicktoContinue();
		
		registerObject.userRegistration("omnia", "elgendy", "04387493", "12345", "Egypt", "Cairo", "Egypt", "Al Qahirah");
		
	}
}
