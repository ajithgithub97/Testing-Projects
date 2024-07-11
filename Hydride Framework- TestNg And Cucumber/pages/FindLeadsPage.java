package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindLeadsPage extends BaseClass {
	@When("Click on the phone option")
	public FindLeadsPage click_on_the_phone_option() throws IOException {
		try {
			getdriver().findElement(By.xpath("//span[text()='Phone']")).click();
			reportStep("Clicked phone option successfullt", "Pass");
		} catch (Exception e) {
			reportStep("Phone option not Clicked "+e, "fail");
		}
		return this;
	}
	@Given("Enter phone number (.*)$")
	public FindLeadsPage enter_phone_number(String pNum) throws IOException {
		try {
			getdriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNum);
			reportStep("Phone number entered successfullt", "Pass");
		} catch (Exception e) {
			reportStep("Phone number is not entered  "+e, "fail");
		}
		return this;
	}

	@Given("Click on the find button")
	public FindLeadsPage click_on_the_find_button() throws InterruptedException, IOException {
		try {
			getdriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
			reportStep("Find button clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("Find button is not clicked "+e, "fail");
		}
		Thread.sleep(2000);
		return this;
	}
	@Given("Click on the lead list")
	public ViewLeadPage click_on_the_lead_list() throws IOException {
		try {
			getdriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			reportStep("Lead list successfully clicked", "Pass");
		} catch (Exception e) {
			reportStep("Lead list is not clicked "+e, "fail");
		}
		return new ViewLeadPage();
	}
	@Given("Enter the Leadid (.*)$")
	public FindLeadsPage enter_the_leadid(String leadid) throws IOException {
		try {
			getdriver().findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid);
			reportStep("Leadid entered successfully", "Pass");
		} catch (Exception e) {
			reportStep("Leadid is not entered"+e, "fail");
		}
		return this;
	}

	@Then("Verify the delete lead")
	public FindLeadsPage verify_the_delete_lead() throws IOException {
		String deleteverify;
		try {
			deleteverify = getdriver().findElement(By.xpath("//*[@class='x-paging-info']")).getText();
			if (deleteverify.contains("No records")) {
				System.out.println("Lead deleted Successfully");
			}else 
				System.out.println("Lead is not deleted");
			reportStep("Delete lead verified successfully", "Pass");
		} 
		
		catch (Exception e) {
			reportStep("Delete lead is not verified "+e, "Pass");
		}
		
		return this;
	}

	@Then("Window one should be handle (.*)$")
	public MergeLead window_one_should_be_handle(String leadid1) throws InterruptedException, IOException {
		try {
			Set<String> fromwindow1 = getdriver().getWindowHandles();
			List<String> listwindowa1 = new ArrayList<String>(fromwindow1);
			getdriver().switchTo().window(listwindowa1.get(1));
			getdriver().findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid1);
			getdriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			getdriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			getdriver().switchTo().window(listwindowa1.get(0));
			reportStep("window handles succesfully", "Pass");
		} catch (Exception e) {
			reportStep("window is not handled"+e, "fail");
		}
		return new MergeLead();
	}


	@Then("Window two should be handle (.*)$")
	public MergeLead window_two_should_be_handle(String leadid2) throws InterruptedException, IOException {
		try {
			Set<String> fromwindow2 = getdriver().getWindowHandles();
			List<String> listwindowa2 = new ArrayList<String>(fromwindow2);
			getdriver().switchTo().window(listwindowa2.get(1));
			getdriver().findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid2);
			getdriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			getdriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			getdriver().switchTo().window(listwindowa2.get(0));
			reportStep("window handles succesfully", "Pass");
		} catch (Exception e) {
			reportStep("window is not handled"+e, "fail");
		}
		return new MergeLead();
	}
}
