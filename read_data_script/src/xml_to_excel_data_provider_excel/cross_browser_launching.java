package xml_to_excel_data_provider_excel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * 
 * @author ravik
 *
 */
public class cross_browser_launching {
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void Browser_Setup(@Optional("chrome") String browserName) throws IOException {
		System.out.println(browserName);
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		String aapurl = "https://www.naukri.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(aapurl);
	}

	@AfterClass
	public void Browser_tear_down() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
