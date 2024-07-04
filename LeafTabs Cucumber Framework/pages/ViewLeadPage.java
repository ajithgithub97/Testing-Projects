package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends CucumberHooks {
	@Then("Leadid should be displayed (.*)$")
	public void leadid_should_be_displayed_test_leaf(String cName) {
		String verifypage = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if (verifypage.contains(cName)) {
			System.out.println("Lead Created Successfuly");

		}else
			System.out.println("Lead is not created");
	}
	
	@Given("Click on the edit button")
	public void click_on_the_edit_button() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	
	@Then("Company name should be displayed (.*)$")
	public void company_name_should_be_displayed_qeagle(String cName) {
		String verifypage = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if (verifypage.contains(cName)) {
			System.out.println("Edited Successfuly");

		}else
			System.out.println("Edit Unsuccessful");
	}
}
