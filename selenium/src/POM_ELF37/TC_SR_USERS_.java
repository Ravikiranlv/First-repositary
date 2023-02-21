package POM_ELF37;

import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;
import javax.swing.text.html.parser.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/**
 * 
 * @author ravik
 *
 */
public class TC_SR_USERS_ {
	@Test(groups = "Smoke")
	public void createUsers() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		Advanced_concepts refvar = new Advanced_concepts(driver);

		refvar.getSearchTextBox().clear();

		driver.navigate().refresh();

		refvar.getSearchTextBox().sendKeys("Ravikiranlv");

	}

}
