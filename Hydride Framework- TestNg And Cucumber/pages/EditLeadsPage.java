package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLeadsPage extends BaseClass {
	@Given("Clear company name")
	public EditLeadsPage clear_company_name() throws IOException {
		try {
			getdriver().findElement(By.id("updateLeadForm_companyName")).clear();
			reportStep("Compamy name clared successfully", "Pass");
		} catch (Exception e) {
			reportStep("Compamy name is not clared "+e, "fail");
		}
		return this;
	}
	@Given("Update company name (.*)$")
	public EditLeadsPage update_company_name(String cName) throws IOException {
		try {
			getdriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
			reportStep("Compamy name updated successfully", "Pass");
		} catch (Exception e) {
			reportStep("Compamy name is not updated", "fail");
		}
		return this;
	}

	@When("Click on the update button")
	public ViewLeadPage click_on_the_update_button() throws IOException {
		try {
			getdriver().findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
			reportStep("Update button clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("Update button is not clicked "+e, "fail");
		}
		return new ViewLeadPage();
	}
}
