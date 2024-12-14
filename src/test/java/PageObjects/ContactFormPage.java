package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage extends PageBase
{

	public ContactFormPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//input[@id='input_7_3_6']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input_7_3_6']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input_7_3_6']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input_7_3_6']")
	WebElement txtPhone;
	
	@FindBy(xpath="//input[@id='bed_type__2']")
	WebElement ClkBed;
	
	@FindBy(xpath="//input[@id='bath_type_2']")
	WebElement ClkBath;
	
	@FindBy(xpath="//select[@id='about']")
	WebElement SelValue;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement ClkChkBox;
	
	@FindBy(xpath="//h2[normalize-space()='Contact Form']")
	WebElement msg;
	
	public void EnterFirstName(String Fname)
	{
	   txtFirstName.sendKeys(Fname);	
	}

	public void EnterLastName(String Lname)
	{
	   txtLastName.sendKeys(Lname);	
	}
	
	public void EnterEmail(String Email)
	{
	   txtEmail.sendKeys(Email);	
	}
	
	public void EnterPhone(String Phone)
	{
	   txtPhone.sendKeys(Phone);	
	}
	
	public void ClickBed()
	{
	   ClkBed.click();
	}
	
	public void SelectOption(String Value)
	{
		SelValue.sendKeys(Value);
	}
	
	public void ClickChkBox()
	{
		ClkChkBox.click();
	}
	
	public boolean getmsg()
	{
		return msg.isDisplayed();
	}
}
