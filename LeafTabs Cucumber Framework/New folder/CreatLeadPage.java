package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreatLeadPage extends CucumberHooks {
	@Given("Enter the company name (.*)$")
	public void enter_the_company_name_test_leaf(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}
	@Given("Enter the first name (.*)$")
	public void enter_the_first_name_ajith(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@Given("Enter the last name (.*)$")
	public void enter_the_last_name_kumar(String lNAme) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lNAme);
	}
	@Given("Enter the phone number (.*)$")
	public void enter_the_phone_number(String phonenumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phonenumber);
	}
	@When("Click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
}
