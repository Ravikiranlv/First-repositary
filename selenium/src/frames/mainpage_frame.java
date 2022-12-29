package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mainpage_frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://demoqa.com/frames");
		Thread.sleep(5000);
		WebElement frame1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe[@id='frame1']"))));
		WebDriver frame = driver.switchTo().frame(frame1);
		String text = frame.getTitle();
		System.out.println(text);
	}

}
