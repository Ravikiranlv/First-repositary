package elf;                                                                        
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hidden_division {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.makemytrip.com/");
		LocalDateTime ldt=LocalDateTime.now().plusYears(9);
		ldt.plusDays(15);
		String month = ldt.getMonth().toString();
		String monthValue = month.substring(0, 1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();                                                      
		System.out.println(monthValue+ "-"+year+ "-"+day);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		//Thread.sleep(5000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")));
		//driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200);");
		//WebDriverWait wait1=new WebDriverWait(driver, 10);
        //wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='close']")))).click();
		selectDate(driver,"November",2022, 22);
	}
	public static void selectDate(WebDriver driver,String monthValue,int year,int day) throws InterruptedException
	{
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+monthValue+" "+year+"']/../..//p[text()='"+day+"']")).click();
				break;
			}
			catch(NoSuchElementException e){
				//WebDriverWait wait = new WebDriverWait(driver, 16);
				//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@aria-label='Next Month']")));
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

	}
}
