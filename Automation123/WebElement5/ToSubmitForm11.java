package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSubmitForm11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/button/buttonSubmitClick?sublist=3");
		
		driver.findElement(By.id("sat1")).click();
		driver.findElement(By.id("btn40")).submit();
	}

}
