package pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclass1.Headertabs;
import pomclass1.Loginpage;

public class classabc {
	
	public static void main (String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://online.actitime.com/student20/login.do");
		
		
		Loginpage loginpage=new Loginpage(driver);
			
		loginpage.sendusername();
		loginpage.sendpassword();
		loginpage.clickonlogin();
		
		Thread.sleep(3000);
		
		Headertabs headertabs=new Headertabs(driver);
		headertabs.clickonReports();
		
		String url= driver.getCurrentUrl();
		String title=driver.getTitle();
		
		if(url.equals("https://online.actitime.com/student20/reports/dashboard.do")&&(title.equals("Reports Dashboard")))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		headertabs.clickonlogout();
		
		driver.close();
		
	}

}
