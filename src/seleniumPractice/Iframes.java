package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  //    Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
        

		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().parentFrame();
		//driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).sendKeys("Amol darade");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement drop = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
		Select s = new Select(drop);
		s.selectByValue("babycat");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
