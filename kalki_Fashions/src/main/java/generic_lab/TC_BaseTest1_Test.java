package generic_lab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TC_BaseTest1_Test {
	public WebDriver driver;
	
	@BeforeClass
	public void Browser_Setup(){
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		driver=new ChromeDriver();
		Reporter.log("Browser is launched succssfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized succssfully");
	}

	@AfterClass
	public void Browser_tear_down() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
