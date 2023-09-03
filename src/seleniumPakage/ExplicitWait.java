package seleniumPakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/r.php?r=101");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
       WebElement ele = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
         
       WebDriverWait w = new WebDriverWait(driver,15);
       w.until(ExpectedConditions.visibilityOf(ele));
       ele.sendKeys("Amol Darade");
       
    //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       Thread.sleep(3000);
       driver.quit();
	}

}
