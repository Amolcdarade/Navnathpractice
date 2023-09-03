package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringRev {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[4]")).click();
		driver.findElement(By.xpath("(//p[@class=' todayPrice'])[5]")).click();
		
		driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[39]")).click();
		driver.quit();
		}
		

	}


