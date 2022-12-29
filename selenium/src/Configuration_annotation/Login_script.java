package Configuration_annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_script  extends Time_tracck1{
	@Test
	public void createTimeTrack()
	{
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	}

}
