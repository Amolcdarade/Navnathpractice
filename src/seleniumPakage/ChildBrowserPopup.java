package seleniumPakage;




import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumsample.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Posts (Atom)']")).click();
		driver.findElement(By.xpath("//a[text()='Blogger']")).click();
		Thread.sleep(4000);
		
	Set<String> ids	= driver.getWindowHandles();
		
		LinkedList l = new LinkedList(ids);
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		//System.out.println(l.get(1));
		driver.switchTo().window((String) l.get(1));
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		//System.out.println(l.get(2));
		driver.switchTo().window((String) l.get(2));
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000);
		driver.quit();
		}
    }
