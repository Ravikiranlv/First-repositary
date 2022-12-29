package REDIFF_assignment_mail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class data_providing_to_scriptFlow 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions act;
	@BeforeMethod
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    driver=new ChromeDriver();
		Reporter.log("Browser is succesfully launched");
		driver.manage().window().maximize();
		Reporter.log("Browser window is mazimized Succesfully");
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    wait=new WebDriverWait(driver, 10);
	    act=new Actions(driver);	
	
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}