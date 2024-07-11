package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001MergeLead extends BaseClass {
	@BeforeTest
	public void setValue() {
		filename = "Merge";
		testName = "MergeLead";
		testDescription = "merge lead functionality"; 
		category = "system";
		authorName = "Ajith";

	}
     @Test(dataProvider="fetchdata")
	public void runmerge(String uName,String pWord,String leadid1,String leadid2,String cName) throws InterruptedException, IOException {

		new LoginPage()
		.enter_the_username_as(uName)
		.enter_the_password_as(pWord)
		.click_on_the_login_button()
		.welcome_page_should_be_displayed()
		.click_on_crmsfa_link()
		.click_on_the_leads_link()
		.click_on_the_merge_lead_link()
		.click_on_the_from_lead()
		.window_one_should_be_handle(leadid1)
		.click_on_the_to_lead()
		.window_two_should_be_handle(leadid2)
		.click_on_the_merge_button()
		.alert_should_be_handle()
		.leadid_should_be_displayed(cName);
	}
}
