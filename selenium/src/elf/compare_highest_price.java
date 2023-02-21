package elf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author ravik
 *
 */
public class compare_highest_price {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.get("https://www.flipkart.com/");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement elect = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(elect).perform();
		driver.findElement(By.xpath("//a[text()='Laptop Accessories']")).click();
		driver.findElement(By.xpath("//div[text()='Keyboard and Combos']")).click();
		driver.findElement(By.xpath("//a[text()='Logitech K380 / Easy-Switch for Upto 3 Devices, Slim Bl...']")).click();
		Thread.sleep(3000);
	
		//driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		
	}
}
