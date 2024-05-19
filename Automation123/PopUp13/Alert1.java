package PopUp13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/alert?sublist=0");
		
		driver.findElement(By.id("buttonAlert2")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.linkText("Prompt")).click();
		
	}

}
