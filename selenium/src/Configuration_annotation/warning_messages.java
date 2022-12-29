package Configuration_annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * 
 * @author ravik
 *
 */
public class warning_messages {
	public WebDriver driver;
	public WebDriverWait wait;
	public SoftAssert softassert;
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
		Reporter.log("Browser is succesfully launched");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Reporter.log("Browser window is mazimized Succesfully");
         wait=new WebDriverWait(driver, 10);
         softassert=new SoftAssert();
	}
	@Test
	public void LoginToApp()
	// Step:1 We are navigate to the Application
	{
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		String ExpectedLoginPageTitle = "Sign Up";
		String ActualLoginPageTitle = driver.getTitle();
		softassert.assertNotEquals(ActualLoginPageTitle, ExpectedLoginPageTitle, "Login Page is not dispalyed succssfully");
	
	//Step 2: we are click on Sign up button
		driver.findElement(By.xpath("//a[text()='Use date of birth']/../../../..//button[@type='submit']")).click();
		String ExpectedSignupTitle="Sign Up";
		String ActualSignUpTitle=driver.getTitle();
		softassert.assertEquals(ActualSignUpTitle, ExpectedSignupTitle, "Sign up button is not Clickable succssfully");
	
		//Step 3:We are Click on FirstName
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='firstname']")))).click();
		String ExpectedFirstname="What's your name?";
		String ActualFirstNAme=driver.getTitle();
		Reporter.log("What's your name?");
		softassert.assertEquals(ActualFirstNAme, ExpectedFirstname, "not able to Click on First Name textField Succssfully");
		
		//Step 4: WE are click on SurNAme
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='lastname']")))).click();
		String ExpectedSurNAme="What's your name?";
		String ActualSurNAme=driver.getTitle();
		softassert.assertEquals(ActualSurNAme, ExpectedSurNAme, "Not able to Click on SurName textField Succssfully");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")))).click();
		String  ExpectedMobileNumber="";
	}
}
