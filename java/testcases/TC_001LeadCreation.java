package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001LeadCreation extends BaseClass {

	@BeforeTest
	public void setValue() {
    filename = "CreatLead";
	}


	@Test(dataProvider = "fetchdata")
	public void runcreatlead(String uName,String pWord,String cName,String fName,String lNAme,String pNum) {
		new LoginPage(driver)
		.enterusername(uName)
		.enterpassword(pWord)
		.clickloginbutton()
		.verifypage()
		.clickcrmsfsclink()
		.clickleadslink()
		.clickcreatlead()
		.entercompanyname(cName)
		.enterfirstname(fName)
		.enterlastname(lNAme)
		.enterPnumber(pNum)
		.clicksubmitbutton()
		.verifyleadcreation();	
		


	}


}