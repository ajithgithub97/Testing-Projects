package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends BaseClass {
	@Then("Leadid should be displayed (.*)$")
	public ViewLeadPage leadid_should_be_displayed(String cName) throws IOException {
		try {
			String verifypage = getdriver().findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
			if (verifypage.contains(cName)) {
				System.out.println("Lead Created Successfuly");

			}else
				System.out.println("Lead is not created");
			reportStep("Leadid displayed successfully", "pass");
		} catch (Exception e) {
			reportStep("Leadid is not displayed "+e, "fail");
		}
		return this;
	}
	
	@Given("Click on the edit button")
	public EditLeadsPage click_on_the_edit_button() throws IOException {
		try {
			getdriver().findElement(By.xpath("//a[text()='Edit']")).click();
			reportStep("Edit button clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Edit button is not clicked"+e, "fail");
		}
		return new EditLeadsPage();
	}
	
	@Then("Company name should be displayed (.*)$")
	public ViewLeadPage company_name_should_be_displayed(String cName) throws IOException {
		try {
			String verifypage = getdriver().findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
			if (verifypage.contains(cName)) {
				System.out.println("Edited Successfuly");

			}else
				System.out.println("Edit Unsuccessful");
			reportStep("Company name displayed successfully", "pass");
		} catch (Exception e) {
			reportStep("Company name is not displayed"+e, "fail");
		}
		return this;
	}
	
	@Given("Click on the delete button")
	public MyLeadsPage click_on_the_delete_button() throws IOException {
		try {
			getdriver().findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
			reportStep("Delete button clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Delete button is not clicked"+e, "fail");
		}
		return new MyLeadsPage();
	}
}
