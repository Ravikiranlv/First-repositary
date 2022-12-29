package data_driven_testing_elf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class property_file {
	public static void main(String[] args) throws IOException {
		
		//step1:  Create object of Input stream
		File abspath=new File("./softwares/test_data/testdata.properties");
		FileInputStream fis=new FileInputStream(abspath);
		
		//step2: create object of file type
		Properties properties=new Properties();
		properties.load(fis);
		
		//step3: read method
		 String url=properties.getProperty("url");
		 String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		 
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	

}
