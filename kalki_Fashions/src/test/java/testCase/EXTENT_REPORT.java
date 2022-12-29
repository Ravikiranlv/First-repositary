package testCase;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class EXTENT_REPORT {
	static WebDriver driver;
	static LocalDateTime date=LocalDateTime.now();
	static String systemDateTime=date.toString().replaceAll(":", "-");
	 
	public static String pageScreenshot()
	{
		System.out.println(systemDateTime);
		String path="./testdata/"+systemDateTime+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		
		try {
			FileHandler.copy(temp,dest);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return "."+path;
	}
	
	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reportets/"+systemDateTime+".html");
		ExtentReports reports=new ExtentReports();
		//reports.attachReporter(reporter);
		ExtentTest test=reports.createTest("Extent Test");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.log(Status.INFO, "Browser is Launched");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		test.log(Status.PASS, "Webpage is Successfully scrolled");
		test.addScreenCaptureFromPath(pageScreenshot());
		driver.close();
		reports.flush();
	}

}
