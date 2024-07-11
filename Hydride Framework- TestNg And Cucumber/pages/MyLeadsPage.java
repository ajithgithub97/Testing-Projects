package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class MyLeadsPage extends BaseClass {
	@When("Click on the Creatlead link")
	public CreatLeadPage click_on_the_creatlead_link() throws IOException {
		try {
			getdriver().findElement(By.linkText("Create Lead")).click();
			reportStep("creatLeads link clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("CreatLeads link is not clicked "+e, "fail");
		}
		return new CreatLeadPage();
	}
	
	@When("Click on the findleads link")
	public FindLeadsPage click_on_the_findleads_link() throws IOException {
		try {
			getdriver().findElement(By.linkText("Find Leads")).click();
			reportStep("FindLeads link clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("FindLeads link is not clicked"+e, "fail");
		}
		return new FindLeadsPage();
	}
	@When("Click on the merge lead link")
	public MergeLead click_on_the_merge_lead_link() throws IOException {
		try {
			getdriver().findElement(By.linkText("Merge Leads")).click();
			reportStep("MergeLeads link clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("MergeLeads link is not clicked ", "fail");
		}
		return new MergeLead();
	}
}
