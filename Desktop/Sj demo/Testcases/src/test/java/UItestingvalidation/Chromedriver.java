package UItestingvalidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {
	static WebDriver driver;

	public static WebDriver driverchromedriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sfareed\\Desktop\\Sj demo\\Testcases\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
}
