package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheParentWindow6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/link"); 		
		//https://demoapps.qspiders.com/link/linkNew
		
		driver.findElement(By.linkText("Link in New Tab")).click();
	
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);  // 3sec pause
		
		driver.close();
		
	}

}
