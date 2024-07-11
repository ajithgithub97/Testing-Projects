package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001EditLead extends BaseClass {
    @BeforeTest
	public void setValue() {
		filename = "EditLead";
		testName = "EditLead";
		testDescription = "Edit lead functionality"; 
		category = "system";
		authorName = "Ajith";

	}
	
	@Test(dataProvider="fetchdata",groups="sanity")
	public void runeditlead(String uName,String pWord,String pNum,String cName) throws InterruptedException, IOException {

		new LoginPage()
		.enter_the_username_as(uName)
		.enter_the_password_as(pWord)
		.click_on_the_login_button()
		.welcome_page_should_be_displayed()
		.click_on_crmsfa_link()
		.click_on_the_leads_link()
		.click_on_the_findleads_link()
		.click_on_the_phone_option()
		.enter_phone_number(pNum)
		.click_on_the_find_button()
		.click_on_the_lead_list()
		.click_on_the_edit_button()
		.clear_company_name()
		.update_company_name(cName)
		.click_on_the_update_button()
		.company_name_should_be_displayed(cName);
	}
	
}
