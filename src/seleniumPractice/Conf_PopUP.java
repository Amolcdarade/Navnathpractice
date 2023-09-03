package seleniumPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conf_PopUP {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumsample.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='feed-link']")).click();
		driver.findElement(By.xpath("(//a[@href='https://www.blogger.com'])[1]")).click();
		Alert alt = driver.switchTo().alert();
		Set<String> ids=driver.getWindowHandles();
		
		LinkedList l = new LinkedList(ids);
		System.out.println(driver.getTitle());
		driver.switchTo().window((String) l.get(1));
		System.out.println(l.get(1));
		driver.close();
        Thread.sleep(2000);
        driver.quit();

	}

}
