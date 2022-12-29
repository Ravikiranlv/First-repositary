package capter_screen_shot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
/***
 * 
 * @author ravik
 *
 */
public class screen_shot {
	public static void getPhoto(String testCaseName) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shaadi.com/");
		LocalDateTime systemDate=LocalDateTime.now();
		String ScreenShotDate = systemDate.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenShot = (TakesScreenshot)Base_Test1. driver;
		File tempFile=takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./"+testCaseName+ScreenShotDate+ ".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		    }
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
