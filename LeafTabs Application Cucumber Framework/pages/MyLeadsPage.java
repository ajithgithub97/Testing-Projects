package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.When;

public class MyLeadsPage extends CucumberHooks {
	@When("Click on the Creatlead link")
	public void click_on_the_creatlead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@When("Click on the findleads link")
	public void click_on_the_findleads_link() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click on the merge lead link")
	public void click_on_the_merge_lead_link() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
}
