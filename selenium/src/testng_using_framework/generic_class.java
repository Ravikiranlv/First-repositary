package testng_using_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic_class {
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		wait=new WebDriverWait(driver, 10);
		driver.get("https://in.search.yahoo.com/?fr2=inr");
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
