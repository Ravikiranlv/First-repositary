package capter_screen_shot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base_Test1 {

	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	@Test
	public void Browser_Setup(@Optional("chrome") String browserName) {
		System.out.println(browserName);
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		String url = "https://www.redbus.in/bus-tickets/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}

	@AfterMethod(alwaysRun = true)
	public void Browser_tear_down(ITestResult result) throws InterruptedException {
		Reporter.log("Close", true);
		Thread.sleep(2000);
		driver.quit();
	}

}
