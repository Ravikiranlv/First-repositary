package basictestscipt;

import org.testng.annotations.Test;

public class login_script {
	@Test(priority = 1,invocationCount = 3)
	public void signup()
	{
		System.out.println("baa guru signup aagu");
	}
	@Test(priority = 2,invocationCount = 2)
	public void login()
	{
		System.out.println("baa guru loign aagu");
	}
	@Test(priority = 3,invocationCount = 1)
	public void notification()
	{
		System.out.println("message banthu nodu guru");
	}
	@Test(priority = 4,enabled = false)
	public void logout()
	{
		System.out.println("saaku logout aagu");
	}
}
