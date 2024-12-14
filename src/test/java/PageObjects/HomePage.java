package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//li[@id='menu-item-3272']")
	WebElement ClkST;
	
	@FindBy(xpath="//input[@id='input_5_3_3']")
	WebElement Fname;
	
	@FindBy(xpath="//input[@id='input_5_3_6']")
	WebElement Lname;
	
	@FindBy(xpath="//input[@id='input_5_5']")
	WebElement Phone;
	
	@FindBy(xpath="//input[@id='input_5_16']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='choice_5_15_0']")
    WebElement Clkchk;
	
	@FindBy(xpath="//input[@id='gform_submit_button_5']")
	WebElement Clkbtn;
	
	@FindBy(xpath="//h2[text()='There was a problem with your submission. Please review the fields below.']")
	WebElement msg;
	
	@FindBy(xpath="//div[text()='Phone format: (###) ###-####']")
	WebElement PhoneMsg;
	
	@FindBy(xpath="//div[@id=\"validation_message_5_16\"]")
	WebElement emailmsg;
	
	@FindBy(xpath="//h1[normalize-space()='Thank you for choosing Arrive LEX!']")
	WebElement submsg;
	
	public void ClkSchedule_A_Tour()
	{
		ClkST.click();
	}
	
	public void EnterFname(String fname)
	{
		Fname.sendKeys(fname);
	}
	
	public void EnterLname(String lname)
	{
		Lname.sendKeys(lname);
	}
	
	public void EnterPhone(String phone)
	{
		Phone.sendKeys(phone);
	}
	
	public void EnterEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public String getconfirmation()
	{
		try {
			return msg.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public String getPhoneconfirmation()
	{
		try {
			return PhoneMsg.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public String getEmailconfirmation()
	{
		try {
			return emailmsg.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public String getSubmission()
	{
		try {
			return emailmsg.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	public void ClkCheckbox()
	{
		Clkchk.click();
	}
	
	public void ClkSignUp()
	{
		Clkbtn.click();
	}
	
}
