package seleniumPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllActionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
//	WebElement doublec = driver.findElement(By.xpath("(//a[@title='jQuery UI'])[2]"));
//		Actions a = new Actions(driver);
//		a.doubleClick().perform();
//		Thread.sleep(3000);
		
//	WebElement Rightc = driver.findElement(By.xpath("(//a[@title='jQuery UI'])[2]"));
//		Actions s = new Actions(driver);
//		s.contextClick(Rightc).perform();
//		Thread.sleep(3000);
		
	WebElement mte = driver.findElement(By.xpath("//a[text()='Contribute']"));
		Actions x = new Actions(driver);
		x.moveToElement(mte).perform();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
