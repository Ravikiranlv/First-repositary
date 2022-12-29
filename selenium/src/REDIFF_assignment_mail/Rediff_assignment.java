package REDIFF_assignment_mail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Rediff_assignment extends data_providing_to_scriptFlow {
  @Test
  public void scriptFlow() throws InterruptedException, AWTException
  {
	  
		driver.findElement(By.id("login1")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='rd_write']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter name or email']")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.xpath("//div[contains(.,'sumanthElfBatch ') and @class='rdAutoSuggestName']")).click();
		driver.findElement(By.xpath("//li[@class='fld_sub']")).click();
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Ravikiran lv");
		driver.findElement(By.xpath("//div[@id='cke_1_contents']")).click();
		Thread.sleep(2000);
		Robot rbt= new Robot();
		rbt.keyPress(KeyEvent.VK_H);
		rbt.keyPress(KeyEvent.VK_I);
	
		
		rbt.keyRelease(KeyEvent.VK_H);
		rbt.keyRelease(KeyEvent.VK_I);
		driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Actions act=new Actions(driver);
		act.moveByOffset(1154, 230).perform();
		act.click();
		//driver.findElement(By.xpath("(//cite[@style='cursor: pointer;'])[1]")).click();
		//driver.findElement(By.xpath("//span[@class='rd_fil_del']")).click();
		//driver.findElement(By.xpath("//button[@class=' jqidefaultbutton ']")).click();
		act.moveByOffset(497, 247).moveByOffset(778, 230).click();
		
	}

}
