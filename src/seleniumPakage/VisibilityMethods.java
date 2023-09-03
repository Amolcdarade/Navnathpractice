package seleniumPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/r.php?r=101");
        driver.manage().window().maximize();
        
       WebElement Firstname_extBox = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
       boolean b = Firstname_extBox.isDisplayed();
       System.out.println(b);
       boolean c = Firstname_extBox.isEnabled();
       System.out.println(c);
       boolean m= Firstname_extBox.isSelected();
       System.out.println(m);
       
       driver.quit();
       }
  }
