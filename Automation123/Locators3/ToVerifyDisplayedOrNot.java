package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDisplayedOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("gaurav@gmail.com");
		
		boolean emailDisplayed = emailTextBox.isDisplayed();
		if(emailDisplayed) {
			System.out.println("Pass: the email text box is displayed");
		}
		else
			System.out.println("Fail: the email text box is not displayed");

	}

}
