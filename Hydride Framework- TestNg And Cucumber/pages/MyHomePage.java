package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class MyHomePage extends BaseClass{
	@When("Click on the leads link")
	public MyLeadsPage click_on_the_leads_link() throws IOException {
		try {
			getdriver().findElement(By.linkText("Leads")).click();
			reportStep("Leads link clicked successfully", "Pass");
		} catch (Exception e) {
			reportStep("Leads link is not clicked "+e, "fail");
		}
		return new MyLeadsPage();
	}
}
