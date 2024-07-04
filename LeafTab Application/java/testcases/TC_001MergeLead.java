package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001MergeLead extends BaseClass {
	@BeforeTest
	public void setValue() {
		filename = "Merge";

	}


	@Test(dataProvider = "fetchdata")
	public void runlogin(String uName,String pWord,String leadid1,String leadid2) throws InterruptedException {
		new LoginPage(driver)
		.enterusername(uName)
		.enterpassword(pWord)
		.clickloginbutton()
		.verifypage()
		.clickcrmsfsclink()
		.clickleadslink()
		.clickmergeleads()
		.clickfromlead()
		.windowhandle1(leadid1)
		.clickTolead()
		.windowhandle2(leadid2)
		.clickMergebutton()
		.alerthandle()
		.verifyleadcreation();
	}
}
