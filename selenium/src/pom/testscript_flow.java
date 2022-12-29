 package pom;

import org.testng.annotations.Test;

public class testscript_flow extends generic 
{
  @Test
  public void testscript() throws InterruptedException
  {
	 pom_class pmc=new pom_class(driver);
	 pmc.username();
	 Thread.sleep(2000);
	 pmc.passwrd();
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 pmc.checkbox();
	 Thread.sleep(2000);
	 pmc.login();
  }
}
