package Dropdowns9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAndDeselect6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carDropdown = driver.findElement(By.id("cars"));
		
		Select select= new Select(carDropdown);
		
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		select.selectByValue("saab");
		Thread.sleep(2000);
		
		select.selectByIndex(0);
		Thread.sleep(2000);

		select.deselectByIndex(1);
		Thread.sleep(2000);

		select.deselectByValue("audi");
		Thread.sleep(2000);

		select.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);

		select.deselectAll();
		
		
	}

}
