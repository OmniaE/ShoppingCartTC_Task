package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RigistrationPage extends PageBase{

	public RigistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText ="Step 2: Account & Billing Details ")
	WebElement ContinueBtn ; 
	
	@FindBy(name="firstname")
	WebElement fnTextBox ;
	
	@FindBy(name="lastname")
	WebElement lnTextBox ;
	
	@FindBy(name="telephone")
	WebElement teleTextBox ;
	
	@FindBy(name="password")
	WebElement pass ;
	
	@FindBy(name="confirm")
	WebElement confirmPass ;
	
	@FindBy(name="address_1")
	WebElement addressTxtbox ;
	
	@FindBy(name="city")
	WebElement CityTxtBox ;
	
	@FindBy(id="input-payment-country")
	WebElement country ;
	Select countrySel = new Select (country);
	
	@FindBy(id="input-payment-zone")
	WebElement region ;
	Select regionSel = new Select (region);
	
	@FindBy(id="button-register")
	WebElement registerBtn ; 
	
	public void clicktoContinue() 
	{
	ContinueBtn.click();
		
	}
	
	public void userRegistration(String firstName , String lastName , String phone , String password,
			String address, String city, String country, String region) 
	{
		setTextElementText(fnTextBox, firstName);
		setTextElementText(lnTextBox, lastName);
		setTextElementText(teleTextBox, phone);
		setTextElementText(pass, password);
		setTextElementText(confirmPass, password);
		setTextElementText(addressTxtbox, address);
		setTextElementText(CityTxtBox, city);
		countrySel.selectByVisibleText(country);
		regionSel.selectByVisibleText(region);
		
		clickButton(registerBtn);
	}
	

}
