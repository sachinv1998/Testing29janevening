package pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
    private	WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	
	@FindBy(xpath="//input[@name='remember']")
    private  WebElement keepon;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername()
	{
		username.sendKeys("sachinvarade3010@gmail.com");
	}
	
	public void sendpassword()
	{
		password.sendKeys("pass@123");
	}
	
	public void clickonlogin()
	{
		login.click();
	}
	public void clickonkeepon()
	{
		keepon.click();
	}
	
}
