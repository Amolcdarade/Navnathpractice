package seleniumPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
	WebElement tar=	driver.findElement(By.xpath("//select[@id='cars']"));
	Select s = new Select(tar);
		s.selectByVisibleText("Audi");
		Thread.sleep(4000);
		
		s.deselectByVisibleText("Audi");
		Thread.sleep(4000);
		driver.quit();
		}
   }
