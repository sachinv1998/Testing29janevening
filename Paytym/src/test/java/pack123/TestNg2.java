package pack123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsers.Base;
import pomclass1.Headertabs;
import pomclass1.Loginpage;

public class TestNg2 {

	WebDriver driver;
	Headertabs headertabs;
	Loginpage loginpage;
	@Parameters("browserName")
	
	@BeforeTest
	public void launchthebrowser(String browser) {
		
		System.out.println(browser);
		
		if(browser.equals("Chrome"))
		{
			driver=Base.opentheChromeBrowser();
		}
		if(browser.equals("Firefox"))
		{
			driver=Base.opentheFirefoxBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	     }
	
	
	     @BeforeClass
	     public void createPomobject()
	     {
	    	loginpage=new Loginpage(driver);
	    	 headertabs=new Headertabs(driver);
     	 }
	     
	     
	     @BeforeMethod
	     public void launchtheapplication() throws InterruptedException
	     {
         driver.navigate().to("https://online.actitime.com/student20/login.do");
		
		
		Loginpage loginpage=new Loginpage(driver);
			
		loginpage.sendusername();
		loginpage.sendpassword();
		loginpage.clickonlogin();
		
		Thread.sleep(3000);
		 headertabs=new Headertabs(driver);
	     }
	     
	     
	     @Test
	     public void testthereport() throws InterruptedException
	     {
         headertabs.clickonReports();
		Thread.sleep(4000);
		String url= driver.getCurrentUrl();
		String title=driver.getTitle();
		
		Assert.assertEquals("actiTIME - Reports Dashboard", title);	
	   }
	     
	    @Test
	    public void testtheTasks() throws InterruptedException
        {
        headertabs.clickonTasks();
    	Thread.sleep(4000);
    	String url= driver.getCurrentUrl();
	    String title=driver.getTitle();   
	    Assert.assertEquals("actiTIME - Task List", title);
       }
	    
	   
	    
	    
        @AfterMethod
	    public void logouttheapllication() throws InterruptedException
	    {
    	  Thread.sleep(8000);
		headertabs.clickonlogout();
	    }
        
        
      
	   @AfterClass
	   public void cleartheobject()
	   {
		   loginpage=null;
		   headertabs=null;
	   }
	
	   @AfterTest
	   
	   public void closebrowser()
	   {
		   driver.close();
		   driver=null;
		   System.gc(); // garbage collector
	   }
	
	
	
	
	
}
