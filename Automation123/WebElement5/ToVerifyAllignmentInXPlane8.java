package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentInXPlane8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		
		WebElement yesButton1 = driver.findElement(By.id("btn"));
		WebElement yesButton2 = driver.findElement(By.id("btn2"));
		
		Point yesButton1Position = yesButton1.getLocation();
		Point yesButton2Position = yesButton2.getLocation();
		
		int yesButton1StartX = yesButton1Position.getX();
		int yesButton2StartX = yesButton2Position.getX();
		
		if( yesButton1StartX == yesButton2StartX ) {
			System.out.println("Pass: the allignment is verified");
		}
		else
			System.out.println("Fail: the allignment is not verified");
			
	}

}
