package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001DeleteLead extends BaseClass {
	@BeforeTest
	public void setValue() {
		filename = "DeleteLead";
		testName = "deleteLead";
		testDescription = "Delete lead Functionality"; 
		category = "system";
		authorName = "Ajith";

	}
	@Test(dataProvider="fetchdata")
	public void rundeletelead(String uName,String pWord,String pNum,String leadid) throws InterruptedException, IOException {
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
		.click_on_the_delete_button()
		.click_on_the_findleads_link()
		.enter_the_leadid(leadid)
		.click_on_the_find_button()
		.verify_the_delete_lead();

	}
}
