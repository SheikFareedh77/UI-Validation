package UItestingvalidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Datafeed {
	WebDriver driver = null;

//	public Datafeed(WebDriver driver) {
//		this.driver = driver;
//	}

	@FindBy(xpath = "//button[@style='color:#fff;padding:10px 20px;border:1px solid #32cd32;background-color:#32cd32']")
	WebElement cookiebutton;
	@FindBy(xpath = "//a[@class='btn btn-primary btn-lg btn-mr btn-res']")
	WebElement Trydemo;
	@FindBy(xpath = "//a[@class='btn btn-primary-outline btn-lg btn-res']")
	WebElement BuyOnline;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/ul/li[3]/a")
	WebElement Buyonlineheader;
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div[1]/form/div[1]/input")
	WebElement Trydemotextbox;
	@FindBy(xpath = "//button[@id='btn-click']")
	WebElement Lookup;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/ul/li[1]/a")
	WebElement Homebutton;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[3]/table/tbody/tr[3]/td/a")
	WebElement Country;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[3]/table/tbody/tr[4]/td")
	WebElement region;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[3]/table/tbody/tr[5]/td")
	WebElement city;
	// @FindBy(xpath = "/html/body/main/div/div/div/div/span")
	// WebElement errorcode;
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div[1]/form/div[2]")
	WebElement errormessage;
}
