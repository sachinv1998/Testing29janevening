package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	   public static WebDriver opentheChromeBrowser()
	   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	   }
	   public static WebDriver opentheFirefoxBrowser()
	   {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sachin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	   }
	   
	   public static WebDriver opentheOperaBrowser()
	   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	   }
	   
	   
	}


