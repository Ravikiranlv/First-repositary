package generic_lab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TC_BaseTest_test {
	public WebDriver driver;
	public WebDriverWait wait;	
	
	@BeforeMethod
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/registration/createAccount");
		Reporter.log("Apllication is launching succssfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("window is successfully maximized");
		wait=new WebDriverWait(driver, 10);
	}
	
	@AfterMethod
	public void closeLoign() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
