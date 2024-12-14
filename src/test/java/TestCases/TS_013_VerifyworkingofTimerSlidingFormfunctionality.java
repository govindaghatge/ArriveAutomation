package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBase.BaseTest;

public class TS_013_VerifyworkingofTimerSlidingFormfunctionality extends BaseTest
{
	  @Test(priority=1)
      public void TC_TS_005_Verify_form_is_not_submitting_if_no_field_is_filled_by_user()
      {
           try 
           {
			  logger.info("***** Test has been started *****"); 
			  HomePage Hp = new HomePage(driver);
			  
			  Hp.EnterFname("");
			  Hp.EnterLname("");
			  Hp.EnterPhone("");
			  Hp.EnterEmail("");// randomly generated the email
			  Hp.ClkCheckbox();
			  Hp.ClkSignUp();
			  logger.info("***** Clicked on Sign Up *****"); 
			  
			  String validationMsg = Hp.getconfirmation();
			  Assert.assertEquals(validationMsg,"There was a problem with your submission. Please review the fields below.");
			  logger.info("***** Validation Done *****");
			  
			  driver.navigate().refresh();

           }
           catch(Exception e)
			  {
				logger.error("Test failed: " + e.getMessage());
				Assert.fail("Test failed: " + e.getMessage());
  	 	  }
			finally
			{
				 logger.info("***** Test has been completed *****"); 	
			}
      }
	  
	  @Test(priority=2)
	  public void TC_TS_006_Verify_form_is_not_submitting_if_mandatory_field_is_not_filled()
      {
           try 
           {
			  logger.info("***** Test has been started *****"); 
			  HomePage Hp = new HomePage(driver);
			  
			  Hp.EnterFname("");
			  Hp.EnterLname(randomeString().toUpperCase());
			  Hp.EnterPhone("");
			  Hp.EnterEmail("");// randomly generated the email
			  Hp.ClkCheckbox();

			  Hp.ClkSignUp();
			  logger.info("***** Clicked on Sign Up *****"); 
              
			  String validationMsg = Hp.getconfirmation();
			  Assert.assertEquals(validationMsg,"There was a problem with your submission. Please review the fields below.");
			  logger.info("***** Validation Done *****");

			  driver.navigate().refresh();

           }
           catch(Exception e)
			  {
				logger.error("Test failed: " + e.getMessage());
				Assert.fail("Test failed: " + e.getMessage());
  	 	  }
			finally
			{
				 logger.info("***** Test has been completed *****"); 	
			}
      }
	  
	  @Test(priority=3)
	  public void TC_TS_007_Verify_Phone_field_is_accepting_only_valid_format()
      {
           try 
           {
			  logger.info("***** Test has been started *****"); 
			  HomePage Hp = new HomePage(driver);
			  
			  Hp.EnterFname(randomeString().toUpperCase());
			  Hp.EnterLname(randomeString().toUpperCase());
			  Hp.EnterPhone("(123) 456-67");
			  Hp.EnterEmail(randomeString()+"@gmail.com");// randomly generated the email
			  Hp.ClkCheckbox();

			  Hp.ClkSignUp();
			  logger.info("***** Clicked on Sign Up *****"); 
              
			  String validationPhoneMsg = Hp.getPhoneconfirmation();
			  Assert.assertEquals(validationPhoneMsg,"Phone format: (###) ###-####");
			  logger.info("***** Validation Done *****");

			 driver.navigate().refresh();

           }
           catch(Exception e)
			  {
				logger.error("Test failed: " + e.getMessage());
				Assert.fail("Test failed: " + e.getMessage());
  	 	  }
			finally
			{
				 logger.info("***** Test has been completed *****"); 	
			}
      }
	  
	  @Test(priority=4)
	  public void TC_TS_008_Verify_email_field_is_accepting_only_valid_format()
      {
           try 
           {
			  logger.info("***** Test has been started *****"); 
			  HomePage Hp = new HomePage(driver);
			  
			  Hp.EnterFname(randomeString().toUpperCase());
			  Hp.EnterLname(randomeString().toUpperCase());
			  Hp.EnterPhone(" 123 456 6789");
			  Hp.EnterEmail(randomeString());// randomly generated the email
			  Hp.ClkCheckbox();

			  Hp.ClkSignUp();
			  logger.info("***** Clicked on Sign Up *****"); 
              
			  String validationEmailMsg = Hp.getEmailconfirmation();
		Assert.assertEquals(validationEmailMsg,"The email address entered is invalid, please check the formatting (e.g. email@domain.com).");
			  logger.info("***** Validation Done *****");

			 driver.navigate().refresh();

           }
           catch(Exception e)
			  {
				logger.error("Test failed: " + e.getMessage());
				Assert.fail("Test failed: " + e.getMessage());
  	 	  }
			finally
			{
				 logger.info("***** Test has been completed *****"); 	
			}
      }
	  
	  @Test(priority=5)
	  public void TC_TS_009_Verify_user_is_able_to_fill_all_the_fields()
      {
           try 
           {
			  logger.info("***** Test has been started *****"); 
			  HomePage Hp = new HomePage(driver);
			  
			  Hp.EnterFname(randomeString().toUpperCase());
			  Hp.EnterLname(randomeString().toUpperCase());
			  Hp.EnterPhone("123 456 6789");
			  Hp.EnterEmail(randomeString()+"@gmail.com");// randomly generated the email
			  Hp.ClkCheckbox();

			  Hp.ClkSignUp();
			  logger.info("***** Clicked on Sign Up *****"); 
              
			  String submsg = Hp.getSubmission();
			  Assert.assertEquals(submsg,"Thank you for choosing Arrive LEX!");
			  logger.info("***** Validation Done *****");


           }
           catch(Exception e)
			  {
				logger.error("Test failed: " + e.getMessage());
				Assert.fail("Test failed: " + e.getMessage());
  	 	  }
			finally
			{
				 logger.info("***** Test has been completed *****"); 	
			}
      }
}
