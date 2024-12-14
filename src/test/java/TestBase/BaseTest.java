package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest
{
   public static WebDriver driver;
   public Properties p;
   public Logger logger;
   
   @BeforeClass 
   @Parameters({"os","browser"})
   public void Setup(String os, String br) throws IOException
   {
	  FileReader File = new FileReader(".//src//test//resources//Config.properties");
	             p = new Properties();
	             p.load(File);
	  
	     logger = LogManager.getLogger(this.getClass());
	             
   if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
	   {
		 DesiredCapabilities capabilities=new DesiredCapabilities();
	     
		 if(os.equalsIgnoreCase("Windows"))
		 {
			 capabilities.setPlatform(Platform.WIN10);
		 }
		 else if(os.equalsIgnoreCase("Linux"))
		 {
			 capabilities.setPlatform(Platform.LINUX);
		 }
		 else if(os.equalsIgnoreCase("Mac"))
		 {
			 capabilities.setPlatform(Platform.MAC);
		 }		 
		 else
		 {
			 System.out.println("No matching os");
	   		 return;
   		 }
	   
		 switch(br.toLowerCase())
			{
			case "chrome" : driver=new ChromeDriver(); break;
			case "edge" : driver=new EdgeDriver(); break;
			case "firefox": driver=new FirefoxDriver(); break;
			default : System.out.println("Invalid browser name.."); return;
			}
	   //driver=new RemoteWebDriver(new URL("https://www.arrivelex.com/"),capabilities);
	 }
	 
	   if(p.getProperty("execution_env").equalsIgnoreCase("local"))
	  {
		   switch(br.toLowerCase())
			{
			case "chrome" : driver=new ChromeDriver(); break;
			case "edge" : driver=new EdgeDriver(); break;
			case "firefox": driver=new FirefoxDriver(); break;
			default : System.out.println("Invalid browser name.."); return;
			}
	  }	 
	 
	 driver.manage().deleteAllCookies();
	 driver.get(p.getProperty("weburl"));
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   
   @AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
   public String randomeString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String randomeNumber()
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String randomeAlphaNumberic()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednumber=RandomStringUtils.randomNumeric(3);
		return (generatedstring+"@"+generatednumber);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;
	}
}
