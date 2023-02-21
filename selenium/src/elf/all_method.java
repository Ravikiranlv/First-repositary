package elf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class all_method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.navigate().to("https://www.woodenstreet.com/");
		Thread.sleep(5000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='loginclose1']")));
	    driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
	    Thread.sleep(2000);
		Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//a[text()='Dining & Kitchen']"))).perform();
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Iconic Chairs ']")))).click();
	    
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,500)");
	    String price = driver.findElement(By.xpath("(//div[contains(@id,'article')])[3]//strong")).getText().replace(",", "").replace("Rs ", "");
	    if(Integer.valueOf(price)>5000)
	    {
	    	System.out.println(price+"  very costley!");
	    }
	    else
	    {
	    	driver.findElement(By.xpath("(//div[contains(@id,'article')])[3]//p[@class='cart-btn']")).click();
	    	System.out.println("added to cart page succsfully ");
	    }
	    driver.quit();
	}

}
