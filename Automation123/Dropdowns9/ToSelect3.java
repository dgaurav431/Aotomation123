package Dropdowns9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		
		WebElement monthDropdown = driver.findElement(By.id("month"));

		WebElement yearDropdown = driver.findElement(By.id("year"));

		Select selectDay= new Select(dayDropdown);
		selectDay.selectByIndex(27);
		
		Select selectMonth= new Select(monthDropdown);
		selectMonth.selectByValue("6");
		
		Select selectYear= new Select(yearDropdown);
		selectYear.selectByVisibleText("1997");

	}

}
