package data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_demo_loign_001 {
	@DataProvider
	public String[] credentials()
	{
		String[] arr={"1","2"};
				      // {"msg4thanu@gmail.com","thanushree@18"},
				      // {"",""};
		           //  }
		//}
		
		return arr;
	}
	
	@Test(dataProvider = "credentials")
	public void loginWithMultipleCredentials(String[] arr)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://demowebshop.tricentis.com/");
		System.out.println(arr);
		driver.quit();
		//driver.findElement(By.id("")).sendKeys(username);
		
	}

}
