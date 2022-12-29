package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic 
{
	public WebDriver driver;
	public WebDriverWait wait;
  @BeforeMethod
   public void openapll()
   {
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.navigate().to("http://localhost/login.do");
	  wait=new WebDriverWait(driver, 10);
   }
   @AfterMethod
   public void closeappll()
   {
	   driver.close();
   }
}
