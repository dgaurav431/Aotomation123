package practiceAutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnsuggestion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("jordan");
		
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(), 'ordan')]"));
		
		for(WebElement sugggestion:allSuggestion) {
			
			if(sugggestion.getText().equals("jordan shoes price")) {
				sugggestion.click();
				break;
			}
		}
	}

}
