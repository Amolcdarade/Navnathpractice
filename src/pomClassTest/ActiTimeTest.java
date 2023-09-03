package pomClassTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomClass.ActiTimeHomePage;
import pomClass.ActiTimeLoginPage;

public class ActiTimeTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		
		ActiTimeLoginPage login = new ActiTimeLoginPage(driver);
		login.enterActiTimeUsername();
		login.enterActiTimePassword();
		login.ClickOnLoginButton();
		
		ActiTimeHomePage home = new ActiTimeHomePage(driver);
		home.CheckActiTimeLogo();
		home.ClickActiTimeLogOutLink();
	}

}
