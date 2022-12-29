package POM_ELF37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Advanced_concepts {
	
	public Advanced_concepts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Enter skills / designations / companies']") WebElement searchTextBox;
	
	@FindBy(id="")
	private WebElement ustf;
    
	public WebElement getSearchTextBox()
	{
		return searchTextBox; 
	}
	public WebElement getustf()
	{
		return ustf;
	}
	
	
	

}
