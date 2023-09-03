package seleniumPakage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertPopUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://nxtgenaiacademy.com/alertandpopup");
        driver.manage().window().maximize();
         Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
        Thread.sleep(4000);
        Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText());
       // String str=alt.getText();
      //  System.out.println(str);
        alt.accept();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
         Thread.sleep(2000);
         Alert al = driver.switchTo().alert();
         System.out.println(al.getText());
         al.dismiss();
         Thread.sleep(4000);
        driver.quit(); 
        
        
	}

}
