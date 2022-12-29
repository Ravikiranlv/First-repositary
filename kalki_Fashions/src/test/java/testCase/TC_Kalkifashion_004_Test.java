package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_lab.TC_BaseTest1_Test;

public class TC_Kalkifashion_004_Test extends TC_BaseTest1_Test {
		@Test(groups = "smoke")
		public void login() {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.naukri.com/");
			driver.quit();
		}

}
