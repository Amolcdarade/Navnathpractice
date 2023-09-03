package seleniumPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(4000);
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.switchTo().frame("frame3");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(7000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).sendKeys("My 1st oct batch");
		Thread.sleep(7000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//select[@id='animals']")).sendKeys("Baby Cat");
		Thread.sleep(7000);
		driver.quit();

	}

}
