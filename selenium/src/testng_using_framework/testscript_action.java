package testng_using_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;    
import org.testng.annotations.Test;

public class testscript_action extends generic_class
{  
	@Test
	public void scriptflow()
	{
		driver.findElement(By.xpath("(//div[.='Sign In'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='login-username']")))).sendKeys("ravikiranlv1697@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='password']")))).sendKeys("dinga1997@fb");
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@title='Mail']")))).click();
		driver.findElement(By.xpath("//a[.='Compose']")).click(); 
	//agthilla	//driver.findElement(By.xpath("//div[@class='react-y-pills k_w D_F ab_C W_6D6F p_R']")).sendKeys("manulv2000@yahoo.com");
		driver.findElement(By.xpath("(//div[@class='p_R'])[2]")).sendKeys("hi macha how r u");
		driver.findElement(By.xpath("//button[@class='q_Z29WjXl e_dRA k_w r_P H_6VdP s_3mS2U en_0 M_1gLo4F V_M cZ1RN91d_n y_Z2hYGcu A_6EqO u_e69 b_0 C_52qC I4_Z2chSgW it3_dRA']")).click();
		
	}

}
