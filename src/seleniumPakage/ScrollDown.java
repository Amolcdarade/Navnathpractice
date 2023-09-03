package seleniumPakage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,5000)");
		Thread.sleep(5000);

		Thread.sleep(3000);
		js.executeScript("scroll(0,-3000)");
		Thread.sleep(5000);

		driver.quit();


	}

}
