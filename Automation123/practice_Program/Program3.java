package practice_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		
		driver.findElement(By.cssSelector("smart-ui-menu[class=\"smart-ui-component\"]")).getShadowRoot().findElement(By.cssSelector("div[class=\"smart-menu-item-label-element\"]")).click();
		//driver.findElement(By.cssSelector(null)).getShadowRoot().findElement(By.cssSelector(null)).click();
		
	}

}
