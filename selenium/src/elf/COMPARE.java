package elf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class COMPARE {
	    public static void main(String[] args) {
	        // set up Chrome driver
	        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebDriverWait wait=new WebDriverWait(driver, 30);
	        // navigate to flipkart
	        driver.get("https://www.flipkart.com/");
	        
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
	        // add the first three products to the cart
	        List<WebElement> products = driver.findElements(By.cssSelector("._2kHMtA"));
	        for (int i = 0; i < 3; i++) {
	            products.get(i).click();
	            
	            // add the product to the cart
	            driver.findElement(By.cssSelector("._3ybBIU._1_WHN1")).click();
	        }
	        
	        // remove the least priced product from the cart
	        List<Double> prices = new ArrayList<>();
	        List<WebElement> priceElements = driver.findElements(By.cssSelector("._30jeq3li._1_WHN1"));
	        for (WebElement priceElement : priceElements) {
	            String priceText = priceElement.getText().replaceAll(",", "");
	            double price = Double.parseDouble(priceText.substring(1));
	            prices.add(price);
	        }
	        int minIndex = prices.indexOf(Collections.min(prices));
	        driver.findElements(By.cssSelector("._3iNgDj._2RlhLF")).get(minIndex).click();
	        
	        // print the highest priced product
	        double maxPrice = Collections.max(prices);
	        System.out.println("The highest priced product is: " + maxPrice);
	        
	        // close the driver
	        driver.quit();
	    }
	}



