package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DayAndTimeSelectionPage extends PageBase
{

	public DayAndTimeSelectionPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//label[@for='date1']")
	WebElement ClkDate;
	
	@FindBy(xpath="//label[contains(@class,'66 time-box')]")
	WebElement ClkSlot;
		
	@FindBy(xpath="//button[@id='second_section']")
	WebElement ClkNext;
	
	@FindBy(xpath="//p[normalize-space()='Select from available days & times']")
	WebElement getmsg;
	
	public void ClkNextButton()
	{
		ClkNext.click();
	}
	
	public void ClkDate()
	{
		ClkDate.click();
	}
	
	public void ClkSlot()
	{
		ClkSlot.click();
	}
	public String getConfirmation()
	{
		try
		{
		    return (getmsg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage()); 
		}
    }
	
	public boolean getSlots()
	{
		   return (getmsg.isDisplayed());
	}
}
