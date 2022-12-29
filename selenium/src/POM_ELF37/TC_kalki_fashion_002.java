package POM_ELF37;

import org.testng.annotations.Test;

public class TC_kalki_fashion_002  extends base{
	@Test
	public void test()
	{
		TC_kalkifashion_001 tc1=new TC_kalkifashion_001(driver);
		tc1.getCancel_popup().click();
        tc1.getLoginButon().click();
        tc1.getEmail().sendKeys("ravikiranlv16@gmail.com");
        tc1.getJoinNow().click();
        tc1.getFirstName().sendKeys("ravikiran");
        tc1.getLastName().sendKeys("LV");
        tc1.getPassword().sendKeys("Ravikiranlv@16");
		tc1.getContinueBut().click();
		//tc1.getMen().click();
		//tc1.getCategoryDropdown().click();
		//tc1.getCategoryLink().click();
		//tc1.getShowPerPage().click();
		//tc1.getSortBy().click();
		//tc1.getLikeButton().click();
		//tc1.getLike().click();
	}

}
