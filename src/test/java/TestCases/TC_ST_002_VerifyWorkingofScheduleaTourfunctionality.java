package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ContactFormPage;
import PageObjects.DayAndTimeSelectionPage;
import PageObjects.HomePage;
import PageObjects.TypeofTourPage;
import TestBase.BaseTest;

public class TC_ST_002_VerifyWorkingofScheduleaTourfunctionality extends BaseTest
{
	@Test(priority=1)
	public void TC_ST_002_Verify_that_link_of_Schedule_a_tour_is_clickable_on_the_header_of_site() 
	{
		try {
			logger.info("***** Test has been started *****");
			HomePage Hp = new HomePage(driver);
			Hp.ClkSchedule_A_Tour();
			logger.info("***** Clicked on Schedule_A_Tour *****");

			TypeofTourPage Ttp = new TypeofTourPage(driver);

			String confirm = Ttp.getConfirmation();

			Assert.assertEquals(confirm, "Which type of tour would you like to schedule?");
			logger.info("***** Validating expected message *****");
			logger.info("***** Test has been passed *****");

			Ttp.ClkCancel();
		}

		catch (Exception e) {
			Assert.fail();
			e.getMessage();
			logger.info("***** Test has been failed *****");
		}
		finally
		{
			 logger.info("***** Test has been completed *****"); 	
		}
	}

	    @Test(priority=2)
	    public void TC_ST_003_Verify_that_any_of_the_tour_is_clickable()
	    {
	    	try 
	    	{
	    		logger.info("***** Test has been started *****");
				HomePage Hp = new HomePage(driver);
				Hp.ClkSchedule_A_Tour();
				logger.info("***** Clicked on Schedule_A_Tour *****");

				TypeofTourPage Ttp = new TypeofTourPage(driver);
				Ttp.ClkTourType();
				logger.info("***** Clicked on Type of Tour *****");
				logger.info("***** Test has been passed *****");
				
				Ttp.ClkCancel();
	    	}
	    	catch (Exception e) {
				Assert.fail();
				e.getMessage();
				logger.info("***** Test has been failed *****");
			}
	    	finally
			{
				 logger.info("***** Test has been completed *****"); 	
			}
	    }
		
		@Test(priority=3)
		 public void TC_ST_004_Verify_that_next_button_is_clickable_on_the_popup() 
		{ 
			try 
		      {
			  logger.info("***** Test has been started *****"); 
			  HomePage Hp = new HomePage(driver); 
			  Hp.ClkSchedule_A_Tour();
			  logger.info("***** Clicked on Schedule_A_Tour *****");

			  TypeofTourPage Ttp = new TypeofTourPage(driver); 
			  Ttp.ClkTourType();
			  logger.info("***** Clicked on Type of Tour *****"); 
			  Ttp.ClkNextButton();
			  logger.info("***** Clicked on NextButton *****");
			  logger.info("***** Test has been passed *****"); 
			  
			  DayAndTimeSelectionPage Dt = new DayAndTimeSelectionPage(driver);
			  
			  String confirm = Dt.getConfirmation();
			  
			  Assert.assertEquals(confirm, "Select from available days & times");
			  logger.info("***** Validating expected message *****");
			  logger.info("***** Test has been passed *****");
				
			  Ttp.ClkCancel();
			  } 
			  catch(Exception e)
			  {
			    Assert.fail(); 
			    e.getMessage();
			    logger.info("***** Test has been failed *****");
			 }
			finally
			{
				 logger.info("***** Test has been completed *****"); 	
			}
		}	 
		@Test(priority=4)
		public void TC_ST_008_Verify_that_date_is_clickable()
		{
			  try
			  {
				  logger.info("***** Test has been started *****"); 
				  HomePage Hp = new HomePage(driver); 
			
				  Hp.ClkSchedule_A_Tour();
				  logger.info("***** Clicked on Schedule_A_Tour *****");

				  TypeofTourPage Ttp = new TypeofTourPage(driver); 
				  Ttp.ClkTourType();
				  logger.info("***** Clicked on Type of Tour *****"); 

				  Ttp.ClkNextButton();
				  logger.info("***** Clicked on NextButton *****"); 

				  DayAndTimeSelectionPage Dt = new DayAndTimeSelectionPage(driver);
				  Dt.ClkDate();
				  logger.info("***** Clicked on Date *****"); 
				  
				//  Thread.sleep(3000);
	              boolean slotvisibility = Dt.getSlots();
	              Assert.assertEquals(slotvisibility, true);
				  logger.info("***** Validating expected message *****");
				  logger.info("***** Test has been passed *****");
				
			      Ttp.ClkCancel();
			  } 
			  catch(Exception e)
			  {
			    Assert.fail(); 
			    e.getMessage();
			    logger.info("***** Test has been failed *****");
			 }
			 finally
				{
					 logger.info("***** Test has been completed *****"); 	
				}
		}
		
		@Test(priority=5)
		public void TC_ST_018_Verify_that_time_slots_is_clickable()
		{
			try
			{
				logger.info("***** Test has been started *****"); 
				  HomePage Hp = new HomePage(driver); 
			
				  Hp.ClkSchedule_A_Tour();
				  logger.info("***** Clicked on Schedule_A_Tour *****");

				  TypeofTourPage Ttp = new TypeofTourPage(driver); 
				  Ttp.ClkTourType();
				  logger.info("***** Clicked on Type of Tour *****"); 

				  Ttp.ClkNextButton();
				  logger.info("***** Clicked on NextButton *****"); 

				  DayAndTimeSelectionPage Dt = new DayAndTimeSelectionPage(driver);
				  Dt.ClkDate();
				  logger.info("***** Clicked on Date *****"); 
				  
				  Dt.ClkSlot();
				  logger.info("***** Clicked on Slot *****"); 
				  logger.info("***** Test has been passed *****");
					
			      Ttp.ClkCancel();
			}
			catch(Exception e)
			  {
			    Assert.fail(); 
			    e.getMessage();
			    logger.info("***** Test has been failed *****");
			 }
			finally
			{
				 logger.info("***** Test has been completed *****"); 	
			}
		}
		
		@Test(priority=6)
		public void TC_ST_020_Verfiy_that_next_button_is_clickable_if_user_has_clicked_on_the_time_slot()
		{
			try
			{
				logger.info("***** Test has been started *****"); 
				  HomePage Hp = new HomePage(driver); 
			
				  Hp.ClkSchedule_A_Tour();
				  logger.info("***** Clicked on Schedule_A_Tour *****");

				  TypeofTourPage Ttp = new TypeofTourPage(driver); 
				  Ttp.ClkTourType();
				  logger.info("***** Clicked on Type of Tour *****"); 

				  Ttp.ClkNextButton();
				  logger.info("***** Clicked on NextButton *****"); 

				  DayAndTimeSelectionPage Dt = new DayAndTimeSelectionPage(driver);
				  Dt.ClkDate();
				  logger.info("***** Clicked on Date *****"); 
				  
				  Dt.ClkSlot();
				  logger.info("***** Clicked on Slot *****"); 
				  
				  Dt.ClkNextButton();
				  logger.info("***** Clicked on NextButton *****"); 
				  
				  ContactFormPage Cf = new ContactFormPage(driver);
				  boolean msg = Cf.getmsg();
				  
				  Assert.assertEquals(msg, true);
				  logger.info("***** Validating expected message *****");
				  logger.info("***** Test has been passed *****");
				  					
			      Ttp.ClkCancel();
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
