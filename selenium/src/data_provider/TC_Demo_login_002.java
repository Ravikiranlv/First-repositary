package data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Demo_login_002 {
	@DataProvider(name = "testDataForcredentials")
	public String[][] credentials() {
		String[][] arr = { 
				            { "msgthanu@gmail.com", "thanushree@18" }, 
				            { "rajuraj@somemail.com", "rajuraj" },
				            { "ravikiranlv16@gmail.com","Ravikiranlv@16"} 
				         };
		return arr;
	}

	@Test(dataProvider = "testDataForcredentials")
	public void loginWithMultipleCredentials(String[] arr) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		System.out.println();
		driver.findElement(By.id("Email")).sendKeys(arr[0]);
		driver.findElement(By.id("Password")).sendKeys( arr[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();

	}

}
