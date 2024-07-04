package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLeadsPage extends CucumberHooks {
	@Given("Clear company name")
	public void clear_company_name() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
	}
	@Given("Update company name (.*)$")
	public void update_company_name_qeagle(String cName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
	}

	@When("Click on the update button")
	public void click_on_the_update_button() {
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	}
}
