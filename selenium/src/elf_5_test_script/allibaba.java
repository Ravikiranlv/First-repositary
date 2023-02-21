package elf_5_test_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class allibaba {
	@Test
	public void demo()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.alibaba.com/");
		driver.close(); 
	}

}
