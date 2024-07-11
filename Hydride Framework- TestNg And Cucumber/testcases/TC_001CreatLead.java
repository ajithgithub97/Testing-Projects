package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreatLead extends BaseClass {
    @BeforeTest
	public void setValue() {
		filename = "CreatLead";
		testName = "CreatLead";
		testDescription = "Creat lead with valid credential"; 
		category = "system";
		authorName = "Ajith";
		

	}
	
	@Test(dataProvider="fetchdata",groups="sanity")
	public void runcreatlead(String uName,String pWord,String cName,String fName,String lNAme,String phonenumber) throws IOException {
		new LoginPage()
		.enter_the_username_as(uName)
		.enter_the_password_as(pWord)
		.click_on_the_login_button()
		.welcome_page_should_be_displayed()
		.click_on_crmsfa_link()
		.click_on_the_leads_link()
		.click_on_the_creatlead_link()
		.enter_the_company_name(cName)
		.enter_the_first_name(fName)
		.enter_the_last_name(lNAme)
		.enter_the_phone_number(phonenumber)
		.click_on_the_submit_button()
		.leadid_should_be_displayed(cName);
		
		
		

	}
	
}
