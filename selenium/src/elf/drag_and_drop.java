package elf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drag_and_drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://trello.com/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
	 	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='user']")))).sendKeys("ravikiranlv16@gmail.com");
	 	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("login")))).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password")))).sendKeys("Ravikiranlv@16");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Log in']")))).click();
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@aria-labelledby='password-uid1-label password-uid1-helper password-uid1-valid password-uid1-error']")))).sendKeys("Ravikiranlv@16");
	//	driver.findElement(By.id("login-submit")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='boards-page-board-section-header']/..//div[text()='study']")))).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement text = driver.findElement(By.xpath("(//span[contains(.,'Ndrk IT')])[1]"));
		WebElement text2 = driver.findElement(By.xpath("(//span[contains(.,'BGS IT')])[1]"));
		act.clickAndHold(text).moveByOffset(550, 300).perform();
		act.moveByOffset(80, 0).perform();
		act.dragAndDropBy(text2, 530, 300);
		Thread.sleep(3000);
		act.release().perform();
	}
}
