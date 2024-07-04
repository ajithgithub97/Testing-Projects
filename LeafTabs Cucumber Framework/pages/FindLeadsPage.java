package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FindLeadsPage extends CucumberHooks {
	@When("Click on the phone option")
	public void click_on_the_phone_option() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter phone number (.*)$")
	public void enter_phone_number(String pNum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNum);
	}

	@Given("Click on the find button")
	public void click_on_the_find_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@Given("Click on the lead list")
	public void click_on_the_lead_list() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}
}
