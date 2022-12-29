package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class 
{
  public WebElement getUname() {
		return uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getLog_btn() {
		return log_btn;
	}
@FindBy(id="username")
 private  WebElement uname;
  
  @FindBy(name="pwd")
 private WebElement pwd;
  
  @FindBy(id="keepLoggedInCheckBox")
  private WebElement checkbox;
  
  @FindBy(xpath="//div[.='Login ']")
  private WebElement log_btn;
  
  public pom_class(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void username()
  {
	  uname.sendKeys("admin");
  }
  public void passwrd()
  {
	  pwd.sendKeys("manager");
  }
  public void checkbox()
  {
	  checkbox.click();
  }
  public void login()
  {
	  log_btn.click();
  }
}
