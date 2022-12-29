package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testingbasicprog 
{
 @Test
 public void test()
 {
	 Reporter.log("long ride", true);
 }
 @Test
 public void test1()
 {
	 Reporter.log("to ladakh", true);
 }
}