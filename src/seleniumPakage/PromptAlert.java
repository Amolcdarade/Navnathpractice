package seleniumPakage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://nxtgenaiacademy.com/alertandpopup");
        driver.manage().window().maximize();
         Thread.sleep(4000);
         
         driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
      Alert as=driver.switchTo().alert();
      as.sendKeys("yes");
      System.out.println(as.getText());
      as.accept();
      Thread.sleep(7000);
      driver.quit();

	}

}
