package practiceWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToVerifyOverlappingIssues {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/demoPage.html");
		
		WebElement username = driver.findElement(By.id("123abc"));
		WebElement password = driver.findElement(By.xpath("//input[@testing='qspiders']"));
		
		Rectangle usernameRect = username.getRect();
		Rectangle passwordRect = password.getRect();
		
		int usernameStartY = usernameRect.getY();
		int usernameHeight = usernameRect.getHeight();
		
		int usernameEndY = usernameStartY + usernameHeight;
		
		int passwordStartY = passwordRect.getY();
		
		if(passwordStartY>=usernameEndY) {
			System.out.println("Pass: the text fields are not overlapping");
		}
		
		else
			System.out.println("Fail: the text fields are overlapping");

	}

}
