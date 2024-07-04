package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001DeleteLead extends BaseClass {

	@BeforeTest
	public void setValue() {
    filename = "DeleteLead";
	}
	@Test(dataProvider= "fetchdata")
	public void rundeletelead(String uName,String pWord,String pNum,String leadid) throws InterruptedException {
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
		.clickdelete()
		.clickfindleads()
		.enterleadid(leadid)
		.clickfindbutton()
		.verifydelete();
		
		
		

	}
}
