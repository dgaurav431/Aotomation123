package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheParentWindowID14 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
	}

}
