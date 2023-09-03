package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
	//POM
	
	//2.Initialization
	public ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
    // 1.Declaration
	@FindBy(xpath="//input[@name='username']")
	private WebElement username_textbox;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd_textbox;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbttn;
	
	// 3.Usage
	public void enterActiTimeUsername()
	{
		username_textbox.sendKeys("admin");
	}
	
	public void enterActiTimePassword()
	{
		pwd_textbox.sendKeys("manager");
	}
	
	public void ClickOnLoginButton()
	{
		loginbttn.click();
	}
	
	
	
	
	

	
	
}
