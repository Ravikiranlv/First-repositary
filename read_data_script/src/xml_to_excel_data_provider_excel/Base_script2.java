package xml_to_excel_data_provider_excel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Base_script2  extends cross_browser_launching{
	@Test
	public void fast()
	{
		driver.findElement(By.id("register_Layer")).click();
	}

}
