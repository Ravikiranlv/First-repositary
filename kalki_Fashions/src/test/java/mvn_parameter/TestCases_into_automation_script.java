package mvn_parameter;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases_into_automation_script {
	public WebDriverWait wait;
	public WebDriver driver;
	
	@BeforeClass
	public void Browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver=new ChromeDriver();	
		Reporter.log("Browser is launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		//driver.navigate().to("");	
	}
	@Test
	public void Login() throws EncryptedDocumentException, IOException
	{
		String url = READdataFROMexcel.readFromExcel("./testdata/Book1.xlsx", "Sheet1", 9, 0);
		driver.get(url);
		Reporter.log("url is triggered");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='wzrk-cancel']")));
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@aria-label='Close Notifications']")));
		//driver.findElement(By.xpath("//span[@aria-label='Close Notifications']")).click();
		Home_Page homePage = new Home_page();
        homePage.getSearch().sendKeys("");
       // WebElement searchtext = homePage.getSearch();
      //  assertTrue(searchtext.isDisplayed(), "homepage is not displayed");
	}
}




















































//public class Basetest {
//	public WebDriver driver;
//	public WebDriverWait wait;
//
//	@BeforeClass	
//	public void browserlaunch() throws IOException {
//		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
//		driver = new ChromeDriver();
//		Reporter.log("Browser is launched");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		wait=new WebDriverWait(driver, 10);
//	}
//	
//	@BeforeMethod
//	public void login() throws EncryptedDocumentException, IOException {
//		String url = READdataFROMexcel.readFromExcel("./data/Actitime.xlsx", "Sheet1", 0, 0);
//		driver.get(url);
//		Reporter.log("url is triggered");
//		String expectedLoginPageUrl="actiTIME - Login";
//		String actualLoginPageUrl=driver.getTitle();
//		assertEquals(actualLoginPageUrl, expectedLoginPageUrl, "Login page is not displayed");
//		Loginpage login=new Loginpage(driver);
//		login.getUsernme().sendKeys("admin");
//		Reporter.log("entered username");
//		String expectedUserNameEntered = "admin";
//		String actualUserNameEntered = login.getUsernme().getAttribute("value");
////		System.out.println(actualUserNameEntered);
//		assertEquals(expectedUserNameEntered, actualUserNameEntered, "user is not same as entred");
//		login.getPassword().sendKeys("manager");
//		Reporter.log("entred password");
//		String expectedPasswordEntred = "manager";
//		String actualPasswordEntered = login.getPassword().getAttribute("value");
//		assertEquals(expectedPasswordEntred, actualPasswordEntered, "password is not same as entered");
//		login.getLog().click();
//		Reporter.log("clicked on login button");
//		Userspage userspage=new Userspage(driver);
////		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logo_aT")));
////		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
//		WebElement logo = userspage.getActiTimeLogo();
//		assertTrue(logo.isDisplayed(), "Home page is not displayed");
////		String actualHomePageTitle = driver.getTitle();
////		assertEquals(expectedHomePageTitle, actualHomePageTitle, "Home page is not displayed");
//	}
//	
//	@AfterClass
//	public void closeapp() {
//		driver.quit();
//	}
//	
//	
//	
//	
//	
//	
//	
//}




