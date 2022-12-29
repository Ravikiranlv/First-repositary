package POM_ELF37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_kalkifashion_001 {

	public TC_kalkifashion_001(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//button[text()='No thanks']")
	private WebElement cancel_popup;

	public WebElement getCancel_popup() {
		return cancel_popup;
	}

	@FindBy(xpath = "//li[@class='ajaxLogin']")
	private WebElement loginButon; 

	public WebElement getLoginButon() {
		return loginButon;
	}

	@FindBy(id = "email_register")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(xpath="//button[text()=' Join now']")
	private WebElement joinNow;

	public WebElement getJoinNow() {
		return joinNow;
	}
	
	@FindBy(id="firstname")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id="lastname")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(id="password-register")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
    
	@FindBy(id="signupform")
	private WebElement continueBut;

	public WebElement getContinueBut() {
		return continueBut;
	}

	@FindBy(xpath = "//span[text()='Men']")
	private WebElement men;

	public WebElement getMen() {
		return men;
	}

	@FindBy(xpath = "//dt[text()='Categories']//span[@class='fa fa fa-angle-right']")
	private WebElement categoryDropdown;

	public WebElement getCategoryDropdown() {
		return categoryDropdown;
	}

	@FindBy(xpath = "//span[text()='Designer Kurtas']")
	private WebElement categoryLink;

	public WebElement getCategoryLink() {
		return categoryLink;
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	@FindBy(xpath = "(//select[@id='limiter']//option[@value='60'])[1]")
	private WebElement ShowPerPage;

	public WebElement getShowPerPage() {
		return ShowPerPage;
	}

	@FindBy(xpath = "(//select[@id='sorter']//option[@value='bestsellers'])[1]")
	private WebElement sortBy;

	@FindBy(xpath = "//span[@id='223036']")
	private WebElement likeButton;

	public WebElement getLikeButton() {
		return likeButton;
	}

	@FindBy(xpath = "//span[@class='textTitle wishlist_head']")
	private WebElement like;

	public WebElement getLike() {
		return like;
	}	

}
