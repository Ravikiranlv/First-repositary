package xml_to_excel_data_provider_excel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BASE_script extends cross_browser_launching{
	@Test
	public void exhecute()
	{
		driver.findElement(By.id("login_Layer")).click();
	}

}
