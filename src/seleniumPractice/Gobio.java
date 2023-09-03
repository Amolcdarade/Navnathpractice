package seleniumPractice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gobio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@class='loginCont__input']")).sendKeys("7972657538");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Navnath");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("navnathsangale93@gmail.com");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		//driver.findElement(By.xpath("(//span[@class='sc-jtXEFf ezccfJ'])[3]")
		driver.findElement(By.xpath("(//span[@class='sc-jtXEFf ezccfJ'])[3]")).click();
	//	Scanner s1 = new Scanner(System.in);
	//	int a = s1.nextInt();
	//	int b = s1.nextInt();
	//	int c = s1.nextInt();
	//	int d = s1.nextInt();
		
     //   driver.quit();
	}

}
