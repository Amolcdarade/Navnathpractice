package seleniumPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("7972657538");
        Thread.sleep(2000);
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgot Password")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Cust")).click();
        Thread.sleep(2000);
        driver.quit();
        
        

	}

}
