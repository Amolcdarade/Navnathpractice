package seleniumPakage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);

       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File des = new File("C:\\Users\\AK\\eclipse-workspace\\myoctogang\\src\\seleniumPakage\\GoogleSS.png");
       FileHandler.copy(src, des);
       Thread.sleep(2000);
       driver.quit();
	}

}
