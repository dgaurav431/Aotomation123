package Actions_Class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RateApplication2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/mouseHover/rating?sublist=2");
		
		WebElement firstStar = driver.findElement(By.xpath("(//*[name()='svg'])[1]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(firstStar, 170, 0).perform();
		
	}

}
