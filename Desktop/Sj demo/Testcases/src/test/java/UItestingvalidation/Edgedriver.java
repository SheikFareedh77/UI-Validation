package UItestingvalidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgedriver {
	static WebDriver driver;

	public static WebDriver driveredgedriver() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sfareed\\Desktop\\Sj demo\\Testcases\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
}
