package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass {
	@When("Click on the from lead")
	public FindLeadsPage click_on_the_from_lead() throws IOException {
		try {
			getdriver().findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
			reportStep("Fromlead clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("Fromlead is not clicked "+e, "Fail");
		}
		return new FindLeadsPage();
	}
	@When("Click on the to lead")
	public FindLeadsPage click_on_the_to_lead() throws IOException {
		try {
			getdriver().findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			reportStep("Lead clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("Lead is not clicked "+e, "Fail");
		}
		return new FindLeadsPage();
	}

	@When("Click on the merge button")
	public MergeLead click_on_the_merge_button() throws IOException {
		try {
			getdriver().findElement(By.xpath("//a[text()='Merge']")).click();
			reportStep("Lead clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("Lead is not clicked"+e, "fail");
		}
		return this;
	}
	@Then("Alert Should be handle")
	public ViewLeadPage alert_should_be_handle() throws InterruptedException, IOException {
		try {
			getdriver().switchTo().alert().accept();
			reportStep("Alert is handled", "Pass");
		} catch (Exception e) {
			reportStep("Alert is not handled"+e, "fail");
		}
		
		Thread.sleep(1000);
		return new ViewLeadPage();
	}
}
