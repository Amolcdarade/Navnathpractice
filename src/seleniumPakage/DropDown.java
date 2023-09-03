package seleniumPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?r=101");
        driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Amol");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Darade");
        
        
       WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
       Select s = new Select(day);
       s.selectByVisibleText("19");
      //s.selectByIndex(0);
      //s.selectByValue("10");
      Thread.sleep(2000);
      
      WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
      Select s1 = new Select(month);
      s1.selectByVisibleText("Oct");
      //s1.selectByValue("10");
     // year.selectByIndex(9);
      Thread.sleep(5000);
      
      WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
      Select s2 = new Select(year);
      s2.selectByVisibleText("1990");
      Thread.sleep(5000);
      driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();  
      driver.quit();
	}

}
