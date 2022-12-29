package Before_annotation_method;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_method extends configuration_annotation {
	@Test
	public void CreateTimeTeack() 
	{
		Reporter.log("From the test case",true);
	}

}
