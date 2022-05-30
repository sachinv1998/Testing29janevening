package pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headertabs {

	@FindBy(xpath="//div[text()='Time-Track']")
   private	WebElement Timetrack;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement Tasks;
	
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement Reports;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement Users;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public Headertabs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonTimetrack()
	{
		Timetrack.click();
	}
	
	public void clickonTasks()
	{
		Tasks.click();
	}
	
	public void clickonReports()
	{
		Reports.click();
	}
	
	public void clickonUsers()
	{
		Users.click();
	}
	public void clickonlogout()
	{
		logout.click();
	}
	
}
