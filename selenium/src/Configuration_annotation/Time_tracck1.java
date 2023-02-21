package Configuration_annotation;

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

import basictestscipt.login_script;

public class Time_tracck1 {
	public WebDriverWait wait;
	public WebDriver driver;
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
	}
	@BeforeMethod
	public void  LoginToApp()
	//Step 1:navigate to Application	
	{
		driver.navigate().to("https://online.actitime.com/softeg/login.do");
		String expectedLoginPageTitle = "actiTIME - Login";
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equalsIgnoreCase(actualLoginPageTitle))
		{
			Reporter.log("Login page is displayed successfully",true);
		}
		else
		{
			Reporter.log("Login page is not displayed succesfully",true);
		}
		
		//Step 2:Enter the valid Username and valid password
		String usernameData = "ravikiranlv16@gmail.com";
		String passwordData = "9353608818";
		WebElement userNameTextField = driver.findElement(By.name("username"));
		userNameTextField.sendKeys(usernameData);
		String actualUsernameEnterd = userNameTextField.getAttribute("value");
		if(usernameData.equals(actualUsernameEnterd))
		{
			Reporter.log("username is Enter successfully",true);
		}
		else
		{
			Reporter.log("Username is not entered successfully",true);
		}
		
		WebElement passwordTextfield = driver.findElement(By.name("pwd"));
		passwordTextfield.sendKeys(passwordData);
		String actualPasswordEnterd = passwordTextfield.getAttribute("value");
		if(passwordData.equals(actualPasswordEnterd))
		{
			Reporter.log("password enterd successfully",true);
		}
		else
		{
			Reporter.log("password is not Enterd successfully",true);
		}
		
		//Step 3: Click on Login button
		driver.findElement(By.id("loginButton")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle))
		{
			Reporter.log("Home page is displayed successfully",true);
		}
		else
		{
			Reporter.log("Home page is not displayed successfully",true);
		}
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
		String expectedLoginPageTitle = "actiTIME - Login";
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equalsIgnoreCase(actualLoginPageTitle))
		{
			Reporter.log("Login page is diplayed succssfully",true);
		}
		else
		{
			Reporter.log("Login page is not displayed succssfully",true);
		}
	}
	@AfterClass
	public void clossingTheSession()
	{
		driver.quit();
	}

}
