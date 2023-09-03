package seleniumPakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserRunning {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe\\");
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.get("https://www.sapkalknowledgehub.org/");
        Thread.sleep(5000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.get("https://in.bookmyshow.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.quit();
        
        
        
	}

}
