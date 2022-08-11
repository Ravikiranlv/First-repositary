package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import generic_lab.TC_BaseTest_test;

public class TC_NaukridotCom_001_Test extends TC_BaseTest_test {
	
	@Test(groups = "regrission")
	public void ScriptFlow() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='name']")))).sendKeys("Ravikiranlv");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email")))).sendKeys("ravikiranlv16@gamil.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password")))).sendKeys("Ravikiranlv@16");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("mobile")))).sendKeys("9353608818");
		driver.findElement(By.xpath("//button[text()='Register Now']")).click();
	}
}
