package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
		Thread.sleep(2000);
		
		String emailToolTipText = driver.findElement(By.id("email")).getAttribute("title");
		
		System.out.println(emailToolTipText);
	
		if(emailToolTipText.contains("Enter your Email")) {
			System.out.println("Pass: the tool tip text is verified");
		}
		else
			System.out.println("Fail: the tool tip text is not verified");
		
	}
		
}
