package seleniumPakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoOfLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    int count = links.size();
	    System.out.println(count);
	    
	    for(int i=0; i<links.size(); i++)
	    {
	        System.out.println(links.get(i).getText());
	    }
	    Thread.sleep(2000);
		driver.quit();
      }
  }
