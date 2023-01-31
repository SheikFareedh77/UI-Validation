package UItestingvalidation;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Validtestcases {
	int n = Globalvariabletestcase.n;
	int actual = Globalvariabletestcase.actual;
	WebDriver driver = Globalvariabletestcase.driver;
	String Errormessage = Globalvariabletestcase.Errormessage;
	Datafeed login = Globalvariabletestcase.login;
	JavascriptExecutor js = Globalvariabletestcase.js;

	@Test(priority = 1)
	public void executevalidtestcase()
			throws InterruptedException, IOException, ParseException, CsvValidationException {

		Globalvariabletestcase.driver = driver;
		driver.manage().window().maximize();
		driver.get("https://www.ip2location.com");
		login.cookiebutton.click();
		String title = driver.getTitle().toString();
		System.out.println(title);
		Assert.assertEquals("IP Address to IP Location and Proxy Information | IP2Location", title);
		Thread.sleep(3000);
		login.Trydemo.click();
		Thread.sleep(3000);
		login.Trydemotextbox.click();
		Thread.sleep(3000);
		login.Trydemotextbox.clear();
		Thread.sleep(3000);
		CSVReader reader = new CSVReader(
				new FileReader("C:\\Users\\sfareed\\Desktop\\Sj demo\\Testcases\\Csv files\\Testcases.csv"));
		String[] cell;
		while ((cell = reader.readNext()) != null) {
			List<String> l = new ArrayList<>();
			l.add(cell[0]);
			l.add(cell[1]);
			l.add(cell[2]);
			l.add(cell[3]);
			l.add(cell[4]);
			l.add(cell[5]);
			Thread.sleep(3000);
			login.Trydemotextbox.sendKeys(l.get(0));
			int validate = Validateipaddress.validateipaddress(l.get(0));
			Assert.assertEquals(n, validate);
			Thread.sleep(3000);
			login.Lookup.click();
			js.executeScript("window.scrollTo(0,400)");
			Thread.sleep(3000);
			login.Trydemotextbox.clear();
			int n1 = Validateeachvalue.lookupvalidate(driver, l.get(2), l.get(3), l.get(4), login);
			Assert.assertEquals(n1, Globalvariabletestcase.actual);

		}
	}

	@Test(priority = 2)
	public void executeinvalidtestcase() throws InterruptedException, CsvValidationException, IOException {
		driver.manage().window().maximize();
		driver.get("https://www.ip2location.com");
		// login.cookiebutton.click();
		String title = driver.getTitle().toString();
		System.out.println(title);
		Assert.assertEquals("IP Address to IP Location and Proxy Information | IP2Location", title);
		Thread.sleep(3000);
		login.Trydemo.click();
		Thread.sleep(3000);
		login.Trydemotextbox.click();
		Thread.sleep(3000);
		login.Trydemotextbox.clear();
		Thread.sleep(3000);
		CSVReader reader = new CSVReader(
				new FileReader("C:\\Users\\sfareed\\Desktop\\Sj demo\\Testcases\\Csv files\\Invalidtestcase.csv"));
		String[] cell;
		while ((cell = reader.readNext()) != null) {
			List<String> l = new ArrayList<>();
			l.add(cell[0]);
			Thread.sleep(3000);
			login.Trydemotextbox.sendKeys(l.get(0));
			Thread.sleep(3000);
			login.Lookup.click();

			js.executeScript("window.scrollTo(0,400)");
			Thread.sleep(3000);
			Assert.assertEquals(login.errormessage.getText(), Errormessage);
			login.Trydemotextbox.clear();
		}
	}
}
