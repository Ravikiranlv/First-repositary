package data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demoWebshop_multiple_user {
	@DataProvider(name = "testDataForcredentials")
	public String[] [] credential()
	{
		String[][] arr = { 
	            { "ravikiran", "lv","ravikiranlv16@gmail.com","Ravikiranlv@16","Ravikiranlv@16"}, 
	            { "raju","kv", "rajuraj@somemail.com","rajuraj", "rajuraj"},
	            { "manu","kg", "ravikiranlv1997@gmail.com","Ravikiranlv@19","Ravikiranlv@19"},
	            {"seena","nm","seenanm145@gmail.com","seenanm","senanm"},
	            {"docter","dj","docter777@gmail.com","goonda","goonda"}
	         };
      return arr;
		
	}
   @Test(dataProvider="testDataForcredentials")
   public void LoginWithMultipleCredentials(String [] arr)
   {
	   System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver2.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.navigate().to("http://demowebshop.tricentis.com/");
	   WebDriverWait wait=new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Register']")))).click();
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("gender-male")))).click();
	   driver.findElement(By.id("FirstName")).sendKeys(arr[0]);
	   driver.findElement(By.id("LastName")).sendKeys(arr[1]);
	   driver.findElement(By.id("Email")).sendKeys(arr[2]);
	   driver.findElement(By.id("Password")).sendKeys(arr[3]);
	   driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[4]);
	   driver.findElement(By.id("register-button")).click();
	   
   }
}
