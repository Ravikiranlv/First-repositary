package elf;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class compare_highest_price2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.navigate().to("https://www.woodenstreet.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[.='Dining']"))).perform();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[.=' Iconic Chairs ']")))).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='loginclose1']")));
		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
		act.moveToElement(driver.findElement(By.xpath("//a[.=' Study & Office ']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Gaming Chairs']")).click();

		String price = driver.findElement(By.xpath("(//div[contains(@id,'article')])[3]//strong")).getText()
				.replace(",", " ").replace("Rs ", "");
		driver.findElement(By.xpath("(//div[contains(@id,'article')])[1]//p[@class='cart-btn']")).click();
		ArrayList<String> brandlist = new ArrayList<>();
		brandlist.add(
				driver.findElement(By.xpath("(//div[contains(@id,'article')])[1]//a[@class='by-brand']")).getText());
		int itemcart = 1;
		for (int i = 2;; i++) {
			if (itemcart == 3)
				break;
			String xpath = "(//div[contains(@id,'article')])[" + i + "]//a[@class='by-brand']";
			String brandName = driver.findElement(By.xpath(xpath)).getText();
			//jse.executeScript("window.scrollBy(0,500)");
			if (brandlist.contains(brandName)) {
				continue;
			} else {
				brandlist.add(brandName);
				driver.findElement(By.xpath("(//div[contains(@id,'article')])[" + i + "]//p[@class='cart-btn']")).click();
				itemcart++;
			}
			System.out.println(itemcart);
		}
		System.out.println(brandlist);
		jse.executeScript("window.scrollTo(0,0)");
		driver.findElement(By.xpath("//a[@title='Cart']")).click();
		int[] price1 = new int[3];
		for (int i = 1; i < 4; i++) {
			String temp = driver.findElement(By.xpath("(//div[@class='product-detail'])[" + i + "]//strong")).getText()
					.replace("Rs ", "").replace(",", "");
			Integer tempPrice = Integer.valueOf(temp);
			price1[i - 1] = tempPrice;
			System.out.println(price1[i - 1]);
		}
		if (price1[0] > price1[1] && price1[0] < price1[1])
			driver.findElement(By.xpath("(//p[contains(text(),'Remove')])[1]")).click();
		else if (price1[1] > price1[0] && price1[1] < price1[2])
			driver.findElement(By.xpath("(//p[contains(text(),'Remove')])[2]")).click();
		else if (price1[2] > price1[0] && price1[2] < price1[1])
			driver.findElement(By.xpath("(//p[contains(text(),'Remove')])[3]")).click();
		System.out.println("items sucessfully removed");

		driver.quit();
	}
}
