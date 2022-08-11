package mvn_parameter;

import org.testng.annotations.Test;

public class browser_luanch_Test {
	@Test
	public void LoginPage()
	{
		String browserName = System.getProperty("browserName");
		String browser = System.getProperty("browser");
		System.out.println(browserName);
		System.out.println(browser);
	}
	
}
