package readDataFromExcelandPassToTestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider extends ExcelUtility {
	
	@DataProvider
	public String[][] testData() throws EncryptedDocumentException, IOException {
		String[][] dataFromeExcel1 = ExcelUtility.readMultipleDataFromExcel("./testdata/Book1.xlsx", "Testdata");
		return dataFromeExcel1;
	}

	@Test(dataProvider = "testData")
	public void readDataFromDataProvider(String[] arr) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.id("name")).sendKeys(arr[0]);
		driver.findElement(By.id("email")).sendKeys(arr[1]);
		driver.findElement(By.id("password")).sendKeys(arr[2]);
		driver.findElement(By.id("mobile")).sendKeys(arr[3]);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Register Now']")).click();
		driver.quit();
	}

}
