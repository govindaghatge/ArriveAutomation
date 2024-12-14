package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypeofTourPage extends PageBase
{

	public TypeofTourPage(WebDriver driver) 
	{
		super(driver);
	}
   
	@FindBy(xpath="//label[@for='Agent-Accompanied']")
	WebElement ClkType;
	
	@FindBy(xpath="//button[@id='first_section']")
	WebElement ClkNext;
	
	@FindBy(xpath="//p[text()='Which type of tour would you like to schedule?']")
	WebElement getmsg;
	

	@FindBy(xpath="//a[@class='schedult-close']")
	WebElement ClkCancel; 
	
	   public void ClkTourType()
	   {
		  ClkType.click();
	   }
	
	   public void ClkNextButton()
	   {
		  ClkNext.click();
	   }
	
	   public void ClkCancel()
	   {
		  ClkCancel.click();
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
	
	public boolean getButtonText()
	{
		    return (getmsg.isDisplayed());
	}
}	
