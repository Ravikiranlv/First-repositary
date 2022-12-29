package xml_to_excel_data_provider_excel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Base_script3 extends cross_browser_launching{
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//div[text()='Search']")).click();
	}

}
