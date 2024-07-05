package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends CucumberHooks {
	@When("Click on the from lead")
	public void click_on_the_from_lead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	}
	@When("Click on the to lead")
	public void click_on_the_to_lead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}

	@When("Click on the merge button")
	public void click_on_the_merge_button() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	@Then("Alert Should be handle")
	public void alert_should_be_handle() throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
}
