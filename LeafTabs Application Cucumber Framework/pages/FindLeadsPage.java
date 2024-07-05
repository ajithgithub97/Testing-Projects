package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
	@Given("Enter the Leadid (.*)$")
	public void enter_the_leadid(String leadid) {
		driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid);
	}

	@Then("Verify the delete lead")
	public void verify_the_delete_lead() {
		String deleteverify = driver.findElement(By.xpath("//*[@class='x-paging-info']")).getText();
		if (deleteverify.contains("No records")) {
			System.out.println("Lead deleted Successfully");
		}else 
			System.out.println("Lead is not deleted");
	}
	
	@Then("Window one should be handle (.*)$")
	public void window_one_should_be_handle(String leadid1 ) throws InterruptedException {
		Set<String> fromwindow1 = driver.getWindowHandles();
		List<String> listwindowa1 = new ArrayList<String>(fromwindow1);
		driver.switchTo().window(listwindowa1.get(1));
		driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(listwindowa1.get(0));
	}
	

@Then("Window two should be handle (.*)$")
public void window_two_should_be_handle(String leadid2) throws InterruptedException {
	Set<String> fromwindow2 = driver.getWindowHandles();
	List<String> listwindowa2 = new ArrayList<String>(fromwindow2);
	driver.switchTo().window(listwindowa2.get(1));
	driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid2);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(listwindowa2.get(0));
}
}
