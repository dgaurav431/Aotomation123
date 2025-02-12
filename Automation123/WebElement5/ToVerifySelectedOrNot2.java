package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySelectedOrNot2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/checkbox?sublist=0");
		
		WebElement emailCheckBox = driver.findElement(By.id("domain1"));
		emailCheckBox.click();
		
		boolean selected = emailCheckBox.isSelected();
		
		if(selected) {
			System.out.println("Pass: the checkbox is selected");
		}
		else
			System.out.println("Pass: the checkbox is not selected");
	}

}
