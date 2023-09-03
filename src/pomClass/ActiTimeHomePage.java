package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage {

	public ActiTimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/img/default/top_nav/default-logo.png?hash=274618146']")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout_link;
	
	public void CheckActiTimeLogo()
	{
		boolean b=logo.isDisplayed();
		if(b==true)
		{
			System.out.println("Logo is visible");
		}
		else
		{
			System.out.println("Logo is not visible");

		}
	}
	
	public void ClickActiTimeLogOutLink()
	{
		logout_link.click();
	}
}
