package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001EditLead extends BaseClass {
	
	@BeforeTest
	public void setValue() {
	filename = "EditLead";
}

	@Test(dataProvider= "fetchdata")
	public void runeditlead(String uName,String pWord, String pNum,String cName ) throws InterruptedException {
		new LoginPage(driver)
		.enterusername(uName)
		.enterpassword(pWord)
		.clickloginbutton()
		.verifypage()
		.clickcrmsfsclink()
		.clickleadslink()
		.clickfindleads()
		.clickphone()
		.enterphonenumber(pNum)
		.clickfindbutton()
		.clickleadlist()
		.clickedit()
		.clearcompanyname()
		.updatecompanyname(cName)
		.clickupdatebutton()
		.verifyEditcreation();
		
		

	}
}
