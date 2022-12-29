package data_provider;

import org.testng.annotations.Test;

public class ReadDataFromDiffarentPackageDataProvider {
	@Test(dataProviderClass=TC_Demo_login_002.class,dataProvider="testDataForcredentials")
	public void demo(String [] testData)
	{
		System.out.println(testData[0]);
		System.out.println(testData[1]);
	}

}
