package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) {
		        WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    driver.findElement(By.xpath("//button[@class='_2KpZ6l_2doB4z']")).click();
				driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Iphone11");
				driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
				String Rating =
				driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")
				).getText();
				System.out.println(Rating); 
	}
}