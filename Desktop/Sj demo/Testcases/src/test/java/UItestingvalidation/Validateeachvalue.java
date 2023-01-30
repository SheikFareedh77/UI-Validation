package UItestingvalidation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Validateeachvalue {
	public static int lookupvalidate(WebDriver driver, String country, String region, String city, Datafeed login) {
		// WebDriver driver = Definitionclass.definebrowser("chrome");

		String Obtainedcountry = login.Country.getText();
		String Obtainedregion = login.region.getText();
		String Obtainedcity = login.city.getText();
		Assert.assertEquals(country, Obtainedcountry);
		Assert.assertEquals(region, Obtainedregion);
		Assert.assertEquals(city, Obtainedcity);

		return 1;

	}
}
