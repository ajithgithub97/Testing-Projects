package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreatLeadPage extends BaseClass {
	@Given("Enter the company name (.*)$")
	public CreatLeadPage enter_the_company_name(String cName) throws IOException {
		try {
			getdriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
			reportStep("Company name entered succesfully", "Pass");
		} catch (Exception e) {
			reportStep("Company name is not entered "+e, "fail");
		}
		return this;
	}
	@Given("Enter the first name (.*)$")
	public CreatLeadPage enter_the_first_name(String fName) throws IOException {
		try {
			getdriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
			reportStep("First name entered succesfully", "Pass");
		} catch (Exception e) {
			reportStep("First name is not entered "+e, "fail");
		}
		return this;
	}
	@Given("Enter the last name (.*)$")
	public CreatLeadPage enter_the_last_name(String lNAme) throws IOException {
		try {
			getdriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lNAme);
			reportStep("Last name entered succesfully", "Pass");
		} catch (Exception e) {
			reportStep("Last name is not entered "+e, "fail");
		}
		return this;
	}
	@Given("Enter the phone number (.*)$")
	public CreatLeadPage enter_the_phone_number(String phonenumber) throws IOException {
		try {
			getdriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phonenumber);
			reportStep("Phone number is entered succesfully", "Pass");
		} catch (Exception e) {
			reportStep("Phone number is not entered "+e, "fail");
		}
		return this;
	}
	@When("Click on the submit button")
	public ViewLeadPage click_on_the_submit_button() throws IOException {
		try {
			getdriver().findElement(By.className("smallSubmit")).click();
			reportStep("Submit button is clicked succesfully", "Pass");
		} catch (Exception e) {
			reportStep("Submit button is not clicked"+e, "fail");

		}
		return new ViewLeadPage();
	}
}
