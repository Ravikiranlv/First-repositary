package data_provider;

import org.testng.annotations.Test;

public class TC_Demo_Login_003 {
	@Test(dataProviderClass=TC_Demo_login_002.class,dataProvider="testDataForcredentials")
	public static void display(String [] testData)
	{
		System.out.println(testData[0]);
		System.out.println(testData[1]);
	}

}
