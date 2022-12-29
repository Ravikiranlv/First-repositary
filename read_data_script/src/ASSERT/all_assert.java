package ASSERT;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
public class all_assert {

		public WebDriverWait wait;
		public WebDriver driver;
		public SoftAssert softassert;
		@BeforeClass
		public void LaunchBrowser()
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			driver= new FirefoxDriver();
			Reporter.log("Browser is succesfully launched");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Reporter.log("Browser window is mazimized Succesfully");
		    wait=new WebDriverWait(driver, 10);
		    softassert=new SoftAssert();
		}
		@BeforeMethod
		public void  LoginToApp(String[] args) throws InterruptedException
		//Step 1:navigate to Application
		{
			driver.navigate().to("http://localhost/login.do");
			String expectedLoginPageTitle = "actiTIME - Login";
			String actualLoginPageTitle = driver.getTitle();
			
			softassert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login page is not displayed succesfully");
			
			
		
			//Step 2:Enter the valid Username and valid password
			String usernameData = (args[0]);   //          "admin";
			String passwordData = (args[1]);   //          "manager";
			Thread.sleep(2000);
			WebElement userNameTextField = driver.findElement(By.name("username"));
			userNameTextField.sendKeys(usernameData);
			String actualUsernameEnterd = userNameTextField.getAttribute("value");
			softassert.assertEquals(actualUsernameEnterd,userNameTextField ,"Username is not entered successfully");
			
			WebElement passwordTextfield = driver.findElement(By.name("pwd"));
			passwordTextfield.sendKeys(passwordData);
			String actualPasswordEnterd = passwordTextfield.getAttribute("value");
		    softassert.assertEquals(actualPasswordEnterd,passwordTextfield, "password is not Enterd successfully");
				
			//Step 3: Click on Login button
			driver.findElement(By.id("loginButton")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
			String expectedHomePageTitle = "actiTIME - Enter Time-Track";
			String actualHomePageTitle = driver.getTitle();
		    softassert.assertEquals(actualHomePageTitle,expectedHomePageTitle , "Home page is not displayed successfully");
			
		}
		@AfterMethod
		public void logout()
		{
			driver.findElement(By.id("logoutLink")).click();
			String expectedLoginPageTitle = "actiTIME - Login";
			String actualLoginPageTitle = driver.getTitle();
	        softassert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login page is not displayed succssfully");
		}
		@AfterClass
		public void clossingTheSession()
		{
			driver.quit();
		}

	}



