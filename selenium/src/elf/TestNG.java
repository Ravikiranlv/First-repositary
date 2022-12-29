package elf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
	@Test(priority=5,invocationCount = 2)
	 void demo()
	{
		Reporter.log("from demo list page",true);
	}
	@Test(priority=4,invocationCount = 1)
	 void sample()
	{
		Reporter.log("from sample list page",true);
	}
	@Test(priority=1,invocationCount = 3)
	 void first()
	{
		Reporter.log("from first list page",true);
	}
	@Test(priority=2,invocationCount = 4)
	 void second()
	{
		Reporter.log("from second list page",true);
	}
	@Test(priority=3,invocationCount = 1)
	 void third() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Search']")).click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")))).click();
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.xpath("//span[.='Student']"))).perform();
		Thread.sleep(2000);
		Reporter.log("from third list page",true);
	}

}
