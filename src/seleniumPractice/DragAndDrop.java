package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	    //Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
     WebElement drg = driver.findElement(By.xpath("//div[@id='draggable']"));
	 WebElement drp = driver.findElement(By.xpath("//div[@id='droppable']"));
	    Actions as = new Actions(driver);
	    as.dragAndDrop(drg, drp).perform();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
