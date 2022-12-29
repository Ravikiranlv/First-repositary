package ASSERT;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class script_flow extends all_assert {
	@Test
	public void createTimeTrack() {
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	}

}
