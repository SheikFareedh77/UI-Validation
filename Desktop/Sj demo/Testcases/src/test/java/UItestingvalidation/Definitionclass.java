package UItestingvalidation;

import org.openqa.selenium.WebDriver;

class Definitionclass {
	static WebDriver driver;

	public static WebDriver definebrowser(String browsername) {

		if (browsername.equals("chrome")) {
			driver = Chromedriver.driverchromedriver();
			return driver;
		} else if (browsername.equals("firefox")) {
			driver = Edgedriver.driveredgedriver();
			return driver;
		}
		return driver;
	}

}
